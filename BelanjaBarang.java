import java.util.Scanner;

public class BelanjaBarang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama Barang 1 ");
        String barang1 = input.nextLine();
        System.out.println("Masukkan Harga 1: ");
        double harga1 = input.nextDouble();
        System.out.println("Masukkan Nama barang 2 ");
        String barang2 = input.next();
        System.out.println("Masukkan Harga 2: ");
        double harga2 = input.nextDouble();

        System.out.println("=================================");
        System.out.println("Nama Barang 1: " + barang1);
        System.out.println("Harga Barang 1: " + harga1);
        System.out.println("Nama Barang 2: " + barang2);
        System.out.println("Harga Barang 2: " + harga2);
        System.out.println("=================================");

    }
}
