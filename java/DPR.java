// deklarasi class
public class DPR {

    // attibut private bertipe data string
    private String id;
    private String name;
    private String bidang;
    private String partai;

    // constructor tanpa parameter
    public DPR() {
        this.id = "";
        this.name = "";
        this.bidang = "";
        this.partai = "";
    }

    // constructor
    public DPR(String id, String name, String bidang, String partai) {
        this.id = id;
        this.name = name;
        this.bidang = bidang;
        this.partai = partai;
    }

    // setter dan getter
    public String get_id() {
        return this.id;
    }

    public void set_id(String id) {
        this.id = id;
    }

    public String get_name() {
        return this.name;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public String get_bidang() {
        return this.bidang;
    }

    public void set_bidang(String bidang) {
        this.bidang = bidang;
    }

    public String get_partai() {
        return this.partai;
    }

    public void set_partai(String partai) {
        this.partai = partai;
    }

};
