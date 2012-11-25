package com.epam.papaya.api.apartment;

/**
 * @author Tregubenkov_Evgenij
 */
public enum ApartmentStatus {

    /**
     * Type for free.
     */
    FREE("Free"),

    /**
     * Type for booked.
     */
    BOOKED("Booked"),

    /**
     * Type for occupied.
     */
    OCCUPIED("Occupied");

    /**
     * The status.
     */
    private String status;

    /**
     * Constructor.
     * 
     * @param status status
     */
    private ApartmentStatus(String status) {
        this.setStatus(status);
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

}
