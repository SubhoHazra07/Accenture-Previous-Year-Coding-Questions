import java.util.*;

public class DectoNBase {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the divisor : ");
        int n=scanner.nextInt();
        System.out.print("Enter the Number : ");
        int num=scanner.nextInt();
        System.out.println(n+"-Base Equivalent of "+num+" : "+dectoNBase(n,num));
        scanner.close();
    }    
    public static String dectoNBase(int n,int num){
        String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String result="";
        while(num!=0){
            int rem=num%n;
            if(rem>=0 && rem<=9){
                result=rem+result;
            }else if(num>9){
                int quotient=rem-10;
                result=alphabet.charAt(quotient)+result;
            }
            num=num/n;
        }
        return result;
    }
}
