package praktica;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(" <x> coordinate of the dot A");
        double x1 = in.nextDouble();
        System.out.println("<y> coordinate of the dot A");
        double y1 = in.nextDouble();
        System.out.println(" <x> coordinate of the dot B");
        double x2 = in.nextDouble();
        System.out.println(" <y> coordinate of the dot B");
        double y2 = in.nextDouble();

        Dot A = new Dot(x1, y1);
        Dot B = new Dot(x2, y2);
        System.out.println(A.distanceTo(B));
        System.out.println(A.toString(A));
    }
}