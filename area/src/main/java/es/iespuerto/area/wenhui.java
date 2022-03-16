package es.iespuerto.area;

public class wenhui {

    String tipo;
    Integer valor1;
    Integer valor2;

    /**
     * Constructor sin parámetros
     */
    public wenhui(){

    }

    /**
     * Constructor con dos parámetros
     * @param tipo de la clase
     */
    public wenhui(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Constructor con dos parámetros
     * @param valor1 de la clase
     * @param valor2 de la clase
     */
    public wenhui(Integer valor1, Integer valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getValor1() {
        return valor1;
    }

    public void setValor1(Integer valor1) {
        this.valor1 = valor1;
    }

    public Integer getValor2() {
        return valor2;
    }

    public void setValor2(Integer valor2) {
        this.valor2 = valor2;
    }

    public void CalculoArea(double valor1, double valor2){

    }
}
