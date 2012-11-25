package com.epam.papaya.api.apartment;

import java.util.Date;

/**
 * @author Tregubenkov_Evgenij
 */
public interface IPhoto {

    /**
     * @return the data
     */
    byte[] getData();

    /**
     * @param data the data to set
     */
    void setData(byte[] data);

    /**
     * @return the name
     */
    String getName();

    /**
     * @param name the name to set
     */
    void setName(String name);

    /**
     * @return the date
     */
    Date getDate();

    /**
     * @param date the date to set
     */
    void setDate(Date date);

    /**
     * @return the description
     */
    String getDescription();

    /**
     * @param description the description to set
     */
    void setDescription(String description);
}
