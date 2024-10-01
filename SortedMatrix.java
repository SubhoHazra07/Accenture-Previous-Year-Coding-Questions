import java.util.*;
public class SortedMatrix {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Size of Matrix : ");
        int size=scanner.nextInt();
        int matrix[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the "+i+" Element : ");
            matrix[i]=scanner.nextInt();
        }
        System.out.println("Summation of Second Largest Element from both Odd and Even Sorted Array is : "+sortedMatrix(size,matrix));
        scanner.close();
    }
    public static int sortedMatrix(int n,int arr[]){
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
        return even.get(even.size()-2)+odd.get(odd.size()-2);
    }
}
