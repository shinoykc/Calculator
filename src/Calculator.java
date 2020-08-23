import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator {
	public Calculator(){
		
		JFrame jf= new JFrame("Shinus Calulator");                              //created JFrame
		jf.setLayout(null);
		jf.setSize(600,600);                                                  //define size of the JFrame 
		jf.setLocation(1000,100);                                          // define the location of the JFrame which show on the computer window
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JLabel displayLabel= new JLabel("I am label");                     //created JLabel
		displayLabel.setBounds(30,50,540,30);                              //  (setBound=setSize+setLocation) displayLabel.setSize(30,50); displayLabel.setLocation(540,30);
		                                                                    // Above we define the location of the JFrame which show in the JFrame window
		displayLabel.setBackground(Color.GRAY);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);            //set label-text alignment
		displayLabel.setForeground(Color.WHITE);                          //set text color
		jf.add(displayLabel);                                               //  created JLabel added in the JFrame
		
		
		JButton sevenButton= new JButton("7");                                  // create seven button
		sevenButton.setBounds(30,130,80,80);
		jf.add(sevenButton);                                                    //add seven button in the Jframe 
		
		
		JButton eightButton= new JButton("8");                                  // create eight button
		eightButton.setBounds(140,130,80,80);
		jf.add(eightButton);                                                           //add seven button in the Jframe 
		
		JButton nineButton= new JButton("9");                                  // create nine button
		nineButton.setBounds(260,130,80,80);
		jf.add(nineButton);                                                           //add seven button in the Jframe 
		
		JButton fourButton= new JButton("4");                                  // create four button
		fourButton.setBounds(30,230,80,80);
		jf.add(fourButton);                                                           //add seven button in the Jframe 
		
		JButton fiveButton= new JButton("5");                                  // create five button
		fiveButton.setBounds(140,230,80,80);
		jf.add(fiveButton);                                                           //add seven button in the Jframe 
		
		JButton sixButton= new JButton("6");                                  // create six button
		sixButton.setBounds(260,230,80,80);
		jf.add(sixButton);                                                           //add seven button in the Jframe 
		
		JButton oneButton= new JButton("1");                                  // create one button
		oneButton.setBounds(30,330,80,80);
		jf.add(oneButton);                                                           //add seven button in the Jframe 
		
		JButton twoButton= new JButton("2");                                  // create two button
		twoButton.setBounds(140,330,80,80);
		jf.add(twoButton);                                                           //add seven button in the Jframe 
		
		JButton threeButton= new JButton("3");                                  // create three button
		threeButton.setBounds(260,330,80,80);
		jf.add(threeButton);                                                           //add seven button in the Jframe 
		
		
		JButton dotButton= new JButton(".");                                  // create one button
	     dotButton.setBounds(30,430,80,80);
		jf.add(dotButton);                                                           //add seven button in the Jframe 
		
		JButton zeroButton= new JButton("0");                                  // create two button
		zeroButton.setBounds(140,430,80,80);
		jf.add(zeroButton);                                                           //add seven button in the Jframe 
		
		JButton equaltoButton= new JButton("=");                                  // create three button
		equaltoButton.setBounds(260,430,80,80);
		jf.add(equaltoButton);                                                           //add seven button in the Jframe 
		
		JButton divisionButton= new JButton("/");                                  // create nine button
		divisionButton.setBounds(360,130,80,80);
		jf.add(divisionButton);  
		
		JButton multiplicationButton= new JButton("*");                                  // create six button
		multiplicationButton.setBounds(360,230,80,80);
		jf.add(multiplicationButton); 
		
		JButton subtractionButton= new JButton("-");                                  // create three button
		subtractionButton.setBounds(360,330,80,80);
		jf.add(subtractionButton);                                                           //add seven button in the Jframe 
		
		JButton additionButton= new JButton("+");                                  // create three button
		additionButton.setBounds(360,430,80,80);
		jf.add(additionButton); 
	
		
		
	
		
	}
 public static void main(String args[])
 {
	 new Calculator();//while creating object, Here we use   * new Calculator();*   instead of    *Calculator cal= new Calculator();*     (Because if we have no future use of 'Cal')
	 
 }
}
