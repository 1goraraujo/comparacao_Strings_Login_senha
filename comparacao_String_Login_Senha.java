package comparacao_strings;


public class comparacao_String_Login_Senha {
    public static void main(String[] args) {
        //declaração variaveis
        String nameUsuario;
        String senhaUsuario;

        //abertura teclado
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite 1 para Cadastro");
        int cadastro = teclado.nextInt();
        System.out.println("Digite 2 para Login");
        int login = teclado.nextInt();
        
        System.out.println("REALIZE SEU CADASTRO");
        System.out.println("Digite seu Nome: ");
        nameUsuario = teclado.nextLine();
        System.out.println("Digite seu Senha: ");
        senhaUsuario = teclado.nextLine();

        //tela de login e variaveis para testes    
        System.out.println("----------FAÇA SEU LOGIN----------");
        String name;
        String senha;
        System.out.println("Digite seu Login: ");
        name = teclado.nextLine();
        System.out.println("Digite sua Senha: ");
        senha = teclado.nextLine();

        //decisão e exibindo resultados
        if (name.equals(nameUsuario) && senha.equals(senhaUsuario)) {
            System.out.println("Bem-vindo, usuário logado!");
        } else {
            System.out.println("Nome de usuário e senha invalidos!!");
        }
        teclado.close();
    }
}
               
    

