package ar.edu.unahur.obj2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.cazadores.Rural;
import ar.edu.unahur.obj2.cazadores.Sigiloso;
import ar.edu.unahur.obj2.cazadores.Urbano;
import ar.edu.unahur.obj2.profugo.Profugo;

public class IntimidacionTest {
    @Test
    public void urbanoIntimidaYDejaDeSerNerviosoYDisminuyeInocencia(){
        Urbano cazador = new Urbano(10);
        Profugo profugo = new Profugo(50, 40, true);
        cazador.intimidar(profugo);
        assertFalse(profugo.getEsNervioso());
        assertEquals(Integer.valueOf(48), profugo.getInocencia());
    }
    @Test
    public void ruralIntimidaYSeVuelveNerviosoYDisminuyeInocencia(){
        Rural cazador = new Rural(10);
        Profugo profugo = new Profugo(50, 40, false);
        cazador.intimidar(profugo);
        assertTrue(profugo.getEsNervioso());
        assertEquals(Integer.valueOf(48), profugo.getInocencia());
    }
    @Test
    public void sigilosoIntimidaYReduceHabilidadYDisminuyeInocencia(){
        Sigiloso cazador = new Sigiloso(10);
        Profugo profugo = new Profugo(50, 40, false);
        cazador.intimidar(profugo);
        assertEquals(Integer.valueOf(35), profugo.getHabilidad());
        assertEquals(Integer.valueOf(48), profugo.getInocencia());
    }
}
