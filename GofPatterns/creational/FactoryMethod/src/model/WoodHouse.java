package model;

public class WoodHouse extends House{

	public WoodHouse(){
		super();
	}
	
	@Override
	protected Material factoryMethod() {
		return new Wood();
	}

}
