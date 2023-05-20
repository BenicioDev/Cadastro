public class Usuario {
    private String nome;
    private String email;
    private int senha;

    public Usuario(String nome, String email, int senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getEmail(){return email;}
    public void setEmail(String email) {this.email = email;}
    public int senha(){return senha;}
    public void setSenha (int senha) {this.senha = senha;}


    public String toString() {
        return "Nome: " + nome + ", Email: " + email + ", Senha: " + senha;
    }
}
