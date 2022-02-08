package com.example.dto;
import java.util.ArrayList;
import java.util.List;

public class ServicioPersonas {
  
  public List<Persona> buscarTodos() {
    
    Persona p1= new Persona("pedro","gomez",20);
    Persona p2= new Persona("angel","sanchez",20);
    Persona p3= new Persona("ana","perez",30);
    
    List<Persona> lista= new ArrayList<Persona>();
    lista.add(p1);
    lista.add(p2);
    lista.add(p3);
    
    return lista;
    
    
    
  }
}


