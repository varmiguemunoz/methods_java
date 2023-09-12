public class methodReturn{

    private int suma;
    private int resta;
    private int divicion;
    private int multiplicacion;

    public methodReturn(int suma, int resta, int divicion, int multiplicacion) {
        this.suma = suma;
        this.resta = resta;
        this.divicion = divicion;
        this.multiplicacion = multiplicacion;
    }

    public int suma(int a, int b) {
        suma = a + b;
        return suma;
    }

    public int resta(int a, int b) {
        resta = a - b;
        return resta;
    }

    public int divicion(int a, int b) {
        divicion = a / b;
        return divicion;
    }

    public int multiplicacion(int a, int b) {
        multiplicacion = a * b;
        return multiplicacion;
    }

}
