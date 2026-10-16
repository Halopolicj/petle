import java.util.Scanner;

public class z2_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int punkty = scan.nextInt();
        if (punkty>=50) {
            System.out.println("Test zaliczony!");
        } else{
            System.out.println("Niestety, spróbuj ponownie.");
        }
    }
}
