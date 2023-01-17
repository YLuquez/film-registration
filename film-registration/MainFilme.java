import java.util.ArrayList;
import java.util.Scanner;

public class MainFilme {
    public static void main(String[] args) {
        ArrayList<Filme> filmes = new ArrayList<Filme>();
        Scanner sc = new Scanner(System.in);

        // Cadastrando filmes
        String opcao;
        do {
            System.out.println("Deseja cadastrar um filme? (s/n)");
            opcao = sc.nextLine();

            if (opcao.equals("s")) {
                System.out.print("Título: ");
                String titulo = sc.nextLine();
                System.out.print("Descrição: ");
                String descricao = sc.nextLine();

                System.out.print("Nome do diretor: ");
                String nomeDiretor = sc.nextLine();
                System.out.print("Tempo de experiência do diretor (em anos): ");
                int tempoExperiencia = sc.nextInt();
                sc.nextLine(); // Consumindo quebra de linha
                System.out.print("Local de origem do diretor: ");
                String localOrigem = sc.nextLine();

                Diretor diretor = new Diretor(nomeDiretor, tempoExperiencia, localOrigem);

                System.out.print("Duração em minutos: ");
                int duracaoEmMinutos = sc.nextInt();
                sc.nextLine(); // Consumindo quebra de linha

                Filme filme = new Filme(titulo, descricao, diretor, duracaoEmMinutos);
                filmes.add(filme);
            }
        } while (opcao.equals("s"));

        // Buscando filme por título
        System.out.print("Informe o título do filme para busca: ");
        String tituloBuscado = sc.nextLine();
        Filme filmeEncontrado = null;
        for (Filme filme : filmes) {
            filmeEncontrado = filme.buscarPorTitulo(tituloBuscado);
            if (filmeEncontrado != null) {
                break;
            }
        }
        if (filmeEncontrado != null) {
            System.out.println("Filme encontrado:");
            filmeEncontrado.exibirDados();
        } else {
            System.out.println("Filme não encontrado");
        }

        // Exibindo título e duração de cada filme
        for (Filme filme : filmes) {
            System.out.println("Título: " + filme.getTitulo());
            filme.exibirDuracaoEmHoras();
        }
    }
}
