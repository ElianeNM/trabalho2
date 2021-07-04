package tp02;
  
public class Aluno {
    //atributos da classe aluno
    protected String nome;
    private int id;
    private double media;
    protected double nota1;
    protected double nota2;
    //imprime nome
    public void mostraNome(){
        System.out.println("O nome é: " + this.nome);
    }
    //altera nome
    public void mudaNome(String nome) {
        this.nome = nome;
    }
    //imprime id
    public void mostraId() {
        System.out.println("O número id é: " + this.id);
    }
    //altera id
    public void mudaId(int id) {
        this.id = id;
    }
    //calcula media,método privado
    private void calculaMedia(){
        media = ((this.nota1 + this.nota2) / 2);
    }
    //retorna media
    public double retornaMedia(){
        calculaMedia();
        return this.media;
    }
    //passou true ou false
    public boolean passou() {
        if (media >= 7.0)
            return true;
        else
            return false;
                
    }
}
