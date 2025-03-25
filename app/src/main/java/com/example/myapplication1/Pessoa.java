package com.example.myapplication1;

public class Pessoa {
    private String nome;
    private String wdc;
    private String wins;
    private String img;

    private String podiuns;

    private String poles;

    public Pessoa(String nome, String wdc, String wins, String img, String podiuns, String poles) {
        this.nome = nome;
        this.wdc = wdc;
        this.wins = wins;
        this.img = img;
        this.podiuns = podiuns;
        this.poles = poles;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getWdc() {
        return wdc;
    }

    public void setWdc(String wdc) {
        this.wdc = wdc;
    }

    public String getWins() {
        return wins;
    }

    public void setWins(String wins) {
        this.wins = wins;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getPodiuns(){return podiuns;}

    public void setPodiuns(String podiuns){this.podiuns = podiuns;}

    public String getPoles(){return poles;}

    public void setPoles(String poles){this.poles = poles;}
}
