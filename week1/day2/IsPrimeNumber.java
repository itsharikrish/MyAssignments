package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args)
	{
		  int number = 13;
	        boolean isPrime = true;

	        if (number <= 1) 
	        {
	            isPrime = false;
	        }
	        else
	        {
	            for (int i = 2; i < number; i++)
	            {
	                if (number % i == 0) 
	                {
	                    isPrime = false;
	                    break;
	                }
	            }
	        }

	        if (isPrime) 
	        {
	            System.out.println("It is a Prime Number");
	        } 
	        else 
	        {
	            System.out.println("It is not a Prime Number");
	        }
	    }
}


