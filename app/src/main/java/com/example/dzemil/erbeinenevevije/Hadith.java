package com.example.dzemil.erbeinenevevije;

public class Hadith {
    private String hadithNum;
    private String bosHadith;
    private String araHadith;

    public Hadith(String hadithNum, String bosHadith, String araHadith) {
        this.hadithNum = hadithNum;
        this.bosHadith = bosHadith;
        this.araHadith = araHadith;
    }

    public String getHadithNum() {
        return hadithNum;
    }

    public void setHadithNum(String hadithNum) {
        this.hadithNum = hadithNum;
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
