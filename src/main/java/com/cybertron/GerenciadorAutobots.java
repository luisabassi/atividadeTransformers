package com.cybertron;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorAutobots {

    private List<Autobot> lista = new ArrayList<>();
    private static final double LIMITE_ENERGON_ALTO = 500.0;
    private static final int LIMITE_ENERGON_MEDIA = 200;
    private static final int ENERGON_ADICIONAL = 100;

    public void adicionar(Autobot autobot) {
        lista.add(autobot);
    }

    public double calcularEnergonTotal() {
        double total = 0;
        for (int i = 0; i < lista.size(); i++) {
            total += lista.get(i).getEnergon();
        }
        return total;
    }

    public Autobot buscar(String nome) {
        for (Autobot a : lista) {
            if (a.getNomeAutobot().equals(nome)) {
                return a;
            }
        }
        return null;
    }

    public void reparar(Autobot autobot) {
        try {
            if (autobot.getEnergon() < 0) {
                throw new Exception("Energon negativo");
            }
            autobot.setEnergon(autobot.getEnergon() + ENERGON_ADICIONAL);
        } catch (Exception causa) {
            System.out.println("Nao foi possível reparar o autobot" + causa);

        }
    }

    public String classificar(Autobot autobot) {
        if (autobot.getEnergon() > LIMITE_ENERGON_ALTO) {
            return "ELITE";
        } else if (autobot.getEnergon() > LIMITE_ENERGON_MEDIA) {
            return "PADRAO";
        } else {
            return "RESERVA";
        }
    }
}
