public class OperatorLengkap {
    public static void main(String[] args){
        // Persiapan angka
        int a = 10;
        int b = 3;

        // Operator Aritmetika Dasar
        int tambah = a + b;
        int kurang = a - b;
        int kali = a * b;
        double bagi = (double) a / b;
        int sisa = a % b;

        // Operator Increment dan Decrement
        int c = 5;
        c++;
        int d = 5;
        d--;

        // Tampilkan hasil
        System.out.println("Penjumlahan: " + tambah);
        System.out.println("Pengurangan: " + kurang);
        System.out.println("Perkalian: " + kali);
        System.out.println("Pembagian: " + bagi);
        System.out.println("Sisa bagi: " + sisa);
        System.out.println("Increment c: " + c);
        System.out.println("Decrement d: " + d);
    }
}
