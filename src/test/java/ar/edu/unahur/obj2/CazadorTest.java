package ar.edu.unahur.obj2;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.cazadores.Rural;
import ar.edu.unahur.obj2.cazadores.Sigiloso;
import ar.edu.unahur.obj2.cazadores.Urbano;
import ar.edu.unahur.obj2.profugo.Profugo;

public class CazadorTest {
    @Test
    void urbanoCapturaSiLaExperienciaEsMayorYNoNervioso(){
        Urbano cazador = new Urbano(60);
        Profugo profugo = new Profugo(40, 70, false);
        assertTrue(cazador.puedeCapturar(profugo));
    }
    @Test
    void ruralNoCapturaSiNoEsNervioso(){
        Rural cazador = new Rural(70);
        Profugo profugo = new Profugo(30, 60, false);
        assertFalse(cazador.puedeCapturar(profugo));
    }
    @Test
    void sigilosoNoCapturaSiHabilidadAlta(){
        Sigiloso cazador = new Sigiloso(80);
        Profugo profugo = new Profugo(20, 90, true);
        assertFalse(cazador.puedeCapturar(profugo));
    }
}
