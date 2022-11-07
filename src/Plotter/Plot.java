package Plotter;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class Plot extends JFrame {
	
	public Plot() {
		setTitle("JPANEL CREATION");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        //setting the bounds for the JFrame
        setBounds(50,50,440,700);
        Border br = BorderFactory.createLineBorder(Color.black);
        Container c=getContentPane();
        //Creating a JPanel for the JFrame
        JPanel panel=new JPanel();
        JPanel panel2=new JPanel();
        JPanel panel3=new JPanel();
        JButton panel4=new JButton("Run");
        //setting the panel layout as null
        panel.setLayout(null);
        panel2.setLayout(null);
        panel3.setLayout(null);
        panel4.setLayout(null);
        //adding a label element to the panel
//        JLabel label=new JLabel("Panel 1");
//        JLabel label2=new JLabel("Panel 2");
//        JLabel label3=new JLabel("Panel 3");
//        JLabel label4=new JLabel("Panel 4");
//        label.setBounds(120,50,200,50);
//        label2.setBounds(120,50,200,50);
//        label3.setBounds(120,50,200,50);
//        label4.setBounds(120,50,200,50);
//        panel.add(label);
//        panel2.add(label2);
//        panel3.add(label3);
//        panel4.add(label4);
        // changing the background color of the panel to yellow
        //Panel 1
        panel.setBackground(Color.yellow);
        panel.setBounds(10,10,400,150);
        //Panel 2
        panel2.setBackground(Color.red);
        panel2.setBounds(10,170,400,150);
        //Panel 3
        panel3.setBackground(Color.green);
        panel3.setBounds(10,340,400,150);
        //Panel 4
        panel4.setBackground(Color.cyan);
        panel4.setBounds(150,510,100,75);
        
        // Panel border
        panel.setBorder(br);
        panel2.setBorder(br);
        panel3.setBorder(br);
        panel4.setBorder(br);
        
        //adding the panel to the Container of the JFrame
        c.add(panel);
        c.add(panel2);
        c.add(panel3);
        c.add(panel4);
       
        setVisible(true);
	}

}
