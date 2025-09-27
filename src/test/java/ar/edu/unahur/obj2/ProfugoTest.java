package ar.edu.unahur.obj2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.profugo.Profugo;

public class ProfugoTest {
    @Test
    public void guardaYDevuelveAtributos(){
        Profugo profugo = new Profugo(50,60, true);
        assertEquals(Integer.valueOf(50), profugo.getInocencia());
        assertEquals(Integer.valueOf(60), profugo.getHabilidad());
        assertTrue(profugo.getEsNervioso());
    }
    @Test
    public void disminuirInocenciaNoBajaDeCero(){
        Profugo profugo = new Profugo(1,30, false);
        profugo.disminuirInocencia();
        profugo.disminuirInocencia();
        assertEquals(Integer.valueOf(0), profugo.getInocencia());
    }
    @Test
    public void disminuirHabilidadNoBajaDeCero(){
        Profugo profugo = new Profugo(1,5, false);
        profugo.reducirHabilidad();
        profugo.reducirHabilidad();
        assertEquals(Integer.valueOf(0), profugo.getHabilidad());
    }
}
