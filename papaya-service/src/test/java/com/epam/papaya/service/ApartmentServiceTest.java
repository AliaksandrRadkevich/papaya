package com.epam.papaya.service;

import org.junit.Test;

import com.epam.papaya.api.apartment.IApartment;
import com.epam.papaya.api.service.IApartmentService;
import com.epam.papaya.domain.apartment.Apartment;
import com.epam.papaya.repository.IApartmentRepository;
import static org.mockito.Mockito.*;

/**
 * 
 * @author Anastasiya_Bomko
 */
public class ApartmentServiceTest {

    @Test
    public void testSaveApartment() {
        IApartment apartment = new Apartment();
        apartment.setNumber(1);
        apartment.setPrice(100d);
        IApartmentRepository apartmentRepository = mock(IApartmentRepository.class);
        IApartmentService apartmentService = new ApartmentService(apartmentRepository);
        apartmentService.save(apartment);
        verify(apartmentRepository).save(eq(apartment));
    }

}
