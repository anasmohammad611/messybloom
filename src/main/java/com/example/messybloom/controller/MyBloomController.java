package com.example.messybloom.controller;

import com.example.messybloom.dto.ValueReq;
import com.example.messybloom.service.BloomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/myBloom")
public class MyBloomController {

    @Autowired
    private BloomService bloomService;

    @PostMapping("/checkIfExists")
    ResponseEntity<?> checkIfExistsMyBloom(@RequestBody ValueReq valueReq) {
        return new ResponseEntity<>(bloomService.checkIfExistsMyBloom(valueReq), HttpStatus.OK);
    }

    @PostMapping("/addValueToMyBloomFilter")
    ResponseEntity<?> addValueToMyBloomFilterMyBloom(@RequestBody ValueReq valueReq) {
        return new ResponseEntity<>(bloomService.addValueToMyBloomFilterMyBloom(valueReq), HttpStatus.OK);
    }
}