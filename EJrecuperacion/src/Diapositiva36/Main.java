package Diapositiva36;

import java.io.*;

public class Main {
	public static void main(String[] args) {
        String archivo = "archivo.txt";
        contarPalabras(archivo);
        inicialMayuscula(archivo);
        eliminarPalabra(archivo, "");
    }

	public static void contarPalabras(String nombreArchivo) {
		try {
		int palabras = 0;
		FileReader fr = new FileReader(nombreArchivo);
		BufferedReader br = new BufferedReader(fr);
		String linea;
		while ((linea = br.readLine()) != null) {
		String[] palabrasLinea = linea.split("\\s+");
		palabras += palabrasLinea.length;
		}
		//al cerrar el BufferedReader se cierra también el FileReader
		br.close();
		System.out.println(nombreArchivo + " contiene " + palabras + " palabras");
		} catch (IOException e) {
		System.out.println("Error al leer el archivo: " + e.getMessage());
		}
	}
	
	public static void inicialMayuscula(String nombreArchivo) {
        try {
            File inputFile = new File(nombreArchivo);
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));

            StringBuilder nuevoContenido = new StringBuilder();
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] palabras = linea.split("\\s+");
                for (int i = 0; i < palabras.length; i++) {
                    if (!palabras[i].isEmpty()) {
                        palabras[i] = palabras[i].substring(0, 1).toUpperCase() + palabras[i].substring(1).toLowerCase();
                    }
                }
                nuevoContenido.append(String.join(" ", palabras)).append("\n");
            }
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo));
            writer.write(nuevoContenido.toString());
            writer.close();

            System.out.println("Contenido del archivo capitalizado.");
        } catch (IOException e) {
            System.out.println("Error al modificar el archivo: " + e.getMessage());
        }
    }

    public static void eliminarPalabra(String nombreArchivo, String palabraEliminar) {
        try {
            File archivoOriginal = new File(nombreArchivo);
            BufferedReader reader = new BufferedReader(new FileReader(archivoOriginal));

            StringBuilder nuevoContenido = new StringBuilder();
            String linea;
            while ((linea = reader.readLine()) != null) {
                linea = linea.replaceAll("\\b" + palabraEliminar + "\\b", "");
                nuevoContenido.append(linea.trim()).append("\n");
            }
            reader.close();

            String nuevoNombre = nombreArchivo.replace(".txt", "_2.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(nuevoNombre));
            writer.write(nuevoContenido.toString());
            writer.close();

            System.out.println("Se ha eliminado la palabra \"" + palabraEliminar + "\": " + nuevoNombre);
        } catch (IOException e) {
            System.out.println("Error al procesar el archivo: " + e.getMessage());
        }
    }
}
