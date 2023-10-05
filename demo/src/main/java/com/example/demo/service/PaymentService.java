package com.example.demo.service;
import com.example.demo.jpa.PaymentDAO;
import com.example.demo.model.Payment;
import com.example.demo.model.dto.PaymentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentDAO paymentDAO;

    //saveAndUpdate
    public PaymentDTO saveAndUpdate(PaymentDTO paymentDTO){
        Payment payment = null;
        if (paymentDTO.getPaymentId()!=null){
            payment = this.paymentDAO.findByPaymentId(paymentDTO.getPaymentId());
        }else{
            payment = new Payment();
        }
        payment.setPaymentId(paymentDTO.getPaymentId());
        payment.setCardName(paymentDTO.getCardName());
        payment.setAddress(paymentDTO.getAddress());
        payment.setCity(paymentDTO.getCity());
        payment.setPostalCode(paymentDTO.getPostalCode());
        payment.setCvv(paymentDTO.getCvv());
        payment.setDistrict(paymentDTO.getDistrict());
        payment.setEmail(paymentDTO.getEmail());
        payment.setFullName(paymentDTO.getFullName());
        payment.setExMonth(paymentDTO.getExMonth());
        payment.setExYear(paymentDTO.getExYear());
        payment.setNumber(paymentDTO.getNumber());

        payment= paymentDAO.saveAndFlush(payment);
        PaymentDTO paymentDTO1 = new PaymentDTO(payment);
        return paymentDTO1;

    }

}
