package org.lys.dao;

import java.util.List;

import javax.persistence.NamedQuery;

import org.lys.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface PersonRepository extends JpaRepository<Person, Long> {
	List<Person> findByAddress(String address);//方法名查询
	
	Person findByNameAndAddress(String name,String address);//方法名查询 
	//@Query查询
	@Query("select p from Person p where p.name= :name and p.address= :address")
	
	Person withNameAndAddressQuery(@Param("name")String name,@Param("address")String address);
	//@NamedQuery查询
	Person withNameAndAddressNamedQuery(String name,String address);

}
