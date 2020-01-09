/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 * @versión 1.0
 *
 */

public final class tiempo {

    int hora;
    int minuto;
    int segundo;

    public tiempo() {
        this.cambiarHora(0, 0, 0);
    }

    public void cambiarHora(int valorHora, int valorMinuto, int valorSegundo) {
        hora = ((valorHora >= 0) && (valorHora < 24)) ? valorHora : 0;
        minuto = ((valorMinuto >= 0) && (valorMinuto < 60)) ? valorMinuto : 0;
        segundo = ((valorSegundo >= 0) && (valorSegundo < 60)) ? valorSegundo : 0;
    }

    public String horaUniversal() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public String horaEstandar() {
        return String.format("%02d:%02d:%02d", ((hora == 12 || hora == 0) ? 12 : hora % 12), minuto, segundo, (hora < 12 ? "AM" : "PM"));
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

}
