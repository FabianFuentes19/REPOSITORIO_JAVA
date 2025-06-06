public class Persona {

    private String nombre;
    private double altura;
    private double peso;

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String clasificarIMC(){

        double imc = calcularIMC();
        if (imc < 18.5) {
            return "Bajo peso";
        } else if (imc>=18.5 && imc <= 24.9) {
            return "Peso normal";
        } else if (imc>=25 && imc <= 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }



}
