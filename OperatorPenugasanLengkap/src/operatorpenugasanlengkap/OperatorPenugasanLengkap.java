package operatorpenugasanlengkap;

public class OperatorPenugasanLengkap {
public static void main(String[] args) {
    int angka = 20;
    System.out.println("Nilai awal angka: " + angka);
    int a, b, c;
    a = b = c = 100;
    System.out.println("Nilai a, b, c: " + a + "," + b + "," + c);
    System.out.println("\n--- Operasi Compound Assignment ---");
    angka += 10;
    System.out.println("Setelah += 10: " + angka);
    angka -= 5;
    System.out.println("Setelah -= 5: " + angka);
    angka *= 2;
    System.out.println("Setelah *= 2: " + angka);
    angka /= 5;
    System.out.println("Setelah /= 5: " + angka);
    angka %= 3;
    System.out.println("Setelah %= 3: " + angka);
    int totalBelanja = 0;
    int item1 = 5000, item2 = 3000, item3 = 2000;

    totalBelanja += item1;
    totalBelanja += item2;
    totalBelanja += item3;
    System.out.println("\nTotal Keranjang Belanja: Rp" + totalBelanja);
}
}