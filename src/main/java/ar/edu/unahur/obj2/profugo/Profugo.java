package ar.edu.unahur.obj2.profugo;

public class Profugo {
    protected Integer inocencia;
    protected Integer habilidad;
    protected Boolean esNervioso;

    public Profugo(Integer inocencia, Integer habilidad, Boolean esNervioso) {
        this.inocencia = inocencia;
        this.habilidad = Math.min(habilidad, 100);
        this.esNervioso = esNervioso;
    }

    public Integer getInocencia() {
        return inocencia;
    }
    public Integer getHabilidad() {
        return habilidad;
    }
    public Boolean getEsNervioso() {
        return esNervioso;
    }

    public void disminuirInocencia() {
        this.inocencia = Math.max(this.inocencia - 2, 0);
    }

    public void reducirHabilidad() {
    this.habilidad = Math.max(this.habilidad - 5, 0);
    }

}
