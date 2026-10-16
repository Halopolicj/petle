import java.util.Scanner;

public class z4_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj status, nowe(n), wysłane(w), zrealizowane(z)");
        char status = scan.next().charAt(0);
        String opis = switch (status) {
            case 'n', 'N'->"Nowe";
            case 'w', 'W'->"Wysłane";
            case 'z', 'Z'->"Zrealizowane";
            default -> "zła litera";
        };
        System.out.println(opis);
    }
}
