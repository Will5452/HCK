package support;
import javax.swing.*;

public class PullDown {
	 String[] optionsToChoose = {"Apple", "Orange", "Banana", "Pineapple", "None of the listed"};
	 public static PullDown instance = null;
	 public static PullDown getIns() {
		 if(instance == null) {
			 instance = new PullDown();
		 }
		 return instance;
	 }
	 public void getPullDown() {
     String getFavFruit = (String) JOptionPane.showInputDialog(
             null,
             "What fruit do you like the most?",
             "Choose Fruit",
             JOptionPane.QUESTION_MESSAGE,
             null,
             optionsToChoose,
             optionsToChoose[3]);
	 }
}
