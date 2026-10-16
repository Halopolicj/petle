import java.util.Scanner;

public class z2_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Wpisz liczbę ");
        int x = scan.nextInt();
        if(x%2==0){
            System.out.println("Liczba jest parzysta");
        } else {
            System.out.println("Liczba jest nieparzysta");
        }
    }
}
