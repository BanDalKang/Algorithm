import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int a, b;
		a=sc.nextInt();
		
		for(int i = 1; i <= a; i++){
            int sum=0;
            for(int j = 1; j <= 10; j++){
				b=sc.nextInt();
                if(b%2==1){
                	sum+=b;
                }
            }
            System.out.println("#"+i+" "+sum);
		}
	}
}