package ar.edu.unahur.obj2.cazadores;

import ar.edu.unahur.obj2.profugo.Profugo;


public class Urbano extends Cazador{
    public Urbano(Integer experiencia) {
        super(experiencia);
    }
    public Boolean condicionEspecifica(Profugo unProfugo){
        return !unProfugo.getEsNervioso();
    }
    public void intimidar(Profugo profugo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'intimidar'");
    }
    }

