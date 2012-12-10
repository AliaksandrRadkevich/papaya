package com.epam.papaya.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.epam.papaya.api.apartment.IApartment;

/**
 * @author Anastasiya_Bomko
 */
public interface IApartmentRepository extends MongoRepository<IApartment, Long> {

}
