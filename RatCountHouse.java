import java.util.*;

public class RatCountHouse{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the No of Rats : ");
        int rat=scanner.nextInt();
        System.out.print("Enter the Amount of food consumes by each rat : ");
        int unit=scanner.nextInt();
        System.out.print("Enter the Size of Array : ");
        int size=scanner.nextInt();
        int area[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the Element : ");
            area[i]=scanner.nextInt();
        }
        System.out.println("Output is : "+countRat(size,area,rat,unit));
        scanner.close();
    }
    public static int countRat(int n,int arr[],int rat,int unit){
        if(arr==null){
            return -1;
        }
        int amount=rat*unit;
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            count++;
            if(sum>=amount){
                break;
            }
        }
        if(sum<amount){
            return 0;
        }
        return count;
    }
}