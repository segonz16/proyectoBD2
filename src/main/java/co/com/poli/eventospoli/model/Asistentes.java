package co.com.poli.eventospoli.model;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
public class Asistentes {

    @NonNull
    private String identificacion;
    @NonNull
    private String nombreUsuario;
    @NonNull
    private String nombreCompleto;
    @NonNull
    private String tipoRelacion;
    @NonNull
    private String email;
    @NonNull
    private Ciudad ciudad;
}
