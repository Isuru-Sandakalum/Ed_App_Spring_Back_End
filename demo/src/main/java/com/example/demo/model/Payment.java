package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "paymentid")
    private Integer paymentId;

    @Column(name = "fullname")
    private String fullName;

    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "district")
    private String District;

    @Column(name = "postalcode")
    private String PostalCode;

    @Column(name = "cardname")
    private String cardName;

    @Column(name = "number")
    private String number;

    @Column(name = "exmonth")
    private String exMonth;

    @Column(name = "exyear")
    private String exYear;

    @Column(name = "cvv")
    private String cvv;


    public Payment() {

    }

    public Payment(Integer paymentId, String fullName, String email, String address, String city, String district, String postalCode, String cardName, String number, String exMonth, String exYear, String cvv) {
        this.paymentId = paymentId;
        this.fullName = fullName;
        this.email = email;
        this.address = address;
        this.city = city;
        this.District = district;
        this.PostalCode = postalCode;
        this.cardName = cardName;
        this.number = number;
        this.exMonth = exMonth;
        this.exYear = exYear;
        this.cvv = cvv;
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String postalCode) {
        PostalCode = postalCode;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getExMonth() {
        return exMonth;
    }

    public void setExMonth(String exMonth) {
        this.exMonth = exMonth;
    }

    public String getExYear() {
        return exYear;
    }

    public void setExYear(String exYear) {
        this.exYear = exYear;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
}
