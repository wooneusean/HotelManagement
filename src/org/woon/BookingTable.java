/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.woon;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author eusea
 */
// https://docs.oracle.com/javase/tutorial/uiswing/components/table.html
public class BookingTable extends AbstractTableModel {

    public static CustomerData vacantCustomer = new CustomerData("", "", "", "", "");
    public static BookingData vacantBooking = new BookingData(vacantCustomer, 0, false, 0);

    private String[] columnNames = {"Room No.", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    private int numFloors = 2;
    private int numRoomsPerFloor = 10;
    private Object[][] data = new Object[numFloors * numRoomsPerFloor][8];

    public BookingTable() {
        for (int floor = 0; floor < numFloors; floor++) {
            for (int room = 0; room < numRoomsPerFloor; room++) {
                int roomNumber = (100 * (floor + 1)) + (room + 1);
                data[room + (floor * numRoomsPerFloor)][0] = "Room " + String.valueOf(roomNumber);
            }
        }
        setAllVacant();
    }

    public void setAllVacant() {
        for (int floor = 0; floor < numFloors; floor++) {
            for (int room = 0; room < numRoomsPerFloor; room++) {
                for (int day = 1; day < 8; day++) {
                    data[room + (floor * numRoomsPerFloor)][day] = vacantBooking;
                }
            }
        }
    }

    public void mapBookings(ArrayList<BookingData> bookings) {
        setAllVacant();
        for (BookingData booking : bookings) {
            int row = booking.getRoomNumber();
            int floor = Integer.valueOf(String.valueOf(row).substring(0, 1));
            row = (row - (floor * 100) - 1) + ((floor - 1) * 10);
            for (int col : booking.getDaysBooked()) {
                data[row][col] = booking;
            }
        }
        updateTable();
    }

    public ArrayList<Integer> getDaysBooked(int roomNumber) {
        int floor = Integer.valueOf(String.valueOf(roomNumber).substring(0, 1)) - 1;
        int room = Integer.valueOf(String.valueOf(roomNumber).substring(1, 3)) - 1;
        int row = (floor * this.numRoomsPerFloor) + room;

        ArrayList<Integer> listOfDaysBooked = new ArrayList<Integer>();
        for (int i = 1; i < 8; i++) {
            if (data[row][i] != vacantBooking) {
                listOfDaysBooked.add(i);
            }
        }
        return listOfDaysBooked;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }

    public void updateTable() {
        super.fireTableDataChanged();
    }

    public void setValueAt(Object value, int row, int col) {
        data[row][col] = value;
        fireTableCellUpdated(row, col);
    }

    public int getNumFloors() {
        return numFloors;
    }

    public void setNumFloors(int numFloors) {
        this.numFloors = numFloors;
    }

    public int getNumRoomsPerFloor() {
        return numRoomsPerFloor;
    }

    public void setNumRoomsPerFloor(int numRoomsPerFloor) {
        this.numRoomsPerFloor = numRoomsPerFloor;
    }

}
