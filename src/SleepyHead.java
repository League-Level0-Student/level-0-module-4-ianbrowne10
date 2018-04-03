
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;
		// JOptionPane.showConfirmDialog(null, "Is it a weekday?",
		int i = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "", JOptionPane.YES_NO_OPTION);
		if (i == 1) {
			JOptionPane.showMessageDialog(null, "Sleep In");
		} else {
			int t = JOptionPane.showConfirmDialog(null, "Is it a vacation day?", "", JOptionPane.YES_NO_OPTION);
			if (t == 1) {
				JOptionPane.showMessageDialog(null, "WAKEY WAKEY EGGS AND BAKEY");
			} else {
				JOptionPane.showMessageDialog(null, "Sleep In");
			}
		}

		/*
		 * Ask the user for these values using JOptionPane.showConfirmDialog(null,
		 * "is it a weekday?", "", JOptionPane.YES_NO_OPTION);
		 */

		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday, print
		 * “get up lazybones!” If it is a weekday, and we are on vacation, print “sleep
		 * in”.
		 */

	}
}
