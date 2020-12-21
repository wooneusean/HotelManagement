/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.woon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author eusea
 */
public class MenuFrame extends javax.swing.JFrame {

    public static BookingTable bookingData = new BookingTable();
    public static ArrayList<BookingData> bookings = new ArrayList<>();
    private TableRowSorter<BookingTable> sorter;

    /**
     * Creates new form Menu
     */
    public MenuFrame(EmployeeData employee) {
        initComponents();

        sorter = new TableRowSorter<BookingTable>(bookingData);
        tblBookings.setRowSorter(sorter);

        lblCurrentEmployee.setText(employee.getFullName());
        SaveData.loadBookingData();
        refreshTable();
    }

    //<editor-fold defaultstate="collapsed" desc="Dummy Data">
    void dummyData() {
        // <editor-fold defaultstate="collapsed" desc="Data of People">
        Object[][] people = {
            new Object[]{
                "Gobalakrishnan",
                "Ramasamy",
                "4916 1884 0057 6409",
                "012-951 3411",
                "gobalo@gmail.com"
            },
            new Object[]{
                "Tiong Niau",
                "Yit",
                "4024 0071 0785 7111",
                "018-296 1608",
                "tiongyit@gmail.com"
            },
            new Object[]{
                "Nurul Fasehah",
                "Nik Isyraq",
                "4716 1510 7718 4057",
                "015-599 5076",
                "nurulfaq@gmail.com"
            },
            new Object[]{
                "Darlina Baha",
                "Syed Salman",
                "6011 4728 1546 0311",
                "015-324 3404",
                "darlian@gmail.com"
            },
            new Object[]{
                "Hui Loy",
                "Zhi",
                "6011 7867 3865 3045",
                "015-190 6109",
                "huilzhi@gmail.com"
            },
            new Object[]{
                "Haji Hamka",
                "Che Borhan",
                "2221 3223 8189 4325",
                "012-457 1056",
                "hajihan@gmail.com"
            },
            new Object[]{
                "Chee Won",
                "Ziau",
                "6011 3397 8223 1621",
                "015-154 4206",
                "cheewau@gmail.com"
            },
            new Object[]{
                "Thang Yeu",
                "Teng",
                "2720 5091 1109 2859",
                "015-569 0876",
                "thangng@gmail.com"
            },
            new Object[]{
                "Stella Gee",
                "Liong Tam",
                "2640 8712 0893 3610",
                "015-396 4369",
                "stelam@gmail.com"
            },
            new Object[]{
                "Loke Onn",
                "Xiu",
                "2640 8712 0893 3610",
                "015-396 4369",
                "stelam@gmail.com"
            },
            new Object[]{
                "Nur Syahira",
                "Wahbillah",
                "2640 8712 0893 3610",
                "015-396 4369",
                "stelam@gmail.com"
            },
            new Object[]{
                "Nur Hjh Noorain Zamree",
                "Che Ruknuddin",
                "2640 8712 0893 3610",
                "015-396 4369",
                "stelam@gmail.com"
            },
            new Object[]{
                "Kiran",
                "Serbegeth Surendran",
                "2640 8712 0893 3610",
                "015-396 4369",
                "stelam@gmail.com"
            },
            new Object[]{
                "Mohammad Syed Ashraf",
                "Syed Zulhilmi Wasil",
                "2640 8712 0893 3610",
                "015-396 4369",
                "stelam@gmail.com"
            },
            new Object[]{
                "Yeoh Thew",
                "Xie",
                "2640 8712 0893 3610",
                "015-396 4369",
                "stelam@gmail.com"
            },
            new Object[]{
                "Ewe Bang",
                "Khum",
                "2640 8712 0893 3610",
                "015-396 4369",
                "stelam@gmail.com"
            },
            new Object[]{
                "Taqiah Batisah",
                "Shahmi Rashid",
                "2640 8712 0893 3610",
                "015-396 4369",
                "stelam@gmail.com"
            },
            new Object[]{
                "Oong Jien",
                "Dao",
                "2640 8712 0893 3610",
                "015-396 4369",
                "stelam@gmail.com"
            },
            new Object[]{
                "Robert Neo",
                "Ziak Mon",
                "2640 8712 0893 3610",
                "015-396 4369",
                "stelam@gmail.com"
            },
            new Object[]{
                "Ewe Yu",
                "Loong",
                "2640 8712 0893 3610",
                "015-396 4369",
                "stelam@gmail.com"
            },
            new Object[]{
                "Marimuthu",
                "Kumutha",
                "2640 8712 0893 3610",
                "015-396 4369",
                "stelam@gmail.com"
            },
            new Object[]{
                "Kwok Sui",
                "Fan",
                "2640 8712 0893 3610",
                "015-396 4369",
                "stelam@gmail.com"
            },
            new Object[]{
                "Muhamad Nik",
                "Shawal Hanafi",
                "2640 8712 0893 3610",
                "015-396 4369",
                "stelam@gmail.com"
            },
            new Object[]{
                "Nurul Shafiqa",
                "Che Zizi",
                "2640 8712 0893 3610",
                "015-396 4369",
                "stelam@gmail.com"
            },
            new Object[]{
                "Bishan Prakash",
                "Vivasvan Manikavasagam",
                "2640 8712 0893 3610",
                "015-396 4369",
                "stelam@gmail.com"
            },
            new Object[]{
                "Maniam Jayaseelan",
                "Sidhu",
                "2640 8712 0893 3610",
                "015-396 4369",
                "stelam@gmail.com"
            },
            new Object[]{
                "Zabrina Rao",
                "Kundan Lal",
                "2640 8712 0893 3610",
                "015-396 4369",
                "stelam@gmail.com"
            },
            new Object[]{
                "Noor Hajjah",
                "Mardhiah Zulfikar",
                "2640 8712 0893 3610",
                "015-396 4369",
                "stelam@gmail.com"
            },
            new Object[]{
                "Ramkarpal",
                "Thamil",
                "2640 8712 0893 3610",
                "015-396 4369",
                "stelam@gmail.com"
            },
            new Object[]{
                "Ganga",
                "Mahathevan",
                "2640 8712 0893 3610",
                "015-396 4369",
                "stelam@gmail.com"
            },
            new Object[]{
                "Khew Choi",
                "Sik",
                "2640 8712 0893 3610",
                "015-396 4369",
                "stelam@gmail.com"
            },
            new Object[]{
                "Khew Choi",
                "Sik",
                "2640 8712 0893 3610",
                "015-396 4369",
                "stelam@gmail.com"
            },
            new Object[]{
                "Yeap Jia",
                "Yung",
                "2640 8712 0893 3610",
                "015-396 4369",
                "stelam@gmail.com"
            },
            new Object[]{
                "Goh Chei",
                "Onn",
                "2640 8712 0893 3610",
                "015-396 4369",
                "stelam@gmail.com"
            },
            new Object[]{
                "Khor Zhen",
                "Win",
                "2640 8712 0893 3610",
                "015-396 4369",
                "stelam@gmail.com"
            },
            new Object[]{
                "Carl",
                "Johnson",
                "2640 8712 0893 3610",
                "015-396 4369",
                "stelam@gmail.com"
            }
        };
        // </editor-fold>

        bookingData.setAllVacant();
        bookings.clear();
        for (int i = 0; i < people.length; i++) {
            CustomerData customerData = new CustomerData(
                    String.valueOf(people[i][0]), String.valueOf(people[i][1]),
                    String.valueOf(people[i][2]), String.valueOf(people[i][3]),
                    String.valueOf(people[i][4])
            );

            int roomNumber = (getRandomNumberInRange(1, bookingData.getNumRoomsPerFloor()) + (getRandomNumberInRange(1, bookingData.getNumFloors()) * 100));
            ArrayList<Integer> daysBooked = bookingData.getDaysBooked(roomNumber);
            while (daysBooked.size() >= 7) {
                roomNumber = (getRandomNumberInRange(1, bookingData.getNumRoomsPerFloor()) + (getRandomNumberInRange(1, bookingData.getNumFloors()) * 100));
                daysBooked = bookingData.getDaysBooked(roomNumber);
            }
            System.out.println("Selected room: " + roomNumber);
            System.out.println("Days booked: " + daysBooked);

            ArrayList<Integer> daysToBeBooked = new ArrayList<>();
            for (int j = 1; j < 8; j++) {
                if (daysBooked.indexOf(j) == -1) {
                    daysToBeBooked.add(j);
                }
            }

            System.out.println("Days can be booked: " + daysToBeBooked);

            boolean selectionIsConsecutive = false;
            List<Integer> randomDaysToBook = null;
            int numLooped = 0;
            while (!selectionIsConsecutive && numLooped < 10) {
                int numRoomsToBook = getRandomNumberInRange(1, daysToBeBooked.size());
                int startNumRoomsToBook = getRandomNumberInRange(0, daysToBeBooked.size() - 1);
                if (numRoomsToBook < startNumRoomsToBook) {
                    int temp = numRoomsToBook;
                    numRoomsToBook = startNumRoomsToBook;
                    startNumRoomsToBook = temp;
                } else if (startNumRoomsToBook == numRoomsToBook) {
                    numRoomsToBook++;
                }

                System.out.println(String.format("start: %d end: %d", startNumRoomsToBook, numRoomsToBook));

                randomDaysToBook = daysToBeBooked.subList(startNumRoomsToBook, numRoomsToBook);

                selectionIsConsecutive = areConsecutive(toIntArray(randomDaysToBook), randomDaysToBook.size());
                numLooped++;
            }

            System.out.println("Days to be booked: " + randomDaysToBook + "\n");

            bookings.add(new BookingData(customerData, roomNumber, true, toIntArray(randomDaysToBook)));
            bookingData.mapBookings(bookings);
        }
    }

    // https://www.geeksforgeeks.org/check-if-array-elements-are-consecutive/
    boolean areConsecutive(int arr[], int n) {
        if (n < 1) {
            return false;
        }

        /* 1) Get the minimum element in array */
        int min = getMin(arr, n);

        /* 2) Get the maximum element in array */
        int max = getMax(arr, n);

        /* 3) max - min + 1 is equal to n,  then only check all elements */
        if (max - min + 1 == n) {
            /* Create a temp array to hold visited flag of all elements. 
               Note that, calloc is used here so that all values are initialized  
               as false */
            boolean visited[] = new boolean[n];
            int i;
            for (i = 0; i < n; i++) {
                /* If we see an element again, then return false */
                if (visited[arr[i] - min] != false) {
                    return false;
                }

                /* If visited first time, then mark the element as visited */
                visited[arr[i] - min] = true;
            }

            /* If all elements occur once, then return true */
            return true;
        }
        return false; // if (max - min  + 1 != n) 
    }

    /* UTILITY FUNCTIONS */
    int getMin(int arr[], int n) {
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    int getMax(int arr[], int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    int getRandomNumberInRange(int min, int max) {

        if (min > max) {
            throw new IllegalArgumentException("max must be greater than min");
        } else if (min == max) {
            return min;
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    int[] toIntArray(List<Integer> list) {
        int[] ret = new int[list.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = list.get(i);
        }
        return ret;
    }//</editor-fold>

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableCellRenderer bookingRenderer = new BookingRenderer();
        tblBookings = new JTable(new BookingTable()) {
            public TableCellRenderer getCellRenderer(int row, int column) {
                if (column >= 1) {
                    return bookingRenderer;
                } else {
                    return super.getCellRenderer(row, column);
                }
            }
        };

        tblBookings.setDefaultRenderer(BookingData.class, bookingRenderer);
        tblBookings.setModel(bookingData);
        tblBookings.setRowSelectionAllowed(false);
        tblBookings.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jLabel1 = new javax.swing.JLabel();
        lblCurrentEmployee = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnExit = new javax.swing.JMenuItem();
        mnSave = new javax.swing.JMenuItem();
        mnRefresh = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnPreferences = new javax.swing.JMenuItem();

        jCheckBox1.setText("jCheckBox1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard - Hotel Manager");
        setMinimumSize(new java.awt.Dimension(1152, 678));

        jPanel1.setPreferredSize(new java.awt.Dimension(1152, 678));

        tblBookings.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblBookings.setRowHeight(75);
        tblBookings.getTableHeader().setReorderingAllowed(false);
        tblBookings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblBookingsMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblBookings);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Logged in as:");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                generateDummy(evt);
            }
        });

        lblCurrentEmployee.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCurrentEmployee.setText("Test");

        lblLogout.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(0, 51, 255));
        lblLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogout.setText("Log out");
        lblLogout.setAlignmentX(0.5F);
        lblLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogout.setPreferredSize(new java.awt.Dimension(75, 30));
        lblLogout.setVerifyInputWhenFocusTarget(false);
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblLogoutMouseReleased(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSearch.setToolTipText("Search for customers");
        txtSearch.setPreferredSize(new java.awt.Dimension(300, 27));
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCurrentEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCurrentEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("File");

        mnExit.setText("Exit");
        mnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnExitActionPerformed(evt);
            }
        });
        jMenu1.add(mnExit);

        mnSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnSave.setText("Save Bookings");
        mnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSaveActionPerformed(evt);
            }
        });
        jMenu1.add(mnSave);

        mnRefresh.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnRefresh.setText("Refresh Bookings");
        mnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRefreshActionPerformed(evt);
            }
        });
        jMenu1.add(mnRefresh);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        mnPreferences.setText("Registered Employees");
        mnPreferences.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPreferencesActionPerformed(evt);
            }
        });
        jMenu2.add(mnPreferences);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblBookingsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBookingsMouseReleased
        int row = tblBookings.convertRowIndexToModel(tblBookings.rowAtPoint(evt.getPoint()));
        int col = tblBookings.convertColumnIndexToModel(tblBookings.columnAtPoint(evt.getPoint()));
        if (row >= 0 && col >= 1) {
            BookingData selectedCell = (BookingData) bookingData.getValueAt(row, col);
            if (selectedCell != null) {
                if (selectedCell.isBooked()) {
                    new BookingDetailsDialog(this, true, selectedCell).setVisible(true);
                } else {
                    int roomNumber = Integer.valueOf(String.valueOf(bookingData.getValueAt(row, 0)).substring(5));
                    new AddBookingDialog(this, true, roomNumber).setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_tblBookingsMouseReleased

    private void lblLogoutMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseReleased
        this.setVisible(false);
        new LoginFrame().setVisible(true);
    }//GEN-LAST:event_lblLogoutMouseReleased

    private void generateDummy(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generateDummy
        dummyData();
        SaveData.saveBookingData();
        refreshTable();
    }//GEN-LAST:event_generateDummy

    // https://docs.oracle.com/javase/tutorial/uiswing/components/table.html#sorting
    private void filterRooms() {
        RowFilter<BookingTable, Integer> rf = new RowFilter<BookingTable, Integer>() {
            @Override
            public boolean include(RowFilter.Entry<? extends BookingTable, ? extends Integer> entry) {
                BookingTable model = entry.getModel();
                ArrayList<BookingData> bookingDataList = new ArrayList<>();

                for (int i = 1; i < entry.getValueCount(); i++) {
                    BookingData data = (BookingData) model.getValueAt(entry.getIdentifier(), i);
                    if (data.getCustomerData().getFirstName().toLowerCase().contains(txtSearch.getText().toLowerCase())
                            || data.getCustomerData().getLastName().toLowerCase().contains(txtSearch.getText().toLowerCase())
                            || data.getCustomerData().getIdentityCard().toLowerCase().contains(txtSearch.getText().toLowerCase())) {
                        return true;
                    }
                }
                return false;
            }
        };
        sorter.setRowFilter(rf);
    }

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        filterRooms();
    }//GEN-LAST:event_txtSearchKeyReleased

    private void mnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRefreshActionPerformed
        refreshTable();
    }//GEN-LAST:event_mnRefreshActionPerformed

    private void mnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnExitActionPerformed

    private void mnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSaveActionPerformed
        SaveData.saveBookingData();
    }//GEN-LAST:event_mnSaveActionPerformed

    private void mnPreferencesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPreferencesActionPerformed
        new PreferencesDialog(this, true).setVisible(true);
    }//GEN-LAST:event_mnPreferencesActionPerformed

    public static void refreshTable() {
        bookingData.mapBookings(bookings);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCurrentEmployee;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JMenuItem mnExit;
    private javax.swing.JMenuItem mnPreferences;
    private javax.swing.JMenuItem mnRefresh;
    private javax.swing.JMenuItem mnSave;
    private javax.swing.JTable tblBookings;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
