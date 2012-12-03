package com.epam.papaya.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.epam.papaya.domain.apartment.Room;

/**
 * @author Anastasiya_Bomko
 */
public interface IRoomRepository extends MongoRepository<Room, Long> {

}
