jetbrains://idea/navigate/reference?project=tp1PBO_Gagas&fqn=Nilai
C:\Users\USER\IdeaProjects\tp1PBO_Gagas\src\Nilai.java

  public class Nilai {
    String nama;
    int npm;
    double Absen, Tugas, UTS, UAS, Akhir;

    void Nilai() {
        this.Absen = Absen * 0.1;
        this.Tugas = Tugas * 0.2;
        this.UTS = UTS * 0.3;
        this.UAS = UAS * 0.4;
        this.Akhir = (this.Absen + this.Tugas + this.UTS + this.UAS);

    }

    void Nilaii() {
        System.out.println("NPM              : " + this.npm);
        System.out.println("Nama             : " + this.nama);
        System.out.println("Nilai Absen [10%]: " + this.Absen);
        System.out.println("Nilai Tugas [20%]: " + this.Tugas);
        System.out.println("Nilai UTS [30%]  : " + this.UTS);
        System.out.println("Nilai UAS [40%]  : " + this.UAS);
        System.out.println("Nilai Akhir      : " + this.Akhir);
    }
}
