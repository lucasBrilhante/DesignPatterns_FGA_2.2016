package model;

import java.util.ArrayList;
import java.util.List;

public abstract class House {
	private List<Material> materials = new ArrayList<Material>(); 
	
	public House(){
		Material material1 = new Material();
		Material material2 = new Material();
		
		materials.add(material1);
		materials.add(material2);
	}
	
	protected abstract Material factoryMethod();
	public int getNumberOfMaterials(){
		return materials.size();
	}
}
