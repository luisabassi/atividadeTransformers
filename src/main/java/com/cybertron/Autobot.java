package com.cybertron;

public class Autobot {
    private String nomeAutobot;
    private double energoon;
    private int nivel;

    public Autobot(String nomeAutobot, double energoon, int nivel) {
        this.nomeAutobot = nomeAutobot;
        this.energoon = energoon;
        this.nivel = nivel;
    }

    public String getNomeAutobot() {
        return nomeAutobot;
    }

    public void setNomeAutobot(String nomeAutobot) {
        this.nomeAutobot = nomeAutobot;
    }

    public double getEnergoon() {
        return energoon;
    }

    public void setEnergoon(double energoon) {
        this.energoon = energoon;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
