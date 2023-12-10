
import java.text.SimpleDateFormat;
import java.util.Date;

class Transaksi extends Barang implements TotalBayar {
   
    private String namaPelanggan;
    private String nomorHP;
    private String alamat;
    private int jumlahBeli;
    

    public Transaksi(String namaPelanggan,String nomorHP, String alamat,String kodeBarang, String namaBarang, double hargaBarang, int jumlahBeli) {
        super(kodeBarang,namaBarang, hargaBarang);
        this.namaPelanggan = namaPelanggan;
        this.nomorHP= nomorHP;
        this.alamat= alamat;
        this.jumlahBeli = jumlahBeli;
    }

    @Override
    public double hitungTotalBayar() {
        return hargaBarang * jumlahBeli;
    }

    public String getNamaKasir() {
        return "Uwan";
    }

    public String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, dd/MM/yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public String getCurrentTime() {
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss Z");
        Date date = new Date();
        return timeFormat.format(date);
    }

    public void tampilkanTransaksi() {
        System.out.println("Kedai");
        System.out.println("Tanggal : " + getCurrentDate());
        System.out.println("Waktu   : " + getCurrentTime());
        System.out.println("========================");
        System.out.println("DATA PELANGGAN");
        System.out.println("---------------------");
        System.out.println("Nama Pelanggan : " + namaPelanggan.toUpperCase());
        System.out.println("No. HP         : " + nomorHP);
        System.out.println("Alamat         : " + alamat);
        System.out.println("++++++++++++++++++++++++");
        System.out.println("DATA PEMBELIAN BARANG");
        System.out.println("----------------------------");
        tampilkanInfo(); 
        System.out.println("Jumlah Beli   : " + jumlahBeli);
        System.out.println("TOTAL BAYAR  : " + String.format("%.2f", hitungTotalBayar()));
        System.out.println("++++++++++++++++++++++++");
        System.out.println("Kasir :" + getNamaKasir());

        
    }



    
    
}