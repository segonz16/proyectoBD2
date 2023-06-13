package co.com.poli.eventospoli.model;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
public class Ciudad {

    @NonNull
    private String nombre;
    @NonNull
    private String departamento;
    @NonNull
    private String pais;
}
