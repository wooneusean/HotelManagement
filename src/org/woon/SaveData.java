package org.woon;

// https://www.geeksforgeeks.org/serialization-in-java/
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SaveData {

    private static String bookingDataPath = "save/bookingData.dat";
    private static String employeeDataPath = "save/employeeData.dat";
    private static File saveDirectory = new File("save");

    public static void saveEmployeeData() {
        try {
            if (!saveDirectory.exists()) {
                saveDirectory.mkdirs();
            }

            //Saving of object in a file 
            FileOutputStream file = new FileOutputStream(employeeDataPath);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object 
            out.writeObject(LoginFrame.employeeList);

            out.close();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void loadEmployeeData() {
        try {
            // https://stackoverflow.com/questions/1816673/how-do-i-check-if-a-file-exists-in-java
            File employeeData = new File(employeeDataPath);
            if (employeeData.exists() && !employeeData.isDirectory()) {
                // Reading the object from a file 
                FileInputStream file = new FileInputStream(employeeData);
                ObjectInputStream in = new ObjectInputStream(file);

                // Method for deserialization of object 
                LoginFrame.employeeList = (ArrayList<EmployeeData>) in.readObject();

                in.close();
                file.close();
            } else {
                System.out.println("[WARN]\tEmployee file is not found. Adding default employee data.");
                LoginFrame.employeeList.add(new EmployeeData("pass", "emp", "Default", "Employee", "none"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void saveBookingData() {
        try {
            if (!saveDirectory.exists()) {
                saveDirectory.mkdirs();
            }

            //Saving of object in a file 
            FileOutputStream file = new FileOutputStream(bookingDataPath);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object 
            out.writeObject(MenuFrame.bookings);

            out.close();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void loadBookingData() {
        try {
            File bookingData = new File(bookingDataPath);
            if (bookingData.exists() && !bookingData.isDirectory()) {
                // Reading the object from a file 
                FileInputStream file = new FileInputStream(bookingData);
                ObjectInputStream in = new ObjectInputStream(file);

                // Method for deserialization of object 
                MenuFrame.bookings = (ArrayList<BookingData>) in.readObject();

                in.close();
                file.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
