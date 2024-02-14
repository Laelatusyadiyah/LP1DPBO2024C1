<?php

//import file 
require('DPR.php');

// instansiasi object 
$dpr1 = new DPR("123", "Laela", "Keuangan", "PKB");
$dpr2 = new DPR("456", "Azalea", "Rumah Tangga", "PKS");
$dpr3 = new DPR("789", "Wandi", "Kaderisasi", "PBB");
$dpr4 = new DPR("987", "Wati", "Daerah", "P3");
$dpr5 = new DPR("654", "Maya", "Pariwisata", "PAN");

//memasukkan object ke dalam array
$dpr = array($dpr1, $dpr2, $dpr3, $dpr4, $dpr5);

//menampilkan data 
echo "<br> Data Anggota DPR <br>";

for ($i = 0; $i < 5; $i++) {
    echo $i + 1 . ". ID          :" . $dpr[$i]->get_id() . "<br>";
    echo "   Nama           :" . $dpr[$i]->get_name() . "<br>";
    echo "   Bidang          :" . $dpr[$i]->get_bidang() . "<br>";
    echo "   Partai       :" . $dpr[$i]->get_partai() . "<br><br>";
}

// instansiasi object
$dpr6 = new DPR("234", "Fatin", "Internal", "PAN");
$dpr7 = new DPR("567", "Ari", "Eksternal", "PKS");

//menambah object baru ke dalam array
array_push($dpr, $dpr6, $dpr7);

//menampillkan data  yang sudah ditampilkan
echo "<br> Data Anggota DPR ditambah dengan yang baru <br>";

for ($i = 0; $i < 7; $i++) {
    echo $i + 1 . ". ID          :" . $dpr[$i]->get_id() . "<br>";
    echo "   Nama           :" . $dpr[$i]->gar_name() . "<br>";
    echo "   Bidang          :" . $dpr[$i]->get_bidang() . "<br>";
    echo "   Partai       :" . $dpr[$i]->get_partai() . "<br><br>";
}

//menghapus object dari dalam array
\array_splice($dpr, 2, 1);
\array_splice($dpr, 3, 1);

//menampilkan data DPR yang sudah ada dihapus beberapa
echo "<br> Data Anggota DPR baru yang sudah ada yang didelete <br>";
for ($i = 0; $i < 5; $i++) {
    eecho $i + 1 . ". ID          :" . $dpr[$i]->get_id() . "<br>";
    echo "   Nama           :" . $dpr[$i]->gar_name() . "<br>";
    echo "   Bidang          :" . $dpr[$i]->get_bidang() . "<br>";
    echo "   Partai       :" . $dpr[$i]->get_partai() . "<br><br>";
}
