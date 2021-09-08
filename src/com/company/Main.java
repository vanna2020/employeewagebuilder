package com.company;
import java.util.Random;
public class Main {

        public static final int IS_FULL_TIME = 2;
        public static final int IS_PART_TIME = 1;
        public static final int EMP_RATE_PER_HOUR = 20;

        public static void main (String[]args){
            int IS_FULL_TIME1 = 2;
            int IS_PART_TIME2 = 1;
            int EMP_RATE_PER_HOUR = 20;
            int empHours = 0;
            int empWage = 0;
            // Taking Random values 0 or 1.
            Random random = new Random();
            int empCheck = random.nextInt(3);
            // Checking the condition.
            if (empCheck == IS_FULL_TIME) {
                empHours = 8;
            } else if (empCheck == IS_PART_TIME) {
                empHours = 4;
            } else {
                empHours = 0;
                switch (empCheck) {
                    case IS_FULL_TIME:
                        empHours = 8;
                        break;
                    case IS_PART_TIME:
                        empHours = 4;
                        break;
                    default:
                        empHours = 0;
                }
                empWage = empHours * EMP_RATE_PER_HOUR;
                System.out.println("The daily wages of an employee is : " + empWage);
            }
        }
    }
}