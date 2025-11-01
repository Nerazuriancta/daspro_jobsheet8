import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah cabang cafe: ");
        int jumlahCabang = sc.nextInt();

        int total_pelanggan_semua = 0;
        int total_item_semua = 0;

        System.out.println("\n=== Input Penjualan Per Cabang ===");

        for(int i=1; i <= jumlahCabang; i++) {
            System.out.println("\n--- Cabang " +i+ " ---" );
            System.out.print("Jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt();

            int total_item_cabang = 0;

            for(int j=1; j <= jumlahPelanggan;j++) {
                System.out.print("- Pelanggan " +j+ " memesan berapa item? ");
                int item = sc.nextInt();
                total_item_cabang += item;
            }

            System.out.println("Cabang " +i+ ":");
            System.out.println("- Pelanggan: " +jumlahPelanggan+ "orang");
            System.out.println("- Item terjual: " +total_item_cabang+ " item");

            total_pelanggan_semua += jumlahPelanggan;
            total_item_semua += total_item_cabang;
        }

        System.out.println("\n=== Total seluruh cabang ===");
        System.out.println("Pelanggan: " +total_pelanggan_semua+ " orang");
        System.out.println("Item terjual: " + total_item_semua+ " item");
    }
}
