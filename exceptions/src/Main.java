public class Main {
    public static void main(String[] args) {
        int resultado;
        try{
            resultado=5/0;
            System.out.println("El resultado es: "+resultado);
        }
        catch (RuntimeException a){
            System.out.println("--- ERROR (runtime) ---");
        }
        catch (Exception a){
            System.out.println("--- ERROR ---");
        }
        finally {
            System.out.println("bloque finally");
        }
        ///El punto 1 está mal porque al poner primero Exception, incluye a las RuntimeException. Seria como querer capturar estas ultimas dos veces.
   int e= EjemploExcepciones.devuelveNumero(8);
        System.out.println(e);
    }
    public static class EjemploExcepciones{
        public static int devuelveNumero(int num) {
            try {
                if (num % 2 == 0) {
                    throw new Exception("Lanzando excepcion. ");
                }
                return 1;
            } catch (Exception ex){
                System.out.println(ex.getMessage().concat("Rompi todo y pase por Catch"));
                return 2;
            } finally {
                return 3;
            }
        }
    }
    ///Hay que agregar el getMessage() en un sout para que lo muestre por pantalla
}