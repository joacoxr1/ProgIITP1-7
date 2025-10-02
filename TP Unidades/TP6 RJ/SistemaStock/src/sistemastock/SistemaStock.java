package sistemastock;

public class SistemaStock {
    public static void main(String[] args) {
        Inventario inv = new Inventario();
        Producto p1 = new Producto("P001", "Arroz 1kg", 1200.0, 30, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Iphone 12", 450000.0, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Remera Algodon", 32000.0, 50, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Aspiradora 1200W", 120000.0, 5, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Fideos 500g", 800.0, 100, CategoriaProducto.ALIMENTOS);

        inv.agregarProducto(p1);
        inv.agregarProducto(p2);
        inv.agregarProducto(p3);
        inv.agregarProducto(p4);
        inv.agregarProducto(p5);

        System.out.println("\n Listado completo de productos ");
        inv.listarProductos();

        
        
        System.out.println("\n Buscar producto con ID 'P003' ");
        Producto busc = inv.buscarProductoPorId("P003");
        if (busc != null) busc.mostrarInfo(); else System.out.println("Producto no encontrado.");
        
        

        System.out.println("\n Filtrar por categoria ROPA ");
        for (Producto p : inv.filtrarPorCategoria(CategoriaProducto.ROPA)) p.mostrarInfo();

        
        
        System.out.println("\n Eliminar producto P002...");
        boolean eliminado = inv.eliminarProducto("P002");
        System.out.println("Eliminado: " + eliminado);
        System.out.println("Listado tras eliminacion:");
        inv.listarProductos();

 
        
        
        System.out.println("\n  Actualizar stock de P001 a 25 ");
        boolean actualizado = inv.actualizarStock("P001", 25);
        System.out.println("Actualizado: " + actualizado);
        Producto prodP001 = inv.buscarProductoPorId("P001");
        if (prodP001 != null) prodP001.mostrarInfo();


        System.out.println("\n Total de stock disponible");
        System.out.println(inv.obtenerTotalStock());

        
        System.out.println("\n Producto con mayor stock ");
        Producto mayor = inv.obtenerProductoConMayorStock();
        if (mayor != null) mayor.mostrarInfo();
 
        
        System.out.println("\n Productos con precio entre $1000 y $3000 ");
        for (Producto p : inv.filtrarProductosPorPrecio(1000.0, 3000.0)) p.mostrarInfo();


        System.out.println("\n Categorias disponibles ");
        inv.mostrarCategoriasDisponibles();

        System.out.println("\n Proceso Finalizado ");
    }
}
