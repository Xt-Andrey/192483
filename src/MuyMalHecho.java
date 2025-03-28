import java.util.Scanner;

public class MuyMalHecho {
    public static void main(String[] args) throws Exception {
        Scanner miobj = new Scanner(System.in);
        int C = 0;

        System.out.println("Número de usuarios a ingresar:");
        int numUsuaro = miobj.nextInt();
        miobj.nextLine();

        int E1 = 0, E2 = 0, E3 = 0;
        String N1 = "", N2 = "", N3 = "";

        while (C < numUsuaro) {
            System.out.println("Nombre del usuario:");
            String nombreUsuario = miobj.nextLine();

            System.out.println("Edad del usuario:");
            int edadUsuario = miobj.nextInt();
            miobj.nextLine();

            if (C == 0) {
                N1 = nombreUsuario;
                E1 = edadUsuario;
            } else if (C == 1) {
                N2 = nombreUsuario;
                E2 = edadUsuario;
            } else if (C == 2) {
                N3 = nombreUsuario;
                E3 = edadUsuario;
            }

            if (edadUsuario >= 18) {
                System.out.println(nombreUsuario + " es mayor de edad.");
            } else {
                System.out.println(nombreUsuario + " es menor de edad.");
            }

            if (edadUsuario > 120 || edadUsuario < 1) {
                System.out.println("Edad no válida.");
            }

            C = C + 1;
        }

        System.out.println("Resumen:");
        System.out.println("Usuario 1: " + N1 + " - Edad: " + E1);
        System.out.println("Usuario 2: " + N2 + " - Edad: " + E2);
        System.out.println("Usuario 3: " + N3 + " - Edad: " + E3);
    }
}
