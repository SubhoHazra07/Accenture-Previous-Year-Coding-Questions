import java.util.*;
public class NumberOfCarries {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int num1=scanner.nextInt();
        System.out.print("Enter Second Number : ");
        int num2=scanner.nextInt();
        System.out.println("Number of Carries after adding "+num1+" and "+num2+" is : "+numberOfCarries(num1,num2));
        scanner.close();
    }
    public static int numberOfCarries(int a,int b){
        int rem=0;
        int count=0;
        while (a!=0 && b!= 0)
        {
            int rem1=a%10;
            int rem2=b%10;
            if ((rem1+rem2+rem) > 9)
    	    {
                count++;
                int sum=rem1+rem2+rem;
                sum=sum/10;
                rem=sum;
            }
            a/=10;
            b/=10;
        } 
        while(a!=0)
        {
            int rem1=a%10;
            if((rem1+rem)>9)
            {
                count++;
                int sum=rem1+rem;
                sum=sum/10;
                rem=sum;
            }
            a/=10;
        }
        while(b!=0)
        {
            int rem2=b%10;
            if((rem2+rem)>9)
            {
                count++;
                int sum=rem2+rem;
                sum=sum/10;
                rem=sum;
            }
            b/=10;
        }
        return count;
    }
}
