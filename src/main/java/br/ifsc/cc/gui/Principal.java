/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifsc.cc.gui;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno
 */
public class Principal {
    public static void main(String[] args) {
        ResourceBundle traducoes = null;
//      LoginAcesso login = new LoginAcesso(new javax.swing.JFrame(), true, traducoes);
        
        String idioma;
        String pais;
 
          if(args.length != 2){
            idioma = "pt";
            pais = "BR";
        } else { 
            idioma = args[0]; //pt ou en
            pais = args[1]; //BR ou US
        }
        
        Locale localCorrente;
      
        
        //para desenvolvimento local
        localCorrente = new Locale(idioma, pais);
        traducoes = ResourceBundle.getBundle("MessagesBundle", localCorrente);
        //teremos MessagesBundle_idioma_pais.properties

        //para o executavel .jar final
//        InputStream newInputStream;
//        String nomeArquivo = "./idiomas/MessagesBundle_"+idioma+"_"+pais+".properties";
//        try {
//            newInputStream = Files.newInputStream(Paths.get(nomeArquivo));
//            traducoes = new PropertyResourceBundle(newInputStream);
//        } catch (IOException ex) {
//            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
//        }
        LoginAcesso logintela = new LoginAcesso(new javax.swing.JFrame(), true, traducoes );
        logintela.setVisible(true);
    }
        
}
