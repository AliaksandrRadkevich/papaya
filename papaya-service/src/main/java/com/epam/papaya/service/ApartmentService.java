package com.epam.papaya.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epam.papaya.api.apartment.IApartment;
import com.epam.papaya.api.service.IApartmentService;
import com.epam.papaya.repository.IApartmentRepository;

/**
 * ApartmentService.
 *
 * @author Anastasiya_Bomko
 */
@Service
public class ApartmentService implements IApartmentService {

    /**
     * Apartment repository.
     */
    private IApartmentRepository apartmentRepository;

    /**
     * Constructor.
     *
     * @param apartmentRepository the apartment repository
     */
    @Autowired
    public ApartmentService(IApartmentRepository apartmentRepository) {
        this.apartmentRepository = apartmentRepository;
    }

    @Override
    public List<IApartment> get() {
        return apartmentRepository.findAll();
    }

    @Override
    public void save(IApartment apartment) {
        apartmentRepository.save(apartment);
    }

}
