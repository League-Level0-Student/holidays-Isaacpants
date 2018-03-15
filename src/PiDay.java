import javax.swing.JOptionPane;

public class PiDay {
	public static void main(String[] args) {

		String pi = "3.141592653";
//		for (int i = 0; i < 4; i++) {
//			System.out.print(pi.charAt(i));
//		}
		
for (int i = 0; i < pi.length(); i++) {
	String nPI = JOptionPane.showInputDialog("WHAT IS THE NEXT DIGIT OF PI?");	
char p = pi.charAt(i);
		String PIn = Character.toString(p);
		if(PIn.equals(nPI)) {
			JOptionPane.showMessageDialog(null, "Correct");
		System.out.println(nPI);	
			
		}else {
			JOptionPane.showMessageDialog(null, "Wrong");
			
		}
	}
}
}
