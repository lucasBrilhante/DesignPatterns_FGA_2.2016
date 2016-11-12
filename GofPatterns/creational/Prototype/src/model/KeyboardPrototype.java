package model;

public class KeyboardPrototype extends ComponentPrototype{
	
	/**
	 * Construtor aberto. Utilizado pelo cliente.
	 */
	public KeyboardPrototype(){
		this.setPrice(0.0);
		//imagine esses atributos serem preenchidos do banco de dados que fica em outro server.
		this.setFabric("Zona franca de Manaus");
		this.setName("Teclado Razer");
		this.setSeller("Best Buy");
	}
	/**
	 * Construtor privado que clona o objeto keyboard e seta apenas o necessário e o retorna.
	 * 
	 * @param keyboardPrototype
	 */
	private KeyboardPrototype(KeyboardPrototype keyboardPrototype) {
		this.setPrice(keyboardPrototype.getPrice());
		this.setName(keyboardPrototype.getName());
		this.setFabric(keyboardPrototype.getFabric());
		this.setSeller(keyboardPrototype.getSeller());
	}
	/**
	 * Print
	 */
	@Override
	public String exibirInfo() {
		return "Loja vendendo:"+this.getSeller()+" \nNome:"+this.getName()+" \nPreço:" + this.getPrice() + "\n";
	}
	/**
	 * Utiliza o construtor privado que seta o atributo desejado, o preço, e mantem o resto
	 * de acordo com o objeto clonado.
	 */
	@Override
	public ComponentPrototype clone() {
		return new KeyboardPrototype(this);
	}
	

}
