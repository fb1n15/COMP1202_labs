/**
 * Method modelling flash cards
 * @author Wojciech Rozowski (wkr1u18)
 *
 */
public class FlashCard {
	String answer, question;
	/**
	 * Public constructor creating FlashCard object taking question and answer as a parameters.
	 * @param question String containing question
	 * @param answer String containing answer
	 */
	public FlashCard(String question, String answer) {
		this.answer = answer;
		this.question = question;
	}
	
	/**
	 * Getter to question part of the flash card.
	 * @return String containing flash card's question
	 */
	public String getQuestion() {
		return question;
	}
	
	/**
	 * Getter to answer part of the flash card.
	 * @return String containing flash card's answer.
	 */
	public String getAnswer() {
		return answer;
	}
}
