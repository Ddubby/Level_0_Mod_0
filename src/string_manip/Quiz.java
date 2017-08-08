package string_manip;

import java.util.Random;

import javax.swing.JOptionPane;

public class Quiz {
public static void main(String[] args) {
Random rand = new Random();
int r =rand.nextInt((5000-1000)+1000);
	String name=JOptionPane.showInputDialog(null, "Hello there! What's your name?");
JOptionPane.showMessageDialog(null, "Well hello, "+name+", Welcome to The Price is Right!");	
JOptionPane.showMessageDialog(null, "Now, we will give 3 questions! Here are the rules:");	
JOptionPane.showMessageDialog(null, "1. One correct answer will give you that Item!");
JOptionPane.showMessageDialog(null, "2. If the answer of any question is wrong, you get one strike!");
JOptionPane.showMessageDialog(null, "3. Each strike, subtracts 200$ from your bank!");
JOptionPane.showMessageDialog(null, "4. You must have enough money in your bank to pay for the item you get correct!");
JOptionPane.showMessageDialog(null, "You start with, a total of "+r+ "!");
JOptionPane.showMessageDialog(null, "Good luck!");
String first=JOptionPane.showInputDialog("How much, does a Ipad Mini cost?");
if (first.equals("650")) {
	JOptionPane.showMessageDialog(null, "Correct! Well done!");
	String yes=JOptionPane.showInputDialog("Now, will you buy this Item?");
	if (yes.equals("yes")) {
		JOptionPane.showMessageDialog(null, "Congradulations! You now have an Ipad Mini");
		
		
	}
	else {
		JOptionPane.showMessageDialog(null, "Ok then, lets countinue!");			
				}
}
else {
	JOptionPane.showMessageDialog(null, "*losing horn plays");
	JOptionPane.showMessageDialog(null, "Oh no! you got the price wrong! It was, 650$, 200$ deducted!");
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
