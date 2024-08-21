import java.util.ArrayList;
import java.util.List;

public class Categoría {
    private final String nombre;
    private final List<Producto> productos;

    public Categoría(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
