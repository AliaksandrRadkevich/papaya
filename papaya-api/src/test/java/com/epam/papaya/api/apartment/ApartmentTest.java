package com.epam.papaya.api.apartment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.testng.Assert;

/**
 * @author Tregubenkov_Evgenij
 */
public class ApartmentTest {

    private static final Long TEST_ID = 1L;

    private static final Integer TEST_NUMBER = 2;

    private static final List<Room> TEST_ROOMS = Arrays.asList(new Room[] {new Room()});

    private static final RoomType TEST_TYPE = RoomType.STANDART;

    private static final Double TEST_PRICE = 3.0;

    private static final Double TEST_AREA = 4.0;

    private static final ApartmentStatus TEST_STATUS = ApartmentStatus.FREE;

    private static final Map<String, Object> TEST_OPTIONS = new HashMap<>();

    private static final String TEST_DESCRIPTION = "Test";

    private static final Integer TEST_CAPACITY = 5;

    @Before
    public void init() {
        TEST_OPTIONS.put("Smoking", "Yes");
    }

    @Test
    public void testGettersAndSetters() {
        testGetters(testSetters());
    }

    private void testGetters(Apartment object) {
        Assert.assertEquals(object.getId(), TEST_ID);
        Assert.assertEquals(object.getNumber(), TEST_NUMBER);
        Assert.assertEquals(object.getRooms(), TEST_ROOMS);
        Assert.assertEquals(object.getType(), TEST_TYPE);
        Assert.assertEquals(object.getPrice(), TEST_PRICE);
        Assert.assertEquals(object.getArea(), TEST_AREA);
        Assert.assertEquals(object.getStatus(), TEST_STATUS);
        Assert.assertEquals(object.getOptions(), TEST_OPTIONS);
        Assert.assertEquals(object.getDescription(), TEST_DESCRIPTION);
        Assert.assertEquals(object.getCapacity(), TEST_CAPACITY);
    }

    private Apartment testSetters() {
        Apartment object = new Apartment();
        object.setId(TEST_ID);
        object.setNumber(TEST_NUMBER);
        object.setRooms(TEST_ROOMS);
        object.setType(TEST_TYPE);
        object.setPrice(TEST_PRICE);
        object.setArea(TEST_AREA);
        object.setStatus(TEST_STATUS);
        object.setOptions(TEST_OPTIONS);
        object.setDescription(TEST_DESCRIPTION);
        object.setCapacity(TEST_CAPACITY);
        return object;
    }
}
