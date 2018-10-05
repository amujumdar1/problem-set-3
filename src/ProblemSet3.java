
/**
 * INSTRUCTIONS.
 * 
 * Problem Set 3 will be extensive. You've been warned. Practice
 * makes perfect, and we'll get a lot of practice with conditional
 * and iterative control structures.
 * 
 * A few new concepts are being introduced with this assignment.
 * Last time, we saw methods (other than the main method) for the
 * first time. Now, we're seeing parameters, which are the variables
 * inside the parentheses in our methods. We'll cover these in more
 * detail later. For now, you just need to understand the basics.
 * 
 * A parameter is data that is provided to the method. It helps the
 * method do its job. It's passed in through the parentheses, and
 * you can reference these variables by name as if they're your own.
 * 
 * Each of the return statements included in this skeleton are
 * placeholders. You'll need to modify them as you write your code.
 */

public class ProblemSet3 {
	/**
	 * Make sure you're testing your code by calling your methods
	 * from the main method!
	 */
	
	public static void main(String[] args) {
		ProblemSet3 pset3 = new ProblemSet3();
		
		pset3.dateFashion(2, 9);
		// special case of one high and low
		
		pset3.fizzString("flob");
		// f and b both there
		
		pset3.squirrelPlay(100, true);
		// just made it
		
		pset3.fizzStringAgain(15);
		// divisible by both 3 and 5
		
		pset3.makeBricks(3, 1, 9);
		// almost works, but doesn't
		
		pset3.loneSum(3, 2, 3);
		// when a and c are invalid
		
		pset3.luckySum(1, 2, 3);
		// just three random numbers
		
		pset3.factorialFor(6);
		// same as while (consistency)
		
		pset3.factorialWhile(6);
		// same as for (consistency)
		
		pset3.isPrime(1999);
		// very large prime number
		
	}
	
	/*
	 * You and your date are trying to get a table at a restaurant. The
	 * parameter "you" is the stylishness of your clothes, in the range
	 * 0..10, and "date" is the stylishness of your date's clothes. The
	 * result getting the table is encoded as an int value with (0 = no,
	 * 1 = maybe, 2 = yes). If either of you is very stylish, 8 or more,
	 * then the result is 2 (yes). With the exception that if either of
	 * you has style of 2 or less, then the result is 0 (no). Otherwise
	 * the result is 1 (maybe). Print YES, NO, or MAYBE. Nothing more,
	 * nothing less.
	 * 
	 * dateFashion(5, 10) → YES
	 * dateFashion(5, 2) → NO
	 * dateFashion(5, 5) → MAYBE
	 */
	
	public void dateFashion(int you, int date) {
		
		int result;
		if (you > 10 || you < 0 || date > 10 || date < 0) {
			
			System.out.println("Invalid number!");
		}
		// negative values can't work
		
		else if (you <= 2 || date <= 2) {
			
			result = 0;
			System.out.println("NO");
		}
		
		else if (you >= 8 || date >= 8) {
			
			result = 2;
			System.out.println("YES");
		}
		
		else {
			
			result = 1;
			System.out.println("MAYBE");
		}
		
		
	}
	
	/*
	 * Given a string str, if the string starts with "f" print FIZZ.
	 * If the string ends with "b" print BUZZ. If both the "f" and "b"
	 * conditions are true, print FIZZBUZZ. In all other cases, print
	 * the string unchanged.
	 * 
	 * fizzString("fig") → FIZZ
	 * fizzString("dib") → BUZZ
	 * fizzString("fib") → FIZZBUZZ
	 */
	
	public void fizzString(String str) {
		
		char firstLetter = Character.toLowerCase(str.charAt(0));
		// finds first position in string and makes it lower case for consistency
		
		char lastLetter = Character.toLowerCase(str.charAt(str.length() - 1));
		// finds last letter in string through built in length function
		
		if (firstLetter == 'f' && lastLetter == 'b') {
			
			System.out.println("FIZZBUZZ");
		}
		
		else if (firstLetter == 'f') {
			
			System.out.println("FIZZ");
		}
		
		else if (lastLetter == 'b') {
			
			System.out.println("BUZZ");
		}
		
		else {
			
			System.out.println(str);
		}
		
	}
	
	/*
	 * The squirrels in Palo Alto spend most of the day playing. In particular,
	 * they play if the temperature is between 60 and 90 (inclusive). Unless it
	 * is summer, then the upper limit is 100 instead of 90. Given an int
	 * temperature and a boolean isSummer, print YES if the squirrels play and
	 * NO otherwise.
	 * 
	 * squirrelPlay(70, false) → YES
	 * squirrelPlay(95, false) → NO
	 * squirrelPlay(95, true) → YES
	 */
	
	public void squirrelPlay(int temp, boolean isSummer) {
		
		int upperLimit = (isSummer) ? 100 : 90;
		// defines upper limit depending on if its summer or not
		
		if (temp >= 60 && temp <= upperLimit)  {
			
			System.out.println("YES");
		}
		
		else {
			System.out.println("NO");
		}
	}
	
	/*
	 * Given an int n, print the string form of the number followed by "!". So the
	 * int 6 yields "6!". Except if the number is divisible by 3 print FIZZ instead of
	 * the number; if the number is divisible by 5 print BUZZ; if divisible by
	 * both 3 and 5, print FIZZBUZZ.
	 * 
	 * fizzStringAgain(1) → 1!
	 * fizzStringAgain(2) → 2!
	 * fizzStringAgain(3) → FIZZ!
	 */
	
	public void fizzStringAgain(int n) {
		
		if (n % 3 == 0 && n % 5 == 0) {
			
			System.out.println("FIZZBUZZ");
		}
		
		else if (n % 3 == 0) {
			
			System.out.println("FIZZ");
		}
		
		else if (n % 5 == 0) {
			
			System.out.println("BUZZ");
		}
		
		else {
			
			System.out.println(n + "!");
		}
	}
	
	/*
	 * We want to make a row of bricks that is goal inches long. We have a number of small
	 * bricks (1 inch each) and big bricks (5 inches each). Print YES if it is possible
	 * to make the goal by choosing from the given bricks, otherwise print NO. This is a
	 * little harder than it looks and can be done without any loops.
	 * 
	 * makeBricks(3, 1, 8) → YES
	 * makeBricks(3, 1, 9) → NO
	 * akeBricks(3, 2, 10) → YES
	 */
	
	public void makeBricks(int small, int big, int goal) {
		
		if (small < 0 || big < 0 || goal < 0) {
			
			System.out.println("Invalid input!");
			return;
		}
		// negative bricks don't exist
		
		while (goal >= 5 && big >= 1) {  
			
			goal -= 5;
			big--;
		}
		// eliminates as many big bricks as possible to get same result
		
		while (goal >= 1 && small >= 1) {
			
			goal -= 1;
			small--;
		}
		// does the same thing with the small bricks
		
		String result = (goal == 0) ? "YES" : "NO";
		// lowest possible number if the max amount of bricks are gone 
		
		System.out.println(result);
		
	}
	
	/*
	 * Given 3 int values, a b c, print their sum. However, if one of the values is the
	 * same as another of the values, it does not count towards the sum.
	 * 
	 * loneSum(1, 2, 3) → 6
	 * loneSum(3, 2, 3) → 2
	 * loneSum(3, 3, 3) → 0
	 */
	
	public void loneSum(int a, int b, int c) {
		
		if (a == b && b == c) { // law of syllogism 
			
			System.out.println(0);
		}
		
		else if (a == c) {
			
			System.out.println(b);
		}
		
		else if (a == b) {
			
			System.out.println(c);
		}
		
		else if (b == c) {
			
			System.out.println(a);
		}
		
		else {
			
			System.out.println(a + b + c);
		}
		
	}
	
	/*
	 * Given 3 int values, a b c, return their sum. However, if one of the values is 13
	 * then it does not count towards the sum and values to its right do not count. So for
	 * example, if b is 13, then both b and c do not count.
	 * 
	 * luckySum(1, 2, 3) → 6
	 * luckySum(1, 2, 13) → 3
	 * luckySum(1, 13, 3) → 1
	 */
	
	public void luckySum(int a, int b, int c) {
		
		if (a == 13) {
			
			System.out.println(0);
		}
		
		else if (b == 13) {
			
			System.out.println(a);
		}
		
		else if (c == 13) {
			
			System.out.println(a + b);
		}
		
		else {
			
			System.out.println(a + b + c);
		}
	}
	
	/*
	 * Given an integer value, n, compute the factorial of n. You are required to use a
	 * for loop to solve this exercise.
	 * 
	 * factorialFor(3) → 6
	 * factorialFor(4) → 24
	 * factorialFor(5) → 120
	 */
	
	public void factorialFor(int n) {
		
		if (n < 0) {
			
			System.out.println("Invalid input!");
			return;
		}
		// positive integers 
		
		int factorial = 1;
		
		for (int x = 1; x < n + 1; x++) {
			
			factorial *= x;
		}
		System.out.println(factorial);
	}
	
	/*
	 * Given an integer value, n, compute the factorial of n. You are required to use a
	 * while loop to solve this exercise. Your method should print n! = y (where n is the
	 * input and y is the output). Nothing more, nothing less.
	 * 
	 * factorialWhile(3) → 6
	 * factorialWhile(4) → 24
	 * factorialWhile(5) → 120
	 */
	
	public void factorialWhile(int n) {
		if (n < 0) {
			
			System.out.println("Invalid input!");
			return;
		}
		
		int factorial = 1;
		
		int x = 1;
		
		while (x < n + 1) {
			
			factorial *= x;
			
			x++;
		}
		
		System.out.println(factorial);
	}
	
	/*
	 * Given an integer value, n, determine whether or not n is a prime number. Your method
	 * should either print PRIME or NOT PRIME. Nothing more, nothing less.
	 * 
	 * isPrime(11) → YES
	 * isPrime(17) → YES
	 * isPrime(112) → NO
	 */
	
	public void isPrime(int n) {
		
		if (n < 2) { 
			
			System.out.println("NOT PRIME");
			// this is because 1, 0, and negative numbers are not prime
			
			return;
		}
		
		for (int x = 2; x * x <= n ; x++) {
			
			if (n % x == 0) {
				
				System.out.println("NOT PRIME");
				
				/* checks all numbers up to square root point (the peak), and 
				 * if even one is divisible, is composite */
				
				return;
			}
		}
		
		System.out.println("PRIME");
		
	}
}