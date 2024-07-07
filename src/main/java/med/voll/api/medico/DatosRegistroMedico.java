package med.voll.api,medico;

public record DatosRegistroMedico(
        String nombre,
        String email,
        String telefono,
        String documentoIdentidad,
        DatosDireccion direccion
) {
}
