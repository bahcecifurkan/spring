package com.furkanb.form.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.furkanb.form.model.Person;

@Repository("personDao")
public class PersonDaoImpl extends AbstractDao implements PersonDao {

	@Override
	public void savePerson(Person person) {
		persist(person);
	}

	@Override
	public List<Person> listPerson() {
		Criteria criteria = getSession().createCriteria(Person.class);
		return (List<Person>) criteria.list();
	}

}
