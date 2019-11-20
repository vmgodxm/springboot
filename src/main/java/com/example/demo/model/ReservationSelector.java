package com.example.demo.model;

/**
 * ReservationSelector
 */
public class ReservationSelector {
    private String designerId;
    private int month;

    public ReservationSelector() { }

    public ReservationSelector(String designerId, int month) {
        this.designerId = designerId;
        this.month = month;
    }

    public String getDesignerId() {
        return this.designerId;
    }

    public void setDesignerId(String designerId) {
        this.designerId = designerId;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "{" +
            " designerId='" + getDesignerId() + "'" +
            ", month='" + getMonth() + "'" +
            "}";
    }
}