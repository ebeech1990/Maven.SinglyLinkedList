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
        int expected = 7;
        int actual = sl.find(1);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeAtTest(){
        sl.removeAt(1);
        int expected = 11;
        int actual = sl.find(1);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void containsTest(){
        Assert.assertTrue( sl.contains(11));
    }

    @Test
    public void findTest(){
        sl.find(1);
        int expected = 2;
        int actual = sl.find(1);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void sizeTest(){
        int expected = 3;
        int actual = sl.size();
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void copyTest(){
        SinglyLinkedList sl2 = SinglyLinkedList.copy(sl);
        Assert.assertFalse(sl2==sl);
    }

    @Test
    public void sortTest(){

        sl.sort();

        String expected = "2\n5\n11";
        String actual = sl.printAllNodes();
        Assert.assertEquals(expected,actual);
    }
}
