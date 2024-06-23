package com.soccer;


import java.util.Hashtable;

import com.soccer.model.entity.Coach;
import com.soccer.model.entity.Doctor;
import com.soccer.model.entity.Player;
import com.soccer.model.entity.Team;

public class Controller {
    public Hashtable <String,Team> equipos = new Hashtable<>();
    public Hashtable <Integer, Player> jugadores = new Hashtable<>();
    public Hashtable <Integer, Coach> entrenadores = new Hashtable<>();
    public Hashtable <Integer, Doctor> doctores = new Hashtable<>();
}
