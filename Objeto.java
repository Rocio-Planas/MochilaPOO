

public class Objeto {
    private double valor;
    private double peso;
    private Double variableDecision;

    public Objeto(double valor, double peso) {
        this.valor = valor;
        this.peso = peso;
        this.variableDecision = this.valor/this.peso;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Double getVariableDecision() {
        return variableDecision;
    }

    public void setVariableDecision(double variableDecision) {
        this.variableDecision = variableDecision;
    }
}
