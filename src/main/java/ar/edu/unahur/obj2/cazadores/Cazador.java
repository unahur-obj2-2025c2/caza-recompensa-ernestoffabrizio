package ar.edu.unahur.obj2.cazadores;

import ar.edu.unahur.obj2.profugo.Profugo;

public abstract class Cazador {
    protected Integer experiencia;
    
    public Cazador(Integer experiencia) {
        this.experiencia = experiencia;
    }
    //condición general
    public Boolean puedeCapturar(Profugo unProfugo){
        return this.experiencia > unProfugo.getInocencia() && condicionEspecifica(unProfugo);
    }
    //condicion especifica
    protected abstract Boolean condicionEspecifica(Profugo unProfugo);
    
}