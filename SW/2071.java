import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
        int a, b;
        a=sc.nextInt();
         
        for(int i = 1; i <= a; i++){
            double sum=0;
            for(int j = 1; j <= 10; j++){
                b=sc.nextInt();
                sum+=b;
            }
            System.out.println("#"+i+" "+ Math.round( sum / 10 ));
        }
        sc.close();
	}
}