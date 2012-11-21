package com.epam.papaya.domain.apartment;

import java.util.List;
import java.util.Map;

import com.epam.papaya.api.apartment.*;
import com.epam.papaya.domain.StoredObject;

/**
 * @author Tregubenkov_Evgenij
 */
public class Apartment extends StoredObject implements IApartment {

    private Integer number;

    private List<IRoom> rooms;

    private RoomType type;

    private Double price;

    private Double area;

    private ApartmentStatus status;

    private Map<String, Object> options;

    private String description;

    private Integer capacity;

    /** {@inheritDoc} */
    public Integer getNumber() {
        return number;
    }

    /** {@inheritDoc} */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /** {@inheritDoc} */
    public List<IRoom> getRooms() {
        return rooms;
    }

    /** {@inheritDoc} */
    public void setRooms(List<IRoom> rooms) {
        this.rooms = rooms;
    }

    /** {@inheritDoc} */
    public RoomType getType() {
        return type;
    }

    /** {@inheritDoc} */
    public void setType(RoomType type) {
        this.type = type;
    }

    /** {@inheritDoc} */
    public Double getPrice() {
        return price;
    }

    /** {@inheritDoc} */
    public void setPrice(Double price) {
        this.price = price;
    }

    /** {@inheritDoc} */
    public Double getArea() {
        return area;
    }

    /** {@inheritDoc} */
    public void setArea(Double area) {
        this.area = area;
    }

    /** {@inheritDoc} */
    public ApartmentStatus getStatus() {
        return status;
    }

    /** {@inheritDoc} */
    public void setStatus(ApartmentStatus status) {
        this.status = status;
    }

    /** {@inheritDoc} */
    public Map<String, Object> getOptions() {
        return options;
    }

    /** {@inheritDoc} */
    public void setOptions(Map<String, Object> options) {
        this.options = options;
    }

    /** {@inheritDoc} */
    public String getDescription() {
        return description;
    }

    /** {@inheritDoc} */
    public void setDescription(String description) {
        this.description = description;
    }

    /** {@inheritDoc} */
    public Integer getCapacity() {
        return capacity;
    }

    /** {@inheritDoc} */
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}