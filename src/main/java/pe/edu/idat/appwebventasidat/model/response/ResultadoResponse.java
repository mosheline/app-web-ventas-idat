package pe.edu.idat.appwebventasidat.model.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder // Construye el objeto y setear los atributos del objeto a través de un método de manera directa
public class ResultadoResponse {
    private Boolean respuesta;
    private String mensaje;
}
