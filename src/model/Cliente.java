public class Cliente extends Pessoa{

    private int numero;

    public CLiente( String nome,
                    String sobrenome,
                    String dataNascimento,
                    int telefone,
                    int CPF,
                    String cidade,
                    String estado,
                    String pais,
                    String endereco,
                    int numero,
                    String dataCadastro,
                    String email,
                    String senha )
    {
        super( nome, sobrenome, dataNascimento, telefone, CPF, cidade, estado, pais, endereco, dataCadastro, email, senha);
        this.numero = numero;
    }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

}
