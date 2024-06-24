package com.soccer;


import java.util.Hashtable;

import com.soccer.model.entity.Coach;
import com.soccer.model.entity.Doctor;
import com.soccer.model.entity.Player;
import com.soccer.model.entity.Team;

public class Controller {
    public static Hashtable <String,Team> equipos = new Hashtable<>();
    public static Hashtable <Integer, Player> jugadores = new Hashtable<>();
    public static Hashtable <Integer, Coach> entrenadores = new Hashtable<>();
    public static Hashtable <Integer, Doctor> doctores = new Hashtable<>();
}
