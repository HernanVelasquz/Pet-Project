package co.com.sofka.logicaempleado.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.logicaempleado.values.Correo;
import co.com.sofka.logicaempleado.values.NombresCompletos;
import co.com.sofka.logicaempleado.values.ResponsableId;
import co.com.sofka.logicaempleado.values.Telefono;

public class AgregarResponsable extends Command {

    private final ResponsableId responsableId;

    private final NombresCompletos nombresCompletos;
    private final Telefono telefono;
    private final Correo correo;


    public AgregarResponsable(ResponsableId responsableId, NombresCompletos nombresCompletos, Telefono telefono, Correo correo) {
        this.responsableId = responsableId;
        this.nombresCompletos = nombresCompletos;
        this.telefono = telefono;
        this.correo = correo;
    }

    public ResponsableId getResponsableId(){return responsableId;}
    public NombresCompletos getNombresCompletos(){return nombresCompletos;}
    public Telefono getTelefono(){return telefono;}
    public Correo getCorreo(){return correo;}
}
