package com.javatutorial;

import java.util.Scanner;

public class task4 {

    public static void main(String args[]) {

        int marks[] = new int[5];
        int i;
        int total=0, avg;
        Scanner scanner = new Scanner(System.in);


        for(i=0; i<5; i++) {
            System.out.print("Enter Marks of Subject"+(i+1)+":");
            marks[i] = scanner.nextInt();
            total = total + marks[i];
        }
        System.out.println("Your total mark is:" +total );
        avg = total/6;
        System.out.print("The student Grade is: ");
        if(avg>=80)
        {
            System.out.print("A");
        }
        else if(avg>=60 && avg<80)
        {
            System.out.print("B");
        }
        else if(avg>=40 && avg<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
    }
}
