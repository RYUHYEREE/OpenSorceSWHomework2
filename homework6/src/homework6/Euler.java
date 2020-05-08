package homework6;
import java.util.Scanner;
import java.lang.Math;

public class Euler {

	public static void main(String[] args) {
		double pi=0.0, num=1.0;
		
		System.out.print("오일러 공식으로 연산할 횟수를 입력하시오 : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(num<n) {
			pi+=1.0/Math.pow(num,2.0);
			num+=1.0;
			
		}
		
		System.out.print("오일러 공식으로 "+n+"회 연산한 원주율 :"+ Math.sqrt(6*pi));

	}

}
