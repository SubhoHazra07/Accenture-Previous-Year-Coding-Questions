import java.util.*;
public class MaximumExponent {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Lower Range : ");
        int lower=scanner.nextInt();
        System.out.print("Enter Upper Range : ");
        int upper=scanner.nextInt();
        System.out.println("Maximum Exponent of 2 in between "+lower+" and "+upper+" is : "+maximumExponent(lower,upper));
        scanner.close();
    }
    public static int maximumExponent(int a,int b){
        int max=0;
        int num=0;
        for(int i=a;i<=b;i++){
            if(countExp(i)>=max){
                max=countExp(i);
                num=i;
            }
        }
        return num;
    }
    public static int countExp(int num){
        int count=0;
        while(num%2==0 && num!=0){
            count++;
            num/=2;
        }
        return count;
    }
}
