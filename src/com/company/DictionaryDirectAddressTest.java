package com.company;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryDirectAddressTest {

    private DictionaryDirectAddress<Integer> dict;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        dict = new DictionaryDirectAddress<>(10);
    }

    @org.junit.jupiter.api.Test
    void put() {
        dict.put(3,2);
        assertEquals(2, dict.get(3));
    }

    @org.junit.jupiter.api.Test
    void get() {
        dict.put(12,2);
        assertEquals(2, dict.get(12));
        assertNull(dict.get(9));
    }

    @org.junit.jupiter.api.Test
    void remove() {
        dict.put(5,111);
        assertEquals(111, dict.get(5));
        assertEquals(111, dict.remove(5));
        assertNull(dict.get(5));
    }

    @org.junit.jupiter.api.Test
    void contains() {
        dict.put(11,111);
        dict.put(9,111);
        dict.put(13,111);
        assertTrue(dict.contains(11));
        assertTrue(dict.contains(13));
        assertFalse(dict.contains(8));
    }

    @org.junit.jupiter.api.Test
    void size() {
        dict.put(11,111);
        dict.put(10,111);
        dict.put(1,111);
        assertEquals(3, dict.size());
        dict.remove(10);
        assertEquals(2, dict.size());
    }
}