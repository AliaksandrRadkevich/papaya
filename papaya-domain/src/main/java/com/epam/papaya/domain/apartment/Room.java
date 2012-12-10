package com.epam.papaya.domain.apartment;

import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.epam.papaya.api.apartment.IPhoto;
import com.epam.papaya.api.apartment.IRoom;
import com.epam.papaya.domain.StoredObject;

/**
 * @author Tregubenkov_Evgenij
 */
public class Room extends StoredObject implements IRoom {

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
        Room rhs = (Room) obj;
        return new EqualsBuilder().appendSuper(super.equals(obj))
                .append("area", rhs.area)
                .append("photos", rhs.photos)
                .append("beds", rhs.beds)
                .isEquals();
    }

    // hard-coded, randomly chosen, non-zero, odd number
    // ideally different for each class
    @Override
    public int hashCode() {
        return new HashCodeBuilder(55, 13)
                .append(area)
                .append(photos)
                .append(beds)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("area", area)
                .append("photos", photos)
                .append("beds", beds)
                .toString();
      }
}
