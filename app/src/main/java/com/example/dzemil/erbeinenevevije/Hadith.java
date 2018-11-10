package com.example.dzemil.erbeinenevevije;

public class Hadith {
    private String bosHadith;
    private String araHadith;

    public Hadith(String bosHadith, String araHadith) {
        this.bosHadith = bosHadith;
        this.araHadith = araHadith;
    }

    public String getBosHadith() {
        return bosHadith;
    }

    public void setBosHadith(String bosHadith) {
        this.bosHadith = bosHadith;
    }

    public String getAraHadith() {
        return araHadith;
    }

    public void setAraHadith(String araHadith) {
        this.araHadith = araHadith;
    }
}
