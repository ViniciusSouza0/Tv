package com.mycompany.televisao;

public class Tv {
    
 private boolean ligada;
    private int volume;
    private int canal;

    public Tv() {
        this.ligada = false;
        this.volume = 0;
        this.canal = 0;
    }

    public void ligar() {
        this.ligada = true;
        System.out.println("TV ligada.");
    }

    public void desligar() {
        this.ligada = false;
        System.out.println("TV desligada.");
    }

    public void aumentarVolume() {
        if (ligada && volume < 100) {
            volume++;
            System.out.println("Volume aumentado para " + volume);
        }
    }

    public void diminuirVolume() {
        if (ligada && volume > 0) {
            volume--;
            System.out.println("Volume diminuído para " + volume);
        }
    }

    public void trocarCanal(int novoCanal) {
        if (ligada) {
            canal = novoCanal;
            System.out.println("Canal alterado para " + canal);
        }
    }
}    
    
    
    

