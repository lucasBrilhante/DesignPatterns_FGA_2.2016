package model;

import java.util.ArrayList;
import java.util.List;

public abstract class House {
	private List<Material> materials = new ArrayList<Material>(); 
	
	public House(){
	}
	
	protected abstract Material factoryMethod();
	
	public void addMaterial(){
		Material material = new Material();
		materials.add(material);
	}
	
	public int getNumberOfMaterials(){
		return materials.size();
	}
}
