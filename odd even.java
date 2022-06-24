import java.util.Scanner;
import java.lang.Math;

class oddeven{
	public static void main(String[] args){
		System.out.println("Enter your number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int x=num;
		
		for(int k=x-1;k>=1;k--){
			x=x+k;
		}
		System.out.println("Total Sum: "+num);
		if(num%2==0){
			for(int i=num-1;i>=1;i--){
				if(i%2==0)
				{
					num=num+i;
				}
			}
			System.out.println("sum of even"+num);
			System.out.println("sum of odd"+(x-num));
		}
		else{
			for(int j=num-1;j>=1;j--){
				if(j%2!=0)
				{
					num=num+j;
				}	
			}
		}
		System.out.println("sum of even"+(x-num));
		System.out.println("sum of odd"+num);
	}
}