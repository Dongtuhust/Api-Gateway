package com.javainuse;

import com.github.javafaker.Faker;

public class FakeData {
	Faker faker = new Faker();

	String name = faker.name().fullName(); // Miss Samanta Schmidt
	String firstName = faker.name().firstName(); // Emory
	String lastName = faker.name().lastName(); // Barton

	String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449

}
