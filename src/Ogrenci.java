public class Ogrenci {
    private String ad;
    private String bolum;
    private int girisYili;
    private int ogrNo;
    private double gano;
    private int bolumKodu;

    // Constructor Overloading
    public Ogrenci(String ad, String bolum, int girisYili, double gano, int bolumKodu) {
        this.ad = ad;
        this.bolum = bolum;
        this.girisYili = girisYili;
        this.gano = gano;
        this.bolumKodu = bolumKodu;
        this.ogrNo = hesaplaOgrNo(girisYili, bolumKodu);
    }

    public Ogrenci(String ad, String bolum, int girisYili, double gano) {
        this(ad, bolum, girisYili, gano, 0); // Bölüm kodu varsayılan olarak 0
    }

    // Getter ve Setter Metodları
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getGirisYili() {
        return girisYili;
    }

    public void setGirisYili(int girisYili) {
        this.girisYili = girisYili;
    }

    public int getOgrNo() {
        return ogrNo;
    }

    public double getGano() {
        return gano;
    }

    public void setGano(double gano) {
        // Gano kontrolü
        if (gano < 0 || gano > 4) {
            throw new IllegalArgumentException("Gano 0 ile 4 arasında olmalıdır.");
        }
        this.gano = gano;
    }

    public int getBolumKodu() {
        return bolumKodu;
    }

    public void setBolumKodu(int bolumKodu) {
        this.bolumKodu = bolumKodu;
    }

    // Harç Hesaplama Metodu
    public double harcHesapla(int dersSayisi) {
        // Her dersin harcı 160 TL
        double harc = dersSayisi * 160;

        // Uzayan öğrencilerin harcı artırılabilir
        return harc;
    }

    // Öğrenci No Hesaplama Metodu
    private int hesaplaOgrNo(int girisYili, int bolumKodu) {
        // Öğrenci no formatı: giriş yılı + bölüm kodu + giriş sırası
        // Giriş sırası şu an için sabit olarak 1 alınmıştır.
        return Integer.parseInt(String.valueOf(girisYili) + String.valueOf(bolumKodu) + "1");
    }
}