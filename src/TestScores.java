import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
String score = JOptionPane.showInputDialog("What score did you get on your test? (Out of 100)");
	double s = Double.parseDouble(score);
	if(s>80 && s<100) {
	JOptionPane.showMessageDialog(null, "Good job studying!");	
		}
	if(s<60 && s>40) {
	JOptionPane.showMessageDialog(null, "Study harder next time, you could do better.");	
		}
	if(s<40 && s>20) {
		JOptionPane.showMessageDialog(null, "Spend more time studying and less time not studying. By doing this you could get a better score.");
	}
	if(s<20 && s>0) {
		JOptionPane.showMessageDialog(null, "That score isn't acceptable. You must study much much harder next time, slacker!");
	}
	if(s>100) {
		JOptionPane.showMessageDialog(null, "That is not out of 100. Maybe if you studied, you would know your numbers.");
	}
	
	
	
	
}
}
