package com.epam.papaya.domain.apartment;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
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

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        Apartment rhs = (Apartment) obj;
        return new EqualsBuilder().appendSuper(super.equals(obj))
                .append("number", rhs.number)
                .append("rooms", rhs.rooms)
                .append("type", rhs.type)
                .append("price", rhs.price)
                .append("area", rhs.area)
                .append("status", rhs.status)
                .append("options", rhs.options)
                .append("description", rhs.description)
                .append("capacity", rhs.capacity)
                .isEquals();
    }

    // hard-coded, randomly chosen, non-zero, odd number
    // ideally different for each class
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(number)
                .append(rooms)
                .append(type)
                .append(price)
                .append(area)
                .append(status)
                .append(options)
                .append(description)
                .append(capacity)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("number", number)
                .append("rooms", rooms)
                .append("type", type)
                .append("price", price)
                .append("area", area)
                .append("status", status)
                .append("options", options)
                .append("description", description)
                .append("capacity", capacity)
                .toString();
      }
}
