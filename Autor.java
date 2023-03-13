public class Autor {
    private String nome;
    private String email;
    private String cpf;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    void mostrarDetalhesAutor() {
        System.out.println("-".repeat(35));
        System.out.println("Informações do Autor");
        System.out.println("Autor: " + getNome());
        System.out.println("Emai do autor: " + getEmail());
        System.out.println("cpf: " + getCpf());
    }
}
