package com.example.messybloom.bloom;

import com.google.common.hash.Hashing;

import java.nio.charset.Charset;
import java.util.BitSet;

public class MyBloom {

    private final int bitSize;
    private final BitSet bitSet;


    public MyBloom(int size) {
        this.bitSize = size;
        this.bitSet = new BitSet(size);
    }

    public void add(String value) {
        int hash1 = Hashing.murmur3_32_fixed().hashString(value, Charset.defaultCharset()).asInt();
        int hash2 = Hashing.murmur3_128().hashString(value, Charset.defaultCharset()).asInt();

        bitSet.set(Math.abs(hash1) % bitSize, true);
        bitSet.set(Math.abs(hash2) % bitSize, true);
    }

    public boolean contains(String value) {
        int hash1 = Hashing.murmur3_32_fixed().hashString(value, Charset.defaultCharset()).asInt();
        int hash2 = Hashing.murmur3_128().hashString(value, Charset.defaultCharset()).asInt();

        return bitSet.get(Math.abs(hash1) % bitSize) && bitSet.get(Math.abs(hash2) % bitSize);
    }

}
