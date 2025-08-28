public class Cliente {
    private int ID_cliente;
    private String nombre;
    private String telefono;
    private String direccion;
    private String correo;

    public Cliente(int ID_cliente, String nombre, String telefono, String direccion, String correo) {
        this.ID_cliente = ID_cliente;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
    }

    public void registrarCliente() {
        System.out.println("Cliente " + nombre + " registrado con ID " + ID_cliente);
    }

    public void actualizarCliente() {
        System.out.println("Cliente " + nombre + " actualizado");
    }

    public void realizarPedido(String pedido) {
        System.out.println("Cliente " + nombre + " realizó el pedido: " + pedido);
    }
}
java
Copiar código
// Clase Trabajador
public class Trabajador {
    private int ID_trabajador;
    private String nombre;
    private String cargo;
    private double salario;
    private String horario;

    public Trabajador(int ID_trabajador, String nombre, String cargo, double salario, String horario) {
        this.ID_trabajador = ID_trabajador;
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.horario = horario;
    }

    public void registrarVentas() {
        System.out.println("Trabajador " + nombre + " registró una venta");
    }

    public void prepararPan(String tipoPan) {
        System.out.println("Trabajador " + nombre + " está preparando " + tipoPan);
    }

    public void atenderCliente(Cliente cliente) {
        System.out.println("Trabajador " + nombre + " está atendiendo al cliente " + cliente.getNombre());
    }

    public void calcularSalario() {
        System.out.println("El salario de " + nombre + " es " + salario);
    }

    // Getter para que Factura pueda mostrar nombre del trabajador
    public String getNombre() {
        return nombre;
    }
}
java
Copiar código
// Clase Pan
public class Pan {
    private int ID_pan;
    private String nombre;
    private String fecha;
    private double precio;
    private int cantidad;

    public Pan(int ID_pan, String nombre, String fecha, double precio, int cantidad) {
        this.ID_pan = ID_pan;
        this.nombre = nombre;
        this.fecha = fecha;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public void actualizacion() {
        System.out.println("Pan " + nombre + " actualizado");
    }

    public void mostrarInformacion() {
        System.out.println("Pan: " + nombre + ", Precio: " + precio + ", Cantidad: " + cantidad);
    }

    public double precioTotal() {
        double total = precio * cantidad;
        System.out.println("El precio total de " + cantidad + " unidades de " + nombre + " es " + total);
        return total;
    }

    public void verificarFrescura() {
        System.out.println("Verificando frescura del pan " + nombre + " con fecha " + fecha);
    }
}
java
Copiar código
// Clase Factura
import java.util.List;

public class Factura {
    private int ID_factura;
    private String fecha;
    private Cliente cliente;
    private Trabajador trabajador;
    private List<Pan> listProductos;
    private double total;

    public Factura(int ID_factura, String fecha, Cliente cliente, Trabajador trabajador, List<Pan> listProductos) {
        this.ID_factura = ID_factura;
        this.fecha = fecha;
        this.cliente = cliente;
        this.trabajador = trabajador;
        this.listProductos = listProductos;
        this.total = 0;
    }

    public void generarFactura() {
        System.out.println("Generando factura " + ID_factura + " para el cliente " + cliente.getNombre());
    }

    public double calcularTotal() {
        double suma = 0;
        for (Pan producto : listProductos) {
            suma += producto.precioTotal();
        }
        this.total = suma;
        System.out.println("El total de la factura " + ID_factura + " es " + total);
        return total;
    }

    public void mostrarFactura() {
        System.out.println("Factura ID: " + ID_factura + 
                           ", Fecha: " + fecha + 
                           ", Cliente: " + cliente.getNombre() + 
                           ", Trabajador: " + trabajador.getNombre() + 
                           ", Total: " + total);
        for (Pan producto : listProductos) {
            producto.mostrarInformacion();
        }
    }

    public void registrarPago(String metodoPago) {
        System.out.println("Pago registrado para la factura " + ID_factura + " con método " + metodoPago);
    }
}
java
Copiar código
// Modificaciones pequeñas necesarias en Cliente para acceder al nombre
public String getNombre() {
    return nombre;
}