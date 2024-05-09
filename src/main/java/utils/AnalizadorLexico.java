package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnalizadorLexico {
    private String [] textoCodigo;

    public AnalizadorLexico(String codigo){
        this.textoCodigo = codigo.split("\n");
    }

    public static TipoWhile analizarBucle(String linea){//buscameos dentro de la linea del while, donde esta el objetivo al qie tienen que llegar el bucle
        Matcher patron = Pattern.compile("-?\\d+").matcher(linea);
       int variable = Integer.parseInt(patron.group());
       if (linea.contains("=")){
        return TipoWhile.IGUAL;
       }else if (linea.contains("<")){
           return TipoWhile.MENOR;
         }else if (linea.contains(">")){
            return TipoWhile.MAYOR;
            }else {
           return TipoWhile.DIFERENTE;
       }

    }



    public void analizar(){
        for (String linea : textoCodigo){
            if(linea.contains("while")){
                analizarBucle(linea);
                TipoWhile tipowhile = analizarBucle(linea);

              }
            if (linea.matches("\\s*((\\w+ =\\w+ \\+\\d+)|(\\w+ \\+=\\d+)|(\\w+\\+\\+)|(\\+\\+\\w));"){

            }
            if(linea.matches("\\s*((\\w+ *= *\\w+ *- *\\d+)|(\\w+ *-= *\\d+)|(\\w+--)|(--\\w*));*")){

            }
        }

    }
}

