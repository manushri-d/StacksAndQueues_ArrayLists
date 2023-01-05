package com.company;

import java.util.ArrayList;

public class Queue {
    private ArrayList<String> data = new ArrayList<>(1);
    public Queue(){
    }
    public void enqueue(String s){
        data.add(s);//adds the value at the end of the queue(because first in first out)
    }
    public String dequeue(){
        String a = data.get(0);//gets the first value
        data.remove(a);//removes it
        return a;
    }
    public String toString(){
        return data.toString();
    }
    public int size(){
        return data.size();
    }
    public String bubbleSort(){
        String temp;
        for (int i = 0; i <data.size()-1 ; i++) {//for loop to iterate to see which values pass the compareTo test
            if(data.get(i).compareTo(data.get(i+1))>0){
                temp = data.get(i+1);//has a temp var to store the replacing value
                data.set(i+1,data.get(i));//replaces the values
                data.set(i,temp);//replaces the values using the temp variable
            }
        }
        return data.toString();
    }
}

