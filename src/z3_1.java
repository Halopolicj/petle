import java.util.Scanner;

public class z3_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj punkty(0-100)");
        int punkty = scan.nextInt();
        if (punkty>100) {
            System.out.println("Zły wynik!");
        } else if (punkty>=90) {
            System.out.println("Bardzo dobry");
        } else if (punkty>=70) {
            System.out.println("Dobry");
        } else if (punkty>=50) {
            System.out.println("Dostateczny");
        } else{
            System.out.println("Niedostateczny");
        }
    }
}
