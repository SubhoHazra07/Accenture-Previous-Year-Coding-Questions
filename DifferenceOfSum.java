import java.util.*;

public class DifferenceOfSum {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n=scanner.nextInt();
        System.out.print("Enter the Range : ");
        int m=scanner.nextInt();
        differenceOfSum(n,m);
        scanner.close();
    }
    public static void differenceOfSum(int n,int m){
        int divisible=0;
        int notDivisible=0;
        for(int i=1;i<=m;i++){
            if(i%n==0){
                divisible+=i;
            }else{
                notDivisible+=i;
            }
        }
        System.out.println("Difference between "+notDivisible+" and "+divisible+" is : "+Math.abs(notDivisible-divisible));
    }
}
