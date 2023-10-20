package ejercicio2;

/**
    CarreraF1 describe al tipo carrera de Fórmula 1 a través de las propiedades circuito en el que se celebra la
    carrera, país en el que se celebra y fecha en la que se celebra. Además, cuenta con otras dos propiedades que
    representan a la parrilla de salida (lista de pilotos ordenada por la posición en la que salen los pilotos) y la
    clasificación (lista de pilotos ordenada por la posición en la que finalizan los pilotos la carrera).


    Se pide que escriba el siguiente código de la clase CarreraF1Impl:
    
        //TODO
    - obtenerPuntuacionPiloto(Piloto piloto) que devuelve la puntuación que ha obtenido el
      piloto en función de la posición que ocupa en la clasificación de la siguiente forma:

        Puesto Puntos Puesto Puntos
            1º -> 25 puntos     6º -> 8 puntos
            2º -> 18 puntos     7º -> 6 puntos
            3º -> 15 puntos     8º -> 4 puntos
            4º -> 12 puntos     9º -> 2 puntos
            5º -> 10 puntos    10º -> 1 punto

     Si el piloto se clasifica a partir de la posición undécima obtiene cero puntos. Si el piloto no está en la lista de
     clasificados se elevará la excepción ExcepcionCarreraF1OperaciónNoPermitida. No tiene que escribir el
     código de la excepción.

        //TODO
    - lineaDeSalida(Piloto piloto), que devuelve la línea que ocupa el piloto en la parrilla de
      salida, teniendo que cuenta que cada línea tiene dos pilotos. Por ejemplo, un piloto que ocupa la posición 11º
      en la parrilla, saldrá en la 6ª línea de salida. Si el piloto no está en la parrilla de salida se elevará la excepción
      ExcepcionCarreraF1OperaciónNoPermitida. No tiene que escribir el código de la excepción.

        //TODO
    - primerosParrillaSalida(int n) y primerosClasificacion(n), que devuelven la lista de
      pilotos que ocupan las primeras n posiciones de la parrilla de salida y de la clasificación, respectivamente. Si
      n tiene un valor mayor que el número de pilotos que hay en la parrilla de salida o en la clasificación, devolverán
      todos los pilotos de la parrilla de salida o de la clasificación, respectivamente

        //TODO
    - parrillaYClasificacion(int n), que devuelve el conjunto de pilotos que salieron entre las n
      primeras posiciones de la parrilla de salida y han quedado entre los n primeros puestos de la clasificación, es
      decir, que están entre los n primeros de la parrilla y de la clasificación.

        //TODO
    - Los métodos equals, hashCode y compareTo teniendo en cuenta que dos carreras son iguales
      si lo son las fechas en las que se celebran, y que el orden natural es también por la fecha en la que se
      celebran las carreras.  
 */
