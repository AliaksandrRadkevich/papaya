package com.epam.papaya.domain.apartment;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Tregubenkov_Evgenij
 */
public class PhotoTest {

    private static final Long TEST_ID = 1L;

    private static final byte[] TEST_DATA = new byte[] {1, 2, 3};

    private static final String TEST_NAME = "Test";

    private static final Date TEST_DATE = new Date();

    private static final String TEST_DESCRIPTION = "Test2";

    @Test
    public void testGettersAndSetters() {
        testGetters(testSetters());
    }

    private void testGetters(Photo object) {
        Assert.assertEquals(object.getId(), TEST_ID);
        Assert.assertEquals(object.getData(), TEST_DATA);
        Assert.assertEquals(object.getName(), TEST_NAME);
        Assert.assertEquals(object.getDate(), TEST_DATE);
        Assert.assertEquals(object.getDescription(), TEST_DESCRIPTION);
    }

    private Photo testSetters() {
        Photo object = new Photo();
        object.setId(TEST_ID);
        object.setData(TEST_DATA);
        object.setName(TEST_NAME);
        object.setDate(TEST_DATE);
        object.setDescription(TEST_DESCRIPTION);
        return object;
    }
}
