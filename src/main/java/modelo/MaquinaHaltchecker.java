package modelo;

import utils.AnalizadorLexico;

public class MaquinaHaltchecker extends MaquinaTuring{
    //un parametro de next lo tenemos por la clase abstracta
    private String programa;
    private String input;

    public MaquinaHaltchecker(String programa, String input){
        super();
        this.programa = programa;
        this.input = input;
    }

    public MaquinaHaltchecker (Maquina next, String programa, String input){
        this(programa, input);
        this.setNext(next);
    }

    public boolean gestionar(){
        int a;
        //hacemos un try catch para saber el formato del input
        try{
            a = Integer.parseInt(input);

        }catch (Exception e) {
            return true;
        }
        AnalizadorLexico analizadorLexico = new AnalizadorLexico(programa);
    return analizadorLexico.analizar(a);
    }

}




//en this program busca si hay algun bucle. Dividimos el String en líneas
// String[] lineas = programa.split("\n");

//recorremos las líneas
       /* for (String linea : lineas){
            //si la línea contiene la palabra halt
            if (linea.contains("halt")){
                //si el input es igual a la línea
                if (input.equals(linea)){
                    //si el siguiente es null
                    if (this.next == null){
                        //imprimimos que se ha encontrado un bucle
                        System.out.println("Se ha encontrado un bucle");
                    }else{
                        //si no, seguimos con el siguiente
                        this.next.gestionar();
                    }
                }
            }
        }

        */
