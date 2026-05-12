import java.util.Scanner;

public class DoubleLinkedListMain15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DoubleLinkedList15 list = new DoubleLinkedList15();
        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah Data di Awal");
            System.out.println("2. Tambah Data di Akhir");
            System.out.println("3. Sisipkan Data di Tengah (Setelah NIM)");
            System.out.println("4. Hapus Data di Awal");
            System.out.println("5. Hapus Data di Akhir");
            System.out.println("6. Tampilkan Data");
            System.out.println("7. Tampilkan Data Terbalik");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine(); 
            
            switch (pilihan) {
                case 1:
                    Mahasiswa15 mhsAwal = inputMahasiswa(scan);
                    list.addFirst(mhsAwal);
                    break;
                case 2:
                    Mahasiswa15 mhsAkhir = inputMahasiswa(scan);
                    list.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String keyNim = scan.nextLine();
                    System.out.println("Masukkan data baru:");
                    Mahasiswa15 dataBaru = inputMahasiswa(scan);
                    list.insertAfter(keyNim, dataBaru);
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    list.print();
                    break;
                case 7:
                    list.printReverse();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid. ");
            }
        } while (pilihan != 0);
        scan.close();

    }

    private static Mahasiswa15 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM   : ");
        String nim = scan.nextLine();

        System.out.print("Masukkan Nama  : ");
        String nama = scan.nextLine();

        System.out.print("Masukkan Kelas : ");
        String kelas = scan.nextLine();

        System.out.print("Masukkan IPK   : ");
        double ipk = scan.nextDouble();
        scan.nextLine(); // ⚠️ wajib ada untuk flush newline

        return new Mahasiswa15(nim, nama, kelas, ipk);
    }
    
}
