package com.epam.papaya.domain;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Tregubenkov_Evgenij
 */
public class StoredObjectTest {

    private static final Long TEST_ID = 1L;

    @Test
    public void testGettersAndSetters() {
        testGetters(testSetters());
    }

    private void testGetters(StoredObject object) {
        Assert.assertEquals(object.getId(), TEST_ID);
    }

    private StoredObject testSetters() {
        StoredObject object = new StoredObject();
        object.setId(TEST_ID);
        return object;
    }
}
