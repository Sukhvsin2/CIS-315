/**
 * @file DayOfTheWeek.java
 * @author Sukhvinder Singh (https://www.sukhvsin2.me/)
 * @brief This program output day of a particular date
 * @version 1.0
 * @date 2022-06-05
 * 
 * @copyright Copyright (c) 2022
 * 
**/
import java.util.Scanner;

public class DayOfTheWeek
{
	public static void main(String[] args) {
	    int h, q, m, j = 100, k;
	    Scanner s = new Scanner(System.in);
	    System.out.print("Enter the year (e.g., 2020): ");
	    k = s.nextInt() % 100;
	    System.out.print("Enter the month (i.e., 1-12): ");
	    m = s.nextInt();
	    if(m == 1 || m==2){
	        // correcting month by subtracting by 14 
	        m += 12;
	        k--;
	    }
	    
	    System.out.print("Enter the day of the month (i.e., 1-31): ");
	    q = s.nextInt();
	    h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
	    
	    System.out.print("Day of the week is ");
	    switch(h){
	        case 0:
	            System.out.print("Saturday");
	            break;
	        case 1:
	            System.out.print("Sunday");
	            break;
	        case 2:
	            System.out.print("Monday");
	            break;
	        case 3:
	            System.out.print("Tuesday");
	            break;
	        case 4:
	            System.out.print("Wednesday");
	            break;
	        case 5:
	            System.out.print("Thrusday");
	            break;
	        case 6:
	            System.out.print("Friday");
	            break;
	        default: 
	            System.out.println("Error in switch statement!!");
	            break;
	    }
	    System.out.print(".");
	    
	}
}
