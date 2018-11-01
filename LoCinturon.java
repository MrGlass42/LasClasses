package Pacote;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Mr.Glass...
 */
public abstract class LoCinturon 
{
    private final static Scanner in = new Scanner(System.in);
    
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
    
    
}
