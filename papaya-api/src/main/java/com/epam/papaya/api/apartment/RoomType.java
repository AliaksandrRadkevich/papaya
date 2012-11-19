package com.epam.papaya.api.apartment;

public enum RoomType {
    /**
     * Type for standart.
     */
    STANDART("Standart"),
    /**
     * Type for vip.
     */
    VIP("VIP");

    /**
     * The type.
     */
    private String type;

    /**
     * Constructor.
     * @param type type
     */
    private RoomType(String type) {
        this.setType(type);
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
}
