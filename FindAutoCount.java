import java.util.*;
public class FindAutoCount {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=scanner.nextLine();
        System.out.println("Count of Distinct Numbers : "+findAutoCount(str));
        scanner.close();
    }
    public static int findAutoCount(String str){
        int count=0;
        if(str.isEmpty()){
            return 0;
        }
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<str.length();i++){
            if(!set.contains(str.charAt(i))){
                count++;
                set.add(str.charAt(i));
            }
        }
        return count;
    }
}
