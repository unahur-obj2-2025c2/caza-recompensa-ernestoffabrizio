package ar.edu.unahur.obj2.cazadores;

import ar.edu.unahur.obj2.profugo.Profugo;

public class Rural extends Cazador{

    public Rural(Integer experiencia) {
        super(experiencia);
    }
    @Override
    public Boolean condicionEspecifica(Profugo unProfugo){
        return unProfugo.getEsNervioso();
    }
    @Override
    public void intimidacionEspecifica(Profugo unProfugo){
        unProfugo.volverseNervioso();
    }
}
