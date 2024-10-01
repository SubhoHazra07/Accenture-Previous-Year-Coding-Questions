import java.util.*;
public class ProductSmallestPair {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Sum : ");
        int sum=scanner.nextInt();
        System.out.print("Enter the Size : ");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the "+i+" Element : ");
            arr[i]=scanner.nextInt();
        }
        System.out.println("Product of Least two Element : "+productSmallestPair(size,arr,sum));
        scanner.close();
    }
    public static int productSmallestPair(int n,int arr[],int sum){
        if(arr==null || n<2){
            return 0;
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        //Arrays.sort(arr);
        if((arr[0]*arr[1])<=sum){
            return arr[0]*arr[1];
        }
        return -1;
    }
}
