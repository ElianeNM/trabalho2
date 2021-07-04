package tp02;
//Eliane Nunes Martins
import java.util.Scanner; 

public class Main {
    
    public static void main(String[] args) {
         //instanciando... 
         Aluno aluno1 = new Aluno();
         Disciplina disciplina = new Disciplina();
         
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Por favor digite um nome: ");
         String a = sc.nextLine();
         aluno1.mudaNome(a);
         
         System.out.println("Por favor digite uma id: ");
         int b = sc.nextInt();
         aluno1.mudaId(b);
         //alterando as notas pra 3.5 e 6.5
         aluno1.nota1 = 3.5;
         aluno1.nota2 = 6.5;
         //imprime o valor da média invocando o método retorna média 
         System.out.println("Média do aluno é: "+ aluno1.retornaMedia());
         //o aluno passou ou não
         if (aluno1.passou()) {
             System.out.println("O aluno foi aprovado por média.");
         } 
         else {
             System.out.println("O aluno não foi aprovado por média.");
         }
         
         System.out.println("Preenchendo array...");
         disciplina.preencheArray();
         disciplina.coletaMedia();
        
         System.out.println("Digite uma id de 1 a 10 para imprimir o antecessor e o sucessor.");
         int c = sc.nextInt();
         disciplina.antesDepois(c);
         
    }
    
}

