/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumnodaw
 */
public class IODatos {
    
    public void guardarClientes(ArrayList<Cliente> vClientes) throws IOException{
        ArrayList Clientes = new ArrayList();
        String rutaFichero = "Clientes.dat";
        File f = new File(rutaFichero);
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(IODatos.class.getName()).log(Level.SEVERE, null, ex);
            }
         
            
        }
        
               try (FileOutputStream fo = new FileOutputStream(f);
            ObjectOutputStream escribir = new ObjectOutputStream(fo);) {

            escribir.writeObject(vClientes);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(IODatos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public static ArrayList<Cliente> cargarDatos() throws IOException{
        ArrayList<Cliente> vClientes = new ArrayList();
        String rutaFichero = "Clientes.dat";
        File f = new File(rutaFichero);
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(IODatos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
            try(FileInputStream fi = new FileInputStream(f);
                    ObjectInputStream leer = new ObjectInputStream(fi);){
                
                vClientes = (ArrayList<Cliente>) leer.readObject(); 
                } 
            catch (FileNotFoundException ex) { Logger.getLogger(IODatos.class.getName()).log(Level.SEVERE, null, ex); } 
            catch (IOException ex) { Logger.getLogger(IODatos.class.getName()).log(Level.SEVERE, null, ex); } 
            catch (ClassNotFoundException ex) { Logger.getLogger(IODatos.class.getName()).log(Level.SEVERE, null, ex); } 
            
            return vClientes; 
    
        }
        
    }
        

    
    
    

