package org.olmedo.generics.modelo;

public class Lacteo extends Producto {
  private int cantidad;
  private int proteinas;


  public Lacteo(int cantidad, int proteinas, String nombre, Double precio){
    super(nombre, precio);
    this.cantidad = cantidad;
    this.proteinas = proteinas;
  }

  public int getCantidad(){
    return cantidad;
  }

  public int getProteinas(){
    return proteinas;
  }
}
