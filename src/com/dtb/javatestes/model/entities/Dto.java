package com.dtb.javatestes.model.entities;

public class Dto {
	private String name;
	public Dto(Entity e) {
		this.name = e.getName()+" the "+e.getAlias();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Dto [name=" + name + "]";
	}
	
	
}
