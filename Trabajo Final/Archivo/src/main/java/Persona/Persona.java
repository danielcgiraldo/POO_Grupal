package Persona;

import java.io.*;
import java.util.*;

public class Persona {

    String name, surname, phone, id;

    public static List<String> fill() {
        try {
            FileReader fr = new FileReader("./src/main/java/bd.txt");
            BufferedReader br = new BufferedReader(fr);
            List<String> lineas = new ArrayList<String>();
            String linea;
            //recorre cada linea del archivo
            while ((linea = br.readLine()) != null) {
                if (linea.contains("|")) {
                    lineas.add(linea.trim());
                }
            }
            br.close();
            return lineas;
        } catch (Exception e) {
            List<String> lineas = new ArrayList<String>();
            return lineas;
        }
    }

    public boolean add_person() {
        try {
            //leer el archivo
            FileReader fr = new FileReader("./src/main/java/bd.txt");
            BufferedReader br = new BufferedReader(fr);

            String linea;
            //recorre cada linea del archivo
            while ((linea = br.readLine()) != null) {
                if (linea.contains("|")) {
                    String[] data = linea.split("\\|");
                    if ((data[0].trim()).equals(id)) {
                        return false;
                    }
                }
            }
            br.close();
        } catch (Exception ex) {
            return false;
        }
        try {
            FileWriter fw = new FileWriter("./src/main/java/bd.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("\n" + id + "|" + name + "|" + surname + "|" + phone);
            bw.close();
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public static boolean delete_person(String id) {
        try {
            //leer el archivo
            FileReader fr = new FileReader("./src/main/java/bd.txt");
            BufferedReader br = new BufferedReader(fr);
            List<String> lineas = new ArrayList<String>();
            String linea;
            boolean flag = false;
            //recorre cada linea del archivo
            while ((linea = br.readLine()) != null) {
                if (linea.contains("|")) {
                    // almacenar cada linea del archivo a menos que sea la que hay que eliminar
                    String[] data = linea.split("\\|");
                    if ((data[0].trim()).equals(id)) {
                        flag = true;
                    } else {
                        lineas.add(linea.trim());
                    }
                }
            }
            br.close();
            if (flag) {
                //si se encontro la linea por eliminar se continua vaciando el archivo
                if (!vaciar()) {
                    return false;
                }

                //se llena el archivo con la lista que se lleno anteriormente (recordar que ya no tiene al eliminado)
                FileWriter fw = new FileWriter("./src/main/java/bd.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                for (int i = 0; i < lineas.size(); i++) {
                    bw.write("\n" + lineas.get(i));
                }
                bw.close();
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            return false;
        }
    }

    public static boolean vaciar() {
        try {
            FileWriter fw = new FileWriter("./src/main/java/bd.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("");
            bw.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

}
