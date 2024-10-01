import java.util.*;
public class ReplaceCharacter {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str=scanner.nextLine();
        System.out.print("Enter First Character : ");
        char c1=scanner.next().charAt(0);
        System.out.print("Enter Second Character : ");
        char c2=scanner.next().charAt(0);
        System.out.println("After replacing "+c1+" with "+c2+" new string is : "+replaceCharacter(str,str.length(),c1,c2));
        scanner.close();
    }
    public static String replaceCharacter(String str,int n,int ch1,int ch2){
        if(str.isEmpty()){
            return null;
        }
        if(ch1==ch2){
            return str;
        }
        String result="";
        for(int i=0;i<n;i++){
            if(str.charAt(i)==ch1){
                result+=(char)ch2;
            }else if(str.charAt(i)==ch2){
                result+=(char)ch1;
            }else{
                result+=str.charAt(i);
            }
        }
        return result;
    }
}
