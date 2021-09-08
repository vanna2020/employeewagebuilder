package com.company;
import java.util.Random;
public class Main {

    public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NO_OF_WORKING_DAYS = 20;

    public static void main(String[] args) {
        int empHours = 0;
        int empWage = 0;
        int totalEmployeeWage = 0;
        // Taking Random values 0 or 1.
        Random random = new Random();
        int empCheck = random.nextInt(3);
        switch (empCheck) {
            case IS_FULL_TIME:
                empHours = 8;
                break;
            case IS_PART_TIME:
                empHours = 4;
                break;
            default:
                empHours = 0;

                for (int day = 1; day <= NO_OF_WORKING_DAYS; day++) {
                    Random = new Random();
                    int empCheck1 = random.nextInt(3);
                    switch (empCheck) {
                        case IS_FULL_TIME:
                            empHours = 8;
                            System.out.print("The wages of Full Time employee is : ");
                            break;
                        case IS_PART_TIME:
                            empHours = 4;
                            System.out.print("The wages of Part time employee is : ");
                            break;
                        default:
                            empHours = 0;
                            System.out.print("The wages of no work employee is : ");
                    }
                    empWage = empHours * EMP_RATE_PER_HOUR;
                    totalEmployeeWage += empWage;
                    System.out.println(empWage);
                }
                empWage = empHours * EMP_RATE_PER_HOUR;
                System.out.println("The daily wages of an employee is : " + empWage);
                System.out.println();
                System.out.print("The total wages of all the emplpoyee for 20 days is : " + totalEmployeeWage);
        }
    }
}