import java.util.Scanner;
public class promedio {

    public static void main(String[] args) {
        Scanner miobj=new Scanner(System.in);
        System.out.println("ingrese cantidad de estudiantes  ");
        int estudiantes=miobj.nextInt();
        int etApro=0;
            if (estudiantes>0 ) {
                System.out.println("estudiantes");

                for (int i = 0; i < estudiantes; i++) {
                    
                    System.out.println("ingrese las tres notas del estudiante la nota maxima es 5 : ");
                    int nota1=miobj.nextInt();
                    int nota2=miobj.nextInt();
                    int nota3=miobj.nextInt();

                    if (nota1>=0 && nota1<=5 && nota2>=0 && nota2<=5 && nota3>=0 && nota3<=5) {
                        float promedio=(nota1+nota2+nota3)/3;
                        System.out.println("el promedio es :"+promedio);
                        
                       if (promedio>=3) {
                          
                          System.out.println("aprobo el estudiante");
                          etApro++;
                       } else {
                          System.out.println("reprobo el es tudiante");
                       }   
                     
                    } else {
                        System.out.println("ingrese un valor que este en el rango ");
                    }
                    
                 
                }
                System.out.println("la cantidad de estudiantes que aprobo fue :"+etApro);
            }
    }
}
//profe piedad por favor :(