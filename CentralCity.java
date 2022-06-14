/**
 * @file CentralCity.java
 * @author Sukhvinder Singh (https://www.sukhvsin2.me/)
 * @brief This program output day minimum distance between all other cities
 * @version 1.0
 * @date 2022-06-14
 * 
 * @copyright Copyright (c) 2022
 * 
**/

import java.util.Scanner;

public class CentralCity
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.print("Enter the number of cities: ");
	    int size = s.nextInt();
	    double arr[][] = new double[size][2];
	    
	    System.out.print("Enter the coordinates of the cities: ");
	    for(int i = 0;i<size;i++){
	        arr[i][0] = s.nextDouble();
	        arr[i][1] = s.nextDouble();
	    }
	    
	    double min = totalDistance(arr, 0);
	    int m = 0;
	    for(int i=1;i<arr.length;i++){
	        double temp = totalDistance(arr, 1);
	        if(min > temp)
    	        m = i;
	            min = temp;
	    }
	    System.out.printf("The central city is at (%.2f, %.2f).\n", arr[m][0], arr[m][1]);
	    System.out.printf("The total distance to all other cities is %.2f.\n", min);
	}
	public static double distance(double [] c1, double [] c2){
	    double dis = Math.sqrt(Math.pow((c2[0] - c1[0]), 2) + Math.pow((c2[1] - c1[1]), 2));
	    return dis;
	}
	
    public static double totalDistance(double [][] cities, int i){
        double result = 0;
        for(int j=0;j<cities.length;j++){
            if(j != i)
                result += distance(cities[i], cities[j]);
            
        }
        return result;
    }
}
