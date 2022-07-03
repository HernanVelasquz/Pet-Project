package co.com.sofka.logicaempleado.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.logicaempleado.values.*;

public class AgregarEmpleado extends Command {

    private final ResponsableId responsableId;

    private final EmpleadoId empleadoId;

    private final NombresCompletos nombresCompletos;

    private final Correo correo;

    private final Telefono telefono;

    private final DocumentoId documentoId;


    public AgregarEmpleado(ResponsableId responsableId, EmpleadoId empleadoId, NombresCompletos nombresCompletos, Correo correo, Telefono telefono, DocumentoId documentoId) {
        this.responsableId = responsableId;
        this.empleadoId = empleadoId;
        this.nombresCompletos = nombresCompletos;
        this.correo = correo;
        this.telefono = telefono;
        this.documentoId = documentoId;
    }

    public ResponsableId getResponsableId(){return responsableId;}
    public EmpleadoId getEmpleadoId(){return empleadoId;}
    public NombresCompletos getNombresCompletos(){return nombresCompletos;}
    public Correo getCorreo(){return correo;}
    public Telefono getTelefono(){return telefono;}
    public DocumentoId getDocumentoId(){return documentoId;}

}
