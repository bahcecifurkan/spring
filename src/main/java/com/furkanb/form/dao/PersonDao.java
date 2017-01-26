package com.furkanb.form.dao;

import java.util.List;

import com.furkanb.form.model.Person;

public interface PersonDao {

	void savePerson(Person person);

	List<Person> listPerson();
}
