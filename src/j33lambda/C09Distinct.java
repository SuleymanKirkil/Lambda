package j33lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09Distinct {
    {
        //distinct() => Bu method tekrarlı elemanları sadece bir kere akısa sokar.
        // Bu akışın farklı elemanlarından (Object.equals (Object) 'e göre) oluşan bir akış döndürür.
        // Sıralı akışlar için, farklı elemanın seçimi sabittir.
        // (yinelenen öğeler için, karşılaşma sırasında ilk görünen öğe korunur.)
        // Sırasız akışlar için, herhangi bir kararlılık garantisi verilmez. Stream return eder.

        List<String> yemahhh = new ArrayList<String>(Arrays.asList("küşleme", "küşleme", "küşleme", "soğanlı", "soğanlı", "soğanlı", "trileçe", "bicibici", "büryan", "melemen", "cacix", "kokereç", "yağlama", "güveç", "arabAşı", "tantuni"));
        System.out.println("***Task01****");
        //Task01-> list elemanlarını alfabetik Buyuk harf ile tekrarsız print eden code create ediniz...

        System.out.println();
        System.out.println("\n***Task02****");
        // Task02-> : list elemanlarinin character sayisini ters sirali olarak tekrarsiz print eden code create ediniz.

        System.out.println();
        System.out.println("\n***Task03****");
        // Task03-> : list elemanlarinin character sayisini  k->b sıralı benzersiz print eden code create ediniz.

        System.out.println();
        System.out.println("\n***Task04****");
        // Task04-> : list elemanlarini son characterine göre ters sıralı tekrarsız print eden code create ediniz.

        System.out.println();
        System.out.println("\n***Task05****");
        // Task05-> listin elemanlarin  cift sayili karakterlerinin  karelerini   b->k sirali tekrarsiz print eden code create ediniz...


    }
}
