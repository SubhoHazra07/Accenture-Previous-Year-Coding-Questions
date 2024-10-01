import java.util.*;

public class FindCount {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Size of an array : ");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter "+i+" Element : ");
            arr[i]=scanner.nextInt();
        }
        System.out.print("Enter the Number : ");
        int num=scanner.nextInt();
        System.out.print("Enter the Difference : ");
        int diff=scanner.nextInt();
        System.out.println("No of Elements having absolute difference : "+findCount(arr,size,num,diff));
        scanner.close();
    }
    public static int findCount(int arr[],int len,int num,int diff){
        int count=0;
        for(int i=0;i<len;i++){
            if(Math.abs(num-arr[i])<=diff){
                count++;
            }
        }
        if(count==0){
            return -1;
        }
        return count;
    }
}
