package model;
/**
 * Classe genérica de da abertura de outros componentes, como mouse e monitor pode exemplo.
 * 
 */
public abstract class ComponentPrototype {
	/**
	 * Podendo ter inumeros atributos a ser inicializados.
	 */
    private double price;
    private String name;
    private String seller;
    private String fabric;
    //...

	public abstract String exibirInfo();
 
    public abstract ComponentPrototype clone();
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public String getFabric() {
		return fabric;
	}

	public void setFabric(String fabric) {
		this.fabric = fabric;
	}
 
    public double getPrice() {
        return price;
    }
 
    public void setPrice(double price) {
        this.price = price;
    }
}
