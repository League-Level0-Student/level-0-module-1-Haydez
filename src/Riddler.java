import javax.swing.JOptionPane;

public class Riddler {
public static void main(String[] args) {
	String riddle1=JOptionPane.showInputDialog("What is the beginning of eternity, the end of time and space, the beginning of every end and the end of every race");
	if (riddle1.equals("The Letter E")) {
		JOptionPane.showMessageDialog(null, "Good Job");
	}else {
		JOptionPane.showMessageDialog(null, "HAHAHAHAHHAHA you got it wrong. IDIOT.  Its the letter E");
	}
	String riddle2=JOptionPane.showInputDialog("What belongs to you, but is used by others?");
	if(riddle2.equals("My Name")) {
		JOptionPane.showMessageDialog(null, "Congratulations, you got it right");
	}else {
		JOptionPane.showMessageDialog(null, "WRONGGGGGG, its your name.  STUPID.");
	}
}
}
