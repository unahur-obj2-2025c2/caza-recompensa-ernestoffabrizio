package ar.edu.unahur.obj2.cazadores;

import ar.edu.unahur.obj2.profugo.Profugo;


public class Urbano extends Cazador{
    public Urbano(Integer experiencia) {
        super(experiencia);
    }
    @Override
    public Boolean condicionEspecifica(Profugo unProfugo){
        return !unProfugo.getEsNervioso();
    }
    @Override
    public void intimidacionEspecifica(Profugo unProfugo){
        unProfugo.dejarDeSerNervioso();
    }
    }

