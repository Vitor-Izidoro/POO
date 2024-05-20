public abstract class Pessoa {

    private String nome;
    private String sobrenome;
    private String dataNascimento;
    private int telefone;
    private int CPF;
    private String cidade;
    private String estado;
    private String pais;
    private String endereco;
    private String dataCadastro;
    private String email;
    private String senha;

    Public Pessoa ( String nome, 
                    String sobrenome, 
                    String dataNascimento, 
                    int telefone,
                    int CPF,
                    String cidade,
                    String estado,
                    String pais,
                    String endereco,
                    String dataCadastro,
                    String email,
                    String senha ){

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.CPF = CPF;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.endereco = endereco;
        this.dataCadastro = dataCadastro;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getSobrenome() { return sobrenome; }
    public void setSobrenome(String sobrenome) { this.sobrenome = sobrenome; }

    public String getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(String dataNascimento) { this.dataNascimento = dataNascimento; }

    public int getTelefone() { return telefone; }
    public void setTelefone(int telefone) { this.telefone = telefone; }

    public int getCPF() { return CPF; }
    public void setCPF(int CPF) { this.CPF = CPF; }

    public String getCidade() { return cidade; }
    public void setCidade(String cidade) { this.cidade = cidade; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getPais() { return pais; }
    public void setPais(String pais) { this.pais = pais; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    
    public String getDataCadastro() { return dataCadastro; }
    public void setDataCadastro(String dataCadastro) { this.dataCadastro = dataCadastro; }
    
}