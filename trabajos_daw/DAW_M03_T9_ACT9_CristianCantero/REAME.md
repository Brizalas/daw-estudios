Problemas derivados de la act 9

COMO SE CREA UNA INSTANCIA DE UN OBEJTO Y SE GUARDA EN UN ARRAY?
EN LA ACT 8 ENTENDÍ MAL EL CONCEPTO DE INTERFAZ.. TIENES Q REPASARLO

-que funciona: las funciones de la clase Escuela mostrar() y crearProgramacion() con guardarProgramacion() reutilizada dentro.La estructura del main en forma de menu. 

La implementación de la clase abstracta hay que mirarsela. 
Seguramente hay que establecer arrays y contadores pero para eso tendré que modelar una clase 'cerebro'


He creado arrays para todo. Tengo que mirar cosas como inicializar datos tipo array. Esto esta en el tema 7. 
Miratelo. 

Tengo un conflicto en la clase Escuela línea 63. Quiero qeu según la opción llame a un método u a otro. 
Revisar reutilización de código.

La lógica es guardar el objeto de programacion en su array, el paqueste de bse de datos en el suyo. Y me encantaría que estos dos arrays vivieran dentro de un array de asignatura aunqeu no se si es necesario. 

¿POrque no puedo llamar a un metodo abstracto definido en una clase que lo implementa?
tienes q rehacer la interafaz creo q has hecho mal el enunciado...

RELEE EL EJERCICIO!!
RELEE APUNTES


30/3

Apuntes re-leidos y me encuentro pues como siempre con problemas derivados de cosas que pide el ejercicio que no ejemplifican en los imprimibles.
Si declaro dos clases y estas a su vez extienden (heredan) de otra. Como hago para añadir un método abstracto?? eso se pone en la firma de la clase. Se hacerlo desde una interfaz primero extends y luego implements.. pero si ya tengo extends y tengo una clase abstracta... q tengo q instanciarla dentro de la clase donde la quiero usar?? - Llegó la hora de pregunarle a la IA.

GPT llegó a la conclusión que Asignatura será la clase abstracta. A partir de ahí he podido quitar mucho ruido y siguiendo el patron de los imprimibles he conseguido modelar la clase abstracta e implementar los métodos sin lógica todavía en las clases hijas. Ahora tengo que ver como hago eso. 

Después de bastante pelea se me encendió la luz para usar los getters y así modelar un metodo override sin que pete por los aires y funcionando como yo quiero. La cuestión es que no se si como yo quiero es la manera correcta de funcionar. Tengo dos métodos sobreescritos:

@Override
    public int mostrarPrecioTotal(int resultado){
        resultado = getCreditos() * 120;
        return resultado;
    }
    
    @Override
    public void mostrarInformacion(){
        System.out.println("Lenguaje: " + lenguaje);
        System.out.println("Nivel: " + nivel);
        System.out.println("Precion total: " + mostrarPrecioTotal(0));
        System.out.println("Creditos: " + getCreditos());
    }

En mostrar información cuando quiero que imprima el precio total llamo al método ... (esto pensando / reflexionando...) nada falsa alarma...
llamo al método mostrarPrecioTotalpero no me deja pasarle por parametro el return... y le tengo q poner un 0 o el número que yo quiera... hay algo q está mal planteado porque asíno va devolverme el resultado que yo quiero...

Vale lo he arreglado asi. A la firma del método abstracto le quité los parámetros... y de repente todo compila. 

esto:

 @Override
    public int mostrarPrecioTotal(){
        int resultado = getCreditos() * 120;
        return resultado;
    }
    
    
    
    @Override
    public void mostrarInformacion(){
        System.out.println("Lenguaje: " + lenguaje);
        System.out.println("Nivel: " + nivel);
        System.out.println("Precion total: " + mostrarPrecioTotal());
        System.out.println("Creditos: " + getCreditos());
    }

Ya no da errores de ninguna clase ni tengo que pasarle por parametro nada a mostrarPrecioTotal() en el metodo mostrarInformacion()

Java no da errores pero no se todavía si esto funciona. Al final me han quedoado asi los métodos:

    @Override
    public int calcularPrecioTotal(){
        
        int precio = 120;
        int resultado = precio * getCreditos();
        return  resultado;
    }
    
     @Override
    public void mostrarInformacion(){
        System.out.println("Asignatura: " + getNombre());
        System.out.println("Creditos: " + getCreditos());
        System.out.println("Sistema: " + getSistema());
        System.out.println("Nivel: " + getNivel());
        System.out.println("Precion total: " + calcularPrecioTotal());
        
    }

    GPT me dice que esto ...

        int precio = 120;
        int resultado = precio * getCreditos();
        return  resultado;

    ... es de noobs pero me de igual jajaja

    Debería haberlo hecho asi mejor:
    return 120 * getCreditos(); 

    Ya veré si lo cambio.

    Hasta el punto 4 ahora mismo parece que está todo correcto. Voy con el punto 5.

    Ya está resuelto  pero necesito establecer una rutina de ejercicio para refrescar arrays según elcaso. Porque me he atorado muchísimo en algo que ya he hecho anteriormente y que no he sabido re-invocar. He tenido que pedir ayuda a chat gpt.