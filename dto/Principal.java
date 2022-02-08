package com.example.dto;
import java.util.List;
public class Principal {
  public static void main(String[] args) {
    
    
    ServicioPersonas servicio= new ServicioPersonas();
    
    List<Persona> personas= servicio.buscarTodos();
    
    for (Persona persona: personas) {
      
      System.out.println(persona.getNombre());
    
    }
  }
}