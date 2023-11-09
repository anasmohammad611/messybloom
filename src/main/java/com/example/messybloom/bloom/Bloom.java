package com.example.messybloom.bloom;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;
import org.springframework.stereotype.Component;

import java.nio.charset.Charset;


public class Bloom {
    private final BloomFilter<String> bloomFilter;

    public Bloom(int expectedInsertions, double falsePositiveRate) {
        this.bloomFilter = BloomFilter.create(Funnels.stringFunnel(Charset.defaultCharset()), expectedInsertions, falsePositiveRate);
    }

    public void add(String value) {
        bloomFilter.put(value);
    }

    public boolean contains(String value) {
        return bloomFilter.mightContain(value);
    }
}
