# import class dari file
from DPR import DPR

# deklrasi variabel
i = 0
isFound = False

# deklarasi array
dpr = []
# looping while dengan syarat masukkan user bukan 5 yang berarti exit dari program
# looping ini bekerja untuk menentukan apa yang diinginkan oleh user, ada 5 query yaitu create, read, update dan exit
# untuk menentukan query yang sesuai dengan yang diminta user saya menggunakan fungsi if else (untuk python) yang sesuai dengan menu,
# 1 untuk create, 2 untuk read, 3 untuk update, 4 untuk delete, dan 5 untuk exit
while i != 5:

    # menampilkan menu

    print("")
    print("Program Informasi Anggota DPR")
    print("1. Create")
    print("2. Read")
    print("3. Update")
    print("4. Delete")
    print("5. Exit")
    print("Masukkan Query yang diinginkan:")

    # meminta masukkan query berapa yang diinginkan user
    i = int(input())
    print("")

    #  if else untuk menentukan query yang diinginkan user

    # input 1 untuk create
    if i == 1:

        #  meminta masukkan user untuk menambahkan data baru
        print("Masukkan ID: ")
        id = str(input())
        print("Masukkan Nama: ")
        name = str(input())
        print("Masukkan Bidang: ")
        bidang = str(input())
        print("Masukkan Partai: ")
        partai = str(input())
        #  objek dimasukkan ke dalam array

        dpr.append(DPR(id, name, bidang, partai))
        print("DATA BARU BERHASIL DITAMBAHKAN!")

    # input 2 untuk read

    elif i == 2:
        #  cek terlebih dahulu apakah list kosong atau tidak

        if not dpr:
            print("DATA DPR KOSONG!")
        else:
            #  menampilkan isi dari list dengan looping for dan setiap attributnya ditampilkan dengan memanggil getter masing-masing attribut

            n = 1
            for Dpr in dpr:
                print("Data Lengkap Anggota: ")
                print(n, end=". ")
                print("   ID           :", Dpr.get_id())
                print("   Nama         :", Dpr.get_name())
                print("   Bidang        :", Dpr.gat_bidang())
                print("   Partai     :", Dpr.get_partai())
                n += 1

    # input 3 untuk update
    elif i == 3:
        #  cek terlebih dahulu apakah list kosong atau tidak

        if not dpr:
            print("DATA MAHASISWA KOSONG!")
        else:
            #  meminta masukkan user untuk id yang akan dicari dan akan di-update
            print("Masukkan ID Anggota DPR yang akan di-Update: ")
            cari = str(input())

            #  looping untuk mencari id yang diminta oleh user
            #  jika data ditemukan maka user diminta untuk memasukkan data baru yang akan diubah
            for Dpr in dpr:
                if cari == Dpr.get_id():
                    print("Masukkan ID      : ")
                    id = str(input())
                    print("Masukkan Nama    : ")
                    name = str(input())
                    print("Masukkan Bidang  : ")
                    bidang = str(input())
                    print("Masukkan Partai  : ")
                    partai = str(input())

                    Dpr.set_id(id)
                    Dpr.set_name(name)
                    Dpr.set_bidang(bidang)
                    Dpr.set_partai(partai)

                    #  isFound berubah karena id berhasil ditemukan
                    isFound = True

            #  jika id ditemukan dan jika tidak ditemukan
            if isFound == True:
                print("DATA BERHASIL DI-UPDATE!")
            else:
                print("DATA TIDAK DAPAT DITEMUKAN!")

    # input 4 untuk delete
    elif i == 4:
        #  cek terlebih dahulu apakah list kosong atau tidak

        if not dpr:
            print("DATA DPR KOSONG!")
        else:
            #  meminta masukkan usuer untuk id yang akan dicari dan akan di-delete
            print("Masukkan ID Anggota yang akan di-Delete: ")
            cari = str(input())
            n = 0
            #  looping untuk mencari id yang diminta oleh user
            #  jika data ditemukan maka user diminta untuk memasukkan data baru yang akan dihapus
            for Dpr in dpr:

                if cari == Dpr.get_id():
                    dpr.pop(n)
                    #  isFound berubah karen id berhasil ditemukan
                    isFound = True
                n += 1

            #  jika id ditemukan dan jika tidak ditemukan
            if isFound == True:
                print("DATA BERHASIL DI-DELETE!")
            else:
                print("DATA TIDAK DAPAT DITEMUKAN!")
    else:
        print("TERIMA KASIH!")
