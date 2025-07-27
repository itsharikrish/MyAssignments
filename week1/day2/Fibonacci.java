package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		int num=10;
		int[] a = new int[num];
		a[0]=0;
		a[1]=1;
		System.out.println(a[0]);
		System.out.println(a[1]);
		for (int i=2;i<num;i++)
		{
			a[i]=a[i-1]+a[i-2];
			System.out.println(a[i]);
		}

	}

}
