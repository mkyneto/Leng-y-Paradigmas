import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import pojo.Biblioteca;



class Main {
    public static final String separator = ",";
    List<Biblioteca> listBiblioteca;
  
    // Este metodo retorna una lista obtenida de la tabla en CSV
    private List<Biblioteca> csvRead(){
      BufferedReader bufferReader = null;
      try {
        // Abrir el .csv en buffer de lectura
        bufferReader = new BufferedReader(new FileReader("csv/inventario.csv"));
  
        // Leer primera línea del archivo
        String line = bufferReader.readLine();
        listBiblioteca = new ArrayList<Biblioteca>();
    
        while (line != null) {
          // Sepapar la linea leída con el separador definido previamente
          String[] campos = line.split(separator);
                    
          Biblioteca biblioteca = new Biblioteca();
          biblioteca.setTitulo(campos[0]);
          biblioteca.setAutor(campos[1]);
          biblioteca.setAnio(campos[2]);
          biblioteca.setEstante_seccion(campos[3]);
          biblioteca.setPiso(campos[4]);
          biblioteca.setEdificio(campos[5]);
          biblioteca.setSede(campos[5]);
          listBiblioteca.add(biblioteca);    
    
          // leer siguiente línea del fichero
          line = bufferReader.readLine(); 
        }
        return listBiblioteca;
      } 
      catch (IOException e) {
        e.printStackTrace();
      } 
      finally {
        // Cierro el buffer de lectura
        if (bufferReader != null) {
          try {
            bufferReader.close();
          } 
          catch (IOException e) {
            e.printStackTrace();
          }
        }
      }
      return null;
    }
  
    // Método main (acá inicia la ejecución)
    public static void main(String[] args) {
      // Creamos objeto app a partir de la clase Main
      Main app = new Main();
  
      // Activamos el método csvRead para cargar el archivo en un List
      List<Biblioteca> bibliotecas = app.csvRead();

      //print the data of the list
      Iterator<Biblioteca> it = bibliotecas.iterator();


      System.out.println("......................................." );
      System.out.println("Titulo: " + biblioteca.getTitulo());
      System.out.println("Autor: " + biblioteca.getAutor());
      System.out.println("Año: " + biblioteca.getAnio());
      System.out.println("Estante Numero: " + biblioteca.getEstante_numero());

      System.out.println("Estante Seccion: " + biblioteca.getEstante_seccion());
      System.out.println("Piso: " + biblioteca.getPiso());
      System.out.println("Edificio: " + biblioteca.getEdificio());
      System.out.println("Sede: " + biblioteca.getSede());
      System.out.println("......................................." );

      Iterator<Biblioteca> it = bibliotecas.iterator();
      while(it.hasNext()) {
        Biblioteca biblioteca = it.next();
        System.out.println("..........................." + "\n" +"Titulo: " + biblioteca.getTitulo() + "\n" +"Autor: " + biblioteca.getAutor()+ "\n" + "Año: " +biblioteca.getAnio()+ "\n" + "Estante Numero: " + biblioteca.getEstante_numero()+ "\n"  + "Seccion: "biblioteca.getEstante_seccion()+ "\n" +"Piso: "biblioteca.getPiso()+ "\n" +"Edificio: " + biblioteca.getEdificio()+ "\n" +"Sede: " +biblioteca.getSede() );
      }


     }

    








