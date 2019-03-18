package com.dtb.javatestes;

import com.dtb.javatestes.model.Entity;

public class JavaTestes {
	public static void main(String[] args) {
		Entity e = Entity
				.buider()
					.id(Long.valueOf(1))
					.name("Nome Qualquer")
					.enabled(true)
				.build();
		System.out.println(e.toString());
	}
}
