package com.soccer.model.entity;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String nombre;
    private String ciudad;
    private List<Player> lstJugadores;
    private List<Coach> lstEntrenadores;
    private List<Doctor> lstMasajistas;
    public Team() {
        lstEntrenadores = new ArrayList<Coach>();
        lstJugadores = new ArrayList<Player>();
        lstMasajistas = new ArrayList<Doctor>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public List<Player> getLstJugadores() {
        return lstJugadores;
    }
    public void setLstJugadores(List<Player> jugadores) {
        this.lstJugadores.addAll(jugadores);
    }    
    public List<Coach> getLstEntrenadores() {
        return lstEntrenadores;
    }
    public void setLstEntrenadores(List<Coach> coachs) {
        this.lstEntrenadores.addAll(coachs);
    }
    public List<Doctor> getLstMasajistas() {
        return lstMasajistas;
    }
    public void setLstMasajistas(List<Doctor> doctores) {
        this.lstMasajistas.addAll(doctores);
    }

    

    
}
