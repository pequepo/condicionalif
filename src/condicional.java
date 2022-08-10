public class condicional {
//ejercicio condicional// 
    public static void main(String[] args) {
        int numeroif;
        numeroif = 1;
        if (numeroif >0) {
            System.out.println("El numero es positivo");
        } else if (numeroif < 0) {
            System.out.println("El numero es negativo");
        } else if (numeroif == 0) {
            System.out.println("El numero es neutro");
        }
            //ejercicio con while//
        int numerowhile = 0;
        while(numerowhile <=2){
            System.out.println(numerowhile++);
        }
            //ejercicio do while //
        int numeroDoWhile = 2; 

        do {
            numeroDoWhile = numeroDoWhile - 1; 
        } while (numeroDoWhile == 2);
            System.out.println(numeroDoWhile);

        int numeroFor = 0;
        for (;numeroFor <= 3; numeroFor = numeroFor + 1) {
            System.out.println(numeroFor);
        }

        var estacion = "VERANO"; 

        switch(estacion) {
             case "PRIMAVERA":
             System.out.println("Estamos en PRIMAVERA");
             break;
             case "VERANO":
             System.out.println("Estamos en VERANO");
             break;
             case "OTOÑO":
             System.out.println("Estamos en OTOÑO");
             break;
             case "INVIERNO":
            System.out.println("Estamos en INVIERNO");
                break;
            default: 
                System.out.println("Eso no es una estación");
             


        }
        

    }
    
    
    }

