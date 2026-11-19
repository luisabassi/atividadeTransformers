package com.cybertron;

public class Autobot {
    private String nomeAutobot;
    private double energon;
    private int nivel;

    public Autobot(String nomeAutobot, double energon, int nivel) {
        this.nomeAutobot = nomeAutobot;
        this.energon = energon;
        this.nivel = nivel;
    }

    public String getNomeAutobot() {
        return nomeAutobot;
    }

    public void setNomeAutobot(String nomeAutobot) {
        this.nomeAutobot = nomeAutobot;
    }

    public double getEnergon() {
        return energon;
    }

    public void setEnergoon(double energon) {
        this.energon = energon;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
