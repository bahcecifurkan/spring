package com.furkanb.form.service;

import java.util.List;

import com.furkanb.form.model.Person;

public interface PersonService {
	void savePerson(Person person);

	List<Person> listPerson();
}
