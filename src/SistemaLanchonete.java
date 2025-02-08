import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Produto {
    int codigo;
    String descricao;
    double preco;
    String caminhoImagem;

    Produto(int codigo, String descricao, double preco, String caminhoImagem) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.caminhoImagem = caminhoImagem;
    }
}

public class SistemaLanchonete {
    public static void main(String[] args) {
        Map<Integer, Produto> produtos = new HashMap<>();

        produtos.put(1, new Produto(1, "Cachorro Quente", 4.00, "cachorro_quente.jpg"));
        produtos.put(2, new Produto(2, "X-Salada", 4.50, "x_salada.jpg"));
        produtos.put(3, new Produto(3, "X-Bacon", 5.00, "x_bacon.jpg"));
        produtos.put(4, new Produto(4, "Torrada Simples", 2.00, "torrada_simples.jpg"));
        produtos.put(5, new Produto(5, "Refrigerante", 1.50, "refrigerante.jpg"));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();
        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();

        if (produtos.containsKey(codigo)) {
            Produto produto = produtos.get(codigo);
            double total = produto.preco * quantidade;

            System.out.printf("Total: R$ %.2f\n", total);
            System.out.println("Produto selecionado: " + produto.descricao);
            System.out.println("Imagem do produto: " + produto.caminhoImagem);
        } else {
            System.out.println("Código de produto inválido!");
        }

        scanner.close();
    }
}
