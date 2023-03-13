public class Livro {
    private String nome;
    private String descricao;
    private double valor;
    private String isbn; //isbn (um número de identificação, International Standard Book Number)
    private Autor autor;
    private boolean impresso;


    public void mostrarDetalhes() {
        System.out.println("\n"+"=".repeat(45));
        System.out.println("Detalhes do livro:");
        System.out.println("Nome: "+ nome);
        System.out.println("Descrição: "+ descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        if (this.temAutor()){
           autor.mostrarDetalhesAutor();
        } else {
            System.out.println("-".repeat(35));
            System.out.
                    println("Sem infomações do autor");
        }
        System.out.println("=".repeat(45));

    }

    boolean aplicarDescontoDe (double percentual){
        if (percentual > 0.3) {
            return false;
        }
        this.valor -= this.valor * percentual;
        return true;

    }

    boolean temAutor() {
       return this.autor != null;
    }

    //contructor
    public Livro (Autor autor) {
        this.autor = autor;
        this.isbn = "000-00-00000-00-0";
        this.impresso = true;
    }




    //Getters e seters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
