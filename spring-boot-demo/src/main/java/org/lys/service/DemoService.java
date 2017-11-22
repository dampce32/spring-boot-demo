package org.lys.service;

import org.lys.domain.Person;

public interface DemoService {
	public Person savePersonWithRollBack(Person person);
	public Person savePersonWithoutRollBack(Person person);
	
	Person save(Person person);

	void remove(Long id);

	Person findOne(Person person);

}
