package com.epam.papaya.domain;

import com.epam.papaya.api.IStoredObject;

/**
 * @author Tregubenkov_Evgenij
 */
public class StoredObject implements IStoredObject {

    /**
     * Id.
     */
    private Long id;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
}
