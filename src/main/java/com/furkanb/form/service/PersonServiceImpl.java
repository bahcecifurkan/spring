package com.furkanb.form.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.furkanb.form.dao.PersonDao;
import com.furkanb.form.model.Person;

@Service("personService")
@Transactional
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonDao personDao;

	@Override
	public void savePerson(Person person) {
		personDao.savePerson(person);
	}

	@Override
	public List<Person> listPerson() {
		return personDao.listPerson();
	}

}
