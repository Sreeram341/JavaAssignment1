import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SwitchTest implements ActionListener {

	private JLabel heading, grdA, grdACntr, grdB, grdBCntr, grdC, grdCCntr, grdD, grdDCntr, grdF, grdFCntr, entrGrdLbl; // to
																														// display
	int a_cntr =0, b_cntr=0, c_cntr=0, d_cntr, f_cntr=0; 
	
	String val_entrd = "";																														// labels

	private JTextField entrGrd; // to get the data

	JFrame frame = new JFrame("Grade Counter App");

	public SwitchTest() {
		// TODO Auto-generated constructor stub

		/// Frame title ///

		frame.getContentPane().setLayout(null);

		///// Heading Label //////

		heading = new JLabel("Totals for each letter grade: ");

		heading.setFont(heading.getFont().deriveFont(30.0f));

		heading.setBounds(50, -200, 600, 600);

		heading.setForeground(Color.red);

		frame.getContentPane().add(heading);

		////////// Grade Label A ////////////////

		grdA = new JLabel(" A: ");

		grdA.setFont(grdA.getFont().deriveFont(20.0f));

		grdA.setForeground(Color.red);

		grdA.setBounds(50, 200, 100, 20);

		frame.getContentPane().add(grdA);

		///////////////////////////////////// Counter Label ///////////////////////

		grdACntr = new JLabel("0");

		grdACntr.setFont(grdACntr.getFont().deriveFont(20.0f));

		grdACntr.setForeground(Color.red);

		grdACntr.setBounds(90, 200, 100, 20);

		frame.getContentPane().add(grdACntr);

		////////// Grade Label B ////////////////

		grdB = new JLabel(" B: ");

		grdB.setFont(grdB.getFont().deriveFont(20.0f));

		grdB.setForeground(Color.red);

		grdB.setBounds(50, 240, 100, 20);

		frame.getContentPane().add(grdB);

		///////////////////////////////////// Counter Label ///////////////////////

		grdBCntr = new JLabel("0");

		grdBCntr.setFont(grdBCntr.getFont().deriveFont(20.0f));

		grdBCntr.setForeground(Color.red);

		grdBCntr.setBounds(90, 240, 100, 20);

		frame.getContentPane().add(grdBCntr);

		////////// Grade Label C ////////////////

		grdC = new JLabel(" C: ");

		grdC.setFont(grdC.getFont().deriveFont(20.0f));

		grdC.setForeground(Color.red);

		grdC.setBounds(50, 280, 100, 20);

		frame.getContentPane().add(grdC);
		///////////////////////////////////// Counter Label ///////////////////////

		grdCCntr = new JLabel("0");

		grdCCntr.setFont(grdCCntr.getFont().deriveFont(20.0f));

		grdCCntr.setForeground(Color.red);

		grdCCntr.setBounds(90, 280, 100, 20);

		frame.getContentPane().add(grdCCntr);

		////////// Grade Label D ////////////////

		grdD = new JLabel(" D: ");

		grdD.setFont(grdD.getFont().deriveFont(20.0f));

		grdD.setForeground(Color.red);

		grdD.setBounds(50, 320, 100, 20);

		frame.getContentPane().add(grdD);
		///////////////////////////////////// Counter Label ///////////////////////

		grdDCntr = new JLabel("0");

		grdDCntr.setFont(grdDCntr.getFont().deriveFont(20.0f));

		grdDCntr.setForeground(Color.red);

		grdDCntr.setBounds(90, 320, 100, 20);

		frame.getContentPane().add(grdDCntr);

		////////// Grade Label F ////////////////

		grdF = new JLabel(" F: ");

		grdF.setFont(grdF.getFont().deriveFont(20.0f));

		grdF.setForeground(Color.red);

		grdF.setBounds(50, 360, 100, 20);

		frame.getContentPane().add(grdF);

		///////////////////////////////////// Counter Label ///////////////////////

		grdFCntr = new JLabel("0");

		grdFCntr.setFont(grdFCntr.getFont().deriveFont(20.0f));

		grdFCntr.setForeground(Color.red);

		grdFCntr.setBounds(90, 360, 100, 20);

		frame.getContentPane().add(grdFCntr);

		////////////// LABEL GRADE ///////////////////

		entrGrdLbl = new JLabel(" Enter Grade ");

		entrGrdLbl.setFont(entrGrdLbl.getFont().deriveFont(20.0f));

		entrGrdLbl.setOpaque(true);

		entrGrdLbl.setBackground(Color.blue);

		entrGrdLbl.setForeground(Color.white);

		entrGrdLbl.setBounds(500, 200, 130, 40);

		frame.getContentPane().add(entrGrdLbl);

		////////////// LABEL TEXT BOX ///////////////////

		entrGrd = new JTextField("");

		entrGrd.setBounds(500, 250, 130, 40);

		frame.getContentPane().add(entrGrd);

		entrGrd.addActionListener(this);

		/////////////////////// FRAME GEOMETRY /////////////////

		frame.setTitle("Grade Counter App");

		frame.setSize(800, 500);

		frame.setLocationRelativeTo(null);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		

		val_entrd = entrGrd.getText().toLowerCase();

		// System.out.println(val_entrd);

		if (val_entrd.equals("a")) {
			
			a_cntr+=1;
			
			grdACntr.setText(Integer.toString(a_cntr));
			
			entrGrd.setText("");

		} else if (val_entrd.equals("b")) {
			
			
			b_cntr+=1;
			
			grdBCntr.setText(Integer.toString(b_cntr));
			
			entrGrd.setText("");

		} else if (val_entrd.equals("c")) {

			c_cntr+=1;
			
			grdCCntr.setText(Integer.toString(c_cntr));
			
			entrGrd.setText("");

		} else if (val_entrd.equals("d")) {

			d_cntr+=1;
			
			grdDCntr.setText(Integer.toString(d_cntr));
			
			entrGrd.setText("");

		} else if (val_entrd.equals("f")) {

			f_cntr+=1;
			
			grdFCntr.setText(Integer.toString(f_cntr));
			
			
			entrGrd.setText("");

		} else if (!val_entrd.equals("f") || !val_entrd.equals("d") || !val_entrd.equals("c") || !val_entrd.equals("b")
				|| !val_entrd.equals("a")) {

			showStatus(val_entrd);
			entrGrd.setText("");

		}

	}

	public void showStatus(String msg) {


		if (msg.isEmpty()) {

			JOptionPane.showMessageDialog(frame, "Error on Input: no characters entered ", "Please enter a Valid grade",
					JOptionPane.INFORMATION_MESSAGE);	
		} else {

			JOptionPane.showMessageDialog(frame, "Error on Input:  " + msg, "Please enter a Valid grade",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new SwitchTest();
			}
		});
	}

}
