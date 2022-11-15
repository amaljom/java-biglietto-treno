package org.generation.italy;

import java.util.Scanner;

public class CalcolaBiglietto {
	
public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Numero di km da percorrere: ");
		int km=sc.nextInt();
		
		System.out.print("Inserire età: ");
		int age=sc.nextInt();
		
		sc.close();
		
		float price = km * .21f;
		
		if (age < 12) {
			price = 0;
		} else if(age < 18) {
			price = price * 20 / 100;
		} else if(age > 65) {
			price = price / 100 * 40;
		}
		
		System.out.println("km:" + km);
		System.out.println("age" + age);
		System.out.println("totale sconto:" + price + "€");
	}
}
