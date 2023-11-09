package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage programme");
        final int IS_PART_TIME = 1;
        final int IS_FULL_TIME = 2;
        final int EMP_RATE_PER_HOUR = 20;
        final int NUM_OF_WORKING_DAYS = 2;
        final int MAX_HOURS_IN_MONTH = 10;
        //variables
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        //computaion
        while (totalEmpHrs <= MAX_HOURS_IN_MONTH &&
                totalWorkingDays < NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
                    break;
            }
            totalEmpHrs = totalEmpHrs * EMP_RATE_PER_HOUR;
            System.out.println("Dyas#: " + totalWorkingDays +"emp Hr: " + empHrs);
        }
            int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
            System.out.println("Total EmployeeWage :" + totalEmpWage);
    }
}
