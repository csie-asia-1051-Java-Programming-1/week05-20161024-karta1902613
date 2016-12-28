package hw;
/*
 * Topic: 讓使用者輸入一正整數n，輸出1+2+3+…+m<=n的最大整數m=?
 * Date: 2016/10/24
 * Author: 105021043 劉凱文
 */
import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int m=0;
		int sum=0;
		    while(sum<n){
			m++;
			sum=sum+m;
			if(sum>n){
				System.out.print(m-1);}
				else if(sum>=n){
					System.out.print(m);
				}
			}	
		}
	}

