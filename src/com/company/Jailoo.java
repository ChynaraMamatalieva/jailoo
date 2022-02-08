package com.company;

public class Jailoo {
    private String name;
    private String daregi;
    private String chabandynAty;
    private Uy[] uylar;
    private Koy[] koylor;
    private At[] attar;

    public Jailoo(String name, String daregi, String chabandynAty, Uy[] uylar, Koy[] koylor, At[] attar) {
        this.name = name;
        this.daregi = daregi;
        this.chabandynAty = chabandynAty;
        this.uylar = uylar;
        this.koylor = koylor;
        this.attar = attar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDaregi() {
        return daregi;
    }

    public void setDaregi(String daregi) {
        this.daregi = daregi;
    }

    public String getChabandynAty() {
        return chabandynAty;
    }

    public void setChabandynAty(String chabandynAty) {
        this.chabandynAty = chabandynAty;
    }

    public Uy[] getUylar() {
        return uylar;
    }

    public void setUylar(Uy[] uylar) {
        this.uylar = uylar;
    }

    public Koy[] getKoylor() {
        return koylor;
    }

    public void setKoylor(Koy[] koylor) {
        this.koylor = koylor;
    }

    public At[] getAttar() {
        return attar;
    }

    public void setAttar(At[] attar) {
        this.attar = attar;
    }
}
