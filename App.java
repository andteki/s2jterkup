/*
* File: App.java
* Author: Nagy János
* Copyright: 2022, Nagy János
* Group: Szoft I N
* Date: 2022-02-15
* Github: https://github.com/andteki/
* Licenc: GNU GPL
*/

import java.util.Scanner;

class App {
	public static void main(String[] args) {
		System.out.println("Nagy Janos, 2022-02-15");
		System.out.println("Feladat 0301");
		System.out.println("Kor alapu kup terfogata");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Sugar: ");
		double sugar = sc.nextDouble();
		
		System.out.print("Magassag: ");
		double magassag = sc.nextDouble();
		
		double terfogat = 
			1.0/3.0 *
			Math.pow(sugar, 2) *
			Math.PI *
			magassag;
		System.out.println("Terfogat: " + terfogat);
		
	}
}

