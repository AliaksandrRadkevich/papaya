package com.epam.papaya.domain.apartment;

import java.util.Date;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.epam.papaya.api.apartment.IPhoto;
import com.epam.papaya.domain.StoredObject;

/**
 * @author Evgenij_Tregubenkov
 */
public class Photo extends StoredObject implements IPhoto {

    /**
     * Data of photo.
     */
    private byte[] data;

    /**
     * Name.
     */
    private String name;

    /**
     * Date.
     */
    private Date date;

    /**
     * Description.
     */
    private String description;

    @Override
    public byte[] getData() {
        return data;
    }

    @Override
    public void setData(byte[] data) {
        this.data = data;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public void setDate(Date date) {
        this.date = date;
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
        Photo rhs = (Photo) obj;
        return new EqualsBuilder().appendSuper(super.equals(obj))
                .append("data", rhs.data)
                .append("name", rhs.name)
                .append("date", rhs.date)
                .append("description", rhs.description)
                .isEquals();
    }

    // hard-coded, randomly chosen, non-zero, odd number
    // ideally different for each class
    @Override
    public int hashCode() {
        return new HashCodeBuilder(93, 11)
                .append(data)
                .append(name)
                .append(date)
                .append(description)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("data", data)
                .append("name", name)
                .append("date", date)
                .append("description", description)
                .toString();
      }
}
