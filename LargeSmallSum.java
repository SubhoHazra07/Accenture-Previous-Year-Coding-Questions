import java.util.*;
public class LargeSmallSum {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the "+i+" Element : ");
            arr[i]=scanner.nextInt();
        }
        System.out.println("The Sum of second largest element from even position and second smallest postion from odd position : "+largestSmallSum(size,arr));
        scanner.close();
    }
    public static int largestSmallSum(int n,int arr[]){
        if(arr==null || n<3){
            return 0;
        }
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        even.add(arr[0]);
        for(int i=1;i<n;i++){
            if(i%2==0){
                even.add(arr[i]);
            }else{
                odd.add(arr[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);
        return even.get(even.size()-2)+odd.get(1);
    }
}
