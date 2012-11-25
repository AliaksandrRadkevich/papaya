package com.epam.papaya.api.apartment;

import java.util.List;

/**
 * @author Tregubenkov_Evgenij
 */
public interface IRoom {

    /**
     * @return the area
     */
    Double getArea();

    /**
     * @param area the area to set
     */
    void setArea(Double area);

    /**
     * @return the photos
     */
    List<IPhoto> getPhotos();

    /**
     * @param photos the photos to set
     */
    void setPhotos(List<IPhoto> photos);

    /**
     * @return the beds
     */
    Integer getBeds();

    /**
     * @param beds the beds to set
     */
    void setBeds(Integer beds);
}
