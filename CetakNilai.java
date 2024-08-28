jetbrains://idea/navigate/reference?project=tp1PBO_Gagas&fqn=CetakNilai
C:\Users\USER\IdeaProjects\tp1PBO_Gagas\src\CetakNilai.java

  public class CetakNilai {
    public static void main(String[] args) {
        Nilai mahasiswa1 = new Nilai();
        Nilai mahasiswa2 = new Nilai();

        mahasiswa1.npm = 23101;
        mahasiswa1.nama = "Yandra";
        mahasiswa1.Absen = 100;
        mahasiswa1.Tugas = 85;
        mahasiswa1.UTS = 81;
        mahasiswa1.UAS = 88;
        mahasiswa1.Nilai();
        mahasiswa1.Nilaii();

        System.out.println();

        mahasiswa2.npm = 23102;
        mahasiswa2.nama = "Gasyan";
        mahasiswa2.Absen= 98;
        mahasiswa2.Tugas = 88;
        mahasiswa2.UTS = 88;
        mahasiswa2.UAS = 88;
        mahasiswa2.Nilai();
        mahasiswa2.Nilaii();
    }
}
