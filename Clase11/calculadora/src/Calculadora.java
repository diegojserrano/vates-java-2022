import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;

public class Calculadora {

    private Map<String, DoubleBinaryOperator> calculos;

    public Calculadora() {
        calculos = new HashMap<>();

        calculos.put("+", (a, b) -> a + b);
        calculos.put("-", (a, b) -> a - b);
        calculos.put("*", (a, b) -> a * b);
        calculos.put("/", (a, b) -> a / b);
        calculos.put("^", (a, b) -> Math.pow(a, b));

    }

    public double calcular(String expresion) {

        Scanner sc = new Scanner(expresion);

        double x, y;

        x = sc.nextDouble();
        String op = sc.next();
        y = sc.nextDouble();

        //return calculos.get(op).calcular(x, y);
        return calculos.get(op).applyAsDouble(x, y);
    }

}
