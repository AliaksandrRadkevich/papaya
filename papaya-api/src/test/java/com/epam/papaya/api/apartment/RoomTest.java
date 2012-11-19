package com.epam.papaya.api.apartment;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Tregubenkov_Evgenij
 */
public class RoomTest {

    private static final Long TEST_ID = 1L;

    private static final Double TEST_AREA = 2.0;

    private static final List<byte[]> TEST_PHOTOS = new ArrayList<>();

    private static final Integer TEST_BEDS = 3;

    @Test
    public void testGettersAndSetters() {
        testGetters(testSetters());
    }

    private void testGetters(Room object) {
        Assert.assertEquals(object.getId(), TEST_ID);
        Assert.assertEquals(object.getArea(), TEST_AREA);
        Assert.assertEquals(object.getPhotos(), TEST_PHOTOS);
        Assert.assertEquals(object.getBeds(), TEST_BEDS);
    }

    private Room testSetters() {
        Room object = new Room();
        object.setId(TEST_ID);
        object.setArea(TEST_AREA);
        object.setPhotos(TEST_PHOTOS);
        object.setBeds(TEST_BEDS);
        return object;
    }
}
