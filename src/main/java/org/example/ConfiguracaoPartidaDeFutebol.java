package org.example;

public class ConfiguracaoPartidaDeFutebol {

    private ConfiguracaoPartidaDeFutebol() {};
    private static ConfiguracaoPartidaDeFutebol instance = new ConfiguracaoPartidaDeFutebol();

    public static ConfiguracaoPartidaDeFutebol getInstance() {
        return instance;
    }

    private int numeroJogadores;
    private int duracaoPorTempo;
    private int tempoPausaEntreTempos;

    public int getNumeroJogadores() {
        return numeroJogadores;
    }

    public void setNumeroJogadores(int numeroJogadores) {
        this.numeroJogadores = numeroJogadores;
    }

    public int getDuracaoPorTempo() {
        return duracaoPorTempo;
    }

    public void setDuracaoPorTempo(int duracaoPorTempo) {
        this.duracaoPorTempo = duracaoPorTempo;
    }

    public int getTempoPausaEntreTempos() {
        return tempoPausaEntreTempos;
    }

    public void setTempoPausaEntreTempos(int tempoPausaEntreTempos) {
        this.tempoPausaEntreTempos = tempoPausaEntreTempos;
    }
}
