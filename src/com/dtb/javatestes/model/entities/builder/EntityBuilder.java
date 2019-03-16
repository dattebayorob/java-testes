package com.dtb.javatestes.model.entities.builder;

import com.dtb.javatestes.model.entities.Entity;

public class EntityBuilder{
	
	private Entity entity;
	
	public EntityBuilder() {
		this.entity = new Entity();
	}
	
	public static EntityBuilder builder() {
		return new EntityBuilder();
	}
	
	public EntityBuilder id(Long id) {
		this.entity.setId(id);
		return this;
	}
	
	public EntityBuilder name(String name) {
		this.entity.setName(name);
		return this;
	}
	
	public EntityBuilder alias(String alias) {
		this.entity.setAlias(alias);
		return this;
	}
	
	public Entity build() {
		return this.entity;
	}

}
