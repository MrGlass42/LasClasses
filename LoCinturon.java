import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Mr.Glass...
 */
public abstract class LoCinturon 
{
    private final static Scanner in = new Scanner(System.in);
    
    public abstract void Cadastrar(LoCinturon objeto);
    
    public abstract void Alterar(LoCinturon objeto);
    
    public abstract void Excluir(LoCinturon objeto);
    
    public abstract void Exibir(LoCinturon objeto);
    
    
    
    public static boolean SimOuNao(String $mensagem ,boolean $in)
    {
        int $opcao = 0;
        
        if($in)
        {
            JOptionPane.showInputDialog($mensagem + "\n\n1 - Sim\n2 - Não");
            if($opcao == 1)
                return true;
        }
        else
        {
            System.out.print("\n\n" + $mensagem + "\n\n1 - Sim\n2 - Nao\n\nDigite: ");
            if($opcao == 1)
                return true;
        }
        
        return false;
    }
    
    
    public void menuCrud(LoCinturon $objeto, boolean $in)
    {
        int $opcao = 0, $x = 0;
        
        String cabecalho = "\n\nMenu Crud\n\n1 - Cadastrar\n2 - Exibir\n3 - Excluir\n4 - Alterar"
                        + "5 - Sair\n\nDigite: ";
        
        do
        {
            if($in)
            {
                LaConsistencia.consisteNumero(cabecalho, 0, $in);
            }
            else
            {
                System.out.print("\n\nMenu Crud\n\n1 - Cadastrar\n2 - Exibir\n3 - Excluir\n4 - Alterar"
                        + "5 - Sair\n\nDigite: ");
                $opcao = LaConsistencia.consisteNumero(cabecalho,0, $in);
            }
            switch($opcao)
            {
                case 1:
                    $objeto.Cadastrar($objeto);
                    break;
                case 2:
                    $objeto.Exibir($objeto);
                    break;
                case 3:
                    $objeto.Excluir($objeto);
                    break;
                case 4:
                    $objeto.Alterar($objeto);
                    break;
                case 5:
                    $x = 42;
                    break;
                default: System.out.print("\n\nOpção Inválida !!!");
            }
        }while($x != 42);
    }
    
}

        
        do
        {
            System.out.print("\n\nMenu Crud\n\n1 - Cadastrar\n2 - Exibir\n3 - Excluir\n4 - Alterar"
                    + "5 - Sair\n\nDigite: ");
            $opcao = in.nextInt();


            switch($opcao)
            {
                case 1:
                    $objeto.Cadastrar($objeto);
                    break;
                case 2:
                    $objeto.Exibir($objeto);
                    break;
                case 3:
                    $objeto.Excluir($objeto);
                    break;
                case 4:
                    $objeto.Alterar($objeto);
                    break;
                case 5:
                    $x = 42;
                    break;
                default: System.out.print("\n\nOpção Inválida !!!");
            }
        }while($x != 42);
    }
    
}
