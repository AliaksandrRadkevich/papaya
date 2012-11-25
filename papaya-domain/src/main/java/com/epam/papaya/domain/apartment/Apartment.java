package com.epam.papaya.domain.apartment;

import java.util.List;
import java.util.Map;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.epam.papaya.api.apartment.ApartmentStatus;
import com.epam.papaya.api.apartment.IApartment;
import com.epam.papaya.api.apartment.IRoom;
import com.epam.papaya.api.apartment.RoomType;
import com.epam.papaya.domain.StoredObject;

/**
 * @author Tregubenkov_Evgenij
 */
@Document(collection = Apartment.COLLECTION_NAME)
public class Apartment extends StoredObject implements IApartment {

    /**
     * Collection name for mongo.
     */
    public static final String COLLECTION_NAME = "apartment";

    /**
     * Number.
     */
    private Integer number;

    /**
     * Rooms list.
     */
    @DBRef
    private List<IRoom> rooms;

    /**
     * Room type.
     */
    private RoomType type;

    /**
     * Price.
     */
    private Double price;

    /**
     * Area.
     */
    private Double area;

    /**
     * Status.
     */
    private ApartmentStatus status;

    /**
     * Options map.
     */
    private Map<String, Object> options;

    /**
     * Description.
     */
    private String description;

    /**
     * Capacity.
     */
    private Integer capacity;

    @Override
    public Integer getNumber() {
        return number;
    }

    @Override
    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public List<IRoom> getRooms() {
        return rooms;
    }

    @Override
    public void setRooms(List<IRoom> rooms) {
        this.rooms = rooms;
    }

    @Override
    public RoomType getType() {
        return type;
    }

    @Override
    public void setType(RoomType type) {
        this.type = type;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public Double getArea() {
        return area;
    }

    @Override
    public void setArea(Double area) {
        this.area = area;
    }

    @Override
    public ApartmentStatus getStatus() {
        return status;
    }

    @Override
    public void setStatus(ApartmentStatus status) {
        this.status = status;
    }

    @Override
    public Map<String, Object> getOptions() {
        return options;
    }

    @Override
    public void setOptions(Map<String, Object> options) {
        this.options = options;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public Integer getCapacity() {
        return capacity;
    }

    @Override
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}
