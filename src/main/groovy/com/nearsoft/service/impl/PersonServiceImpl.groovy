package com.nearsoft.service.impl

import com.nearsoft.domain.Person
import com.nearsoft.service.PersonService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class PersonServiceImpl implements PersonService {

    @Override
    List<Person> findAll() {
        Person.findAll()
    }

    @Override
    Person findById(Long id) {
        Person.findById(id)
    }

    @Override
    Person save(Person person) {
        person.save(flush:true)
    }

    @Override
    boolean delete(Long id){
        Person person = findById(id)
        if(person) person.delete(flush:true)
    }
}
