/**
 * @file AreaOfATriangle.java
 * @author Sukhvinder Singh (https://www.sukhvsin2.me/)
 * @brief This program finds the area of a triangle by 3 points.
 * @version 1.0
 * @date 2022-06-02
 * 
 * @copyright Copyright (c) 2022
 * 
 */

import java.util.Scanner;

public class AreaOfATriangle
{
	public static void main(String[] args) {
		float x1, x2, x3, y1, y2, y3, A;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter three points for a triangle: ");
		x1 = s.nextFloat();
		x2 = s.nextFloat();
		x3 = s.nextFloat();
		y1 = s.nextFloat();
		y2 = s.nextFloat();
		y3 = s.nextFloat();
		
		
		A = (float)(x1*y2 + x2*y3 + x3*y1 - y1*x2 - y2*x3 - y3*x1) / (float)2.0;
		System.out.printf("The area of the triangle is %.2f", A);
		System.out.println(".");
		
	}
}









