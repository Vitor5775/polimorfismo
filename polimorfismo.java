// Classe base para formas geométricas
abstract class Forma {
    // Método abstrato para calcular a área
    public abstract double calcularArea();
}

// Subclasse representando um círculo
class Circulo extends Forma {
    private double raio;

    // Construtor
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Implementação do método para calcular a área de um círculo
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

// Subclasse representando um retângulo
class Retangulo extends Forma {
    private double largura;
    private double altura;

    // Construtor
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    // Implementação do método para calcular a área de um retângulo
    @Override
    public double calcularArea() {
        return largura * altura;
    }
}

// Classe principal para testar o polimorfismo
public class Main {
    public static void main(String[] args) {
        // Criando objetos de diferentes formas geométricas
        Forma forma1 = new Circulo(5.0);
        Forma forma2 = new Retangulo(4.0, 3.0);

        // Calculando e exibindo a área de cada forma
        System.out.println("Área do círculo: " + forma1.calcularArea());
        System.out.println("Área do retângulo: " + forma2.calcularArea());
    }
}
