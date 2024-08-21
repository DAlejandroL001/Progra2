import java.util.List;

public class CalculadorDePrecioConDescuento extends CalculadorDePrecio {
    private final double descuento;

    public CalculadorDePrecioConDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double calcularPrecioTotal(List<Producto> productos) {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio() * producto.getCantidad();
        }
        return total * (1 - descuento);
    }
}

public class CalculadoraDePrecioSinDescuento extends CalculadorDePrecio {
    public double calcularPrecioTotal(List<Producto> productos) {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio() * producto.getCantidad();
        }
        return total;
    }
}

public class CalculadorDePrecioPorCategoría extends CalculadorDePrecio {
    private final Categoría categoría;

    public CalculadorDePrecioPorCategoría(Categoría categoría) {
        this.categoría = categoría;
    }

    public double calcularPrecioTotal(List<Producto> productos) {
        double total = 0;
        for (Producto producto : productos) {
            if (categoría.getProductos().contains(producto)) {
                total += producto.getPrecio() * producto.getCantidad();
            }
        }
        return total;
    }
}
