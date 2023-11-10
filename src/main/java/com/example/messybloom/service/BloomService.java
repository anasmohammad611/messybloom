package com.example.messybloom.service;

import com.example.messybloom.bloom.Bloom;
import com.example.messybloom.bloom.MyBloom;
import com.example.messybloom.dto.ValueReq;
import org.springframework.stereotype.Service;

@Service
public class BloomService {

    private final Bloom externalBloomFilter = new Bloom(5, 0.01);
    private final MyBloom myBloomFilter = new MyBloom(8);

    public Boolean checkIfExists(ValueReq valueReq) {
        System.out.println("check: " + valueReq.getValue() + " Found in filter?: " + externalBloomFilter.contains(valueReq.getValue()));
        return externalBloomFilter.contains(valueReq.getValue());
    }

    public Boolean addValueToMyBloomFilter(ValueReq valueReq) {
        System.out.println("Add To My Bloom: " + valueReq.getValue());
        externalBloomFilter.add(valueReq.getValue());
        return true;
    }

    public Boolean checkIfExistsMyBloom(ValueReq valueReq) {
        System.out.println("check: " + valueReq.getValue() + " Found in filter?: " + myBloomFilter.contains(valueReq.getValue()));
        return myBloomFilter.contains(valueReq.getValue());
    }

    public Boolean addValueToMyBloomFilterMyBloom(ValueReq valueReq) {
        System.out.println("Add To My Bloom: " + valueReq.getValue());
        myBloomFilter.add(valueReq.getValue());
        return true;
    }
}
