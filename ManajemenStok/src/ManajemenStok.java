import java.util.Scanner;

public class ManajemenStok {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukkan Nama: ");
        String nama = keyboard.nextLine();   
        System.out.print("Masukkan Kelas: ");
        String kelas = keyboard.nextLine();  
        System.out.print("Masukkan Umur: ");
        int umur = keyboard.nextInt();       

        System.out.print("Masukkan Stok Barang: ");
        double stok = keyboard.nextDouble(); 
        System.out.print("Tambah Stok Barang: ");
        double tambah = keyboard.nextDouble(); 
        stok = stok + tambah;

        System.out.print("Kurangi Stok Barang: ");
        double kurang = keyboard.nextDouble(); 
        stok = stok - kurang;

        System.out.println("\n===== DATA AKHIR =====");
        System.out.println("Nama  : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("Umur  : " + umur + " Tahun");
        System.out.println("Jumlah Stok: " + stok + " Barang");

        keyboard.close();
    }
}