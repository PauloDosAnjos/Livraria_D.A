public class Ebook extends Livro {
    private String watermark;


    //metodos


    boolean aplicarDescontoDe(double percentual) {
        if (percentual > 0.15) {
            return false;
        }
        this.setValor(this.getValor()*percentual);
        return true;


    }

    //constructor
    public Ebook (Autor autor) {
        super(autor);
    }

    //getters e setters
    public String getWatermark() {
        return watermark;
    }

    public void setWatermark(String watermark) {
        this.watermark = watermark;
    }
}
