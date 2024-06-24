package com.soccer.view;

import java.util.Scanner;

import com.soccer.Controller;
import com.soccer.model.entity.Doctor;

public class viewDoctor {
    public static Controller controlador;
       public void start() {
       Scanner sc = new Scanner(System.in);
       while(true){
              System.out.println("1. Crear medico");
              System.out.println("2. Actualizar medico");
              System.out.println("3. Buscar medico");
              System.out.println("4. Eliminar medico");
              System.out.println("5. Listar todos medico");
              System.out.println("6. Salir");
              int choice = sc.nextInt();
              sc.nextLine();
              Doctor doctor = new Doctor();
              switch (choice) {
                     case 1:
                            System.out.println("Ingrese el id del medico:");
                            int idmedico = sc.nextInt();
                            sc.nextLine();

                            System.out.println("Ingrese el nombre del medico:");
                            String nombremedico = sc.nextLine();

                            System.out.println("Ingrese el apellido del medico:");
                            String apellidomedico = sc.nextLine();

                            System.out.println("Ingrese la edad del medico:");
                            int edadmedico= sc.nextInt();
                            sc.nextLine();
                            
                            System.out.println("Ingrese el titulo del medico: ");
                            String titulomedico = sc.nextLine();

                            System.out.println("Ingrese los años de experiencia");
                            int expyear = sc.nextInt();
                            sc.nextLine();

                            Doctor nuevodoctor = new Doctor(idmedico, nombremedico, apellidomedico, edadmedico, titulomedico, expyear);
                            controlador.doctores.put(idmedico, nuevodoctor);
                     break;

                     case 2:
                            System.out.println("Ingrese el id del medico a actualizar: ");
                            int codigomedico = sc.nextInt();
                            sc.nextLine();

                            if(controlador.doctores.containsKey(codigomedico)){
                                   Doctor doctoract = controlador.doctores.get(codigomedico);

                                   System.out.println("Ingrese el nombre del medico: ");
                                   String nuevonombre = sc.nextLine();
                                   doctoract.setNombre(nuevonombre);

                                   System.out.println("Ingrese el apellido del medico: ");
                                   String nuevoapellido =sc.nextLine();
                                   doctoract.setApellido(nuevoapellido);

                                   System.out.println("Ingrese la edad del medico: ");
                                   int nuevaedad = sc.nextInt();
                                   sc.nextLine();
                                   doctoract.setEdad(nuevaedad);

                                   System.out.println("Ingrese el titulo del medico: ");
                                   String nuevotitulo = sc.nextLine();
                                   doctoract.setTitulo(nuevotitulo);

                                   System.out.println("Ingrese los años de experiencia del medico: ");
                                   int nuevosxpyears = sc.nextInt();
                                   sc.nextInt();
                                   doctoract.setExpYear(nuevosxpyears);
                            } else {
                                   System.out.println("El medico con el id: "+ codigomedico + " no existe.");
                            }
                     break;

                     case 3:
                            Doctor dc = new Doctor();
                            boolean encontrado = false;

                            while(!encontrado){
                                   System.out.println("Ingrese el id del medico");
                                   int codigod = sc.nextInt();
                                   sc.nextLine();

                                   if(controlador.doctores.containsKey(codigod)){
                                          dc = controlador.doctores.get(codigod);
                                          System.out.println("Nombre del medigo es: "+ dc.getNombre());
                                          encontrado = true;
                                          break;
                                   }
                                   if(!encontrado){
                                          System.out.println("El medico con el id: "+codigod+ " no existe");
                                   }
                            }
                     break;
                     case 4:
                        System.out.println("Ingrese el id del medico a eliminar");
                        int medicoeliminar = sc.nextInt();
                        sc.nextLine();

                        if (controlador.doctores.containsKey(medicoeliminar)){
                            controlador.doctores.remove(medicoeliminar);
                            System.out.println("El medico con el id = " + medicoeliminar + " ha sido eliminado");
                        } else {
                            System.out.println("El medico con el id: "+ medicoeliminar + " no existe");
                        }
                    break;


                     case 5:
                            System.out.println("Listado de todos los entrenadores:");
                            for(Integer key : controlador.doctores.keySet()){
                                   Doctor doctors = controlador.doctores.get(key);
                                   System.out.println("Id: "+ doctors.getId());
                                   System.out.println("Nombre: "+ doctors.getNombre());
                                   System.out.println("Apellido: "+ doctors.getApellido());
                                   System.out.println("Edad: "+ doctors.getEdad());
                                   System.out.println("Titulo: " + doctors.getTitulo());
                                   System.out.println("Años de experiencia: "+ doctors.getExpYear());
                            }
                     break;

                     case 6:
                     return;
                     default:
                     System.out.println("Opcion invalida, intentelo de nuevo.");
                     }
              }
       }
}
