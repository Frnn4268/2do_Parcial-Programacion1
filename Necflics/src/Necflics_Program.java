import java.util.ArrayList;
import java.util.Scanner;

public class Necflics_Program{

    public static int dato;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int des;
        int cont = 0;
        int contp = 0;

        ArrayList array_nombre = new ArrayList();
        ArrayList array_edad = new ArrayList();
        ArrayList array_direccion = new ArrayList();

        ArrayList array_nombreP = new ArrayList();
        ArrayList array_tipo = new ArrayList();
        ArrayList array_genero = new ArrayList();
        ArrayList array_sinopsis = new ArrayList();

        Cliente[] listaclientes = new Cliente[10];
        Pelicula[] listapeliculas = new Pelicula[10];

        do{
            System.out.println("");
            System.out.println(" ____  _____  ________    ______  ________  _____     _____   ______   ______   \n" +
                    "|_   \\|_   _||_   __  | .' ___  ||_   __  ||_   _|   |_   _|.' ___  |.' ____ \\  \n" +
                    "  |   \\ | |    | |_ \\_|/ .'   \\_|  | |_ \\_|  | |       | | / .'   \\_|| (___ \\_| \n" +
                    "  | |\\ \\| |    |  _| _ | |         |  _|     | |   _   | | | |        _.____`.  \n" +
                    " _| |_\\   |_  _| |__/ |\\ `.___.'\\ _| |_     _| |__/ | _| |_\\ `.___.'\\| \\____) | \n" +
                    "|_____|\\____||________| `.____ .'|_____|   |________||_____|`.____ .' \\______.'");
            System.out.println("");
            System.out.println("1.- Clientes");
            System.out.println("2.- Películas");
            System.out.println("3.- Salir");
            int s1 = sc.nextInt();

            switch (s1)
            {
                case 1:
                    System.out.println("1.- Ver listado Clientes");
                    System.out.println("2.- Crear nuevo Cliente");
                    System.out.println("3.- Seleccionar Cliente");
                    System.out.println("4.- Atrás");
                    int s2 = sc.nextInt();

                    switch (s2) {
                        case 1:
                            if (cont == 0) {
                                System.out.println("___________________");
                                System.out.println("No existen clientes");
                            } else {
                                System.out.println("Ver listado Clientes");
                                System.out.println("____________________");
                                for (int j = 0; j < array_nombre.size(); j++) {
                                    String nombre1 = (String) array_nombre.get(j);
                                    String direccion1 = (String) array_direccion.get(j);
                                    int edad1 = (int) array_edad.get(j);
                                    int j1 = j + 1;
                                    System.out.println(" Pos. " + j1 +
                                            "\n Nombre del cliente: " + nombre1 +
                                            "\n Dirección: " + direccion1 +
                                            "\n Edad: " + edad1 +
                                            "\n ");
                                }
                            }
                            break;

                        case 2:
                            cont++;
                            sc.nextLine();
                            System.out.println("Crear nuevo Cliente");
                            System.out.println("___________________");
                            System.out.println("Ingrese nombre");
                            String nombre = sc.nextLine();

                            System.out.println("Ingrese dirección");
                            String direccion = sc.nextLine();

                            System.out.println("Ingrese edad");
                            int edad = Integer.parseInt(sc.nextLine());

                            Cliente cliente = new Cliente(nombre, direccion, edad);
                            listaclientes[cont] = cliente;

                            for (int i = 0; i < 1; i++) {
                                array_nombre.add(cliente.nombre);
                                String nombre1 = (String) array_nombre.get(i);

                                array_direccion.add(cliente.direccion);
                                String direccion1 = (String) array_direccion.get(i);

                                array_edad.add(cliente.edad);
                                int edad1 = (int) array_edad.get(i);
                            }
                            for (int j = 0; j < array_nombre.size(); j++) {
                                String nombre1 = (String) array_nombre.get(j);
                                String direccion1 = (String) array_direccion.get(j);
                                int edad1 = (int) array_edad.get(j);
                                int j1 = j + 1;
                                System.out.println("____________________" +
                                        "\n Pos. " + j1 +
                                        "\n Nombre del cliente: " + nombre1 +
                                        "\n Dirección: " + direccion1 +
                                        "\n Edad: " + edad1);
                            }
                            break;

                        case 3:
                            System.out.println("Seleccionar cliente");
                            System.out.println("___________________");
                            System.out.println("");
                            System.out.println("Listado de clientes");
                            System.out.println("___________________");

                            if (cont == 0) {
                                System.out.println("No existen clientes");
                                System.out.println("___________________");
                            } else {
                                for (int j = 0; j < array_nombre.size(); j++) {
                                    String nombre1 = (String) array_nombre.get(j);
                                    String direccion1 = (String) array_direccion.get(j);
                                    int edad1 = (int) array_edad.get(j);
                                    System.out.println("");
                                    int j1 = j + 1;
                                    System.out.println(" Pos. " + j1 +
                                            "\n Nombre del cliente: " + nombre1 +
                                            "\n Dirección: " + direccion1 +
                                            "\n Edad: " + edad1);
                                }
                            }

                            System.out.println("______");
                            System.out.println("Elija un cliente: ");
                            int cl = sc.nextInt();
                            int cl1 = cl - 1;

                            if(cl == 0){
                                System.out.println("Atrás");
                            } else {
                                System.out.println("ELigió el cliente: ");
                                System.out.println("");
                                System.out.println("Pos. " + cl +
                                        "\n Nombre del cliente: " + array_nombre.get(cl1) +
                                        "\n Direcicón: " + array_direccion.get(cl1) +
                                        "\n Edad: " + array_edad.get(cl1));
                                System.out.println("");
                                System.out.println("____________________");
                                System.out.println("Elija una opción");
                                System.out.println("1.- PlayList");
                                System.out.println("2.- Agregar película");
                                System.out.println("3.- Atrás");
                            }
                            int s4 = sc.nextInt();

                            switch (s4)
                            {
                                case 1:
                                    System.out.println("________");
                                    System.out.println("PlayList");
                                    int cls = cl - 1;
                                    System.out.println("_________________________________");
                                    System.out.println(" Pos. " + cl +
                                            "\n Nombre del cliente " + array_nombre.get(cls) +
                                            "\n Dirección: " + array_direccion.get(cls) +
                                            "\n Edad: " + array_edad.get(cls));
                                    System.out.println("");
                                    int dato1 = dato + 1;
                                    System.out.println(" Pos. " + dato1 +
                                            "\n Nombre de la pelicula: " + array_nombreP.get(dato) +
                                            "\n Género: " + array_genero.get(dato) +
                                            "\n Tipo: " + array_tipo.get(dato) +
                                            "\n Sinopsis: " + array_sinopsis.get(dato));
                                    System.out.println("");
                                        break;

                                case 2:
                                    if(cont == 0){
                                        System.out.println("____________________");
                                        System.out.println("No existen películas");
                                    } else {
                                        System.out.println("");
                                        System.out.println("Ver listado de películas");
                                        System.out.println("________________________");

                                        for (int j = 0; j < array_nombreP.size(); j++) {
                                            String nombrep = (String) array_nombreP.get(j);
                                            String generop = (String) array_genero.get(j);
                                            String tipo = (String) array_tipo.get(j);
                                            String sinopsis = (String) array_sinopsis.get(j);
                                            System.out.println("");
                                            int j1 = j + 1;
                                            System.out.println(" Pos. " + j1 +
                                                    "\n Nombre de la pelicula: " + nombrep +
                                                    "\n Género: " + generop +
                                                    "\n Tipo: " + tipo +
                                                    "\n Sinopsis: " + sinopsis);
                                        }
                                    }

                                    System.out.println("");
                                    System.out.println("Elija una pelicula: ");
                                    System.out.println("____________________");
                                    int dap = sc.nextInt();
                                    int dap1 = dap - 1;
                                    if(dap == 0){
                                        System.out.println("Atrás");
                                    } else {
                                        System.out.println(" Pos. " + dap +
                                                "\n Nombre de la pelicula: " + array_nombreP.get(dap1) +
                                                "\n Género: " + array_genero.get(dap1) +
                                                "\n Tipo: " + array_tipo.get(dap1) +
                                                "\n Sinopsis: " + array_sinopsis.get(dap1));

                                        System.out.println("");
                                        dato = dap1;
                                    }
                                    break;

                                case 3:
                                    System.out.println("Atrás");
                                    break;

                                default:
                                    System.out.println("Default");
                                    break;
                            }
                            break;

                        case 4:
                            System.out.println("Atrás");
                            break;

                        default:
                            System.out.println("Default case");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("1.- Ver listado de películas");
                    System.out.println("2.- Crear película");
                    System.out.println("3.- Atrás");
                    int s3 = sc.nextInt();

                    switch (s3)
                    {
                        case 1:
                            if(contp == 0){
                                System.out.println("No existen películas");
                            } else {
                                System.out.println("Ver listado de películas");
                                for (int j = 0; j < array_nombreP.size(); j++) {
                                    String nombrep = (String) array_nombreP.get(j);
                                    String generop = (String) array_genero.get(j);
                                    String tipo = (String) array_tipo.get(j);
                                    String sinopsis = (String) array_sinopsis.get(j);
                                    int j1 = j + 1;
                                    System.out.println("____________________________");
                                    System.out.println(" Pos. " + j1 +
                                            "\n Nombre de la pelicula: " + nombrep +
                                            "\n Género: " + generop +
                                            "\n Tipo: " + tipo +
                                            "\n Sinopsis: " + sinopsis);
                                }
                            }
                            break;

                        case 2:
                            contp++;
                            sc.nextLine();
                            System.out.println("Crear película");
                            System.out.println("___________________________");

                            System.out.println("Ingrese nombre de la película");
                            String nombre_pelicula = sc.nextLine();

                            System.out.println("Ingrese tipo de película (Serie/Película)");
                            String tipo = sc.nextLine();

                            System.out.println("Ingrese género de la película (Drama, Comedia, Terror, Suspenso)");
                            String genero = sc.nextLine();

                            System.out.println("Ingrese sinopsis de la película");
                            String sinopsis = sc.nextLine();
                            System.out.println("");

                            Pelicula pelicula = new Pelicula(nombre_pelicula, tipo, genero, sinopsis);
                            listapeliculas[cont] = pelicula;

                            for(int i = 0; i < 1; i++){
                                array_nombreP.add(pelicula.nombre_pelicula);
                                String nombrep = (String) array_nombreP.get(i);

                                array_genero.add(pelicula.genero);
                                String generop = (String) array_genero.get(i);

                                array_tipo.add(pelicula.tipo);
                                String tipo1 = (String) array_tipo.get(i);

                                array_sinopsis.add(pelicula.sinopsis);
                                String sinopsis1 = (String) array_sinopsis.get(i);
                            }
                            for (int j = 0; j < array_nombreP.size(); j++) {
                                String nombrep = (String) array_nombreP.get(j);
                                String generop = (String) array_genero.get(j);
                                String tipo1 = (String) array_tipo.get(j);
                                String sinopsis1 = (String) array_sinopsis.get(j);
                                System.out.println("");
                                int j1 = j + 1;
                                System.out.println("____________________________");
                                System.out.println(" Pos. " + j1 +
                                        "\n Nombre de la película: " + nombrep +
                                        "\n Género: " + generop +
                                        "\n Tipo: " + tipo1 +
                                        "\n Sinopsis: " + sinopsis1);
                                System.out.println("____________________________");
                            }
                            System.out.println("");
                            break;

                        case 3:
                            System.out.println("Atrás");
                            break;

                        default:
                            System.out.println("Default case");
                            break;
                    }
                    break;

                case 3:
                    System.out.println("Salir");
                    break;

                default:
                    System.out.println("Default case");
                    break;
            }

            System.out.println("______________________________");
            System.out.println("1.- Salir");
            System.out.println("2.- Regresar al menú principal");
            System.out.println("______________________________");
            des = sc.nextInt();
        }while(des != 1);
    }
}