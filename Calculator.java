package images;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;

import java.sql.*;

 class MyThread extends Thread{
	 @Override
	 public void run() {

         try {
     		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/resultshistory","root","");
     		
     		String SQL = "INSERT INTO resultshistory VALUES (?)";
     		PreparedStatement pstmt = con.prepareStatement(SQL);
     		pstmt.setString(1, Calculator.textField.getText());
     		
     		pstmt.executeUpdate();
     		pstmt.close();
     		this.interrupt();
     	    
     	    	
     	    }
     	    catch(Exception f) {
     	    	JOptionPane.showMessageDialog(null, "Maslo ache tho" + f.getMessage());
     	    }
		 
	 }
 }
public class Calculator {

	private JFrame frame;
	 static JTextField textField;
    static Main m;
    static boolean flag=false;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
					 m=new Main();
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	public Calculator() {
			initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 230, 140));
		frame.setBounds(100, 100, 382, 371);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBackground(new Color(100, 149, 237));
		textField.setBounds(10, 11, 346, 49);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setText("");
		
		JButton btnNewButton = new JButton("9");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textField.setText(textField.getText()+"9");
			}
			
		});
		btnNewButton.setForeground(new Color(139, 0, 0));
		btnNewButton.setBounds(308, 71, 48, 31);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"8");
			}
		});
		btnNewButton_1.setForeground(new Color(139, 0, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(250, 71, 48, 31);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("7");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"7");
			}
		});
		btnNewButton_2.setForeground(new Color(139, 0, 0));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2.setBounds(192, 71, 48, 31);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("6");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"6");
			}
		});
		btnNewButton_3.setForeground(new Color(139, 0, 0));
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3.setBounds(308, 113, 48, 31);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"5");
			}
		});
		btnNewButton_4.setForeground(new Color(139, 0, 0));
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_4.setBounds(250, 113, 48, 31);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("4");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"4");
			}
		});
		btnNewButton_5.setForeground(new Color(139, 0, 0));
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_5.setBounds(192, 113, 48, 31);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("3");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"3");
			}
		});
		btnNewButton_6.setForeground(new Color(139, 0, 0));
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_6.setBounds(308, 155, 48, 31);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("2");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"2");
			}
			
		});
		btnNewButton_7.setForeground(new Color(139, 0, 0));
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_7.setBounds(250, 155, 48, 31);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("1");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"1");
			}
		});
		btnNewButton_8.setForeground(new Color(139, 0, 0));
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_8.setBounds(192, 155, 48, 31);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"0");
			}
		});
		btnNewButton_9.setForeground(new Color(139, 0, 0));
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_9.setBounds(308, 197, 48, 31);
		frame.getContentPane().add(btnNewButton_9);
		
		MyThread t1=new MyThread();
		
		JButton btnNewButton_9_1 = new JButton("=");
		btnNewButton_9_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"use calculator in a correct way");
				}
				else {
					try {
				m.value2=Double.parseDouble(textField.getText());
				textField.setText("");
				m.result();
				t1.run();}
				catch(Exception j) {
					JOptionPane.showMessageDialog(null,"Use calculator correctly");
				}	
				}
				
			}
		});
		btnNewButton_9_1.setForeground(new Color(139, 0, 0));
		btnNewButton_9_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_9_1.setBounds(192, 197, 48, 31);
		frame.getContentPane().add(btnNewButton_9_1);
		
		JButton btnNewButton_9_2 = new JButton("+");
		btnNewButton_9_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"use calculator in a correct way");
				}
				else {
				m.op='+';
				m.value1=Double.parseDouble(textField.getText());
				textField.setText("");
				}
			}
		});
		btnNewButton_9_2.setForeground(new Color(139, 0, 0));
		btnNewButton_9_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_9_2.setBounds(108, 71, 48, 31);
		frame.getContentPane().add(btnNewButton_9_2);
		
		JButton btnNewButton_9_3 = new JButton("-");
		btnNewButton_9_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText().equals("")) {textField.setText("-");}
				else if(textField.getText().equals("-")) {
					JOptionPane.showMessageDialog(null,"use calculator in a correct way");
				}
				else {
					try{m.op='-';
				m.value1=Double.parseDouble(textField.getText());
				textField.setText("");}
					catch(Exception j) {
						JOptionPane.showMessageDialog(null,"Use calculator correctly");
					}}
			}
		});
		btnNewButton_9_3.setForeground(new Color(139, 0, 0));
		btnNewButton_9_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_9_3.setBounds(108, 113, 48, 31);
		frame.getContentPane().add(btnNewButton_9_3);
		
		JButton btnNewButton_9_4 = new JButton("x");
		btnNewButton_9_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"use calculator in a correct way");
				}
				else {
					try {
				m.op='*';
				m.value1=Double.parseDouble(textField.getText());
				textField.setText("");}
					catch(Exception j) {
						JOptionPane.showMessageDialog(null,"Use calculator correctly");
					}
				}}
		});
		btnNewButton_9_4.setForeground(new Color(139, 0, 0));
		btnNewButton_9_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_9_4.setBounds(108, 155, 48, 31);
		frame.getContentPane().add(btnNewButton_9_4);
		
		JButton btnNewButton_9_5 = new JButton("/");
		btnNewButton_9_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"use calculator in a correct way");
				}
				else{
					try {
					m.op='/';
				m.value1=Double.parseDouble(textField.getText());
				textField.setText("");}
					catch(Exception j) {
						JOptionPane.showMessageDialog(null,"Use calculator correctly");
					}
				}}
		});
		btnNewButton_9_5.setForeground(new Color(139, 0, 0));
		btnNewButton_9_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_9_5.setBounds(108, 197, 48, 31);
		frame.getContentPane().add(btnNewButton_9_5);
		
		JButton btnNewButton_9_2_1 = new JButton("SQRT");
		btnNewButton_9_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"use calculator in a correct way");
				}
				else {
					try {
				m.value1=Double.parseDouble(textField.getText());
				textField.setText(Double.toString(Math.sqrt(m.value1)));
				t1.run();}
					catch(Exception j) {
						JOptionPane.showMessageDialog(null,"Use calculator correctly");
					}
				
				}
			}
		});
		btnNewButton_9_2_1.setForeground(new Color(139, 0, 0));
		btnNewButton_9_2_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_9_2_1.setBounds(10, 197, 88, 31);
		frame.getContentPane().add(btnNewButton_9_2_1);
		
		JButton btnNewButton_9_2_1_1 = new JButton("LOG");
		btnNewButton_9_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"use calculator in a correct way");
				}
				else{
					try {
					m.value1=Double.parseDouble(textField.getText());
				textField.setText(Double.toString(Math.log(m.value1)));
		        t1.run();}
					catch(Exception j) {
						JOptionPane.showMessageDialog(null,"Use calculator correctly");
					}	
				}	
			}
		});
		btnNewButton_9_2_1_1.setForeground(new Color(139, 0, 0));
		btnNewButton_9_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_9_2_1_1.setBounds(10, 155, 88, 31);
		frame.getContentPane().add(btnNewButton_9_2_1_1);
		
		JButton btnNewButton_9_2_1_2 = new JButton("CLR");
		btnNewButton_9_2_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textField.setText("");
			}
		});
		btnNewButton_9_2_1_2.setForeground(new Color(139, 0, 0));
		btnNewButton_9_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_9_2_1_2.setBounds(10, 113, 88, 31);
		frame.getContentPane().add(btnNewButton_9_2_1_2);
		
		JButton btnNewButton_9_2_1_3 = new JButton("Backspc");
		btnNewButton_9_2_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"text field is already empty");
				}
				else {
				int stringSize=textField.getText().length();
				textField.setText(textField.getText().substring(0,stringSize-1));
				}}
		});
		btnNewButton_9_2_1_3.setForeground(new Color(139, 0, 0));
		btnNewButton_9_2_1_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_9_2_1_3.setBounds(10, 71, 88, 31);
		frame.getContentPane().add(btnNewButton_9_2_1_3);
		
		JButton btnNewButton_9_1_1 = new JButton(".");
		btnNewButton_9_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"Enter any digit first then use point");
				}
				else {
				textField.setText(textField.getText()+".");}
			}
		});
		btnNewButton_9_1_1.setForeground(new Color(139, 0, 0));
		btnNewButton_9_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton_9_1_1.setBounds(250, 197, 48, 31);
		frame.getContentPane().add(btnNewButton_9_1_1);
		
		JButton btnNewButton_9_2_1_4 = new JButton("Sin(x)");
		btnNewButton_9_2_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"Enter any value first");
				}
				else {
					try {
				m.value1=Double.parseDouble(textField.getText());
				textField.setText(Double.toString(Math.sin(m.value1)));
			    t1.run();}
					catch(Exception j) {
						JOptionPane.showMessageDialog(null,"Use calculator correctly");
					}}
			}
		});
		btnNewButton_9_2_1_4.setForeground(new Color(139, 0, 0));
		btnNewButton_9_2_1_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_9_2_1_4.setBounds(10, 249, 88, 31);
		frame.getContentPane().add(btnNewButton_9_2_1_4);
		
		JButton btnNewButton_9_2_1_5 = new JButton("Cos(x)");
		btnNewButton_9_2_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"Enter any value first");
				}
				else {
					try {
				m.value1=Double.parseDouble(textField.getText());
				textField.setText(Double.toString(Math.cos(m.value1)));
			    t1.run();}
					catch(Exception j) {
						JOptionPane.showMessageDialog(null,"Use calculator correctly");
					}	
				}
			}
		});
		btnNewButton_9_2_1_5.setForeground(new Color(139, 0, 0));
		btnNewButton_9_2_1_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_9_2_1_5.setBounds(10, 291, 88, 31);
		frame.getContentPane().add(btnNewButton_9_2_1_5);
		
		JButton btnNewButton_9_2_1_6 = new JButton("tan(x)");
		btnNewButton_9_2_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"Enter any value first");
				}
				else {
					try {
				m.value1=Double.parseDouble(textField.getText());
				textField.setText(Double.toString(Math.tan(m.value1)));
			    t1.run();}
					catch(Exception j) {
						JOptionPane.showMessageDialog(null,"Use calculator correctly");
					}	
				}
			}
		});
		btnNewButton_9_2_1_6.setForeground(new Color(139, 0, 0));
		btnNewButton_9_2_1_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_9_2_1_6.setBounds(137, 249, 88, 31);
		frame.getContentPane().add(btnNewButton_9_2_1_6);
		
		JButton btnNewButton_9_2_1_7 = new JButton("Cot(x)");
		btnNewButton_9_2_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"Enter any value first");
				}
				else {
					try {
				m.value1=Double.parseDouble(textField.getText());
				textField.setText(Double.toString(1/(Math.tan(m.value1))));
			    t1.run();}
					catch(Exception j) {
						JOptionPane.showMessageDialog(null,"Use calculator correctly");
					}	
				}
			}
		});
		btnNewButton_9_2_1_7.setForeground(new Color(139, 0, 0));
		btnNewButton_9_2_1_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_9_2_1_7.setBounds(137, 291, 88, 31);
		frame.getContentPane().add(btnNewButton_9_2_1_7);
		
		JButton btnNewButton_9_2_1_8 = new JButton("Sec(x)");
		btnNewButton_9_2_1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"Enter any value first");
				}
				else {
					try {
				m.value1=Double.parseDouble(textField.getText());
				textField.setText(Double.toString(1/(Math.cos(m.value1))));
                t1.run();}
					catch(Exception j) {
						JOptionPane.showMessageDialog(null,"Use calculator correctly");
					}
				}}
		});
		btnNewButton_9_2_1_8.setForeground(new Color(139, 0, 0));
		btnNewButton_9_2_1_8.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_9_2_1_8.setBounds(268, 249, 88, 31);
		frame.getContentPane().add(btnNewButton_9_2_1_8);
		
		JButton btnNewButton_9_2_1_9 = new JButton("Cosec(x)");
		btnNewButton_9_2_1_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"Enter any value first");
				}
				else {
					try {
				m.value1=Double.parseDouble(textField.getText());
				textField.setText(Double.toString(1/(Math.sin(m.value1))));
                t1.run();}
					catch(Exception j) {
						JOptionPane.showMessageDialog(null,"Use calculator correctly");
					}
				}}
		});
		btnNewButton_9_2_1_9.setForeground(new Color(139, 0, 0));
		btnNewButton_9_2_1_9.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_9_2_1_9.setBounds(268, 291, 88, 31);
		frame.getContentPane().add(btnNewButton_9_2_1_9);
		
		textField.setText("");
	}
}
class Main{
	double number;
	double value1;
	double value2;
	double output;
	char op;
	
	
	double sum(double n1,double n2) {
		return n1+n2;
	}
	
	double subtract(double n1,double n2) {
		return n1-n2;
	}
	
	double multiply(double n1,double n2) {
		return n1*n2;
	}
	
	double divide(double n1,double n2) {
		return n1/n2;
	}
	
    double squareRoot(double n) {
    	return Math.sqrt(n);
    }
    
    double log(double n) {
		return Math.log(n);
	}
    
    void result(){
    	if(op=='+') {
    		output=value1+value2;
    		Calculator.textField.setText(Double.toString(output));
    	}
    	else if(op=='-') {
    		output=value1-value2;
    		Calculator.textField.setText(Double.toString(output));
    	}
    	else if(op=='*') {
    		output=value1*value2;
    		Calculator.textField.setText(Double.toString(output));
    	}
    	else if(op=='/') {
    		output=value1/value2;
    		Calculator.textField.setText(Double.toString(output));
    	}
    
    }
}