package com.epam.papaya.api.apartment;

import java.util.List;

import com.epam.papaya.api.StoredObject;

/**
 * @author Tregubenkov_Evgenij
 */
public class Room extends StoredObject {

    private Double area;

    private List<byte[]> photos;

    private Integer beds;

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
     * @return the photos
     */
    public List<byte[]> getPhotos() {
        return photos;
    }

    /**
     * @param photos the photos to set
     */
    public void setPhotos(List<byte[]> photos) {
        this.photos = photos;
    }

    /**
     * @return the beds
     */
    public Integer getBeds() {
        return beds;
    }

    /**
     * @param beds the beds to set
     */
    public void setBeds(Integer beds) {
        this.beds = beds;
    }

}
