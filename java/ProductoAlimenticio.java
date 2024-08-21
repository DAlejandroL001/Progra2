import java.time.LocalDate;

public class ProductoElectrónico extends Producto {
    private final String garantia;

    public ProductoElectrónico(String nombre, double precio, int cantidad, Proveedor proveedor, String garantia) {
        super(nombre, precio, cantidad, proveedor);
        this.garantia = garantia;
    }

    public String getGarantia() {
        return garantia;
    }

    @Override
    public String getDetalles() {
        return "Electrónico: " + getNombre() + ", Precio: " + getPrecio() + ", Cantidad: " + getCantidad() + ", Garantía: " + garantia;
    }
}

public class ProductoAlimenticio extends Producto {
    private final LocalDate fechaDeCaducidad;

    public ProductoAlimenticio(String nombre, double precio, int cantidad, Proveedor proveedor, LocalDate fechaDeCaducidad) {
        super(nombre, precio, cantidad, proveedor);
        this.fechaDeCaducidad = fechaDeCaducidad;
    }

    public LocalDate getFechaDeCaducidad() {
        return fechaDeCaducidad;
    }

    @Override
    public String getDetalles() {
        return "Alimenticio: " + getNombre() + ", Precio: " + getPrecio() + ", Cantidad: " + getCantidad() + ", Fecha de caducidad: " + fechaDeCaducidad;
    }
}
