package com.UnitTesting;
import static org.junit.jupiter.api.Assertions.*;
import com.example.Exercise;
import org.junit.jupiter.api.*;

public class Testing
{
    @BeforeEach
    void setUp()
    {
        System.out.println("Setting up test...");
    }

    @AfterEach
    void tearDown()
    {
        System.out.println("Tearing down test...");
    }

    @Test
    void testAdd()
    {
        int a = 1;
        int b = 2;
        int result = Exercise.add(a, b);
        assertEquals(3, result);
    }

    @Test
    void testAddTrue()
    {
        int a = 2, b = 2;
        int result = Exercise.add(a, b);
        assertTrue(result == 4);
    }

    @Test
    void testAddFalse()
    {
        int a = 2, b = 2;
        int result = Exercise.add(a, b);
        assertFalse(result == 5);
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