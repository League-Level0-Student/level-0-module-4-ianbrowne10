import javax.swing.JOptionPane;

public class OwnAdventure {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "You are the evil Dr Bob. You have been put in the castle dungeon and desperatley need to escape.");
	int task1 = JOptionPane.showOptionDialog(null, "There is a trapdoor, and a chest.", "----", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Go through trapdoor","Open chest" }, null);
	if(task1==1) {
		int task2 = JOptionPane.showOptionDialog(null, "In the chest, there is a key.", "----", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Grab key", "Leave the key alone"}, null);	
	if(task2==1) {
		JOptionPane.showMessageDialog(null, "Because you never grabbed the key, you didn't escape the dungeon.");
	}
	if(task2==0) {
		
    int task4 = JOptionPane.showOptionDialog(null, "You can try to open the cell door with the key, or don't do anything with the key.", "----", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Open door", "Do nothing"}, null);	
		if(task4==1) {
			JOptionPane.showMessageDialog(null, "Because you didn't do anything, you never escaped the dungeon.");
		}
	if(task4==0) {
		JOptionPane.showMessageDialog(null, "You escaped!");
	}
	}
	}
	if(task1==0) {
		int task3 = JOptionPane.showOptionDialog(null, "When you climb through the trapdoor, you see a gaurd.", "----", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Fight guard", "Go back to dungeon cell"}, null);	
	if(task3==1) {
		JOptionPane.showMessageDialog(null, "The guard hears you go back to your cell, and you are sentenced to even more years in the dungeon.");
	
	}
	if(task3==0) {
		JOptionPane.showMessageDialog(null, "You caught the guard off guard, and beat him in the fight. You escaped!");
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
