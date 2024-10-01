import java.util.*;
public class MoveHyphen {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=scanner.nextLine();
        System.out.println("After moving the hyphens to the front : "+moveHyphen(str));
        scanner.close();
    }
    public static String moveHyphen(String str){
        if(str.isEmpty()){
            return null;
        }
        String result="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='-'){
                result='-'+result;
            }else{
                result+=str.charAt(i);
            }
        }
        return result;
    }
}
