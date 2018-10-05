import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.println("Input a: ");
        a = scanner.nextDouble();
        System.out.println("Input b: ");
        b = scanner.nextDouble();
        System.out.println("Input c: ");
        c = scanner.nextDouble();

        GiaiPhuongTrinhBacHai_OOP pt = new GiaiPhuongTrinhBacHai_OOP(a, b, c);

        double deta = pt.getDiscriminant();

        if(deta > 0){
            System.out.println("The equation has two roots: " + pt.getRoot1() +
                    " and " + pt.getRoot2());
        }
        if(deta == 0)
            System.out.println("The equation has one root: " + pt.getRoot1());
        if(deta < 0)
            System.out.println("The equation no real rool.");
    }
}