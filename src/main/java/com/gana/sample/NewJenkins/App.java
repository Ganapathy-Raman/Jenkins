package com.gana.sample.NewJenkins;

import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
	public static int SumOfDigits(int num)
    {
        int sum = 0;
        
		while(num != 0)
        {
        	int x = num % 10;
        	sum = sum + x;
        	num = num/10;
        	
        }
		return sum;
        
    }
	
	public static int MaximumDigits(int num)
    {
        int a = num % 10;
        
		while(num != 0)
        {
        	int b = num % 10;
        	if(b > a) {
        		a = b;
        	}
        	num = num / 10;
        	
        }
		return a;
        
    }
	
	public static boolean IncreasingOrder(int num)
    {
        String str = Integer.toString(num);
        
		for(int i = 0; i < str.length()-1; i++) {
			if(str.charAt(i) > str.charAt(i+1)) {
				return false;
			}
		}
		return true;
        
    }
	
	public static int FibonacciSeries(int num)
    {
		int a = 0;
		int b = 1;
		int arr[] = new int[num + 1];
		 arr[0] = a;
		 arr[1] = b;
		for(int i =2; i < num + 1; i++ ) {
			int c = a+b;
			arr[i] = c;
			a = b;
			b = c;
			
			
		}
		return arr[num];
		
    }
	
	public static int PrimeNumber(int num) {
		int n = 1;
		int count = 0;
		while(count > num) {
			n = n + 1;
		}
		for(int i = 2;i <= num; i++) {
			if(n%i == 0) {
				return 0;
			}
			if(i == n) {
				count = count + 1;
			}
			
		}
		return 1;
	}
	
	public static int[] subSetArray(int[] arr, int[] arr2) {
	    Set<Integer> setArr = new HashSet<>();
	    Set<Integer> setArr2 = new HashSet<>();
	    
	    for (int num : arr) {
	        setArr.add(num);
	    }
	    
	    for (int num : arr2) {
	        setArr2.add(num);
	    }
	    
	
	    if (setArr.containsAll(setArr2)) {
	        return arr2;
	    }
	        return new int[]{0};
	}
		
		public static int[] findFirstNPrimes(int n) {
	        if (n <= 0) {
	            return new int[0];
	        }
	 
	        int[] primes = new int[n];
	        primes[0] = 2;
	        int count = 1;
	        int number = 3;
	 
	        while (count < n) {
	            if (isPrime(number)) {
	                primes[count] = number;
	                count++;
	            }
	            number += 2;
	        }
	 
	        return primes;
	    }
	 
	    
	    public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        if (num <= 3) {
	            return true;
	        }
	        if (num % 2 == 0 || num % 3 == 0) {
	            return false;
	        }
	 
	        for (int i = 5; i * i <= num; i += 6) {
	            if (num % i == 0 || num % (i + 2) == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}