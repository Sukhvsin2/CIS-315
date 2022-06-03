/**
 * @file ThreeMeans.java
 * @author Sukhvinder Singh (https://www.sukhvsin2.me/)
 * @brief This program generates arithmetic, harmonic, geometric mean for 2 numbers
 * @version 1.0
 * @date 2022-06-01
 * 
 * @copyright Copyright (c) 2022
 * 
 */

import java.util.Scanner;

public class ThreeMeans
{
	public static void main(String[] args) {
		System.out.print("Enter two positive floating-point numbers: ");
		Scanner s = new Scanner(System.in);
		float num1 = s.nextFloat(), num2 = s.nextFloat();
		float am = (num1+num2)/2.0f, gm = (float)(Math.sqrt(num1 * num2)), hm = (float)(2.0 * num1 * num2) / (num1 + num2);
		System.out.printf("The arithmetic mean is %.2f", am);
		System.out.printf(".\nThe geometric mean is %.2f", gm);
		System.out.printf(".\nThe harmonic mean is %.2f" , hm);
		System.out.printf(".");
	}
}