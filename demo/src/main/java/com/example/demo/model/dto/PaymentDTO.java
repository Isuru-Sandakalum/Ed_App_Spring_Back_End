package com.example.demo.model.dto;

import com.example.demo.model.Payment;

public class PaymentDTO {
    private Integer paymentId;
    private String fullName;
    private String email;
    private String address;
    private String city;
    private String District;
    private String PostalCode;
    private String cardName;
    private String number;
    private String exMonth;
    private String exYear;
    private String cvv;

    public PaymentDTO() {

    }

    public PaymentDTO(Payment payment) {
        this.paymentId = payment.getPaymentId();
        this.fullName = payment.getFullName();
        this.email = payment.getEmail();
        this.address = payment.getAddress();
        this.city = payment.getCity();
        this.District = payment.getDistrict();
        this.PostalCode = payment.getPostalCode();
        this.cardName = payment.getCardName();
        this.number = payment.getNumber();
        this.exMonth = payment.getExMonth();
        this.exYear = payment.getExYear();
        this.cvv = payment.getCvv();
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
