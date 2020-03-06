package com.zipcodewilmington.singlylinkedlist;

import java.util.LinkedList;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList  {
    Node head;

    public void add(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null){ //if this will be the first node in the list
            head = node;
        }
        else{
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void addToStart(int data){
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void addAt(int index, int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(index == 0){
            addToStart(data);
        }
        else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
    }

    public Boolean contains(int data){
        Node temp = head;
        while (temp.next != null){
            if(temp.data == data) {
                return true;
            }
            temp = temp.next;
        }
        if(temp.data == data){
            return true;
        }
        return false;
    }


    public int find(int index){
        Node temp = head;
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
        return temp.next.data;
    }

    public Node getNode(int index){
        Node temp = head;
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
        return temp.next;
    }

    public Node getHead(){
        return head;
    }


    public int size(){
        int sum = 1;
        Node temp = head;
        while (temp.next != null) {
            sum++;
            temp = temp.next;
        }
        return sum;
    }

    public void removeAt(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node temp = head;
            Node temp2 = null;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp2 = temp.next;
            temp.next = temp2.next;
        }

    }


    public void sort(){
        if(size() > 1){
            for (int i = 0; i < size(); i++) {
                Node current = head;
                Node next = current.next;
                for(int j = 0; j < size()-1;j++){
                    if(current.data > next.data){
                        int temp = current.data;
                        current.data = next.data;
                        next.data = temp;
                    }
                    current = next;
                    next = next.next;
                }
            }
        }
    }

    public static SinglyLinkedList copy(SinglyLinkedList original){
        SinglyLinkedList sl = new SinglyLinkedList();
        int originalLength = original.size();
        for (int i = 0; i < originalLength; i++) {
            sl.addAt(i,original.getNode(i).data);
        }
        return sl;
    }

    public String printAllNodes(){
        String s = "";
        Node node = head;
        while (node.next != null){
            System.out.println(node.data);
            s += node.data +"\n";
            node = node.next;
        }
        s+=Integer.toString(node.data);
        System.out.println(node.data);
        return s;
    }


}
