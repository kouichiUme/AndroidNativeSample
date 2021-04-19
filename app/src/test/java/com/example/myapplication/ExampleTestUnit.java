package com.example.myapplication;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleTestUnit {


    /**
     * Example local unit test, which will execute on the development machine (host).
     *
     * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
     */

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testSystemout(){
        System.out.println("system out test");

    }

}
