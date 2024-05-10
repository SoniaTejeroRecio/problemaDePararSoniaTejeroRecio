# problemaDeLaParada_SoniaTejeroRecio

_**Antes de empezar, me gustaría decir que he realizado esta entrega centrándome en los principios SOLID y teneindo muy en cuenta en principio de responsabilidad única.**_


_**Además, he utilizado patrones de comportamiento, para ser más exactos "Chain of responsability".**_


_**Gracias a ello he logrado realizar un programa con la mayor abstracción posible.**_

## ¿Cómo he estructurado el proyecto?
Para este proyecto he realizado un Modelo-vista.controlador. 
El modelo está compuesto por las maquinas principales que llevan a cabo el eje central del problema. Contamos con Haltchecker y Resverser. 

Ambas heredan de una clase abstracta denominada: “MaquinaTuring”. 

## Comenzamos 🚀

Es importante recalcar que todos los bloques de código se han realizado utilizando el lenguaje de programación **Java**.

### Indice 📋
_Cómo he estructurado y desarrollado la tarea:_

```
📌Paquete modelo: encontrarás una interfaz Mauina, MaquinaHaltchecker, MáuinaReverser y la clase abstracata de la que heredan: MaquinaTuring

📌Paquete programas: contiene los programas countUp y countDown que serán utilizados como entrada de las máquinas creadas

📌Paquete Vista: aquí se encuentra la interfaz gráfica de usuario

📌Paquete diagramas: se encuentra los diagramas para un mejor entendimiento dle proyecto

📌Paquete test

📌Paquete utils: las herramientas adicionales programadas para contribuir al funcionamiento de las máquinas 

📌Recursos necesarios para la corrección

📌Autor
```


## Elaboración del ejercicio
Para la elaboración del programa he utilizado patrones de diseño. Siendo el más importante el patrón de comportamiento “chain of responsability”. He seguido la siguiente estructura: 

![image](https://github.com/SoniaTejeroRecio/pruebaaaaa/assets/131295018/b620932c-78c1-4b1e-9c70-c7ad9202d376)

Siendo la interfaz la máquina, BaseHandler→ la MaquinaTuring y ConcreteHandlers → Haltchecker por un lado y la máquina Reverser por otro lado. Además como Client →tenemos la interfaz gráfica de usuario que en mi programa se identifica cómo la vista.

## Realización del programa
He realizado la implementación de una función denominada “Haltchecker”, esta función toma como entrada un código a analizar, además toma un input tal y cómo observamos el el diagrama descrito: 

Dentro de esta clase,  he realizado un método gestionar() que tiene como objetivo analizar un programa en función de un input introducido. Este método se llama al método analizar en el objeto AnalizadorLexico, pasando a como argumento. El resultado de este método se devuelve como el resultado del método gestionar. 



Están definidos dos constructores: 

Un constructor que inicializa las variables de instancia → programa, input 
LLama al constructor anterior para inicializar las variables y establece la siguiente maquina con setNext



Por otro lado, la máquina Reverser es una subclase de MaquinaTuring. Esta clase se utiliza para invertir el flujo de control en una cadena de máquinas en el problema de la parada. 
Tienen dos constructores: 
Inicializa la variable de instancia → programa 
Utilizado para llamar al constructor anterior para inicializar el programa posteriormente establecer la siguiente maquina de estado, para ello he utilizado “setNext”. 
La clase también tiene un método gestionar que establece la siguiente máquina en la cadena como una nueva instancia de MaquinaHaltchecker

Si el método gestionar de la siguiente máquina devuelve true, se entra en un bucle infinito

Por último la clase abstracta MaquinaTuring:proporciona una estructura básica para una máquina en una cadena de máquinas. Cada máquina puede tener una referencia a la siguiente máquina en la cadena, y cada máquina debe ser capaz de "gestionar" de alguna manera, aunque la implementación específica de "gestionar" se deja a las subclases.


## Corrección 🖇️
_Link a codespace:_ [codespace_de_Sonia](https://codespaces.new/SoniaTejeroRecio/problemaDePararSoniaTejeroRecio)

_Repositorio de github:_(https://github.com/SoniaTejeroRecio/problemaDePararSoniaTejeroRecio.git)
