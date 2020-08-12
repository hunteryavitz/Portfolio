import java.util.Arrays;

public class SentimentAnalyzer {

	public static String reviewComment;
	
	public static int[] detectProsAndCons(String review, String[][] featureSet, String[] posOpinionWords, String[] negOpinionWords) {

		int[] featureOpinions = new int[featureSet.length]; // output
		review = review.toLowerCase();
 
		review_search: for (int i = 0; i < featureSet.length; i++) {
			for (int j = 0; j < featureSet[i].length; j++) {
				if (review.indexOf(featureSet[i][j]) != -1) {
					featureOpinions[i] = getOpinionOnFeature(review, featureSet[i][j], posOpinionWords, negOpinionWords);
					System.out.println(reviewComment);
					continue review_search;
				} else {
					featureOpinions[i] = 0;
				}
			}
		}
		
		return featureOpinions;
	}

	private static int getOpinionOnFeature(String review, String feature, String[] posOpinionWords, String[] negOpinionWords) {
		
		if (checkForWasPhrasePattern(review, feature, posOpinionWords, negOpinionWords) != 0) {
			return checkForWasPhrasePattern(review, feature, posOpinionWords, negOpinionWords);
		} else {
			return checkForOpinionFirstPattern(review, feature, posOpinionWords, negOpinionWords);
		}
	}	

	private static int checkForWasPhrasePattern(String review, String feature, String[] posOpinionWords, String[] negOpinionWords) {

		int opinion = 0;
		String pattern = feature + " was ";

		if (review.indexOf(pattern) != -1) {
			
			review = review.substring(review.indexOf(pattern));
			
			for (String positive_word : posOpinionWords) {
			
				if (review.substring(pattern.length()).startsWith(positive_word)) {
					
					reviewComment = pattern + positive_word;
					return 1; 	
					
				}
			}

			for (String negative_word : negOpinionWords) {

				if (review.substring(pattern.length()).startsWith(negative_word)) {

					reviewComment = pattern + negative_word;
					return -1;
					
				}
			}
		}		

	return opinion; 	

	}
	
	private static int checkForOpinionFirstPattern(String review, String feature, String[] posOpinionWords, String[] negOpinionWords) {

		String[] sentences = review.split("\\.");
		int opinion = 0;
		
		for (String sentence : sentences) {

			for (int i = 0; i < posOpinionWords.length; i++) {
				
				if (sentence.indexOf(posOpinionWords[i] + " " + feature) != -1) {

					reviewComment = posOpinionWords[i] + " " + feature;
					return 1;
					
				}
			}
		}

		for (String sentence : sentences) {

			for (int i = 0; i < negOpinionWords.length; i++) {
				
				if (sentence.indexOf(negOpinionWords[i] + " " + feature) != -1) {

					reviewComment = negOpinionWords[i] + " " + feature;
					return -1;
					
				}
			}
		}

		return opinion;
	}

	public static void main(String[] args) {

		String review = "I enjoyed the excellent ambiance and the dessert was amazing.  The food was delicious and the soup was great! Victor provided fantastic service. Will be back soon!";
		//String review = "The atmosphere was horrible. The dessert was awful and we had cold food.  Bad soup and management was unprofessional!  Don't bother coming here!";
		
		String[][] featureSet = { 
		        { "ambiance", "ambience", "atmosphere", "decor" },
				{ "dessert", "ice cream", "desert" }, 
				{ "food" }, 
				{ "soup" },
				{ "service", "management", "waiter", "waitress", "bartender", "staff", "server" } };

		String[] posOpinionWords = { "good", "fantastic", "friendly", "great", "excellent", "amazing", "awesome",
				"delicious" };

		String[] negOpinionWords = { "slow", "bad", "horrible", "awful", "unprofessional", "poor", "cold", "burnt" };

		int[] featureOpinions = detectProsAndCons(review, featureSet, posOpinionWords, negOpinionWords);

		System.out.println("Opinions on Features: " + Arrays.toString(featureOpinions));
	}
}