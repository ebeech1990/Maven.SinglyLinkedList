package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    SinglyLinkedList sl = new SinglyLinkedList();

    @Before
    public void init(){
        sl.add(5);
        sl.add(2);
        sl.add(11);
    }

    @Test
    public void addToStartTest(){
       sl.addToStart(3);
       int expected = 3;
       int actual = sl.head.data;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void addAtTest(){
        sl.addAt(1,7);
        int expected = 1;
        //int actual = sl.
       // Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeTest(){

    }

    @Test
    public void containsTest(){

    }

    @Test
    public void findTest(){

    }

    @Test
    public void sizeTest(){

    }

    @Test
    public void getTest(){

    }

    @Test
    public void copyTest(){

    }

    @Test
    public void sortTest(){

    }
}
