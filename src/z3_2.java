import java.util.Scanner;

public class z3_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj temperaturę");
        int temperatura = scan.nextInt();
        if (temperatura<0) {
            System.out.println("Mróz");
        } else if (temperatura>=18&&temperatura<=22) {
            System.out.println("Temperatura pokojowa");
        } else {
            System.out.println("Inna temperatura");
        }
    }
}
