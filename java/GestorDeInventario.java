import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestorDeInventario {
    private final List<Producto> productos;
    private final Map<String, Categoría> categorías;
    private final Map<String, Proveedor> proveedores;
    private final CalculadorDePrecio calculadorDePrecio;

    public GestorDeInventario(CalculadorDePrecio calculadorDePrecio) {
        this.productos = new ArrayList<>();
        this.categorías = new HashMap<>();
        this.proveedores = new HashMap<>();
        this.calculadorDePrecio = calculadorDePrecio;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        producto.getProveedor().agregarProducto(producto);
        Categoría categoría = categorías.get(producto.getNombre()); // O alguna lógica para determinar la categoría
        if (categoría != null) {
            categoría.agregarProducto(producto);
        }
    }

    public void agregarCategoría(Categoría categoría) {
        categorías.put(categoría.getNombre(), categoría);
    }

    public void agregarProveedor(Proveedor proveedor) {
        proveedores.put(proveedor.getNombre(), proveedor);
    }

    public double calcularPrecioTotal() {
        return calculadorDePrecio.calcularPrecioTotal(productos);
    }

    public double calcularPrecioTotalPorCategoría(String nombreCategoría) {
        Categoría categoría = categorías.get(nombreCategoría);
        if (categoría != null) {
            CalculadorDePrecioPorCategoría calculador = new CalculadorDePrecioPorCategoría(categoría);
            return calculador.calcularPrecioTotal(productos);
        }
        return 0;
    }
}
