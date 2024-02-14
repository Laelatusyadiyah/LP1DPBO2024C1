
// import library
import java.util.Scanner;
import java.util.ArrayList;

//deklarasi class main
class Main {
  public static void main(String[] args) {

    // deklrasi variabel
    int i, n = 0;
    String id, name, bidang, partai;

    // deklrasi list menggunakan library
    ArrayList<DPR> list = new ArrayList<>();

    try (// deklarasi scanner untuk input
        Scanner sc = new Scanner(System.in)) {
      /*
       * looping while dengan syarat masukkan user bukan 5 yang berarti exit dari
       * program
       * looping ini bekerja untuk menentukan apa yang diinginkan oleh user, ada 5
       * query yaitu create, read, update dan exit
       * untuk menentukan query yang sesuai dengan yang diminta user saya menggunakan
       * switch yang sesuai dengan menu,
       * 1 untuk create, 2 untuk read, 3 untuk update, 4 untuk delete, dan 5 untuk
       * exit
       */
      while (n != 5) {

        // menampilkan menu
        System.out.println("Program Informasi Daftar Anggota DPR");
        System.out.println("1. Create");
        System.out.println("2. Read");
        System.out.println("3. Update");
        System.out.println("4. Delete");
        System.out.println("5. Exit");
        System.out.print("Masukkan Query yang diinginkan: ");

        // meminta masukkan query berapa yang diinginkan user
        n = sc.nextInt();
        sc.nextLine();

        // switch untuk menentukan query yang diinginkan user
        switch (n) {
          // case 1 untuk create
          case 1:

            // meminta masukkan user untuk menambahkan data baru
            System.out.print("Masukkan ID: ");
            id = sc.nextLine();
            System.out.print("Masukkan Nama: ");
            name = sc.nextLine();
            System.out.print("Masukkan Bidang: ");
            bidang = sc.nextLine();
            System.out.print("Masukkan Partai: ");
            partai = sc.nextLine();

            // instansiasi object tanpa parameter
            DPR temp = new DPR();

            // inputan user dimasukkan ke dalam temp dulu menggunakan setter masing-masing
            // attribut
            temp.set_id(id);
            temp.set_name(name);
            temp.set_bidang(bidang);
            temp.set_partai(partai);

            // objek dimasukkan ke dalam list
            list.add(temp);

            System.out.println("");
            System.out.println("DATA BARU BERHASIL DITAMBAHKAN!");

            break;
          // case 2 untuk read
          case 2:

            // deklarasi boolean untuk mengetahui kosong atau tidak list
            boolean isEmpty = list.isEmpty();
            // cek terlebih dahulu apakah list kosong atau tidak
            if (isEmpty == true) {
              System.out.println("DATA DPR KOSONG!");

            } else {
              // menampilkan isi dari list dengan looping for dan setiap attributnya
              // ditampilkan dengan memanggil getter masing-masing attribut
              for (i = 0; i < list.size(); i++) {
                System.out.println(Integer.toString(i + 1) + ". " + "ID          : " + list.get(i).get_id());
                System.out.println("   Nama         : " + list.get(i).get_name());
                System.out.println("   Bidang       : " + list.get(i).get_bidang());
                System.out.println("   Partai       : " + list.get(i).get_partai());
                System.out.println("");
              }
            }
            break;

          case 3:
            // deklarasi boolean untuk mengetahui kosong atau tidak list
            isEmpty = list.isEmpty();
            // deklarasi boolean untuk mengetahui sudah ketemu atau belum ID
            boolean isFound = false;

            // cek terlebih dahulu apakah list kosong atau tidak
            if (isEmpty == true) {
              System.out.println("DATA DPR KOSONG!");
            } else {
              String cari;
              System.out.print("Masukkan ID Anggota yang akan di-Update: ");

              // meminta masukkan usuer untuk id yang akan dicari dan akan di-update
              cari = sc.nextLine();

              // looping untuk mencari id yang diminta oleh user
              // jika data ditemukan maka user diminta untuk memasukkan data baru yang akan
              // diubah
              for (i = 0; i < list.size(); i++) {
                if (cari.compareTo(list.get(i).get_id()) == 0) {

                  System.out.print("Masukkan ID: ");
                  id = sc.nextLine();
                  System.out.print("Masukkan Nama: ");
                  name = sc.nextLine();
                  System.out.print("Masukkan Bidang: ");
                  bidang = sc.nextLine();
                  System.out.print("Masukkan Partai: ");
                  partai = sc.nextLine();

                  temp = new DPR();
                  temp.set_id(id);
                  temp.set_name(name);
                  temp.set_bidang(bidang);
                  temp.set_partai(partai);
                  list.set(i, temp);

                  // isFound berubah karena id berhasil ditemukan
                  isFound = true;
                }
              }
            }

            // jika id ditemukan dan jika tidak ditemukan
            if (isFound == true) {
              System.out.println("DATA BERHASIL DI-UPDATE!");
            } else {
              System.out.println("DATA TIDAK DAPAT DITEMUKAN!");
            }
            break;

          case 4:
            isEmpty = list.isEmpty();
            isFound = false;
            String cari;

            // cek terlebih dahulu apakah list kosong atau tidak
            if (isEmpty == true) {
              System.out.println("DATA MAHASISWA KOSONG!");
            } else {

              // meminta masukkan usuer untuk id yang akan dicari dan akan di-delete
              System.out.print("Masukkan ID Anggota yang akan di-Delete: ");
              cari = sc.nextLine();

              // looping untuk mencari id yang diminta oleh user
              // jika data ditemukan maka user diminta untuk memasukkan data baru yang akan
              // dihapus
              for (i = 0; i < list.size(); i++) {
                if (cari.compareTo(list.get(i).get_id()) == 0) {
                  list.remove(i);
                  // isFound berubah karena id berhasil ditemukan
                  isFound = true;
                }
              }
            }

            // jika id ditemukan dan jika tidak ditemukan
            if (isFound == true) {
              System.out.println("DATA BERHASIL DI-DELETE!");
            } else {
              System.out.println("DATA TIDAK DAPAT DITEMUKAN!");
            }
            break;
          default:
            System.out.println("TERIMA KASIH!");

            break;
        }
      }
    }
  }
}
