// import library dan file
#include <bits/stdc++.h>
#include "DPR.cpp"

int main()
{
    cout << '\n'
         << "~~~ SELAMAT DATANG ~~~" << '\n';
    // deklrasi variabel
    int i, n = 0;
    string id, name, bidang, partai, cari;

    // deklrasi list menggunakan library
    list<DPR> lList;

    /* membuat perulangan while untuk menjalankan setiap menu yang tersedia dengan menggunakan switch untuk menentukan menu yang dipilih */
    while (n != 5)
    {
        // instansiasi object tanpa parameter
        DPR temp;

        // menampilkan menu
        cout << '\n'
             << "Program Informasi Daftar anggota DPR" << '\n';
        cout << "1. Create" << '\n';
        cout << "2. Read" << '\n';
        cout << "3. Update" << '\n';
        cout << "4. Delete" << '\n';
        cout << "5. Exit" << '\n';
        cout << "Masukkan Query yang diinginkan: ";

        // meminta masukkan query berapa yang diinginkan user
        cin >> n;
        cout << '\n';

        // switch untuk menentukan query yang diinginkan user
        switch (n)
        {
            // case 1 untuk create
        case 1:
            int x;
            cout << "Berapa Anggota yang ingin dimasukkan : ";
            cin >> x;
            for (int i = 0; i < x; i++)
            {
                // meminta masukkan user untuk menambahkan data baru sesuai jumlah yang diinginkan
                cout << "\nID     : ";
                cin >> id;
                cout << "Nama   : ";
                cin >> name;
                cout << "Bidang : ";
                cin >> bidang;
                cout << "Partai : ";
                cin >> partai;

                // inputan user dimasukkan ke dalam temp dulu menggunakan setter masing-masing attribut
                temp.set_id(id);
                temp.set_name(name);
                temp.set_bidang(bidang);
                temp.set_partai(partai);

                // objek dimasukkan ke dalam list
                lList.push_back(temp);
            }

            cout << "DATA BARU BERHASIL DITAMBAHKAN!" << '\n';
            break;
            // case 2 untuk read
        case 2:

            // cek terlebih dahulu apakah list kosong atau tidak
            if (lList.empty())
            {
                cout << '\n'
                     << "DATA DPR KOSONG!" << '\n';
            }
            else
            {
                // menampilkan isi dari list dengan looping for dan setiap attributnya ditampilkan dengan memanggil getter masing-masing attribut
                i = 0;
                cout << "Data Lengkap DPR: ";

                for (list<DPR>::iterator it = lList.begin(); it != lList.end(); it++)
                {
                    cout << '\n'
                         << (i + 1) << '.' << " ID      : " << it->get_id() << '\n';
                    cout << "   Nama    : " << it->get_name() << '\n';
                    cout << "   Bidang  : " << it->get_bidang() << '\n';
                    cout << "   Partai  : " << it->get_partai() << "\n";
                    i++;
                }
            }
            break;
            // case 3 untuk update
        case 3:
            // cek terlebih dahulu apakah list kosong atau tidak
            if (lList.empty())
            {
                cout << '\n'
                     << "DATA DPR KOSONG!" << '\n';
            }
            else
            {
                // deklarasi boolean untuk menentukan apakah data ditemukan atau tidak
                bool isFound = false;
                // meminta masukkan usuer untuk id yang akan dicari dan akan di-update
                cout << "Masukkan ID Anggota DPR yang akan di-Update: ";
                cin >> cari;

                // looping untuk mencari id yang diminta oleh user
                // jika data ditemukan maka user diminta untuk memasukkan data baru yang akan diubah
                for (list<DPR>::iterator it = lList.begin(); it != lList.end(); it++)
                {
                    if (cari == it->get_id())
                    {
                        cout << "ID     : ";
                        cin >> id;
                        cout << "Nama   : ";
                        cin >> name;
                        cout << "Bidang : ";
                        cin >> bidang;
                        cout << "Partai : ";
                        cin >> partai;

                        it->set_id(id);
                        it->set_name(name);
                        it->set_bidang(bidang);
                        it->set_partai(partai);
                        // isFound berubah karena id berhasil ditemukan
                        isFound = true;
                    }
                }
                // jika id ditemukan dan jika tidak ditemukan
                if (isFound == true)
                {
                    cout << "DATA BERHASIL DI-UPDATE!" << '\n';
                }
                else
                {
                    cout << "DATA TIDAK DAPAT DITEMUKAN!" << '\n';
                }
            }
            break;
        case 4:

            // cek terlebih dahulu apakah list kosong atau tidak
            if (lList.empty())
            {
                cout << '\n'
                     << "DATA DPR KOSONG!" << '\n';
            }
            else
            {
                // deklarasi boolean untuk menentukan apakah data ditemukan atau tidak
                bool isFound = false;
                cout << "Masukkan ID anggota DPR yang akan di-Delete: ";
                // meminta masukkan usuer untuk id yang akan dicari dan akan di-delete
                cin >> cari;

                // looping untuk mencari id yang diminta oleh user
                // jika data ditemukan maka user diminta untuk memasukkan data baru yang akan dihapus
                for (list<DPR>::iterator it = lList.begin(); it != lList.end(); it++)
                {
                    if (cari == it->get_id())
                    {
                        it = lList.erase(it);
                        // isFound berubah karena id berhasil ditemukan
                        isFound = true;
                    }
                }
                // jika id ditemukan dan jika tidak ditemukan
                if (isFound == true)
                {
                    cout << "DATA BERHASIL DI-DELETE!" << '\n';
                }
                else
                {
                    cout << "DATA TIDAK DAPAT DITEMUKAN!" << '\n';
                }
            }
            break;
        default:
            cout << "TERIMA KASIH!" << '\n';

            break;
        }
    }

    return 0;
}