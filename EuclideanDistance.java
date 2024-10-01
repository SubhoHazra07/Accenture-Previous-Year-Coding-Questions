import java.util.*;
public class EuclideanDistance {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter x1 : ");
        double x1=scanner.nextDouble();
        System.out.print("Enter y1 : ");
        double y1=scanner.nextDouble();
        System.out.print("Enter x2 : ");
        double x2=scanner.nextDouble();
        System.out.print("Enter y2 : ");
        double y2=scanner.nextDouble();
        System.out.print("Enter x3 : ");
        double x3=scanner.nextDouble();
        System.out.print("Enter y3 : ");
        double y3=scanner.nextDouble();
        System.out.printf("Sum of distance between Three Points : %.2f",euclideanDistance(x1,x2,x3,y1,y2,y3));
        scanner.close();
    }
    public static double euclideanDistance(double x1,double x2,double x3,double y1,double y2,double y3){
        double firstDiff=(double)Math.sqrt (Math.pow (x2 - x1, 2) + Math.pow (y2 - y1, 2));
        double secondDiff=(double)Math.sqrt (Math.pow (x3 - x2, 2) + Math.pow (y3 - y2, 2));
        double thirdDiff=(double)Math.sqrt (Math.pow (x3 - x1, 2) + Math.pow (y3 - y1, 2));
        return firstDiff+secondDiff+thirdDiff;
    }
}
