package inner.enums;

public class Person {
    private String ad;
    private Integer yas;
    private Gender cins;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public Integer getYas() {
        return yas;
    }

    public void setYas(Integer yas) {
        this.yas = yas;
    }

    public Gender getCins() {
        return cins;
    }

    public void setCins(Gender cins) {
        this.cins = cins;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ad='" + ad + '\'' +
                ", yas=" + yas +
                ", cins=" + cins +
                '}';
    }
}
