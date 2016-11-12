package view;

import controller.ComputerSellsController;
import model.Computer;

/**
 * 
 * Neste exemplo estaremos simulando uma vendedora de computadores com dois caixas,
 * que mesmos  em contextos diferentes, mantem a mesma instancia da controladora.
 * 
 */
public class MainScreen {

	public static void main(String[] args) {
		firstRegister();
		/* Mesmo em contextos diferentes, a instancia da constroladora
		   continua a mesma.*/
		SecondRegister();
		
	}
	/**
	 * Simula uma vendedora de carros
	 */
	private static void SecondRegister() {
		ComputerSellsController secondInstance = ComputerSellsController.getInstance();
		
		secondInstance.SellComputer();
		
		secondInstance.SellComputer();
	
		System.out.println(secondInstance.generateSellsReport());
		
		
	}
	/**
	 * Simula outra uma vendedora de carros
	 */
	private static void firstRegister() {
		ComputerSellsController firstInstance = ComputerSellsController.getInstance();
		
		firstInstance.SellComputer();
		
		firstInstance.SellComputer();
	
		System.out.println(firstInstance.generateSellsReport());
		
		
	}

}
