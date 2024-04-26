package com.mycompany.televisao;

public class ControleRemoto {
    
  private Tv tv;

    public ControleRemoto(Tv tv) {
        this.tv = tv;
    }

    public void ligarTV() {
        tv.ligar();
    }

    public void desligarTV() {
        tv.desligar();
    }

    public void aumentarVolume() {
        tv.aumentarVolume();
    }

    public void diminuirVolume() {
        tv.diminuirVolume();
    }

    public void trocarCanal(int novoCanal) {
        tv.trocarCanal(novoCanal);
    }
}
   

