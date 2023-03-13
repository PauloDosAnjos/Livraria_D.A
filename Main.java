public class Main {
    public static void main (String[] args) {
        Livro livro1 = new Livro();
        livro1.setNome("Java 8 prático");
        livro1.setDescricao("Novos recursos da linguagem");
        livro1.setValor(59.90);
        livro1.setIsbn("978-85-66250-46-6");

        Autor autor1 = new Autor();
        autor1.setNome("Rodrigo Turini");
        autor1.setEmail("rodrigo.turini@caelum.com.br");
        autor1.setCpf("123.456.789-00");

        livro1.setAutor(autor1);

        livro1.mostrarDetalhes();


        Livro livro2 = new Livro();
        livro2.setNome("lógica de programação");
        livro2.setDescricao("crie seus primeiros programas");
        livro2.setValor(59.90);
        livro2.setIsbn("978-85-66250-22-0");

        livro2.mostrarDetalhes();


        Livro livro3 = new Livro();
        livro3.setNome("O Hobbit");
        livro3.setDescricao("Uma aventura no mundo da Terra-média");
        livro3.setValor(39.90);
        livro3.setIsbn("978-8595086086");

        Autor autor3 = new Autor();
        autor3.setNome("J.R.R. Tolkien");
        autor3.setEmail("jrrtolkien@gmail.com");
        autor3.setCpf("789.456.123-00");

        livro3.setAutor(autor3);

        livro3.mostrarDetalhes();
















    }
}

