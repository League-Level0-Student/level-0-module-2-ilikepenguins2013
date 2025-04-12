package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingRights {

	public static void main(String[] args) {
		String user=JOptionPane.showInputDialog("how old are you(in years)......Hurry uuuupppp!!!! whats taking you so long????!!!! ");
		int userAge=Integer.parseInt(user);
		if(userAge>=18) {
			JOptionPane.showMessageDialog(null, "who do u want to be president");
		}
		else {
			JOptionPane.showMessageDialog(null, "get ouut of here!  u dont belong! no one cares what you think");
		}
	}

}
