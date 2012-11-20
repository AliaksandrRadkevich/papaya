package com.epam.papaya.api.apartment;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Tregubenkov_Evgenij
 */
public class RoomTypeTest {

    private static final String TEST_STANDART = "Standart";

    private static final String TEST_VIP = "VIP";

    @Test
    public void testGetters() {
        RoomType object = RoomType.STANDART;
        Assert.assertEquals(object.getType(), TEST_STANDART);
        object = RoomType.VIP;
        Assert.assertEquals(object.getType(), TEST_VIP);
    }
}
