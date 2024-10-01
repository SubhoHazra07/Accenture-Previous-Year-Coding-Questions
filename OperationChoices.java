import java.util.*;
public class OperationChoices {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Choose 1 : Addition ,2 : Substraction, 3 : Multiplication, 4: Division = ");
        int op=scanner.nextInt();
        System.out.print("Enter 1st Number : ");
        int num1=scanner.nextInt();
        System.out.print("Enter 2nd Number : ");
        int num2=scanner.nextInt();
        operationChoice(op,num1,num2);
        scanner.close();
    }
    public static void operationChoice(int c,int a,int b){
        if(c==1){
            System.out.println("Addition of "+a+" and "+b+" is : "+(a+b));
        }else if(c==2){
            System.out.println("Substraction of "+a+" and "+b+" is : "+(a-b));
        }else if(c==3){
            System.out.println("Multiplication of "+a+" and "+b+" is : "+(a*b));
        }else if(c==4){
            System.out.println("Substraction of "+a+" and "+b+" is : "+(a/b));
        }else{
            System.out.println("Invalid Operation");
        }
    }
}
