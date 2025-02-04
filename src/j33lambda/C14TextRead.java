package j33lambda;

public class C14TextRead {
    public static void main(String[] args) {
         /*
dosya eklemek icin 2 yol kullanılır
1) Files.lines(Path.of("path")  buradan stream e eklemek icin
Stream <String> satir=Files.lines(Path.of(".........."));
bu bize tekrardan stream tanimlamadan kullanmayi saglar
2) //Files.lines(Paths.get("..........")).  kullanilir
==========================================================
intellj dosya eklemek icin src => new=>file=>text diyoruz ve istedigimiz metni buraya kopyaliyoruz
bu dosyanin path almak icin dosyanin uzerine gelip sag tikliyoruz(burada dosya HalUk)
sonrasinda copy path seciyoruz bundan sonra iki secenek var
1) absolute path seciyoruz yada
2) path from content root seciyoruz
her ikisinde de path kopyalamis oluyoruz

cevirirken EXCEPTION OLUSMASIN DIYE => throws IOException <= EKLEMELIYIZ
buda lines altinda kirmizi uyari veriyor uzerine tiklayinca kendiliginden oluyor.
*/

        System.out.println("****Task 01*****");
        //TASK 01 --> hedefDosyayı Console'a print eden code create ediniz.

        System.out.println("\n****Task 02*****");
        //TASK 02 --> hedefDosyayı Console'a buyuk harflerle print eden code create ediniz.

        System.out.println("\n****Task 03*****");
        //TASK 03 --> hedefDosyanın sadece ilk satiri kucuk harflerle print eden code create ediniz.

        System.out.println("\n****Task 04*****");
        //TASK 04 --> hedefDosyayıda "basari" kelimesinin kac satirda gectigini print eden code create ediniz.



    }
}
