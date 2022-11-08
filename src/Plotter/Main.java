package Plotter;


import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main extends JFrame implements ActionListener {
	private Source source = new Source();
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
		setBounds(50,50,440,700);
		Border br = BorderFactory.createLineBorder(Color.black);
		Container c = getContentPane();


		//Plot Panel

		PlotPanel p1 = new PlotPanel(0,0).setPlot(new GeneralPlot());
		c.add(p1);
		source.addObserver(p1);
		PlotPanel p2 = new PlotPanel(10,170).setPlot(new PointPlot(new GeneralPlot()));
		c.add(p2);
		source.addObserver(p2);
		PlotPanel p3 = new PlotPanel(10,340).setPlot(new BarPlot(new PointPlot(new GeneralPlot())));
		c.add(p3);
		source.addObserver(p3);


		//Creation of ActionListener
		JButton button =new JButton("Run");
		button.addActionListener(this);
		button.setBackground(Color.red);
		button.setBounds(150,510,100,75);

		button.setBorder(br);

		//adding the panel to the Container of the JFrame
		c.add(button);





		setVisible(true);
	}

	/**
	 * Whenever the button is clicked we need to generate random numbers and plot graphs accordingly
	 * @param e the event to be processed
	 */
	public void actionPerformed(ActionEvent e){
		System.out.println("Button was clicked");
		RandomNumGen randomNumGen = RandomNumGen.getInstance();
		randomNumGen.generateRandomNumber();
		source.setChanged();
		source.notifyObservers();
	}

}
