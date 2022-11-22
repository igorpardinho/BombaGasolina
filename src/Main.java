
import java.util.Scanner;
public class Main {

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                BombaCombustivel carro = new BombaCombustivel();

                System.out.println("Digite o valor do litro de combustivel: ");
                carro.alterarValor(sc.nextFloat());

                System.out.println("Digite o tipo de combustivel: ");
                carro.alterarCombustivel(sc.next());

                System.out.println("Digite quantos litros quer abastecer: ");
                System.out.println("Deu " + carro.abastecerPorLitro(sc.nextFloat()) + "R$");

                System.out.println("Digite quantos reais quer abastecer: ");
                System.out.println(carro.abastecerPorValor(sc.nextFloat()) + "Litros");

                System.out.println("Altere a quantidade de combustivel na bomba: ");
                System.out.println("Agora a bomba tem " +
                        carro.alterarQuantidadeCombustivel(sc.nextFloat()) + " Litros");

            }
}