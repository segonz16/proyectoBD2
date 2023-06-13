package co.com.poli.eventospoli.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "empleados")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Empleado {


    @Column(name="identificacion")
    @Id
    private String identificacion;
    @Column(name="nombres")
    private String nombre;
    @Column(name="apellidos")
    private String apellidos;
    @Column(name="email")
    private String email;
    @Column(name="tipo_contratacion")
    private String tipoContratacion;
    @Column(name="tipo_empleado")
    private String tipoEmpleado;
    @Column(name="cod_facultad")
    private int codigoFacultad;
    @Column(name="cod_sede")
    private int codigoSede;
    @Column(name="lugar_nacimiento")
    private int lugarNacimiento;
}
