import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Data log masuk
            String username = "hatta";
            String password = "12345678";

            // Program log masuk
            System.out.println("\n\n=== Program Login ===");

            System.out.print("Masukkan nama pengguna: ");
            String inputUsername = scanner.next();

            System.out.print("Masukkan kata sandi: ");
            String inputPassword = scanner.next();

            
            if (username.equals(inputUsername) && password.equals(inputPassword)) {
                // CAPTCHA
                String captcha = "Semangat";
                System.out.println("CAPTCHA: " + captcha);
                System.out.print("Masukkan CAPTCHA : ");
                scanner.nextLine(); 

                String inputCaptcha = scanner.nextLine();

                
                if (captcha.equalsIgnoreCase(inputCaptcha)) {
                    System.out.println("Login berhasil");

                    System.out.println("\n=== Masukkan Data Pelanggan ===");
                    System.out.print("Masukkan Nama Pelanggan: ");
                    String namaPelanggan = scanner.nextLine();
                    System.out.print("Masukkan Nomor HP: ");
                    String nomorHP = scanner.nextLine();
                    System.out.print("Masukkan Alamat: ");
                    String alamat = scanner.nextLine();
                    System.out.print("Kode Barang   : ");
                    String kodeBarang = scanner.nextLine();
                    System.out.print("Nama Barang   : ");
                    String namaBarang = scanner.nextLine();
                    System.out.print("Harga Barang  : ");
                    double hargaBarang = scanner.nextDouble();
                    System.out.print("Jumlah Beli   : ");
                    int jumlahBeli = scanner.nextInt();

                    
                    Transaksi transaksi = new Transaksi(namaPelanggan, nomorHP, alamat, kodeBarang, namaBarang, hargaBarang, jumlahBeli);

                    
                    transaksi.tampilkanTransaksi();
                } else {
                    System.out.println("CAPTCHA tidak cocok. Login gagal!");
                }
            } else {
                System.out.println("Nama pengguna atau kata sandi salah. Login gagal!");
            }

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
