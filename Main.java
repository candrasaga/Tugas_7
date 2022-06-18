package fromzero;

        public class Main {

            public static void main(String[] args) {

                System.out.println("NAMA : Candra Setiawan");
                System.out.println("NIM  : 215150700111024");
                System.out.println();

                Pegawai tetap1 = new PegawaiTetap("Leo Wu", "35070392839289342", 2200000);
                Pegawai tetap2 = new PegawaiTetap("Wuxian", "35171108927919883", 1580000);
                Pegawai tetap3 = new PegawaiTetap("Xiao Yan", "357118989289450", 1500000);
                Pegawai tetap4 = new PegawaiTetap("Ashile","2171109302390993", 4000000 );
                Pegawai tetap5 = new PegawaiTetap("Ashina","2171109302390995", 4500000 );

                tetap1.toString();
                tetap2.toString();
                tetap3.toString();
                tetap4.toString();
                tetap5.toString();

                Pegawai harian_1 = new PegawaiHarian("Quanghai", "3507922192992230", 11500, 40);
                Pegawai harian_2 = new PegawaiHarian("Lorion", "217118102810757", 95000, 30);
                Pegawai harian_3 = new PegawaiHarian("Yan", "2171109210910082", 80000, 50);
                Pegawai harian_4 = new PegawaiHarian("Lauriel", "2171109019209730", 90000, 45);

                harian_1.toString();
                harian_2.toString();
                harian_3.toString();
                harian_4.toString();

                Pegawai sales1 = new Sales("Liang Jie", "350182781729112", 50, 50000);
                Pegawai sales2 = new Sales("Cheng Xiao", "21711928182010", 70, 40000);
                Pegawai sales3 = new Sales("Nakroth", "2171121029019", 75, 65000);
                Pegawai sales4 = new Sales("Zephys", "217119289128918", 95, 55000);

                sales1.toString();
                sales2.toString();
                sales3.toString();
                sales4.toString();


            }

            
        }









