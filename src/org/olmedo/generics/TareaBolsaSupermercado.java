package org.olmedo.generics;

import org.olmedo.generics.modelo.*;


public class TareaBolsaSupermercado {
  public static void main(String[] args){


    BolsaSupermercado<Fruta> bolsaFrutas = new BolsaSupermercado<>();
    BolsaSupermercado<Limpieza> bolsaLimpieza = new BolsaSupermercado<>();
    BolsaSupermercado<Lacteo> bolsaLacteo = new BolsaSupermercado<>();
    BolsaSupermercado<NoPerecible> bolsaNoPerecible = new BolsaSupermercado<>();

    bolsaFrutas.addProducto(new Fruta(300, "Roja", "Manzana", 200d));
    bolsaFrutas.addProducto(new Fruta(233, "Arrillo", "Banana", 155d));
    bolsaFrutas.addProducto(new Fruta(455, "Verde", "Kiwi", 339d));
    bolsaFrutas.addProducto(new Fruta(500, "Naranja", "Mandarina", 554d));
    bolsaFrutas.addProducto(new Fruta(323, "Rosa", "Pomelo", 666d));

    bolsaLimpieza.addProducto(new Limpieza("Desodorante piso", 2, "Querubin", 200d));
    bolsaLimpieza.addProducto(new Limpieza("Destergente", 1, "Musculito", 100d));
    bolsaLimpieza.addProducto(new Limpieza("Limpia muebles", 0.2, "cif", 888d));
    bolsaLimpieza.addProducto(new Limpieza("Lavandina", 0.67, "Querubin", 700d));
    bolsaLimpieza.addProducto(new Limpieza("Perfume de hambiente", 2.0, "Querubin", 600d));

    bolsaLacteo.addProducto(new Lacteo(2, 34, "yogur", 500d));
    bolsaLacteo.addProducto(new Lacteo(1, 55, "leche entera", 600d));
    bolsaLacteo.addProducto(new Lacteo(3, 66, "queso crema", 812d));
    bolsaLacteo.addProducto(new Lacteo(5, 23, "yogur con cereales", 566d));
    bolsaLacteo.addProducto(new Lacteo(8, 45, "leche", 444d));

    bolsaNoPerecible.addProducto(new NoPerecible(187, 87, "Atun", 898d));
    bolsaNoPerecible.addProducto(new NoPerecible(333, 55, "Porotos", 767d));
    bolsaNoPerecible.addProducto(new NoPerecible(553, 43, "Arroz", 333d));
    bolsaNoPerecible.addProducto(new NoPerecible(444, 54, "Lentejas", 554d));
    bolsaNoPerecible.addProducto(new NoPerecible(343, 41, "Arverjas", 665d));

    System.out.println("=================================== Frutas ==============================");

    for(Fruta f: bolsaFrutas.getProductos()){
      System.out.println("------------------" + f.getNombre());
      System.out.println("Precio: " + f.getPrecio());
      System.out.println("Peso: " + f.getPrecio());
      System.out.println("Color: " + f.getColor());
    }

   
    System.out.println("=================================== Producto de Limpieza ==============================");

    for(Limpieza l: bolsaLimpieza.getProductos()){
     System.out.println("--------------- " + l.getNombre());
     System.out.println("Precio: " + l.getPrecio());
     System.out.println("Componentes: " + l.getComponentes());
     System.out.println("Litros: " + l.getLitros());

    }


     System.out.println("================================ Lacteos ======================================");

     for(Lacteo l: bolsaLacteo.getProductos()){

     System.out.println("---------------------- " + l.getNombre());
     System.out.println("Precio: " + l.getPrecio());
     System.out.println("Cantidad: " + l.getCantidad());
     System.out.println("Proteinas: " + l.getProteinas());
     }


     System.out.println("============================== NoPerecible =====================================");
     for(NoPerecible p: bolsaNoPerecible.getProductos()){

     System.out.println("---------------------- " + p.getNombre());
     System.out.println("Precio: " + p.getPrecio());
     System.out.println("Contenido: " + p.getContenido());
     System.out.println("Calorias: " + p.getCalorias());
     }
  }
}
