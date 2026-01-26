public class StokBeras {
public static void main(String[] args) {

    int stok = 100;
    System.out.println("Stok awal: " + stok + " kg");

    stok += 50;
    System.out.println("Setelah datang kiriman baru: " + stok + " kg");

    stok -= 30;
    System.out.println("Setelah terjual: " + stok + " kg");

    stok -= 5;
    System.out.println("Setelah dibuang: " + stok + " kg");

    System.out.println("Stok akhir: " + stok + " kg");
}
}