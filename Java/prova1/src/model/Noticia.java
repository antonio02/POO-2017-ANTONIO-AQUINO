
package model;

class Noticia {
    
    private long id;
    private String titulo;
    private String texto;
    private String resumo;
    private Area area;

    public Noticia(String titulo, String texto, String resumo, Area area) {
        this.titulo = titulo;
        this.texto = texto;
        this.resumo = resumo;
        this.area = area;
    }

    public long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTexto() {
        return texto;
    }

    public String getResumo() {
        return resumo;
    }

    public Area getArea() {
        return area;
    }
    
    
    
}
