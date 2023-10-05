package com.example.demo.controller;

import com.example.demo.model.Payment;
import com.example.demo.model.Student;
import com.example.demo.model.dto.CourseDTO;
import com.example.demo.model.dto.PaymentDTO;
import com.example.demo.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @RequestMapping(value = "/addPayment", method = RequestMethod.POST)
    public ResponseEntity<PaymentDTO> addPayment(@RequestBody PaymentDTO paymentDTO) {
        PaymentDTO paymentDTO1 = this.paymentService.saveAndUpdate(paymentDTO);

        return new ResponseEntity<>(paymentDTO1, HttpStatus.CREATED);
    }


}
