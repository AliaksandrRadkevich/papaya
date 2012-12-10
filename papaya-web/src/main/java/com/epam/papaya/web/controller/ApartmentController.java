package com.epam.papaya.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.epam.papaya.api.apartment.IApartment;
import com.epam.papaya.api.service.IApartmentService;


/**
 * 
 * @author Anastasiya_Bomko
 */
@Controller
public class ApartmentController {

    /**
     * apartmentService.
     */
    private IApartmentService apartmentService;

    /**
     * Constructor.
     *
     * @param apartmentService {@link IApartmentService}
     */
    @Autowired
    public ApartmentController(IApartmentService apartmentService) {
        this.apartmentService = apartmentService;
    }

    /**
     * Get apartments.
     * @return mav ModelAndView
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView getApartments() {
        ModelAndView mav = new ModelAndView();
        List<IApartment> apartments = apartmentService.get();
        mav.getModel().put("apartments", apartments);
        //mav.setViewName("apartment-list");
        return mav;
    }
}
