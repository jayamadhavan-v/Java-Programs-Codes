import java.util.Scanner;

public class MegaBytesConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();///5000
        printMegaByteAndKiloByte(input);
    }

    public static void  printMegaByteAndKiloByte(int input) {
//        1 mb = 1024 kb
        int quotient = input / 1024;
        int remainder = input % 1024;
        System.out.print(input+" KB" + " = " + quotient + " MB and " + remainder + " KB" );
    }
}
