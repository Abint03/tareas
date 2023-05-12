import java.util.InputMismatchException;
import java.util.Scanner;

public class pt3 {
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);
        int nro=(int)(Math.random()*500+1);
        int veces=adivinarNro(e, nro);
        System.out.println("Se adivino en: "+veces+" intentos");
    }
    public static int adivinarNro(Scanner e,int nro){
        int num;
        try{
            System.out.println("INGRESE NUMERO: ");
            num=e.nextInt();
            if(nro==num){
                System.out.println("NUMERO ADIVINADO!");
                return 1;
            }
            if(nro>num){
                System.out.println("NUMERO INGRESADO ES MENOR");
                return 1+adivinarNro(e,nro);

            }
            if(nro<num){

                System.out.println("NUMERO INGRESADO ES MAYOR");

                return 1+adivinarNro(e,nro);
                }
            }catch (InputMismatchException i){
                System.out.println("CARACTER INGRESADO. INGRESE UN NUMERO VALIDO");
                e.nextLine();
                return 1+adivinarNro(e,nro);
            }
        return 0;
    }
}

