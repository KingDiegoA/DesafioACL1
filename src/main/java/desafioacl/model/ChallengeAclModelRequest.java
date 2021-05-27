package desafioacl.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@JsonPropertyOrder({ "id", "fechaCreacion", "fechaFin" ,"fechas"})

//por el momento estan como String - LocalDate
public class ChallengeAclModelRequest {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("fechaCreacion")
    private String fechaCreacion = "1969-03-01";

    @JsonProperty("fechaFin")
    private String fechaFin = "1970-01-01";

    @JsonProperty("fechas")
    private List<String> fechas = null;

    public ChallengeAclModelRequest() {
        this.fechaCreacion ="1969-03-01";
        this.fechaFin="1970-01-01";
        this.fechas=new ArrayList<String>();
    }

    public Long id() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<String> getFechas() {
        return fechas;
    }

    public void setFechas(List<String> fechas) {
        this.fechas = fechas;
    }


}