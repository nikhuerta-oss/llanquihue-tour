package data;

import model.Tour;

import java.io.*;
import java.util.ArrayList;


public class GestorDatos {


    public ArrayList<Tour> cargarTours() {

        ArrayList<Tour> lista = new ArrayList<>();


        try {

            File archivo = new File("resources/tours.txt");

            BufferedReader lector =
                    new BufferedReader(new FileReader(archivo));


            String linea;


            while((linea = lector.readLine()) != null) {


                String datos[] = linea.split(";");


                String nombre = datos[0];
                String lugar = datos[1];
                int precio = Integer.parseInt(datos[2]);


                Tour tour = new Tour(nombre,lugar,precio);


                lista.add(tour);
            }


            lector.close();


        } catch(Exception e){

            System.out.println("Error leyendo archivo");
        }


        return lista;
    }
}