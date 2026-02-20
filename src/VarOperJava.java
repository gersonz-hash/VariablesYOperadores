
import java.sql.SQLOutput;
import java.util.Scanner;//Sirve para que el programa pueda leer lo que el usuario ingresa
//Inicio del Programa
public class VarOperJava {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);

        //Declaración de Variables
        String nombre;
        int edad;
        double estatura;
        boolean estudiante;

        //En la primera linea imprime texto y la segunda.
        System.out.println("Ingrese su nombre: ");
        nombre=entrada.nextLine();//lee el texto que escribe el usuario en el teclado y lo guarda.

        System.out.println("Ingrese su edad: ");
        edad=entrada.nextInt();

        System.out.println("Ingrese su estatura: ");
        estatura=entrada.nextDouble();

        System.out.println("Ingrese true si es estudiante sino ingrese false. ");
        estudiante=entrada.nextBoolean();

        //imprimir texto con los resultados de lo que colocamos anteriormente.
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Estatura: "+estatura);
        System.out.println("Estudiante: "+estudiante);
        System.out.println();

        //Segunda parte Operaciones Matemáticas
        int num1, num2;//declaración de variables con int
        System.out.println("-------Ejercicio con la variable Int-------");

        System.out.println("Ingrese el primer Numero: ");
        num1=entrada.nextInt();

        System.out.println("Ingrese el segundo Numero: ");
        num2=entrada.nextInt();

        //Operaciones de suma, resta, multiplicacion y division
        System.out.println("Suma: "+(num1+num2));
        System.out.println("Resta: "+(num1-num2));
        System.out.println("Multiplicación: "+(num1*num2));
        System.out.println("Division: "+(num1/num2));
        System.out.println();

        //declaración de variables con double
        double d1, d2;
        System.out.println("---------Ejercicio con la variable Double---------");

        System.out.println("Ingrese el primer Numero: ");
        d1=entrada.nextDouble();

        System.out.println("Ingrese el segndo Numero: ");
        d2=entrada.nextDouble();

        //operaciones con suma, resta, multiplicación y division double
        System.out.println("Suma: "+(d1+d2));
        System.out.println("Resta: "+(d1-d2));
        System.out.println("Multiplicación: "+(d1*d2));
        System.out.println("División: "+(d1/d2));
        System.out.println();

        //declaración de variables con float
        float f1, f2;
        System.out.println("---------Ejercicio con la variable float-----------");

        System.out.println("Ingrese el primer Numero: ");
        f1=entrada.nextFloat();

        System.out.println("Ingrese el segundo Numero: ");
        f2=entrada.nextFloat();

        //operacion con suma, resta, multiplicación y division float
        System.out.println("Suma: "+(f1+f2));
        System.out.println("Resta: "+(f1-f2));
        System.out.println("Multiplicación: "+(f1*f2));
        System.out.println("División: "+(f1/f2));
        System.out.println();

        //declaración de variables con short
        System.out.println("--------Ejercicio con la variable Short--------");
        short s1, s2;

        System.out.println("Ingrese el primer Número: ");
        s1=entrada.nextShort();

        System.out.println("Ingrese el segundo Número: ");
        s2=entrada.nextShort();

        //Operaciones con suma, resta, multiplicación, división con SHORT
        System.out.println("Suma: "+(s1+s2));
        System.out.println("Resta: "+(s1-s2));
        System.out.println("Multiplicación: "+(s1*s2));
        System.out.println("División: "+(s1/s2));
        System.out.println();

        //declaración de variables byte
        System.out.println("----------Ejercicio con la Variable byte----------");
        byte b1, b2;

        System.out.println("Ingrese el primer Número: ");
        b1=entrada.nextByte();

        System.out.println("Ingrese el segundo Número: ");
        b2=entrada.nextByte();

        //operaciones con suma, resta, multiplicación y division Byte
        System.out.println("Suma: "+(b1+b2));
        System.out.println("Resta: "+(b1-b2));
        System.out.println("Multiplicación: "+(b1*b2));
        System.out.println("División: "+(b1/b2));

        //TERCERA PARTE "OPERACIONES LÓGICAS"
        //declaración de variables
        int a, b;
        System.out.println("-----------Operaciones Lógicas-----------");
        System.out.println();

        System.out.println("Ingrese el primer Número: ");
        a=entrada.nextInt();

        System.out.println("Ingrese el segundo Número: ");
        b=entrada.nextInt();

        //comparaciones
        System.out.println("a es mayor que b: "+(a>b));
        System.out.println("a es menor que b: "+(a<b));
        System.out.println("a es igual a b: "+(a==b));
        System.out.println();

        //esta parte del codigo usamos los operadores lógicos para ver si se cumplen en ambos lados las condiciones.
        System.out.println("OPERADOR LÓDIGO AND: "+(a>0 && b>0));
        System.out.println("OPERADOR LÓGICO OR: "+(a>0 || b>0));
        System.out.println();

        //CUARTA PARTE CLASIFICACION EDAD
        System.out.println("---------Clasificación de Edad---------------");
        int edadPersona;
        System.out.println("Ingrese su edad: ");
        edadPersona=entrada.nextInt();

        if (edadPersona<12) {
            System.out.println("Niño");
        }else if (edadPersona >=12 && edadPersona<=17){
            System.out.println("Adolecente");
        }
        else if (edadPersona >=18 && edadPersona<=59){
            System.out.println("Adulto");

        }else {
            System.out.println("Adulto Mayor");
        }
        System.out.println();

        //QUINTA PARTE DÓAS DE LA SEMANA

        System.out.println("---------DIA DE LA SEMANA----------");
        int dia;
        System.out.println("Ingrese un numero del 1 al 7 ");
        dia=entrada.nextInt();

        //USO DE LA SENTENCIA SWITCH
        switch (dia){
            case 1:
                System.out.println("Día Lunes");
                break;
            case 2:
                System.out.println("Día Martes");
                break;
            case 3:
                System.out.println("Día Miercoles");
                break;
            case 4:
                System.out.println("Día Jueves");
                break;
            case 5:
                System.out.println("Día Viernes");
                break;
            case 6:
                System.out.println("Día Sabado");
            case 7:
                System.out.println("Día Domingo");
                break;
                //SINO SE CUMPLE LA SENTENCIA SALE UN MENSAJE DE ERROR
                default:
                System.out.println("VALOR NO VALIDO");
        }

        System.out.println();
        //Colocamos un inicio de sesion
        System.out.println("------------INICIO DE SESION-------------");

        //Definimos la contraseña y usuario correctos
        String usuarioCorrecto= "progra1";
        String contraCorrecta= "1234";

        //declaramos las variables de tipo cadena
        String UsuarioIngresado;
        String contraIngresada;

        entrada.nextLine();//esto limpia el enter y nos deja seguir ejecutando el programa

        System.out.println("Ingrese su Usuario");
        UsuarioIngresado=entrada.nextLine();

        System.out.println("Ingrese la Contraseña: ");
        contraIngresada=entrada.nextLine();

        //Usamos la sentencia if-else y .equals porque java no permite hacer comparaciones
        //con cadenas eso es para que podamos validar si coinciden o no.
        if (UsuarioIngresado.equals(usuarioCorrecto) ) {

            if (contraIngresada.equals(contraCorrecta)) {
                System.out.println("ACCESO CONCEDIDO ");
            } else {
                System.out.println("Contraseña  incorrecta.");
            }
        }else{
                System.out.println("USUARIO NO REGISTRADO");
            }
    }
}
