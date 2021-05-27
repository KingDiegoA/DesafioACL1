package desafioacl.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@JsonPropertyOrder({ "id", "fechaCreacion", "fechaFin" ,"fechas","fechasFaltantes"})

public class ChallengeAclModelResponse {

    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("fechaCreacion")
    private LocalDate fechaCreacion = null;

    @JsonProperty("fechaFin")
    private LocalDate fechaFin = null;

    @JsonProperty("fechas")
    private List<LocalDate> fechas = null;

    @JsonProperty("fechasFaltantes")
    private List<LocalDate> fechasFaltantes = null;

    public ChallengeAclModelResponse() {
        this.fechaCreacion =null;
        this.fechaFin=null;
        this.fechas=new ArrayList<LocalDate>();
        this.fechasFaltantes=new ArrayList<LocalDate>();
    }
     public Long id() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<LocalDate> getFechas() {
        return fechas;
    }

    public void setFechas(List<LocalDate> fechas) {
        this.fechas = fechas;
    }

    public List<LocalDate> getFechasFaltantes() {
        return fechasFaltantes;
    }

    public void getFechasFaltantes(List<LocalDate> fechasFaltantes) {
        this.fechasFaltantes = fechasFaltantes;
    }
}




