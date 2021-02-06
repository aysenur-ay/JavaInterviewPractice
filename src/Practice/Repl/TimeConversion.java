package Practice.Repl;
import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
        /*
         * Write your code here.
         */
        String newT = s.substring(2, 8);
        String r = s.substring(0,2)+s.substring(8);
        String APm = s.substring(8);
        int time = 0;
        if (s.indexOf(":")==2) {
            if (APm.equalsIgnoreCase("pm")) {
                switch (r) {
                    case "01PM":
                        time = 13;
                        break;
                    case "02PM":
                        time = 14;
                        break;
                    case "03PM":
                        time = 15;
                        break;
                    case "04PM":
                        time = 16;
                        break;
                    case "05PM":
                        time = 17;
                        break;
                    case "06PM":
                        time = 18;
                        break;
                    case "07PM":
                        time = 19;
                        break;
                    case "08PM":
                        time = 20;
                        break;
                    case "09PM":
                        time = 21;
                        break;
                    case "10PM":
                        time = 22;
                        break;
                    case "11PM":
                        time = 23;
                        break;
                    case "12PM":
                        time = 12;
                        break;
                }
                System.out.println(time + newT);
            } else {
                System.out.println(s.substring(0, 8));
            }
        }else if(s.indexOf(":")==1) {
            newT = s.substring(1, 7);
            r = s.substring(0,1)+s.substring(7);
            APm = s.substring(7);
            if (APm.equalsIgnoreCase("pm")) {
                switch (r) {
                    case "1PM":
                        time = 13;
                        break;
                    case "2PM":
                        time = 14;
                        break;
                    case "3PM":
                        time = 15;
                        break;
                    case "4PM":
                        time = 16;
                        break;
                    case "5PM":
                        time = 17;
                        break;
                    case "6PM":
                        time = 18;
                        break;
                    case "7PM":
                        time = 19;
                        break;
                    case "8PM":
                        time = 20;
                        break;
                    case "9PM":
                        time = 21;
                        break;
                    case "10PM":
                        time = 22;
                        break;
                    case "11PM":
                        time = 23;
                        break;
                    case "12PM":
                        time = 12;
                        break;
                }
                System.out.println(time + newT);
            } else {
                System.out.println(s.substring(0, 7));
            }
        }

    }
}



/*
Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
Function Description
It should print a new string representing the input time in 24 hour format.
timeConversion has the following parameter(s):
s: a string representing time in  12 hour format

Input: 07:05:45PM
Output: 19:05:45
 */
