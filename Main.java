import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        List<Objeto> obj = new ArrayList<>();
        int cantObj;


        System.out.println("Introduzca la cantidad de objetos que usted quiere");
        while(true){
            try{
                cantObj = in.nextInt();
                if (cantObj <= 0) {
                    throw new Exception();
                }
                break;
            }catch(Exception e){
                System.out.println("Cantidad de objetos incorrectas");
                System.out.println("Vuelve a introducirla cantidad de objetos");
            }
        }

        in.nextLine();
        int i = 0;
        while (true){
            try {
                if( i < cantObj){
                    System.out.println("Introdusca el valor del objeto");
                    double valor = in.nextDouble();
                    System.out.println("Introdusca el peso del objeto");
                    double peso = in.nextDouble();
                    Objeto objeto = new Objeto(valor, peso);
                    obj.add(objeto);
                    i++;
                } else {
                    break;
                }
            }catch (Exception e){
                System.out.println("Valor o peso Incorrecto");
            }
        }

        System.out.println("Introduzca la capacidad de la mochila");
        while(true){
            try{
                double capacidad = in.nextDouble();
                if (capacidad <= 0) {
                    throw new Exception();
                }
                Mochila mochila = new Mochila(capacidad);
                mochila.llenarMochila(obj);
                System.out.println(mochila);
                System.out.println("Para un peso total de: "+ mochila.getPesoTotal());
                System.out.println("Para un valor total de: "+ mochila.getValorFinal());
                break;
            }catch(Exception e){
                System.out.println("Cantidad de objetos incorrectas");
                System.out.println("Vuelve a introducirla cantidad de objetos");
            }
        }
    }
}
