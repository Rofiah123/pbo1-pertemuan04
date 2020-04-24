package While;

public class Do {
    int isiGelas = 0;
    int penuh = 225;

    System.out.println("Isi Gelas Sekarang : " + isiGelas + "ml");
    System.out.println("Isi Gelas Ketika Penuh : " + penuh + "ml");

    do {
        isiGelas++;
        System.out.println("Sedang mengisi gelas..");
        System.out.println("Isi Gelas Sekarang : " + isiGelas + "ml");
    }while(isiGelas != penuh);

System.out.println("Finale: Gelas Sekarang : " + isiGelas + "ml");

 }
}
