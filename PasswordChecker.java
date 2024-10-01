import java.util.*;

public class PasswordChecker {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Password : ");
        String str=scanner.nextLine();
        if(passwordChecker(str)==1){
            System.out.println("It is Valid Password");
        }else{
            System.out.println("It is not a Valid Password");
        }
        scanner.close();
    }
    public static int passwordChecker(String password){
        if(password.length()<4){
            return 0;
        }else if(password.charAt(0)>='0' && password.charAt(0)<='9'){
            return 0;
        }
        int capital=0;
        int digit=0;
        for(int i=0;i<password.length();i++){
            if(password.charAt(i)==' ' || password.charAt(i)=='/'){
                return 0;
            }
            if(password.charAt(i)>='0' && password.charAt(i)<='9'){
                digit++;
            }else if(password.charAt(i)>='A' && password.charAt(i)<='Z'){
                capital++;
            }
        }
        if(capital>0 && digit>0){
            return 1;
        }
        return 0;
    }
}
