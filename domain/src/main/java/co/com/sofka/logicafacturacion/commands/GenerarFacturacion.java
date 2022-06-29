package co.com.sofka.logicafacturacion.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.logicafacturacion.Empleado;
import co.com.sofka.logicafacturacion.Factura;
import co.com.sofka.logicafacturacion.Registro;
import co.com.sofka.logicafacturacion.values.ParqueaderoId;

public class GenerarFacturacion implements Command {
    private final ParqueaderoId parqueaderoId;
    private final Registro registro;
    private final Empleado empleado;
    private final Factura factura;

    public GenerarFacturacion(ParqueaderoId parqueaderoId, Registro registro, Empleado empleado, Factura factura) {
        this.parqueaderoId = parqueaderoId;
        this.registro = registro;
        this.empleado = empleado;
        this.factura = factura;
    }

    public ParqueaderoId ObtenerParqueaderoId() {
        return parqueaderoId;
    }

    public Registro ObtenerRegistro() {
        return registro;
    }

    public Empleado ObtenerEmpleado() {
        return empleado;
    }

    public Factura ObtenerFactura() {
        return factura;
    }
}
