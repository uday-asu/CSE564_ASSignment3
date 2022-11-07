package Plotter;


import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
	Source source = new Source();
	public static void main(String[] args) {
		Main obj = new Main();
		obj.draw();
	}


	public void draw(){

		// Set JFrame Properties
		setTitle("Graph Plot Creation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		//setting the bounds for the JFrame
		setBounds(100,0,900,800);
		Border br = BorderFactory.createLineBorder(Color.black);
		Container c = getContentPane();


		//Creating a JPanel for the JFrame
		JPanel panel=new JPanel();
		JPanel panel2=new JPanel();
		JPanel panel3=new JPanel();

		//Plot Panel

		PlotPanel p1 = new PlotPanel();
		PlotPanel p2 = new PlotPanel();
		PlotPanel p3 = new PlotPanel();



		source.addObserver(p1);
		source.addObserver(p2);
		source.addObserver(p3);

		//Creation of ActionListener
		JButton button =new JButton("Run");
		button.addActionListener(this);


		//setting the panel layout as null
//		panel.setLayout(null);
//		panel2.setLayout(null);
//		panel3.setLayout(null);
//		button.setLayout(null);
		p1.setLayout(null);
		p1.setBounds(10,10,400,150);

//		p2.setLayout(null);
//		p2.setBounds(10,170,400,150);
//
//		p3.setLayout(null);
//		p3.setBounds(10,340,400,150);


//		panel.setBackground(Color.yellow);
//		panel.setBounds(10,10,400,150);
//		//Panel 2
//		panel2.setBackground(Color.red);
//		panel2.setBounds(10,170,400,150);
//		//Panel 3
//		panel3.setBackground(Color.green);
//		panel3.setBounds(10,340,400,150);
//		//Panel 4
		button.setBackground(Color.red);
		button.setBounds(0,600,100,75);

		// Panel border
//		panel.setBorder(br);
//		panel2.setBorder(br);
//		panel3.setBorder(br);

		p1.setBorder(br);
//		p2.setBorder(br);
//		p3.setBorder(br);

		button.setBorder(br);

		//adding the panel to the Container of the JFrame
		c.add(p1);
//		c.add(p2);
//		c.add(p3);

		c.add(button);

		setVisible(true);
	}

	/**
	 * Whenever the button is clicked we need to generate random numbers and plot graphs accordingly
	 * @param e the event to be processed
	 */
	public void actionPerformed(ActionEvent e){
		System.out.println("Button was Clicked");
		source.updateValues();
	}

}
