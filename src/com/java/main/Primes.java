package com.java.main;

public class Primes {

	public static void main(String[] args) {

		/**
		 * Print all primes up to numberLimit=30 (interpreted as an integer)
		 */

		int numberLimit = 30;

		try {
			printPrimes(numberLimit);
		} catch (Exception e) {
			System.err.println("Some exception occured." + e.getMessage());
		}
	}

	/** Print all primes up to and including LIMIT. */
	private static void printPrimes(int limit) {

		for (int number = 2; number <= limit; number += 1) {
			if (isPrime(number)) {
				System.out.print(number + " ");
			}
		}

	}

	/**
	 * Return true if inputNumber is prime. The function supports both primitive in case
	 * of ARRAY and object integer in case of ARRAYLIST
	 */
	public static boolean isPrime(Integer inputNumber) {
		if (inputNumber == null) {
			throw new IllegalArgumentException("The number in isPrime() is not valid.");
		}
		if (inputNumber <= 1)
			throw new IllegalArgumentException("The number in isPrime() is less than 1. Not Valid");
		else
			return !isDivisible(inputNumber, 2);
	}

	/**
	 * True if inputNumber is divisible by some number >=K and < inputNumber, given K > 1.
	 */
	private static boolean isDivisible(int inputNumber, int k) {
		if (k >= inputNumber)
			return false;
		else if (inputNumber % k == 0)
			return true;
		else
			return isDivisible(inputNumber, k + 1);
	}
}
