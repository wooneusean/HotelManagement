/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.woon;

/**
 *
 * @author eusea
 */
public class CustomerData extends UserData {

    private String identityCard;
    private String contactNumber;

    public CustomerData(String firstName, String lastName, String identityCard, String contactNumber, String email) {
        super(firstName, lastName, email);
        this.identityCard = identityCard;
        this.contactNumber = contactNumber;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
