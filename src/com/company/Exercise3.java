package com.company;

public class Exercise3 {

    public static void main(String[] args){
        //First variables.
        int hour = 11;
        int minute = 53;
        int second = 40;

        //Second variables.
        int hour1 = 12;
        int minute1 = 11;
        int second1 = 35;

        //Time calculations.
        double totaltime = 86400;
        double passedtime = (hour * 3600) + (minute * 60 + second);
        double remainingtime = totaltime - passedtime;
        double percentpassed = (passedtime / totaltime) * 100;
        double percentremaing = (remainingtime /totaltime) * 100;
        double worktime = ((hour1 - hour) * 3600) + ((minute1 - minute) * 60) + (second1 - second);

        //Intro
        System.out.println("\nWelcome back, and i hope you will like this!.");
        System.out.printf("\n");

        //Clock
        System.out.print("The current time is: ");
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.println(".");

        //Number of seconds remaining of the day.
        System.out.print("Number of Seconds passed today: ");
        System.out.println(passedtime);
        System.out.print("Number of seconds remaining: ");
        System.out.println(remainingtime);

        //Percantage.
        System.out.print("The percentage of the day that has passed: ");
        System.out.print(percentpassed);
        System.out.println("%.");
        System.out.print("The percentage of the day that are remaining: ");
        System.out.print(percentremaing);
        System.out.println("%.");

        //Current time changes
        System.out.print("seconds that have passed working on this: ");
        System.out.print(worktime);
        System.out.println(" seconds.");
        System.out.println("I did however eat dinner in that timespectum.");

        //outro.
        System.out.println("\n");
        System.out.println("I hope you enjoyed this little app.");
        System.out.println("With best regards.");
        System.out.println("Tim.");
    }
}
/*
1. Create a new program called Time.java. From now on, we won’t remind you to start with a small, working program,
    but you should.
2. Following the example program in Section 2.4, create variables named hour, minute, and second. Assign values that
    are roughly the current time. Use a 24-hour clock so that at 2:00 PM the value of hour is 14.
3. Make the program calculate and display the number of seconds since midnight.
4. Calculate and display the number of seconds remaining in the day.
5. Calculate and display the percentage of the day that has passed. You might run into problems when computing
    percentages with integers, so consider using floating-point.
6. Change the values of hour, minute, and second to reflect the current time. Then write code to compute the elapsed
    time since you started working on this exercise.
 */