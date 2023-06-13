package co.com.poli.eventospoli.model;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Document(collection = "eventos")
public class Evento {

    @Id
    private String id;
    @NonNull
    private String titulo;
    @NonNull
    private String descripcion;
    @NonNull
    private String categoria;
    @NonNull
    private String fecha;
    @NonNull
    private LugarEvento lugarEvento;
    @NonNull
    private List<Asistentes> asistentes;
    @NonNull
    private List<Asistentes> conferencista;
    @NonNull
    private List<String> facultadOrganizadora;
    private String programaOrganizador;

    private Comentario comentario;

}

