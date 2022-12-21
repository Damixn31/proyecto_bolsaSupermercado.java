package org.olmedo.generics.modelo;

import java.util.List;
import java.util.ArrayList;

public class BolsaSupermercado<T> {
  private List<T> productos;
  private int indiceProductos;
  private int max = 5;

  public BolsaSupermercado() {
    this.productos = new ArrayList();
  }

  public List<T> getProductos(){
    return productos;
  }
  public void addProducto(T p){
    if(this.productos.size() <= max) {
      this.productos.add(p);
    } else {
      throw new RuntimeException("No hay mas espacio.");
    }
  }
}
