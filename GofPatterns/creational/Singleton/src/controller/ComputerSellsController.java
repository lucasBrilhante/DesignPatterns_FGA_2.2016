package controller;

import java.util.ArrayList;
import java.util.List;

import model.Computer;

/**
 * 
 * Esta classe é o exemplo prático do padrão singleton. Se existir mais de uma classe
 * desta rodando no código, existiram duas listas de computadores que nunca se encontrarão.
 *
 */
public class ComputerSellsController {
	/**
	 * Instancia da classe a ser mantinda a fim de compartilhar a informação "computers"
	 */
	private static ComputerSellsController instance;
	/**
	 * Dado a ser compartilhado
	 */
	private List<Computer> computers = new ArrayList<Computer>();
	/**
	 * Used to now next id
	 */
	private static int nextToInsert = 0;
	/**
	 * Private constructor
	 */
	private ComputerSellsController(){
	}
	/**
	 * Este método caracteriza o padrão singleton, onde uma instancia desta classe
	 * só pode ser criada a partir deste método. Se uma instancia já existir, ele retornará
	 * a existente, se não, criará uma nova.
	 * Synchronized significa que este método poderá ser acessado em várias threads diferentes
	 * e ainda sim, manterá a integridade da instancia. 
	 * 
	 * @return instancia de ComputerSellsController
	 */
	public static synchronized ComputerSellsController getInstance(){
		if(instance == null){
			instance = new ComputerSellsController();
		}else{
			//Nothing to do
		}
		return instance;
	}
	
	public void SellComputer(){
		Computer computer = new Computer(nextToInsert++);
		computers.add(computer);
	}
	
	public String generateSellsReport(){
		return "Computadores vendidos até agora: " + computers.size();
	}
	
}
