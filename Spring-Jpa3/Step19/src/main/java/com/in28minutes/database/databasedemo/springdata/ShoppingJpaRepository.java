package com.in28minutes.database.databasedemo.springdata;

import org.springframework.data.jpa.repository.JpaRepository;
import com.in28minutes.database.databasedemo.entity.Person;

public interface ShoppingJpaRepository extends JpaRepository<Person, Integer>
{
	
}
