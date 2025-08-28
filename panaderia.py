print("PANADERIA")

class Cliente:
    def __init__(self, ID_cliente, nombre, telefono, direccion, correo):
        self.ID_cliente = ID_cliente
        self.nombre = nombre
        self.telefono = telefono
        self.direccion = direccion
        self.correo = correo

    def registrar_cliente(self):
        print(f"Cliente {self.nombre} registrado con ID {self.ID_cliente}")

    def actualizar_cliente(self):
        print(f"Cliente {self.nombre} actualizado")

    def realizar_pedido(self, pedido):
        print(f"Cliente {self.nombre} realizó el pedido: {pedido}")
    
class trabajadores:
    def __init__(self, ID_trabajador, nombre, cargo, salario, horario):
        self.ID_trabajador = ID_trabajador
        self.nombre = nombre
        self.cargo = cargo
        self.salario = salario
        self.horario = horario

    def registrar_ventas(self):
        print(f"Trabajador {self.nombre} registró una venta")

    def preparar_pan(self, tipo_pan):
        print(f"Trabajador {self.nombre} está preparando")

    def atendrer_cliente(self, cliente):
        print(f"Trabajador {self.nombre} está atendiendo al cliente {cliente.nombre}")

    def calcular_salario(self):
        print(f"El salario de {self.nombre} es {self.salario}")
    
class pan:
    def __init__(self, ID_pan, nombre, fecha, precio, cantidad):
        self.ID_pan = ID_pan
        self.nombre = nombre
        self.fecha = fecha
        self.precio = precio
        self.cantidad = cantidad

    def actualizacion(self):
        print(f"Pan {self.nombre} actualizado")

    def mostrar_informacion(self):
        print(f"Pan: {self.nombre}, Precio: {self.precio}, Cantidad: {self.cantidad}")

    def precio_total(self):
        total = self.precio * self.cantidad
        print(f"El precio total de {self.cantidad} unidades de {self.nombre} es {total}")
        return total

    def verificar_frescura(self):
        print(f"Verificando frescura del pan {self.nombre} con fecha {self.fecha}")

class factura:
    def __init__(self, ID_factura,fecha,cliente,trabajador , list_productos, total):
        self.ID_factura = ID_factura
        self.fecha = fecha
        self.cliente = cliente
        self.trabajador = trabajador
        self.list_productos = list_productos
        self.total = total

    def generar_factura(self):
        print(f"Generando factura {self.ID_factura} para el cliente {self.cliente.nombre}")

    def calcular_total(self):
        total = sum(producto.precio_total() for producto in self.list_productos)
        self.total = total
        print(f"El total de la factura {self.ID_factura} es {self.total}")
        return total

    def mostrar_factura(self):
        print(f"Factura ID: {self.ID_factura}, Fecha: {self.fecha}, Cliente: {self.cliente.nombre}, Trabajador: {self.trabajador.nombre}, Total: {self.total}")
        for producto in self.list_productos:
            producto.mostrar_informacion()

    def registrar_pago(self, metodo_pago):
        print(f"Pago registrado para la factura {self.ID_factura} con método {metodo_pago}")

