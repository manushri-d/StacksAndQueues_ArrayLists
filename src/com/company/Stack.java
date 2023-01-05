package com.company;

import java.util.ArrayList;

public class Stack {
    private ArrayList<String> data = new ArrayList<>(1);
    public Stack(){
    }
    public void push(String s){
        data.add(0,s);//adds at a specific value(first value, because first in, last out)
    }
    public String pop(){
        String a = data.get(0);//gets the value
        data.remove(a);//removes this value from the arraylist
        return a;
    }
    public String toString(){
        return data.toString();
    }
    public int size(){
        return data.size();
    }
}
