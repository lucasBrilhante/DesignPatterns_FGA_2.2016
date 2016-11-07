package model;

public class BrickHouse extends House{
	
	public BrickHouse(){
		super();
	}

	@Override
	protected Material factoryMethod() {
		
		return new Brick();
	}

}
