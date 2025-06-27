package com.UnitTesting;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.example.*;

import org.junit.jupiter.api.Test;

public class Testing
{
    @Test
    void testAdd()
    {
       int x = Exercise1.add(1,2);
       assertEquals(x,3);
    }

    @Test
    void testAddTrue()
    {
        assertTrue(Exercise1.add(2, 2) == 4);
    }

    @Test
    void testAddFalse()
    {
        assertFalse(Exercise1.add(2, 2) == 5);
    }

    @Test
    void testNull()
    {
        String str = null;
        assertNull(str);
    }

    @Test
    void testNotNull()
    {
        Object obj = new Object();
        assertNotNull(obj);
    }
}