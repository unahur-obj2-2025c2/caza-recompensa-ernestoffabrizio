package ar.edu.unahur.obj2.cazadores;

import ar.edu.unahur.obj2.profugo.Profugo;

public class Sigiloso extends Cazador{
    public Sigiloso(Integer experiencia) {
        super(experiencia);
    }
    @Override
    public Boolean condicionEspecifica(Profugo unProfugo){
        return unProfugo.getHabilidad() < 50;
    }
    @Override
     public void intimidacionEspecifica(Profugo unProfugo){
        unProfugo.reducirHabilidad();
    }
}
