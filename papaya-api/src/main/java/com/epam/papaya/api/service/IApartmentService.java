package com.epam.papaya.api.service;

import java.util.List;

import com.epam.papaya.api.apartment.IApartment;

/**
 * @author Anastasiya_Bomko
 */
public interface IApartmentService {

    /**
     * Returns all Apartments.
     * 
     * @return List of all Apartments
     */
    List<IApartment> get();

    /**
     * Saves the apartment.
     * @param apartment The Apartment being saved.
     */
    void save(IApartment apartment);
}
