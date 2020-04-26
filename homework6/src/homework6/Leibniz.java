package homework6;

import java.util.Scanner;

public class Leibniz {

	public static void main(String[] args) {
		
		double pi =0;
		double temp=1,p=-1,num=1;
		
		System.out.print("라이프니츠 공식으로 연산할 횟수를 입력하시오 : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(num<n) {
			p*=-1;
			pi+=p*1.0/temp;
			temp+=2;
			num++;
		}
		
		System.out.print("라이프니츠 공식으로 "+n+"회 연산한 원주율 :"+pi*4);
		

	}

}
