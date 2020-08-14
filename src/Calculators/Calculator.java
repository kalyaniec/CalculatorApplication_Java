package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	private double firstNumber;
	private double secondNumber;
	private String operation;
	private double result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
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
		frame.setBackground(Color.PINK);
		frame.setBounds(100, 100, 300, 410);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 264, 34);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btn7 = new JButton("7");
		btn7.setBackground(Color.LIGHT_GRAY);
		btn7.setForeground(Color.BLACK);
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String enterNumber = textField.getText() + btn7.getText();
				textField.setText(enterNumber);
			}
		});
		btn7.setBounds(10, 56, 50, 50);
		frame.getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.setBackground(Color.LIGHT_GRAY);
		btn8.setForeground(Color.BLACK);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String enterNumber = textField.getText() + btn8.getText();
				textField.setText(enterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(70, 56, 50, 50);
		frame.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.setBackground(Color.LIGHT_GRAY);
		btn9.setForeground(Color.BLACK);
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String enterNumber = textField.getText() + btn9.getText();
				textField.setText(enterNumber);
			}
		});
		btn9.setBounds(132, 56, 50, 50);
		frame.getContentPane().add(btn9);

		JButton btnminus = new JButton("-");
		btnminus.setBackground(Color.LIGHT_GRAY);
		btnminus.setForeground(Color.BLACK);
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";

			}
		});
		btnminus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnminus.setBounds(192, 117, 50, 50);
		frame.getContentPane().add(btnminus);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn4.getText();
				textField.setText(enterNumber);
			}
		});
		btn4.setBackground(Color.LIGHT_GRAY);
		btn4.setForeground(Color.BLACK);
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 117, 50, 50);
		frame.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn5.getText();
				textField.setText(enterNumber);
			}
		});
		btn5.setBackground(Color.LIGHT_GRAY);
		btn5.setForeground(Color.BLACK);
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(70, 117, 50, 50);
		frame.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn6.getText();
				textField.setText(enterNumber);
			}
		});
		btn6.setBackground(Color.LIGHT_GRAY);
		btn6.setForeground(Color.BLACK);
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(132, 117, 50, 50);
		frame.getContentPane().add(btn6);

		JButton btnsum_1 = new JButton("+");
		btnsum_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btnsum_1.setBackground(Color.LIGHT_GRAY);
		btnsum_1.setForeground(Color.BLACK);
		btnsum_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnsum_1.setBounds(192, 56, 50, 50);
		frame.getContentPane().add(btnsum_1);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn1.getText();
				textField.setText(enterNumber);
			}
		});

		btn1.setBackground(Color.LIGHT_GRAY);
		btn1.setForeground(Color.BLACK);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(10, 181, 50, 50);
		frame.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn2.getText();
				textField.setText(enterNumber);
			}
		});
		btn2.setBackground(Color.LIGHT_GRAY);
		btn2.setForeground(Color.BLACK);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(70, 181, 50, 50);
		frame.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn3.getText();
				textField.setText(enterNumber);
			}
		});
		btn3.setBackground(Color.LIGHT_GRAY);
		btn3.setForeground(Color.BLACK);
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(132, 181, 50, 50);
		frame.getContentPane().add(btn3);

		JButton btnmultiply = new JButton("*");
		btnmultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnmultiply.setBackground(Color.LIGHT_GRAY);
		btnmultiply.setForeground(Color.BLACK);
		btnmultiply.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnmultiply.setBounds(192, 181, 50, 50);
		frame.getContentPane().add(btnmultiply);

		JButton btndec = new JButton(".");
		btndec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btndec.setForeground(Color.BLACK);
		btndec.setFont(new Font("Tahoma", Font.BOLD, 20));
		btndec.setBackground(Color.LIGHT_GRAY);
		btndec.setBounds(10, 242, 50, 50);
		frame.getContentPane().add(btndec);

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn0.getText();
				textField.setText(enterNumber);
			}
		});
		btn0.setForeground(Color.BLACK);
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBackground(Color.LIGHT_GRAY);
		btn0.setBounds(70, 242, 50, 50);
		frame.getContentPane().add(btn0);

		JButton btnequals = new JButton("=");
		btnequals.addActionListener(new ActionListener() {
			private String answer;

			public void actionPerformed(ActionEvent e) {
				secondNumber = Double.parseDouble(textField.getText());
				if (operation.equals("+")) {
					result = firstNumber + secondNumber;
					answer = String.format("% 2f", result);
					textField.setText(answer);
				}

				else if (operation.equals("-")) {
					result = firstNumber - secondNumber;
					answer = String.format("% 2f", result);
					textField.setText(answer);
				}

				else if (operation.equals("*")) {
					result = firstNumber * secondNumber;
					answer = String.format("% 2f", result);
					textField.setText(answer);
					} 
				
				else if (operation.equals("/")) {
					result = firstNumber * secondNumber;
					answer = String.format("% 2f", result);
					textField.setText(answer);
				}

				else if (operation.equals("%")) {
					result = firstNumber % secondNumber;
					answer = String.format("% 2f", result);
					textField.setText(answer);

				}
			}
		});
		btnequals.setForeground(Color.BLACK);
		btnequals.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnequals.setBackground(Color.LIGHT_GRAY);
		btnequals.setBounds(132, 242, 50, 50);
		frame.getContentPane().add(btnequals);

		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";

			}
		});
		btndiv.setForeground(Color.BLACK);
		btndiv.setFont(new Font("Tahoma", Font.BOLD, 20));
		btndiv.setBackground(Color.LIGHT_GRAY);
		btndiv.setBounds(192, 242, 50, 50);
		frame.getContentPane().add(btndiv);

		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = null;
				textField.setText(enterNumber);
			}
		});
		btnC.setForeground(Color.BLACK);
		btnC.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnC.setBackground(Color.LIGHT_GRAY);
		btnC.setBounds(10, 303, 50, 50);
		frame.getContentPane().add(btnC);

		JButton btnback = new JButton("<-");
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if (textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					backSpace = strB.toString();
					textField.setText(backSpace);

				}
			}
		});
		btnback.setForeground(Color.BLACK);
		btnback.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnback.setBackground(Color.LIGHT_GRAY);
		btnback.setBounds(70, 303, 64, 50);
		frame.getContentPane().add(btnback);

	}
}
