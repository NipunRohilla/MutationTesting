package com.java.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.java.main.Primes;


public class TestPrimes {

	private List<Integer> primes;
	private List<Integer> composites;
	private List<Integer> negativeNumbers;
	private List<Integer> evenNumbers;
	
	@Before
	public void setUp(){
		
		/** Sample data for testIsPrime. */
		primes = Arrays.asList(new Integer[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 1021});
		
		/** Sample data for testIsComposite. */
		composites= Arrays.asList(new Integer[]{4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20, 21, 22, 24, 25, 26, 27, 28,
		        30, 32, 33, 34, 35, 36, 38, 39, 40, 42, 44, 45, 46, 48, 49, 50});
		
		/**Sample data for Negative numbers */
		negativeNumbers= Arrays.asList(new Integer[]{-2,-4,-5,-7,-8,-10,-13,-14,-15,-18,-20});
		
		/**Sample data for Even Numbers*/
		evenNumbers= Arrays.asList(new Integer[]{4,6,8,10,12,14,16,18,20,22,24,26});
		
	}    
    
    @Test
    public void testIsPrime() {
    	 for(int num : primes) {
    	 assertTrue(num + " should be prime.", Primes.isPrime(num));
    	 }
    }
    
    @Test
    public void testIsComposite() {
    	for(int num : composites) {
    	assertFalse(num + " should be composite", Primes.isPrime(num));
    	}
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testException(){
    	List<Integer> list= new ArrayList<>();
    	list.add(null);
    	Primes.isPrime(list.get(0));
    }

    
    @Test(expected=IllegalArgumentException.class)
    public void testNegativesNumbers(){
    	for(int num: negativeNumbers){
    		Primes.isPrime(num);
    		
    	}
    }
    
    @Test
    public void testIsCompositeEvenNumbers() {
    	for(int num : evenNumbers) {
    	assertFalse(num + " should be composite", Primes.isPrime(num));
    	}
    }
}
