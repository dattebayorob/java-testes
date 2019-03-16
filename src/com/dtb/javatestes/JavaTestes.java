package com.dtb.javatestes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.dtb.javatestes.model.entities.Dto;
import com.dtb.javatestes.model.entities.Entity;
import com.dtb.javatestes.model.entities.builder.EntityBuilder;

public class JavaTestes {
	public static void main(String[] args) {
		List<Dto> dtos = entities()
			.stream().map(Dto::new)
				.collect(Collectors.toList());
		
		dtos.forEach(e -> System.out.println(e));
	}
	public static List<Entity> entities(){
		return Arrays.asList(
				EntityBuilder
					.builder()
						.id(Long.valueOf(1))
						.name("Ana Paula")
						.alias("Nataxa")
						.build(),
				EntityBuilder
					.builder()
						.id(Long.valueOf(2))
						.name("João Lobão")
						.alias("Lobinha")
						.build(),
				EntityBuilder
					.builder()
						.id(Long.valueOf(3))
						.name("Flavio Augusto")
						.alias("Flavinho")
						.build()
				);
	}
}
