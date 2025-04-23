import java.util.*;

public class Mochila {
    private double capacidad;
    private List<Objeto> objetos;

    private double valorFinal = 0;
    private double pesoTotal = 0;
    public Mochila(double capacidad) {
        this.capacidad = capacidad;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }

    public void llenarMochila(List<Objeto> objetosLista){
        this.objetos = new ArrayList<>();
//        objetosLista.sort(Comparator.comparing(Objeto::getVariableDecision).reversed()); //ordena el obejto segun la variable decisión en orden descendente; :: significa obtener un método específico de una clase o instancia
        objetosLista.sort(Comparator.comparingDouble(Objeto::getVariableDecision).thenComparingDouble(Objeto::getValor).reversed());
        for (Objeto objeto : objetosLista) {
            if (objeto.getPeso() <= this.capacidad) {
                this.objetos.add(objeto);
                this.capacidad = this.capacidad - objeto.getPeso();
                this.valorFinal += objeto.getValor();
                this.pesoTotal += objeto.getPeso();
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder imprimir = new StringBuilder();
        for(int i = 0; i < this.objetos.size(); i++){
            imprimir.append("Objeto ").append(i + 1).append(" con valor de: ").append(this.objetos.get(i).getValor()).append(" y un peso de: ").append(this.objetos.get(i).getPeso());
            if((i+1) != this.objetos.size()) imprimir.append(", ");

        }
        imprimir.append(" ");
        return imprimir.toString();
    }

}
