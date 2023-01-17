import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner oku =new Scanner(System.in);
        Random random=new Random();
        int kazandi=0;
        int zar;
        int girdi=0;
        int toplam=0;
        int toplam1=0;
        do {
     int dizi []=new int[2];
     for (int i=0;i<2;i++)
     {
         System.out.println("Oyuncu "+(i+1)+" zar atmak için tuşa basınız..:");
          girdi=oku.nextInt();
          zar=random.nextInt(1,6);
          System.out.println("Oyuncu "+(i+1)+" attığı zar: "+zar);
        if (i==0)
        {
            toplam+=zar;
            System.out.println("Güncel Oyuncu 1 Zar Toplamı"+toplam);
            if (toplam>=20)
            {System.out.println("Oyuncu 1 Kazandı"+toplam);
                kazandi=1;
            }

        }
        else if (i==1)
        {
            toplam1+=zar;
            System.out.println("Güncel Oyuncu 1 Zar Toplamı"+toplam1);
            if (toplam1>=20)
            {
                System.out.println("Oyuncu 2 kazandı"+toplam1);
                kazandi=1;
            }

        }


     }

        }
        while (kazandi!=1);







    }
}