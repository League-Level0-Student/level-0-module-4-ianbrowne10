import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
static	int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String pet = JOptionPane.showInputDialog("What pet would you like to buy? (Dog,Cat)");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!

			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			for (int i = 0; i < 4; i++) {
				
			
int task = JOptionPane.showOptionDialog(null, "What would you like to do to your pet?", "Pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Pet", "Play", "Feed" }, null);
if(pet.equalsIgnoreCase("dog")) {
if(task==2) {
	feed();
}
if(task==1) {
	play();
}
if(task==0) {
	pet();
}
JOptionPane.showMessageDialog(null, "Happiness Level:" +happinessLevel);							
}		
if(pet.equalsIgnoreCase("cat")) {
if(task==2) {
	feed2();
}
if(task==1) {
	play2();
}
if(task==0) {
	pet2();
}
JOptionPane.showMessageDialog(null, "Happiness Level:" +happinessLevel);							
}				
else {
	JOptionPane.showMessageDialog(null, "You can not interact with the pet becuase it is not an available pet.");
i=1+4;
}
			
			}
			// 5. Use user input to call the appropriate method created in step 4.

			
	// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
	if(happinessLevel==4) {
		JOptionPane.showMessageDialog(null, "You have cared for you pet so much, they love you!");
	}
	
	}
	

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.

static void pet() {
	JOptionPane.showMessageDialog(null, "Your dog loves it!");
happinessLevel=happinessLevel+1;
}
static void play() {
	JOptionPane.showMessageDialog(null, "Your dog had so much fun playing with you!");
happinessLevel=happinessLevel+1;
}
static void feed() {
	JOptionPane.showMessageDialog(null, "Your dog gobbled up all the food so fast! He thought it was delicous!");
	happinessLevel=happinessLevel+1;
}
static void pet2() {
	JOptionPane.showMessageDialog(null, "Your cat purred becuase it felt so good!");
happinessLevel=happinessLevel+1;
}
static void play2() {
	JOptionPane.showMessageDialog(null, "Your cat is pretty lazy, so he didn't play much with you. He still appreciates you tried to play with him! ");
happinessLevel=happinessLevel+1;
}
static void feed2() {
	JOptionPane.showMessageDialog(null, "Your cat enjoyed their catnip very much!");
	happinessLevel=happinessLevel+1;
}
}