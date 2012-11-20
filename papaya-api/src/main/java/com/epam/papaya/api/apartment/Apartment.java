package com.epam.papaya.api.apartment;

import java.util.List;
import java.util.Map;

import com.epam.papaya.api.StoredObject;

/**
 * @author Tregubenkov_Evgenij
 */
public class Apartment extends StoredObject {

    private Integer number;

    private List<Room> rooms;

    private RoomType type;

    private Double price;

    private Double area;

    private ApartmentStatus status;

    private Map<String, Object> options;

    private String description;

    private Integer capacity;

    /**
     * @return the number
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * @return the rooms
     */
    public List<Room> getRooms() {
        return rooms;
    }

    /**
     * @param rooms the rooms to set
     */
    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    /**
     * @return the type
     */
    public RoomType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(RoomType type) {
        this.type = type;
    }

    /**
     * @return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * @return the area
     */
    public Double getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(Double area) {
        this.area = area;
    }

    /**
     * @return the status
     */
    public ApartmentStatus getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(ApartmentStatus status) {
        this.status = status;
    }

    /**
     * @return the options
     */
    public Map<String, Object> getOptions() {
        return options;
    }

    /**
     * @param options the options to set
     */
    public void setOptions(Map<String, Object> options) {
        this.options = options;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the capacity
     */
    public Integer getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}
