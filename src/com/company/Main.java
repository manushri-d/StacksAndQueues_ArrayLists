package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Stack rowMates = new Stack();//create a new stack
        rowMates.push("T");//add all the names in order of row seat from left to right
        rowMates.push("S");
        rowMates.push("Sara");
        rowMates.push("Manushri");
        rowMates.push("P");
        rowMates.push("J");
        System.out.println(rowMates.pop());//pops them(should print the opposite of what entered)
        System.out.println(rowMates.pop());
        System.out.println(rowMates.pop());
        System.out.println(rowMates.pop());
        System.out.println(rowMates.pop());
        System.out.println(rowMates.pop());

        boolean v = true;
        Queue userA = new Queue();
        Scanner user = new Scanner(System.in);//import the scanner
        while(v==true){
            System.out.println("1. Add person to queue\n2.Remove person from queue\n3.Print queue\n4.Bubble sort\n9.Exit");
            int resp = user.nextInt();//gets the int and goes into the loop to see which one will print
            if(resp==1){
                System.out.println("Enter a name to add");
                String a = user.next();
                userA.enqueue(a);//enqueue the value
            } else if (resp == 2){
                System.out.println("Enter a name to remove");
                String a = user.next();
                userA.dequeue();
            } else if (resp == 3){
                System.out.println(userA.toString());
            } else if (resp == 4){
                System.out.println(userA.bubbleSort());
            } else {
                v = false;//false the variable to exit the while loop
            }
        }
    }
}
