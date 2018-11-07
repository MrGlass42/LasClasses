import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ANCAP...
 */
// Classe Responsavel por fazer a consistencia de dados digitados...


public class LaConsistencia 
{
    private static final Scanner entrada = new Scanner(System.in);

    /**
     * Texto não nulo, sem dígitos no início e sem caracteres especiais
     *
     * @param cabecalho - cabeçalho que será exibido no JOptionPane
     * @param in = True - Entrada com JOption Pane in = False - Entrada com
     * Scanner
     * @return texto
     */
    public static String consisteString(String cabecalho, boolean in) 
    {
        String texto;
        
        if (in) 
        {
            do 
            {
                texto = JOptionPane.showInputDialog(cabecalho);
            } while (texto.trim().isEmpty() || texto.matches("\\d+"));
        } 
        else 
        {
            do 
            {
                System.out.print("\n\n" + cabecalho);
                texto = entrada.nextLine();
                
                System.out.print("\n\nInformação salva, aperte enter para continuar...");
                entrada.nextLine();
            } while (texto.trim().isEmpty() || texto.matches("\\d+"));
        }

        return texto;
    }

    /**
     * Texto não nulo
     *
     * @param cabecalho - cabeçalho que será exibido no JOptionPane
     * @param in = True - Entrada com JOption Pane in = False - Entrada com
     * Scanner
     * @return texto
     */
    public static String consisteStringSpecial(String cabecalho, boolean in) 
    {
        String texto;

        if (in) 
        {
            do 
            {
                texto = JOptionPane.showInputDialog(cabecalho);
            } while (texto.trim().isEmpty());
        } 
        else 
        {
            do 
            {
                System.out.print("\n\n" + cabecalho);
                texto = entrada.next();
                
                System.out.print("\n\nInformação salva, aperte enter para continuar...");
                entrada.nextLine();
            } while (texto.trim().isEmpty());
        }
        return texto;
    }

    /**
     * Consiste numeros do tipo inteiro, excluindo qualquer tipo de caracter diferente de inteiros
     *Dentro de um intervalo de ValorMinimo e ValorMaximo
     *
     * @param cabecalho - cabeçalho que será exibido no JOptionPane
     * @param valorMaximo - limite maximo do valor
     * @param valorMinimo - limite minimo do valor
	 * @param in = True - Entrada com JOption Pane in = False - Entrada com
     * Scanner
     * @return valor
     */
	 
    public static int consisteNumero(String cabecalho, int valorMaximo, int valorMinimo, boolean in) 
    {
        int valor = 0;
        boolean erro;

        if (in) 
        {
            do 
            {
                erro = false;
                try 
                {
                    valor = Integer.valueOf(JOptionPane.showInputDialog(cabecalho));
                } 
                catch (NumberFormatException nfe) 
                {
                    erro = true;
                }
            } while (valor > valorMaximo || valor < valorMinimo || erro);
        }
        else 
        {
            do 
            {
                erro = false;
                try 
                {
                    System.out.println(cabecalho);
                    valor = entrada.nextInt();
                    
                    System.out.print("\n\nInformação salva, aperte enter para continuar...");
                    entrada.nextLine();

                } 
                catch (Exception nfe) 
                {
                    erro = true;
                }
            } while (valor > valorMaximo || valor < valorMinimo || erro);
        }
        return valor;
    }

    /**
     * Consiste numeros do tipo double, excluindo qualquer tipo de caracter diferente de pontos flutuantes
     * Dentro de um intervalo de ValorMinimo e ValorMaximo
     *
     * @param cabecalho - cabeçalho que será exibido no JOptionPane
     * @param valorMaximo - limite maximo do valor
     * @param valorMinimo - limite minimo do valor
     * @return valor
     */
    public static double consisteNumero(String cabecalho, double valorMaximo, double valorMinimo, boolean in) 
    {
        double valor = 0;
        boolean erro;

        if (in) 
        {
            do 
            {
                erro = false;
                try 
                {
                    valor = Double.valueOf(JOptionPane.showInputDialog(cabecalho));
                } 
                catch (NumberFormatException nfe) 
                {
                    erro = true;
                }
            } while (valor > valorMaximo || valor < valorMinimo || erro);
        } 
        else 
        {
            do 
            {
                erro = false;
                
                try 
                {
                    System.out.println(cabecalho);
                    valor = entrada.nextInt();
                    
                    System.out.print("\n\nInformação salva, aperte enter para continuar...");
                    entrada.nextLine();
                } 
                catch (Exception nfe) 
                {
                    erro = true;
                }
            } while (valor > valorMaximo || valor < valorMinimo || erro);
        }
        return valor;
    }

    /**
     * Consiste numeros do tipo double, excluindo qualquer tipo de caracter diferente de pontos flutuantes
     * com base em um ValorMinimo
     *
     * @param cabecalho - cabeçalho que será exibido no JOptionPane
     * @param valorMinimo - limite minimo do valor
     * @return valor
     */
    public static int consisteNumero(String cabecalho, int valorMinimo, boolean in) 
    {
        int valor = 0;
        boolean erro;
        
        if (in) 
        {
            do 
            {
                erro = false;
                try 
                {
                    valor = Integer.valueOf(JOptionPane.showInputDialog(cabecalho));
                } 
                catch (NumberFormatException nfe) 
                {
                    erro = true;
                }
            } while (valor < valorMinimo || erro);
        } 
        else 
        {
            do 
            {
                erro = false;
                try 
                {
                    
                    System.out.print("\n\n" + cabecalho);
                    
                    valor = entrada.nextInt();

                    System.out.print("\n\nInformação salva, aperte enter para continuar...");
                    entrada.nextLine();

                } 
                catch (Exception nfe) 
                {
                    erro = true;
                }
            } while (valor < valorMinimo || erro);
        }
        return valor;
    }

    /**
     * Consiste numeros do tipo double, excluindo qualquer tipo de caracter diferente de pontos flutuantes
     * com base em um ValorMinimo
     *
     * @param cabecalho - cabeçalho que será exibido no JOptionPane
     * @param valorMinimo - limite minimo do valor
     * @return valor
     */
    public static double consisteNumero(String cabecalho, double valorMinimo, boolean in) 
    {
        double valor = 0;
        boolean erro;

        if (in) 
        {
            do 
            {
                erro = false;
                try 
                {
                    valor = Double.valueOf(JOptionPane.showInputDialog(cabecalho));
                } 
                catch (NumberFormatException nfe) 
                {
                    erro = true;
                }
            } while (valor < valorMinimo || erro);
        } 
        else 
        {
            do 
            {
            erro = false;
            try 
            {
                System.out.println(cabecalho);
                valor = entrada.nextInt();

                System.out.print("\n\nInformação salva, aperte enter para continuar...");
                entrada.nextLine();
            } catch (Exception nfe) 
            {
                erro = true;
            }
            } while (valor < valorMinimo || erro);
        }
        return valor;
    }
	/**
     * Consiste documentação sem dígitos
     * @param cabecalho - cabeçalho que será exibido no JOptionPane
     * @param tamanho - tamanho limite da String
     * @return 
     */
	public static String consisteDocumentacao (String cabecalho, int tamanho, boolean $in)
	{
        	String texto;
                
                if($in)
                {
                    do 
                    {
                            texto = JOptionPane.showInputDialog(cabecalho);
                    } while(texto.trim().isEmpty() || texto.matches("\\d+") || texto.length() > tamanho || texto.length() < tamanho);
                }
                else
                {
                    do 
                    {
                        System.out.print("\n\n" + cabecalho);
                        texto = entrada.next();
                        
                        System.out.print("\n\nInformação salva, aperte enter para continuar...");
                        entrada.nextLine();
                    } while(texto.trim().isEmpty() || texto.matches("\\d+") || texto.length() > tamanho || texto.length() < tamanho);
                }
                return texto;
    	}
    
    /**
     * Consiste documentação com dígitos (RG, CPF, etc)
     * @param cabecalho - cabeçalho que será exibido no JOptionPane
     * @param tamanho - tamanho limite da String
     * @return 
     */
    public static String consisteDocumentacaoSpecial (String cabecalho, int tamanho, boolean $in) 
    {
        String texto;
        
        if($in)
        {
            do 
            {
                texto = JOptionPane.showInputDialog(cabecalho);
            } while(texto.trim().isEmpty() || texto.length() < tamanho || texto.length() > tamanho);
        }
        else
        {
            do 
            {
                System.out.print("\n\n" + cabecalho);
                texto = entrada.next();
                
                System.out.print("\n\nInformação salva, aperte enter para continuar...");
                entrada.nextLine();
            } while(texto.trim().isEmpty() || texto.length() < tamanho || texto.length() > tamanho);
        }
        return texto;
    }
}
