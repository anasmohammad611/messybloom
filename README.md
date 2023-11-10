# Bloom Filter Implementation in Java

This repository demonstrates two Java implementations of a Bloom filter – a space-efficient probabilistic data structure used to test set membership with potential false positives.

## Guava Bloom Filter

**Overview:**  
Utilizes Google Guava's `BloomFilter` class, offering a convenient and efficient way to create and manage Bloom filters.


## MurmurHash Bloom Filter

**Overview:**  
Implements a custom Bloom filter using MurmurHash3 – a widely-used non-cryptographic hash function.


Here's an example output illustrating that when the Bloom filter indicates an element is not present, it is undoubtedly absent. However, when the Bloom filter suggests an element is present, it is not definitive; there is a possibility that the element may or may not be present.

![output-bloomFilter](https://github.com/anasmohammad611/messybloom/assets/42072227/b4947773-eb70-4135-9b05-5b6b413f41d6)



### Bloom Filter Use case

Bloom filters find applications in scenarios where quick and memory-efficient set membership tests with an acceptable probability of false positives are essential. Some common use cases include:

1. Caching Systems:
Rapidly check if an item is in the cache before resource-intensive retrieval.

2. Network Routers:
Build forwarding tables to make quick decisions about destination IP addresses.

3. Duplicate Detection:
Identify likely duplicates in datasets.

4. Blockchain and Cryptocurrencies:
Verify the presence of transactions in a blockchain without downloading the entire transaction history.
