import java.util.Scanner;

public class Equation {
    static void doQuadraticEqua(double a, double b, double c){
        double delta = Math.pow(b,2) - 4*a*c;
        if(delta<0){
            System.out.println("Phương trình vô nghiệm");

        }
        else if(delta == 0){
            System.out.println("Phương trình có nghiệm kép là x1 = x2 =: "+ -b/(2*a));
        }
        else {
            System.out.println("Phương trình có 2 nghiệm phân biệt x1= "+(-b+Math.sqrt(delta))/(2*a) +"x2= "+(-b-Math.sqrt(delta))/(2*a));
        }

    }
    public static void main(String[] args) {
        System.out.println("Bạn vui lòng nhập hệ số a, b, c của phương trình bậc 2");
        System.out.println("Hệ số a: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println("Hệ số b: ");
        double b = scanner.nextDouble();
        System.out.println("Hệ số c: ");
        double c = scanner.nextDouble();
        doQuadraticEqua(a,b,c);


    }
}
