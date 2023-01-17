public class Diretor {
    private String nome;
    private int tempoExperiencia;
    private String localOrigem;

    public Diretor(String nome, int tempoExperiencia, String localOrigem) {
        this.nome = nome;
        this.tempoExperiencia = tempoExperiencia;
        this.localOrigem = localOrigem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTempoExperiencia() {
        return tempoExperiencia;
    }

    public void setTempoExperiencia(int tempoExperiencia) {
        this.tempoExperiencia = tempoExperiencia;
    }

    public String getLocalOrigem() {
        return localOrigem;
    }

    public void setLocalOrigem(String localOrigem) {
        this.localOrigem = localOrigem;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Tempo de experiência: " + tempoExperiencia + " anos");
        System.out.println("Local de origem: " + localOrigem);
    }
}