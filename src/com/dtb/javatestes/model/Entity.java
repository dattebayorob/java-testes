package com.dtb.javatestes.model;

public class Entity {
	private Long id;
	private String name;
	private Boolean enabled;
	
	public Entity(Long id, String name, Boolean enabled) {
		this.id = id;
		this.name = name;
		this.enabled = enabled;
	}
	
	
	
	@Override
	public String toString() {
		return "Entity [id=" + id + ", name=" + name + ", enabled=" + enabled + "]";
	}



	public static EntityBuilder buider() {
		return new EntityBuilder();
	}
	public static class EntityBuilder{
		private Long id;
		private String name;
		private Boolean enabled;
		
		public EntityBuilder id(Long id) {
			this.id = id;
			return this;
		}
		public EntityBuilder name(String name) {
			this.name = name;
			return this;
		}
		public EntityBuilder enabled(Boolean enabled) {
			this.enabled = enabled;
			return this;
		}
		public Entity build() {
			return new Entity(id, name, enabled);
		}
	}
	
	
	
}
