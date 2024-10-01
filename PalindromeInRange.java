import java.util.*;
public class PalindromeInRange {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Lower Limit : ");
        int lower=scanner.nextInt();
        System.out.print("Enter Upper Limit : ");
        int upper=scanner.nextInt();
        palindromeInRange(lower,upper);
        scanner.close();
    }
    public static void palindromeInRange(int a,int b){
        System.out.print("Palindromes in between "+a+" and "+b+" are : ");
        for(int i=a;i<=b;i++){
            if(checkPalindrome(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean checkPalindrome(int num){
        int temp=num;
        int rev=0;
        while(num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        return temp==rev;
    }
}
