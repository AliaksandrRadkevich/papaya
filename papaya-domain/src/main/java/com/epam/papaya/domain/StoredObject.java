package com.epam.papaya.domain;

import com.epam.papaya.api.IStoredObject;

/**
 * @author Tregubenkov_Evgenij
 */
public class StoredObject implements IStoredObject {

    private Long id;

    /** {@inheritDoc} */
    public Long getId() {
        return id;
    }

    /** {@inheritDoc} */
    public void setId(Long id) {
        this.id = id;
    }
}
