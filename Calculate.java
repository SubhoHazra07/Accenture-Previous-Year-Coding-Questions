import java.util.*;
public class Calculate {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Lower Limit : ");
        int lower=scanner.nextInt();
        System.out.print("Enter Upper Limit : ");
        int upper=scanner.nextInt();
        if(lower<0 || upper<0 || lower>upper){
            System.out.println("Invalid Input");
            return;
        }
        System.out.print("Sum of All Number that both Divided by 3 and 5 : "+calculate(lower,upper));
        scanner.close();
    }
    public static int calculate(int m,int n){
        int sum=0;
        for(int i=m;i<=n;i++){
            if(i%3==0 && i%5==0){
                sum+=i;
            }
        }
        return sum;
    }
}
