public class Main {

  public static void main(String[] args) {

    String nomePessoa = "Nicolas";
    String nomeDisciplina = "Programação";
    Integer idade = 30;
    double peso = 60.53;
    double saldoNaConta = 500.123456;
    String descricaoFormatada = String.format("Nome: %s - idade: %d - peso: %.2f - saldo na conta: %.2f - Disciplina: %s - agora vou pular linha: %n esse texto deve estar na linha dbaixo", nomePessoa, idade, peso, saldoNaConta, nomeDisciplina);
    String textoQuebrandoLinha =
        """
        Esse texto, foi gerado com Text Block,
        que representa em código 3 aspas, eu posso colocar
        o que eu quiser aqui dentro e vai sair formatado, aqui vai uma estrutura json por exemplo: 
            {
              "nome": "Nicolas",
              "idade": 30
            }
        """;

    System.out.println();
    System.out.println("=== Text Block ===");
    System.out.println();
    System.out.println(textoQuebrandoLinha);
    System.out.println("=== String.format ===");
    System.out.println();
    System.out.println(descricaoFormatada);


  }
}
