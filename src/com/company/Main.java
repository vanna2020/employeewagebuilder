package com.company;
import java.util.Random;
public class Main {

        public static final int IS_FULL_TIME = 2;
        public static final int IS_PART_TIME = 1;
        public static final int EMP_RATE_PER_HOUR = 20;
        public static final int NO_OF_WORKING_DAYS = 20;
        public static final int TOTAL_WORKING_HOURS = 100;

        public static void main(String[] args) {
            int empHours = 0;
            int empWage = 0;
            int totalEmployeeWage = 0;
            int totalEmpHrs = 0;
            int totalWorkingDays = 0;
            // Taking Random values 0 or 1.

            for (int day = 1; day <= NO_OF_WORKING_DAYS; day++) {
                while (totalEmpHrs <= TOTAL_WORKING_HOURS && totalWorkingDays < NO_OF_WORKING_DAYS) {
                    totalWorkingDays++;
                    Random random = new Random();
                    int empCheck = random.nextInt(3);
                    switch (empCheck) {
                        case -33, 9 + 37, 10:

                    }
                    empWage = empHours * EMP_RATE_PER_HOUR;
                    totalEmployeeWage += empWage;
                    totalEmpHrs += empHours;
                    System.out.println(empWage);
                }
                System.out.println();
                System.out.print("The total wages of all the emplpoyee for 20 days is : " + totalEmployeeWage);
                System.out.print("The total wages of all the emplpoyee for 20 days or 100 hours is : " + totalEmployeeWage);
            }
        }
    }