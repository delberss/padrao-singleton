package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConfiguracaoPartidaDeFutebolTest {
    @Test
    public void deveRetornarDuracaoPorTempo() {
        ConfiguracaoPartidaDeFutebol.getInstance().setDuracaoPorTempo(45);
        assertEquals(45, ConfiguracaoPartidaDeFutebol.getInstance().getDuracaoPorTempo());
    }

    @Test
    public void deveRetornarNumeroDeJogadores() {
        ConfiguracaoPartidaDeFutebol.getInstance().setNumeroJogadores(22);
        assertEquals(22, ConfiguracaoPartidaDeFutebol.getInstance().getNumeroJogadores());
    }

    @Test
    public void deveRetornarTempoDePausaEntreTempos() {
        ConfiguracaoPartidaDeFutebol.getInstance().setTempoPausaEntreTempos(15);
        assertEquals(15, ConfiguracaoPartidaDeFutebol.getInstance().getTempoPausaEntreTempos());
    }
}