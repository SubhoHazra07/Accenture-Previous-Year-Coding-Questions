import java.util.*;
public class TableOfNumber {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num=scanner.nextInt();
        System.out.print("Table of "+num+" is : ");
        for(int i=1;i<=10;i++){
            System.out.print((num*i)+" ");
        }
        scanner.close();
    }
}
