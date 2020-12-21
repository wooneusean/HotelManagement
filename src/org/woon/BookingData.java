/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.woon;

import java.awt.Color;
import java.io.Serializable;
import java.lang.reflect.Array;

/**
 *
 * @author eusea
 */
public class BookingData implements Serializable {

    // Day constants
    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;
    public static final int SUNDAY = 7;

    private boolean isBooked = false;
    private Color bookingColor;
    private CustomerData customer = BookingTable.vacantCustomer;
    private int[] daysBooked;
    private int roomNumber;
    private double roomPrice = 350.00;

    public BookingData(CustomerData customer, int roomNumber, boolean isBooked, int... daysBooked) {
        this.customer = customer;
        int r = (int) (Math.random() * 255);
        int g = (int) (Math.random() * 255);
        int b = (int) (Math.random() * 255);
        bookingColor = new Color(r, g, b);
        this.isBooked = isBooked;
        this.roomNumber = roomNumber;
        this.daysBooked = (int[]) Array.newInstance(int.class, daysBooked.length);
        for (int i = 0; i < daysBooked.length; i++) {
            this.daysBooked[i] = daysBooked[i];
        }
    }

    public int[] getDaysBooked() {
        return daysBooked;
    }

    public static String dayToString(int dayInt) {
        switch (dayInt) {
            case BookingData.MONDAY:
                return "Monday";
            case BookingData.TUESDAY:
                return "Tuesday";
            case BookingData.WEDNESDAY:
                return "Wednesday";
            case BookingData.THURSDAY:
                return "Thursday";
            case BookingData.FRIDAY:
                return "Friday";
            case BookingData.SATURDAY:
                return "Saturday";
            case BookingData.SUNDAY:
                return "Sunday";
            default:
                return "Unknown";
        }
    }

    public static int stringToDay(String dayString) {
        switch (dayString.toLowerCase()) {
            case "monday":
                return BookingData.MONDAY;
            case "tuesday":
                return BookingData.TUESDAY;
            case "wednesday":
                return BookingData.WEDNESDAY;
            case "thursday":
                return BookingData.THURSDAY;
            case "friday":
                return BookingData.FRIDAY;
            case "saturday":
                return BookingData.SATURDAY;
            case "sunday":
                return BookingData.SUNDAY;
            default:
                return -1;
        }
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setCustomer(String firstName, String lastName, String identityNumber, String contactNumber, String email) {
        this.customer = new CustomerData(firstName, lastName, identityNumber, contactNumber, email);
    }

    public void setCustomer(CustomerData customer) {
        this.customer = customer;
    }

    public CustomerData getCustomerData() {
        return this.customer;
    }

    public Color getColor() {
        return bookingColor;
    }

    public void setColor(Color color) {
        bookingColor = color;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    @Override
    public String toString() {
        return customer.getFirstName() + " " + customer.getLastName();
    }

}
