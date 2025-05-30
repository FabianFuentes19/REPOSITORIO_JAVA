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
        } else if (imc < 24.9) {
            return "Peso normal";
        } else if (imc < 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }
    }
}
