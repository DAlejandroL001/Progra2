import java.util.Objects;

public abstract class Producto {
    private String nombre;
    private double precio;
    private int cantidad;
    private Proveedor proveedor;

    public Producto(String nombre, double precio, int cantidad, Proveedor proveedor) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.proveedor = proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public abstract String getDetalles();

    @Override
    public String toString() {
        return nombre + " (" + precio + " x " + cantidad + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Double.compare(producto.precio, precio) == 0 &&
                cantidad == producto.cantidad &&
                nombre.equals(producto.nombre) &&
                proveedor.equals(producto.proveedor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio, cantidad, proveedor);
    }
}
