package homework6;

import java.util.Scanner;
import java.lang.Math;


public class John {

	public static void main(String[] args) {
		
		double pi=1;
		double even=2.0, odd=1.0;
		int num=1;
		
		System.out.print("존 월리스 공식으로 연산할 횟수를 입력하시오 : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		while(num<n)
		{
			pi*=even/odd;
			if(num%2==1) {
				odd+=2;
			}
			else even+=2;
			num++;
		}
		
		System.out.print("존 월리스 공식으로 "+n+"회 연산한 원주율 :"+ 2.0*pi);
		
	}
	
	

}
