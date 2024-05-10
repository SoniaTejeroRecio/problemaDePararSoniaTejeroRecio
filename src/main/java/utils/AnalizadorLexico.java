package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnalizadorLexico {
    private String [] textoCodigo;
    private static int variable;

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



    public boolean analizar(int a){
        TipoIncremento tipoIncremento = TipoIncremento.NULO;
       TipoWhile tipowhile = TipoWhile.DIFERENTE;

        for (String linea : textoCodigo){
            if(linea.contains("while")){
                analizarBucle(linea);
                 tipowhile = analizarBucle(linea);
              }
            if (linea.matches("\\s*((\\w+ =\\w+ \\+\\d+)|(\\w+ \\+=\\d+)|(\\w+\\+\\+)|(\\+\\+\\w));")){
                tipoIncremento = TipoIncremento.POSITIVO;
            }
            if(linea.matches("\\s*((\\w+ *= *\\w+ *- *\\d+)|(\\w+ *-= *\\d+)|(\\w+--)|(--\\w*));*")){
                tipoIncremento = TipoIncremento.NEGATIVO;
            }
        }
        switch (tipowhile){
            case MAYOR:
                if(tipoIncremento == TipoIncremento.POSITIVO){
                    return a < variable;
                }else if(tipoIncremento == TipoIncremento.NEGATIVO){
                    return a > variable;
                }else{
                    return false; //entra en bucle infinito (false)
                }
            case MENOR:
             if (tipoIncremento == TipoIncremento.POSITIVO){
                 return a > variable;
                }else if(tipoIncremento == TipoIncremento.NEGATIVO){
                    return a < variable;
                }else{
                 return false;
             }
            case IGUAL:
                if(tipoIncremento == TipoIncremento.POSITIVO){
                    return a <= variable;
                }else if(tipoIncremento == TipoIncremento.NEGATIVO){
                    return a >= variable;

            }else{
                    return a == variable;
                }
            default:
                return false;
        }
    }
}

