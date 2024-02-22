import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.print ("3 dogal sayi giriniz:");

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        int sonuc = a+b*c-b;
        System.out.print (sonuc);

    }
}