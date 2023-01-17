import java.util.Scanner;

class Filme {
    private String titulo;
    private String descricao;
    private Diretor diretor;
    private int duracaoEmMinutos;

    // Construtores
    public Filme() {}
    public Filme(String titulo, String descricao, Diretor diretor, int duracaoEmMinutos) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.diretor = diretor;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    // Métodos getters e setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Diretor getDiretor() {
        return diretor;
    }
    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    // Método exibirDuracaoEmHoras
    public void exibirDuracaoEmHoras() {
        int horas = duracaoEmMinutos / 60;
        int minutos = duracaoEmMinutos % 60;
        System.out.println("O filme " + titulo + " possui " + horas + " horas e " + minutos + " minutos de duração");
    }

    // Método de comparação
    public Filme buscarPorTitulo(String titulo) {
        if (this.titulo.equals(titulo)) {
            return this;
        } else {
            return null;
        }
    }

    // Método de exibição
    public void exibirDados() {
        System.out.println("Título: " + titulo);
        System.out.println("Descrição: " + descricao);
        diretor.imprimir();
        exibirDuracaoEmHoras();
    }
}
