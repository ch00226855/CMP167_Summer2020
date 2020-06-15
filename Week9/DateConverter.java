import java.util.Scanner;

public class DateConverter {

    public static void main(String[] args) {

        // 1. load four numbers from user
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter 4 integers representing dayNumber monthNumber date year:");
        int dayNumber = scnr.nextInt();
        int monthNumber = scnr.nextInt();
        int date = scnr.nextInt();
        int year = scnr.nextInt();

        // 2. Check if the numbers are valid
        if (!isValidDayNumber(dayNumber)) {// is not a valid day number
            System.out.println("Invalid day number: " + dayNumber + 
                    ", please enter a number from 1..7.");
            return; // terminate the program immediately
        }

        if (!isValidMonthNumber(monthNumber)) {// is not a valid month number
            System.out.println("Invalid month number: " + monthNumber +
                                ", please enter a number from 1..12.");
            return; // terminate the program immediately
        }

        // TODO: check if date is valid

        // 3. Print the date
        String dayName = dayConverter(dayNumber);
        String monthName = monthConverter(monthNumber);
        System.out.println(
            dayNumber + " " + monthNumber + " " + date + " " + year +
            " is " + dayName + " " + monthName + " " + date + ", " + year);
        
    }

    // Write a method that converts 1-7 to Sunday-Saturday.
    public static String dayConverter(int dayNumber) {

        String dayName = null;
        // Switch:
        switch (dayNumber) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "ERROR";
        }
        return dayName;
    }



        // // multiple if-else:
        // if (dayNum == 1) {
        //     return "Sunday";
        // } else if (dayNum == 2) {
        //     return "Monday";
        // } else if....
        // return //a string here
    // }
    public static String monthConverter (int monthNum) {
        if (monthNum == 1) {
            return "January";
        } else if (monthNum == 2) {
            return "February";
        } else if (monthNum == 3) {
            return "March";
        } else if (monthNum == 4) {
            return "April";
        } else if (monthNum == 5) {
            return "May";
        } else if (monthNum == 6) {
            return "June";
        } else if (monthNum == 7) {
            return "July";
        } else if (monthNum == 8) {
            return "August";
        } else if (monthNum == 9) {
            return "September";
        } else if (monthNum == 10) {
            return "October";
        } else if (monthNum == 11) {
            return "November";
        } else if (monthNum == 12) {
            return "December";
        } else {
            return "ERROR";
        }
    }

    // Write a method that checks if a given year is a leap year.
    // if (year is not divisible by 4) then (it is a common year)
// else if (year is not divisible by 100) then (it is a leap year)
// else if (year is not divisible by 400) then (it is a common year)
// else (it is a leap year)
    // 2020 - leap year
    // 1900, 2100 - not a leap year
    // 2000 - leap year
    public static boolean checkLeapYear(int year) {
        // implement the above rule to decide whether to return true or false.
        // return true if year is a leap year
        // return false if year is not a leap year
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 == 0 && year % 400 != 0) {
            return false;
        } else {
            return true;
        }

    }

    // Write a method that checks if dayNumber is between 1 and 7
    public static boolean isValidDayNumber(int dayNumber) {
        if (dayNumber >= 1 && dayNumber <= 7) {
            return true;
        } else {
            return false;
        }
        // OR do this:
        // return (dayNumber >= 1 && dayNumber <= 7);
    }

    // Write a method that checks if monthNumber is between 1 and 12
    public static boolean isValidMonthNumber(int monthNumber) {
        if (monthNumber >= 1 && monthNumber <= 12) {
            return true;
        } else {
            return false;
        }
        // OR
        // return (monthNumber >= 1 && monthNumber <= 12);
    }
    
}