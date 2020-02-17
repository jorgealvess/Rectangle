package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		Rectangle x;
		x = new Rectangle();
		
		System.out.println("Enter the measures of width and height rectangle: ");
		x.width = sc.nextDouble();
		x.height = sc.nextDouble();
		
		System.out.printf("Rectangle area: %.2f%n", x.area());
		System.out.printf("Rectangle perimeter: %.2f%n", x.perimeter());
		System.out.printf("Rectangle diagonal: %.2f%n", x.diagonal());
		
		sc.close();
	}

}
