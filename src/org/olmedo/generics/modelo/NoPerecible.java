package org.olmedo.generics.modelo;

public class NoPerecible extends Producto {
  private int contenido;
  private int calorias;


  public NoPerecible(int contenido, int calorias, String nombre, Double precio){
    super(nombre, precio);
    this.contenido = contenido;
    this.calorias = calorias;
  }

  public int getContenido(){
    return contenido;
  }

  public int getCalorias(){
    return calorias;
  }
}
