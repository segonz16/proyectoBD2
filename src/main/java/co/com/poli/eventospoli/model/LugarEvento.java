package co.com.poli.eventospoli.model;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
public class LugarEvento {

    private String nombre;
    private String direccion;
    private Ciudad ciudad;
}
