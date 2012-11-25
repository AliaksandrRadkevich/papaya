package com.epam.papaya.domain.apartment;

import java.util.Date;

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
}
