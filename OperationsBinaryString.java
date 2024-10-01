import java.util.*;

public class OperationsBinaryString {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Binary String : ");
        String binaryString=scanner.nextLine();
        System.out.println("Output of the String is : "+operations(binaryString));
        scanner.close();
    }
    public static int operations(String binary){
        if(binary==null || binary.length()%2==0){
            return -1;
        }
        int sum=binary.charAt(0)-'0';
        for(int i=1;i<binary.length();i+=2){
            if(binary.charAt(i)=='A'){
                sum&=(binary.charAt(i+1)-'0');
            }else if(binary.charAt(i)=='B'){
                sum|=(binary.charAt(i+1)-'0');
            }else{
                sum^=(binary.charAt(i+1)-'0');
            }
        }
        return sum;
    }
}
