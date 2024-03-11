public class Main {
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci("null", "null", 1973, 0.0, 104);
        Ogrenci ogrenci2 = new Ogrenci("Gökhan", "Bilgisayar Müh", 1985, 0.0, 104);
        Ogrenci ogrenci3 = new Ogrenci("Ayşe", "Makine Müh", 1985, 0.0, 104);
        Ogrenci ogrenci4 = new Ogrenci("Elif", "Elektrik-Elektronik Müh", 2020, 1.98, 104);

        System.out.println("Öğrencilerin Bilgileri");
        System.out.println("OGR-1 " + ogrenci1.getAd() + " " + ogrenci1.getBolum() + " " + ogrenci1.getOgrNo() + " " + ogrenci1.getGano());
        System.out.println("OGR-2 " + ogrenci2.getAd() + " " + ogrenci2.getBolum() + " " + ogrenci2.getOgrNo() + " " + ogrenci2.getGano());
        System.out.println("OGR-3 " + ogrenci3.getAd() + " " + ogrenci3.getBolum() + " " + ogrenci3.getOgrNo() + " " + ogrenci3.getGano());
        System.out.println("OGR-4 " + ogrenci4.getAd() + " " + ogrenci4.getBolum() + " " + ogrenci4.getOgrNo() + " " + ogrenci4.getGano());

        // Harç Hesaplama
        System.out.println("3. öğrencinin ödeyeceği harç: " + ogrenci3.harcHesapla(3) + " TL");
        System.out.println("4. öğrencinin ödeyeceği harç: " + ogrenci4.harcHesapla(6) + " TL");
    }
}