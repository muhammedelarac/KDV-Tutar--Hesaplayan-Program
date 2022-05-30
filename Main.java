import java.util.Scanner;
public class Main {
    public static void main(String[] args) {  
//Değişenleri oluştur

double tutar ; 
Scanner imput = new Scanner(System. 
in);

System.out.println("Ücret Yutarını diriniz");
tutar = imput.nextDouble();

// Karşılaştırma    0.18     0.08
boolean karsilastirma = tutar > 1000;

double kdvOran =  karsilastirma ? (0.08) : (0.18);
double kdvTutar =tutar * kdvOran;
double kdvliTutar = tutar + kdvTutar;


//Çıktılar

System.out.println("KDV'sis Tutar " +  tutar);
System.out.println("KDV Oranı " +  kdvOran);
System.out.println("KDV Tutarı " +  kdvTutar);
System.out.println("KDVli Tutar " +  kdvliTutar);

// program bitti
System.out.println("|Program Bitti");


    }
    
}
