package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Up to what number would you like to search for primes?");
		int maxValue = in.nextInt() + 1;
		boolean[] valueChecks;
		valueChecks = new boolean [maxValue];
		//System.out.println(valueChecks[2]);
		for (int i = 2; i < maxValue ; i++)
		{
			if (valueChecks[i] == false)
			{
				for (int j=(i+1); j < maxValue; j++)
				{
					if (j%i==0 && valueChecks[j] == false)
					{
						valueChecks[j] =true;
					}
				}
				
			}
		}
		for (int index = 2; index < maxValue ; index++ )
		{
			if (valueChecks[index] == false)
				{
				System.out.println(index);
				}
			
		}
	}

}
