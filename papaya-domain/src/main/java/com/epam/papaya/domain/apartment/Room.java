package com.epam.papaya.domain.apartment;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.epam.papaya.api.apartment.IPhoto;
import com.epam.papaya.api.apartment.IRoom;
import com.epam.papaya.domain.StoredObject;

/**
 * @author Tregubenkov_Evgenij
 */
@Document(collection = Room.COLLECTION_NAME)
public class Room extends StoredObject implements IRoom {

    /**
     * Collection name for mongo.
     */
    public static final String COLLECTION_NAME = "room";

    /**
     * Area.
     */
    private Double area;

    /**
     * Photo list.
     */
    private List<IPhoto> photos;

    /**
     * Number of beds.
     */
    private Integer beds;

    @Override
    public Double getArea() {
        return area;
    }

    @Override
    public void setArea(Double area) {
        this.area = area;
    }

    @Override
    public List<IPhoto> getPhotos() {
        return photos;
    }

    @Override
    public void setPhotos(List<IPhoto> photos) {
        this.photos = photos;
    }

    @Override
    public Integer getBeds() {
        return beds;
    }

    @Override
    public void setBeds(Integer beds) {
        this.beds = beds;
    }

}
