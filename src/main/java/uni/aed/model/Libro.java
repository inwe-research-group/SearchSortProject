package uni.aed.model;

import java.util.Date;

public class Libro {

    private String name;

    private String author;

    private String isbn;

    private Date publicationDate;
    
    public Libro(){
            this("Desconocido");
    }
    public Libro(String autor){
            estableceAutor(autor);
    }
    public String obtenAutor(){
            return author;
    }
    public void estableceAutor(String autor){
            this.author=autor;
    }
}
