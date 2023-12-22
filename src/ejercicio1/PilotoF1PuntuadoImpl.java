package ejercicio1;

/**
    PilotoF1 describe al tipo piloto de Fórmula 1 a través de su nombre, la escudería en la que compite y su país
    de origen. La clase que lo implementa cuenta con un único constructor al que se le pasan el nombre, la escudería
    y el país, en este mismo orden.

    
    PilotoF1Puntuado representa a un piloto de Fórmula 1 con las puntuaciones obtenidas en los distintos circuitos
    a lo largo de un mundial. Tiene las siguientes propiedades:

    + Circuitos: lista de circuitos en los que ha puntuado el piloto.

    + Puntos: lista con las puntuaciones obtenidas por el piloto. La posición i-ésima de esta lista almacena la puntuación obtenida por el piloto en el circuito i-ésimo.

    + PuntuacionTotal: suma de todas las puntuaciones.

    
       
    Se pide que escriba el siguiente código de la clase PilotoF1PuntuadoImpl:
        
        //TODO
     - Cabecera y constructor de la clase, al que se le pasan el nombre, la escudería y el país como
       parámetros. Inicialmente se considera que el piloto no ha puntuado en ningún circuito.
        
        //TODO
     - PuntuacionTotal, que se calcula como la suma de las puntuaciones obtenidas por
       el piloto en todos los circuitos
        
        //TODO
     - puntuar(circuito, puntos). Si el piloto ya tiene una puntuación para el circuito, esta
       operación la sustituye por los nuevos puntos. En caso contrario, la añade como una puntuación nueva. Los
       puntos que obtiene un piloto en un circuito es un entero entre 0 y 25, ambos valores incluidos. En caso de
       intentar puntuar a un piloto con un valor no permitido se debe elevar la excepción ExcepcionPilotoF1PuntuadoOperacionNoPermitida.
        
        //TODO
     - obtenerPuntuacion(circuito). Devuelve la puntuación obtenida por el piloto en el
       circuito. En el caso de que el piloto no tenga ninguna puntuación para el circuito debe devolver cero.
        
        //TODO
     - Método main (en la clase App que esta fuera de los paquetes) que realice las siguientes acciones:
        + Crear un piloto puntuado con los siguientes datos:
            - Nombre: “Lewis Hamilton”
            - Escudería: “Mercedes”
            - País: “UK”
            - Circuitos: [“Mónaco”,”Shanghai”]
            - Puntos: [25, 18]
        + Mostrar por pantalla la puntuación total.
        + Mostrar por pantalla la puntuación obtenida en el circuito de “Mónaco”.

 */