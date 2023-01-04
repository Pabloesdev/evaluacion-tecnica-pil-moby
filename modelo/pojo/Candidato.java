package main.java.com.pil.moby.evaluacion_tecnica.modelo.pojo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Candidato implements Comparable<Candidato> {

    private Long id;
    private String nombre;
    private String apellido;
    private Integer aniosExperiencia;
    private Double pretensionSalarial;

    private List<Tecnologia> tecnologias;

    public Candidato() {
    }

    public Candidato(Long id, String nombre, String apellido, Double pretensionSalarial, Integer aniosExperiencia) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.aniosExperiencia = aniosExperiencia;
        this.pretensionSalarial = pretensionSalarial;
        tecnologias = new ArrayList<>();
    }

    public List<Tecnologia> getTecnologias() {

        return tecnologias;
    }

    public void setTecnologias(List<Tecnologia> tecnologias) {
        this.tecnologias = tecnologias;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getApellido() {

        return apellido;
    }

    public void setApellido(String apellido) {

        this.apellido = apellido;
    }

    public Integer getAniosExperiencia()
    {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(Integer aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public Double getPretensionSalarial() {

        return pretensionSalarial;
    }

    public void setPretensionSalarial(Double pretensionSalarial) {
        this.pretensionSalarial = pretensionSalarial;
    }


    public void addTecnologias (Tecnologia tecno){

        tecnologias.add(tecno);
    }


    public List<Tecnologia> ordenarTecnologias(){

        tecnologias.sort(Comparator.comparing(Tecnologia::getNombre));
        tecnologias.stream().map(Tecnologia::getNombre)
                .forEach(System.out::println);

        return tecnologias;


    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Candidato candidato)) return false;
        return getId().equals(candidato.getId()) && getNombre().equals(candidato.getNombre())
                && getApellido().equals(candidato.getApellido())
                && getAniosExperiencia().equals(candidato.getAniosExperiencia())
                && getPretensionSalarial().equals(candidato.getPretensionSalarial())
                && getTecnologias().equals(candidato.getTecnologias());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNombre(), getApellido(),
                getAniosExperiencia(), getPretensionSalarial(), getTecnologias());
    }

    @Override
    public String toString() {
        return "\n  ==========  CANDIDATO " + id + "  ==========  \n" +
                "\nId: " + id +
                "\nNombre: " + nombre +
                "\nApellido: " + apellido +
                "\nAños de Experiencia: " + aniosExperiencia + " años" +
                "\nPretensión Salarial: " + "USD " + pretensionSalarial +
                "\nTecnologías: " + tecnologias
                + "\n";
    }

    @Override
    public int compareTo(Candidato otroCandidato) {
        if(this.id == null){
            return 0;
        }
        return this.id.compareTo(otroCandidato.id);

         }




}
