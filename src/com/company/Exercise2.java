package com.company;

public class Exercise2 {

    public static void main(String[] args) {
        //General date message and information.

        System.out.println("\nHello World \nToday's date is as following:");
        System.out.println("\n");
        PrintEurope("Wednesday", 22, "September", 2021);
        PrintAmerican("Wednesday", "September", 22, 2021);

    }

    public static void PrintEurope(String day, int date, String month, int year ) {
        //This is the European version of the date.
        System.out.print("European format:\n");
        System.out.printf("%s, %d, %s, %d", day, date, month, year);
        System.out.println("\n");
    }

    public static void PrintAmerican(String day, String month, int date, int year ) {
        //This is the American version of the date.
        System.out.print("American format:\n");
        System.out.printf("%s, %s, %d, %d", day, month, date, year);
        System.out.println("\n");

    }
}


/*
1. Create a new program named Date.java. Copy or type in something like the Hello World program and make sure you can
    compile and run it.
2. Following the example in Section 2.4, write a program that creates variables named day, date, month, and year.
    The variable day will contain the day of the week (like Friday), and date will contain the day of the month
    (like the 13th). Assign values to those variables that represent today’s date.
3. Display the value of each variable on a line by itself. This is an intermediate step that is useful for checking that
    everything is working so far. Compile and run your program before moving on.
4. Modify the program so that it displays the date in standard American format; for example: Thursday, July 18, 2019.
5. Modify the program so it also displays the date in European format. The final output should be as follows:
 */