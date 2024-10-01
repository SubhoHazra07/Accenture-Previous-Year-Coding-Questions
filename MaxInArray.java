import java.util.*;
public class MaxInArray {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Array Size : ");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the "+i+" Element : ");
            arr[i]=scanner.nextInt();
        }
        maxInArray(size,arr);
        scanner.close();
    }
    public static void maxInArray(int len,int arr[]){
        int max=arr[0];
        int index=0;
        for(int i=0;i<len;i++){
            if(arr[i]>=max){
                max=arr[i];
                index=i;
            }
        }
        System.out.println("Maximum Element in Array is : "+max+" and its index : "+index);
    }
}
