import java.util.Scanner;
public class Challange_TeamC {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");
        System.out.print("Calculator Luas dan Volume \n");
        Scanner input = new Scanner(System.in);
        int pilihan;
        do{
            System.out.println("--------------------------------------------------");
            System.out.print("Menu Utama \n");
            System.out.println("--------------------------------------------------");
            System.out.println("1. Menghitung Luas");
            System.out.println("2. Menghitung Volume");
            System.out.println("3. Matikan Program");
            System.out.println("--------------------------------------------------");
            System.out.println("Masukkan angka pilihan menu :");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("--------------------------------------------------");
                    System.out.print("Menu Luas Bangun Datar \n");
                    boolean ujiluas = true;
                    do{
                        System.out.println("--------------------------------------------------");
                        System.out.print("Pilih bidang datar yang dihitung \n");
                        System.out.println("--------------------------------------------------");
                        System.out.println("1. Persegi");
                        System.out.println("2. Lingkaran");
                        System.out.println("3. Segitiga");
                        System.out.println("4. Persegi Panjang");
                        System.out.println("5. Kembali ke Menu Utama");
                        System.out.println("--------------------------------------------------");
                        int luaspilih = input.nextInt();
                        switch (luaspilih) {
                            case 1:
                                Double luasPersegi;
                                System.out.println("Masukkan sisi : ");
                                Double sisi = input.nextDouble();
                                luasPersegi = sisi*sisi;
                                System.out.printf("\n Luas persegi = %.2f \n",luasPersegi);
                                break;
                            case 2:
                                Double luaslingkaran;
                                System.out.println("Masukkan jari-jari : ");
                                Double jari2 = input.nextDouble();
                                luaslingkaran = (22/7)*(jari2*jari2);
                                System.out.printf("\n Luas lingkaran = %.2f \n",luaslingkaran);
                                break;
                            case 3:
                                Double luasSegitiga;
                                System.out.println("Masukkan alas : ");
                                Double panjangST = input.nextDouble();
                                System.out.println("Masukkan tinggi : ");
                                Double lebarST = input.nextDouble();
                                luasSegitiga = (panjangST*lebarST)/2;
                                System.out.printf("\n Luas segitiga = %.2f \n" ,luasSegitiga);
                                break;
                            case 4:
                                Double luasPesrsegiPanjang;
                                System.out.println("Masukkan panjang : ");
                                Double panjangPP = input.nextDouble();
                                System.out.println("Masukkan lebar : ");
                                Double lebarPP = input.nextDouble();
                                luasPesrsegiPanjang = panjangPP*lebarPP;
                                System.out.printf("\n Luas lingkaran = %.2f \n" ,luasPesrsegiPanjang);
                                break;
                            case 5:
                                ujiluas = false;
                                break;
                        }
                    }while(ujiluas);
                    break;

                case 2:
                    boolean ujiVolume = true;
                    System.out.println("--------------------------------------------------");
                    System.out.print("Menu Volume Bangun Ruang \n");
                    do{
                        System.out.println("--------------------------------------------------");
                        System.out.print("Pilih bidang ruang yang dihitung \n");
                        System.out.println("--------------------------------------------------");
                        System.out.println("1. Kubus");
                        System.out.println("2. Balok");
                        System.out.println("3. Tabung");
                        System.out.println("4. Kembali ke Menu Utama");
                        System.out.println("--------------------------------------------------");
                        int luaspilih = input.nextInt();
                        switch (luaspilih) {
                            case 1:
                                Double volumeKubus;
                                System.out.println("Masukkan sisi : ");
                                Double sisi = input.nextDouble();
                                volumeKubus = sisi*sisi*sisi;
                                System.out.printf("\n Volume Kubus = %.2f \n",volumeKubus);
                                break;
                            case 2:
                                Double volumeBalok;
                                System.out.println("Masukkan panjang : ");
                                Double panjangB = input.nextDouble();
                                System.out.println("Masukkan lebar : ");
                                Double lebarB = input.nextDouble();
                                System.out.println("Masukkan balok : ");
                                Double tingggiB = input.nextDouble();
                                volumeBalok = panjangB*lebarB*tingggiB;
                                System.out.printf("\n Volume Kubus = %.2f \n",volumeBalok);
                                break;
                            case 3:
                                Double volumeTabung ;
                                System.out.println("Masukkan jari-jari : ");
                                Double jari2T = input.nextDouble();
                                System.out.println("Masukkan tinggi : ");
                                Double tingggiT = input.nextDouble();
                                volumeTabung = (22*(jari2T*jari2T)/7)*tingggiT;
                                System.out.printf("\n Volume Tabung = %.2f \n",volumeTabung);
                                break;
                            case 4:
                                ujiVolume = false;
                                break;
                        }
                    }while(ujiVolume);
                    break;
                case 3:
                    System.out.println("Mematikan program");
                    System.out.println("--------------------------------------------------");
                    System.exit(0);
                    break;
                default:
                    System.out.println("salah inpot");
                    break;
            }

        }while (pilihan != 3);
    }
}