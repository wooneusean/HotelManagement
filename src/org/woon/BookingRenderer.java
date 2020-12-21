/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.woon;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author eusea
 */
public class BookingRenderer extends JLabel implements TableCellRenderer {

    private final Color defaultColor = new Color(242, 242, 242);

    public BookingRenderer() {
        setOpaque(true);
    }

    // https://stackoverflow.com/questions/24260853/check-if-color-is-dark-or-light-in-android
    public boolean isColorDark(Color color) {
        double darkness = 1 - (0.299 * color.getRed() + 0.587 * color.getGreen() + 0.114 * color.getBlue()) / 255;
        if (darkness < 0.5) {
            return false; // It's a light color
        } else {
            return true; // It's a dark color
        }
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object bookingCell, boolean isSelected, boolean hasFocus, int row, int column) {

        if (bookingCell != null && column >= 1) {
            BookingData currentCell = (BookingData) bookingCell;
            int correctedRow = table.convertRowIndexToModel(row);
            int correctedCol = table.convertColumnIndexToModel(column);
            String fullName = currentCell.getCustomerData().getFullName();
            if (correctedCol >= 2) {
                if (((BookingData) ((BookingTable) table.getModel()).getValueAt(correctedRow, correctedCol - 1)) != currentCell) {
                    setText("<html><div style=\"text-align: center;padding: 0 8px;\">" + fullName + "</div></html>");
                } else {
                    setText("");
                }
            } else if (correctedCol == 1) {
                setText("<html><div style=\"text-align: center;padding: 0 8px\">" + fullName + "</div></html>");
            }

            if (currentCell.isBooked()) {
                setFont(new Font("Segoe UI", Font.BOLD, 16));
                setBackground(currentCell.getColor());
                if (isColorDark(currentCell.getColor())) {
                    setForeground(Color.WHITE);
                } else {
                    setForeground(Color.BLACK);
                }
            } else {
                setFont(new Font("Segoe UI", Font.PLAIN, 16));
                setBackground((correctedRow % 2 == 0) ? Color.white : defaultColor);
                setForeground(Color.BLACK);
            }
            setVerticalAlignment(JLabel.CENTER);
            setHorizontalAlignment(JLabel.CENTER);
        }

        return this;
    }

}
