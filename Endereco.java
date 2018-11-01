package Pacote;

/**
 *
 * @author Mr.Glass...
 */
public class Endereco 
{
    private String Logradouro;
    private String Bairro;
    private String Numero;
    private String Estado;
    private String Cidade;
    private String CEP;
    
    
    public void Cadastrar()
    {
        this.Logradouro = LaConsistencia.consisteString("\n\nDigite o Logradouro: ", false);
        this.Bairro = LaConsistencia.consisteString("\n\nDigite o Bairro: ", false);
        this.Estado = LaConsistencia.consisteString("\n\nDigite o Estado: ", false);
        this.Numero = LaConsistencia.consisteString("\n\nDigite o Numero: ", false);
        this.Cidade = LaConsistencia.consisteString("\n\nDigite a Cidade: ", false);
        this.CEP = LaConsistencia.consisteString("\n\nDigite a CEP: ", false);
    }
    
    public void Alterar()
    {   
        System.out.print("\n\nLogradouro Atual: " + this.Logradouro);
        if(LoCinturon.SimOuNao("Deseja Alterar?", false))
            this.Logradouro = LaConsistencia.consisteString("\n\nDigite :", false);
        
        System.out.print("\n\nBairro Atual: " + this.Bairro);
        if(LoCinturon.SimOuNao("Deseja Alterar?", false))
            this.Bairro = LaConsistencia.consisteString("\n\nDigite :", false);
        
        System.out.print("\n\nEstado Atual: " + this.Estado);
        if(LoCinturon.SimOuNao("Deseja Alterar?", false))
            this.Estado = LaConsistencia.consisteString("\n\nDigite :", false);
        
        System.out.print("\n\nNumero Atual: " + this.Numero);
        if(LoCinturon.SimOuNao("Deseja Alterar?", false))
            this.Numero = LaConsistencia.consisteString("\n\nDigite :", false);
        
        System.out.print("\n\nCidade Atual: " + this.Cidade);
        if(LoCinturon.SimOuNao("Deseja Alterar?", false))
            this.Cidade = LaConsistencia.consisteString("\n\nDigite :", false);
        
        System.out.print("\n\nCEP Atual: " + this.CEP);
        if(LoCinturon.SimOuNao("Deseja Alterar?", false))
            this.CEP = LaConsistencia.consisteString("\n\nDigite :", false);
    }

    public void Exibir()
    {
        System.out.print("\n\nExibindo o Endereço Selecionado...");
        System.out.print("\n\nLogradouro: " + this.Logradouro);
        System.out.print("\n\nBairro: " + this.Bairro);
        System.out.print("\n\nNumero: " + this.Numero);
        System.out.print("\n\nEstado: " + this.Estado);
        System.out.print("\n\nCidade: " + this.Cidade);
        System.out.print("\n\nCEP: " + this.CEP);
        
        System.out.print("\n---------------------------------------");
    }
    
    public String getLogradouro() 
    {
        return Logradouro;
    }

    public void setLogradouro(String Logradouro) 
    {
        this.Logradouro = Logradouro;
    }

    public String getBairro() 
    {
        return Bairro;
    }

    public void setBairro(String Bairro) 
    {
        this.Bairro = Bairro;
    }

    public String getNumero() 
    {
        return Numero;
    }

    public void setNumero(String Numero) 
    {
        this.Numero = Numero;
    }

    public String getEstado() 
    {
        return Estado;
    }

    public void setEstado(String Estado) 
    {
        this.Estado = Estado;
    }

    public String getCidade() 
    {
        return Cidade;
    }

    public void setCidade(String Cidade) 
    {
        this.Cidade = Cidade;
    }

    public String getCEP() 
    {
        return CEP;
    }

    public void setCEP(String CEP) 
    {
        this.CEP = CEP;
    }
}
