package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

import model.BrickHouse;
import model.House;
import model.WoodHouse;

public class MainScreen extends JFrame{
	
	private static final long serialVersionUID = 1L;

	private static JButton brickButton = null;
	private static JButton tableButton = null;
	
	private final static String ADD_BRICK = "brick";
	private final static String ADD_TABLE = "table";
	
	private House house = null;
	
	public static void main(String[] args) {
		MainScreen main = new MainScreen();
		main.setView();
		
	}
	
	private void setView(){
		brickButton = new JButton(ADD_BRICK);
		tableButton = new JButton(ADD_TABLE);
		
		setOnClickListenerBrick(brickButton);
		setOnClickListenerTable(tableButton);
		
		this.setTitle("Factory method");
		this.setSize(200,80);
		this.getContentPane().add(brickButton, "North");
		this.getContentPane().add(tableButton, "South");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
	}
	
	private void setOnClickListenerBrick(JButton showDialogButton){
		showDialogButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				house = new BrickHouse();
				int numberOfMaterials = house.getNumberOfMaterials();
				showDialog(numberOfMaterials+"");
			}
		   
		});
	}
	

	private void setOnClickListenerTable(JButton showDialogButton){
		showDialogButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				house = new WoodHouse();
				int numberOfMaterials = house.getNumberOfMaterials();
				showDialog(numberOfMaterials+"");
			}
		   
		});
	}
	private void showDialog(String text){
		JDialog d = new JDialog(this, text, true);
		d.setSize(100, 100);
        d.setLocationRelativeTo(this);
        d.setVisible(true);
	}
}