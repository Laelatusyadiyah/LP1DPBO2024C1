#include <iostream>
#include <string>

using namespace std;

// membuat kelas DPR
class DPR
{
    // atribut yang diperlukan
private:
    string name;
    string id;
    string bidang;
    string partai;

public:
    // constructor tanpa parameter
    DPR()
    {
        this->id = "";
        this->name = "";
        this->bidang = "";
        this->partai = "";
    }

    // constructor dengan parameter id, nama, prodi, dan fakultas
    DPR(string id, string name, string bidang, string partai)
    {
        this->id = id;
        this->name = name;
        this->bidang = bidang;
        this->partai = partai;
    }

    // tetapkan id
    void set_id(string id)
    {
        this->id = id;
    }

    // get id
    string get_id()
    {
        return this->id;
    }
    // tetapkan nama
    void set_name(string name)
    {
        this->name = name;
    }

    // get nama
    string get_name()
    {
        return this->name;
    }

    // tetapkan prodi
    void set_bidang(string bidang)
    {
        this->bidang = bidang;
    }

    // get prodi
    string get_bidang()
    {
        return this->bidang;
    }

    // tetapkan fakultas
    void set_partai(string partai)
    {
        this->partai = partai;
    }

    // get fakultas
    string get_partai()
    {
        return this->partai;
    }

    // deconstruct
    ~DPR()
    {
    }
};