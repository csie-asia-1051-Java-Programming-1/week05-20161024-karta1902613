package hw;
/*
 * Topic: ���ϥΪ̿�J�@�����n�A��X1+2+3+�K+m<=n���̤j���m=?
 * Date: 2016/10/24
 * Author: 105021043 �B�ͤ�
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

