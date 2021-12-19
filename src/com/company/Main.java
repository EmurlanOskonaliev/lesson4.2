package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> SpisokA = new ArrayList<>();
		SpisokA.add(scanner.nextLine());
		SpisokA.add(scanner.nextLine());
		SpisokA.add(scanner.nextLine());
		SpisokA.add(scanner.nextLine());
		SpisokA.add(scanner.nextLine());
		System.out.println(SpisokA);

		ArrayList<String> SpisokB = new ArrayList<>();
		SpisokB.add(scanner.nextLine());
		SpisokB.add(scanner.nextLine());
		SpisokB.add(scanner.nextLine());
		SpisokB.add(scanner.nextLine());
		SpisokB.add(scanner.nextLine());
		System.out.println(SpisokB);

		ArrayList<String> SpisokC = new ArrayList<>();
		SpisokC.add(SpisokA.get(0));
		SpisokC.add(SpisokB.get(4));

		SpisokC.add(SpisokA.get(1));
		SpisokC.add(SpisokB.get(3));

		SpisokC.add(SpisokA.get(2));
		SpisokC.add(SpisokB.get(2));

		SpisokC.add(SpisokA.get(1));
		SpisokC.add(SpisokB.get(3));

		SpisokC.add(SpisokA.get(0));
		SpisokC.add(SpisokB.get(4));

		System.out.println(SpisokC);

		SpisokC.sort(Comparator.comparing(String::length));
		System.out.println(SpisokC);
		Collections.reverse(SpisokC);
	}
}
