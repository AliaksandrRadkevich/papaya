package com.epam.papaya.api.apartment;

import java.util.List;
import java.util.Map;

/**
 * @author Tregubenkov_Evgenij
 */
public interface IApartment {

    /**
     * @return the number
     */
    Integer getNumber();

    /**
     * @param number the number to set
     */
    void setNumber(Integer number);

    /**
     * @return the rooms
     */
    List<IRoom> getRooms();

    /**
     * @param rooms the rooms to set
     */
    void setRooms(List<IRoom> rooms);

    /**
     * @return the type
     */
    RoomType getType();

    /**
     * @param type the type to set
     */
    void setType(RoomType type);

    /**
     * @return the price
     */
    Double getPrice();

    /**
     * @param price the price to set
     */
    void setPrice(Double price);

    /**
     * @return the area
     */
    Double getArea();

    /**
     * @param area the area to set
     */
    void setArea(Double area);

    /**
     * @return the status
     */
    ApartmentStatus getStatus();

    /**
     * @param status the status to set
     */
    void setStatus(ApartmentStatus status);

    /**
     * @return the options
     */
    Map<String, Object> getOptions();

    /**
     * @param options the options to set
     */
    void setOptions(Map<String, Object> options);

    /**
     * @return the description
     */
    String getDescription();

    /**
     * @param description the description to set
     */
    void setDescription(String description);

    /**
     * @return the capacity
     */
    Integer getCapacity();

    /**
     * @param capacity the capacity to set
     */
    void setCapacity(Integer capacity);
}
