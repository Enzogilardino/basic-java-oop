// membuat class sebagai template
class Mahasiswa {
    String nama;
    String NPM;
    String jurusan;
    Double IPK;
    int umur;

}



public class main {
    public static void main(String[] args) throws Exception {

        // instaniasi / membuat object
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Enzo";
        mahasiswa1.NPM = "202157201002";
        mahasiswa1.jurusan = "Sistem informasi";
        mahasiswa1.IPK = 4.0;
        mahasiswa1.umur = 19;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NPM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Rizal";
        mahasiswa2.NPM = "202157201035";
        mahasiswa2.jurusan = "Sistem informasi";
        mahasiswa2.IPK = 3.5;
        mahasiswa2.umur = 19;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NPM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);
    }
    
}
