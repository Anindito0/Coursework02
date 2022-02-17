import java.util.Objects;
import java.util.Scanner;

public class JavaLibs5026211077 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int poin = 0;

        System.out.println("Selamat datang di cerdas cermat daring! Pada acara ini peserta akan menjawab 10 pertanyaan untuk memenangkan sebuah hadiah.");

        System.out.println("Sebelum mulai, tolong masukan nama anda disini!");
        String nama = scan.next();

        System.out.println("Berikut adalah aturan dari cerdas cermat ini:");
        System.out.println("Tiap jawaban benar akan bernilai 1 poin dan jika salah 0 poin.");
        System.out.println("""
                Hadiah dari cerdas cermat ini adalah sebagai berikut:\s
                tempat pensil : 8 poin\s
                payung : 9 poin\s
                dan ransel : 10 poin""");

        System.out.println(" ");

        System.out.println("Pertanyaan pertama! Apa nama ibukota Indonesia?");
        String pertanyaanPertama = scan.next();
        if (Objects.equals(pertanyaanPertama, "Jakarta")) {
            poin += 1;
        } else if (Objects.equals(pertanyaanPertama, "jakarta")) {
            poin += 1;
        }

        System.out.println("Pertanyaan kedua! Siapa presiden pertama Indonesia?");
        String pertanyaanKedua = scan.next();
        if (Objects.equals(pertanyaanKedua, "Soekarno")) {
            poin += 1;
        } else if (Objects.equals(pertanyaanKedua, "soekarno")) {
            poin += 1;
        }

        System.out.println("Pertanyaan ketiga! Berapa 10 ditambah 19?");
        String pertanyaanKetiga = scan.next();
        if (Objects.equals(pertanyaanKetiga, "29")) {
            poin += 1;

        }

        System.out.println("Pertanyaan keempat! Jika jawaban sebelumnya yaitu " + pertanyaanKetiga + " dikurang dengan 29 maka akan menghasilkan angka?");
        int pertanyaanKeempat = scan.nextInt();
        if (pertanyaanKeempat == Integer.parseInt(pertanyaanKetiga) - 29) {
            poin += 1;
        }

        System.out.println("Pertanyaan kelima! Jika angka 3 dibagi dengan 2 maka hasilnya adalah?");
        String pertanyaanKelima = scan.next();
        if ((Double.parseDouble(pertanyaanKelima) - 3.0 / 2) < 0.00001) {
            poin += 1;
        }

        System.out.println("Pertanyaan keenam! Jenderal ..... adalah jenderal yang memimpin pertempuran melawan Belanda di wilayah Ambarawa");
        String pertanyaanKeenam = scan.next();
        if (Objects.equals(pertanyaanKeenam, "Soedirman")) {
            poin += 1;
        } else if (Objects.equals(pertanyaanKeenam, "Sudirman")) {
            poin += 1;
        } else if (Objects.equals(pertanyaanKeenam, "sudirman")) {
            poin += 1;
        } else if (Objects.equals(pertanyaanKeenam, "soedirman")) {
            poin += 1;
        }

        System.out.println("Pertanyaan ketujuh! Indonesia merdeka pada tahun? (dalam angka)");
        String pertanyaanKetujuh = scan.next();
        if (Objects.equals(pertanyaanKetujuh, "1945")) {
            poin += 1;
        }

        System.out.println("Pertanyaan kedelapan! Semboyan \"Bhineka Tunggal Ika\" berasald dari kitab?");
        String pertanyaanKedelapan = scan.next();
        if (Objects.equals(pertanyaanKedelapan, "Sutasoma")) {
            poin += 1;
        } else if (Objects.equals(pertanyaanKedelapan, "sutasoma")){
            poin += 1;
        }

        System.out.println("Pertanyaan kesembilan! Daerah di Indonesia yang dijuluki daerah istimewa adalah DIY ......");
        String pertanyaanKesembilan = scan.next();
        if (Objects.equals(pertanyaanKesembilan, "Yogyakarta")) {
            poin += 1;
        } else if (Objects.equals(pertanyaanKesembilan, "yogyakarta")){
            poin += 1;
        }

        System.out.println("Pertanyaan terakhir! Buku Bumi Manusia adalah salah satu buku yang ditulis oleh seorang penulis terkenal di Indonesia, nama sapaan dari penulis tersebut adalah?");
        String pertanyaanKesepuluh = scan.next();
        if (Objects.equals(pertanyaanKesepuluh, "pram")) {
            poin += 1;
        } else if (Objects.equals(pertanyaanKesepuluh, "Pram")){
            poin += 1;
        }

        String hadiah;

        if (poin == 10){
            hadiah = " Selamat anda berhak mendapatkan hadiah ransel!";
        } else if (poin == 9){
            hadiah = " Selamat anda berhak mendapatkan hadiah payung!";
        } else if (poin == 8){
            hadiah = " Selamat anda berhak mendapatkan hadiah tempat pensil!";
        } else {
            hadiah = " Mohon maaf anda belum berhak mendapatkan hadiah apapun.";
        }

        System.out.println("Terima kasih peserta " +nama + " telah mengikuti cerdas cermat daring kami");
        System.out.println("Dari pertanyaan tersebut anda betul " +poin + " poin!" +hadiah);

    }
}
