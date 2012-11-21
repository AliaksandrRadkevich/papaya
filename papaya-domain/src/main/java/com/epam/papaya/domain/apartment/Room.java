package com.epam.papaya.domain.apartment;

import java.util.List;

import com.epam.papaya.api.apartment.IRoom;
import com.epam.papaya.domain.StoredObject;

/**
 * @author Tregubenkov_Evgenij
 */
public class Room extends StoredObject implements IRoom {

    private Double area;

    private List<byte[]> photos;

    private Integer beds;

    /** {@inheritDoc} */
    public Double getArea() {
        return area;
    }

    /** {@inheritDoc} */
    public void setArea(Double area) {
        this.area = area;
    }

    /** {@inheritDoc} */
    public List<byte[]> getPhotos() {
        return photos;
    }

    /** {@inheritDoc} */
    public void setPhotos(List<byte[]> photos) {
        this.photos = photos;
    }

    /** {@inheritDoc} */
    public Integer getBeds() {
        return beds;
    }

    /** {@inheritDoc} */
    public void setBeds(Integer beds) {
        this.beds = beds;
    }

}