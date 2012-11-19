package com.epam.papaya.api.apartment;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Tregubenkov_Evgenij
 */
public class ApartmentStatusTest {

    private static final String TEST_FREE = "Free";

    private static final String TEST_BOOKED = "Booked";

    private static final String TEST_OCCUPIED = "Occupied";

    @Test
    public void testGetters() {
        ApartmentStatus object = ApartmentStatus.FREE;
        Assert.assertEquals(object.getStatus(), TEST_FREE);
        object = ApartmentStatus.BOOKED;
        Assert.assertEquals(object.getStatus(), TEST_BOOKED);
        object = ApartmentStatus.OCCUPIED;
        Assert.assertEquals(object.getStatus(), TEST_OCCUPIED);
    }
}
