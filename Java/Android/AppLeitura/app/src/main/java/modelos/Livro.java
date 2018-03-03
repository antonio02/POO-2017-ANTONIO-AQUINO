package modelos;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToOne;

/**
 * Created by antonio on 12/02/18.
 */
@Entity
public class Livro {

    @Id long id;
    ToOne<Usuario> dono;
    private String nome;
    private String autor;
    private int ano;
    private int totalPaginas;
    private int paginasLidas;
    private String avaliacao;
    private String statusLeitura;
    ToOne<Data> dataInicio;
    ToOne<Data> dataTermino;
    private String errors;



    public Livro() {
    }

    public Livro(String nome, String autor, int ano, int totalPaginas, int paginasLidas, String avaliacao) {
        this.nome = nome;
        this.autor = autor;
        this.ano = ano;
        this.totalPaginas = totalPaginas;
        this.paginasLidas = paginasLidas;
        this.avaliacao = avaliacao;
    }

    public List<String> getPossiblesStatus(){
        List<String> strings = new ArrayList<>();
        if(dataInicio.isNull() && dataTermino.isNull()){
            strings.add("Desejo");
            return strings;
        } else if (!dataInicio.isNull() && dataTermino.isNull()){
            strings.add("Lendo");
            strings.add("Desisti");
            return strings;
        } else if (!dataInicio.isNull() && !dataTermino.isNull()){
            strings.add("Lido");
            return strings;
        }
        return strings;
    }

    public void preencherLivro(String nome, String autor, int ano, int totalPagias,
                               int paginasLidas, String avaliacao, String status) {
        this.nome = nome;
        this.autor = autor;
        this.ano = ano;
        this.totalPaginas = totalPagias;
        this.paginasLidas = paginasLidas;
        this.avaliacao = avaliacao;
        this.statusLeitura = status;
    }

    public String getErrors() {
        return errors;
    }

    public String getStatusLeitura() {
        return statusLeitura;
    }

    public boolean setDataTermino(Data dataTermino) {
        if(dataTermino == null){
            this.dataTermino.setTarget(null);
            return true;
        }
        Calendar c = Calendar.getInstance();
        Data dataAtual = new Data();
        dataAtual.setData(c.get(Calendar.DAY_OF_MONTH),
                c.get(Calendar.MONTH)+1, c.get(Calendar.YEAR));
        if(dataAtual.compareTo(dataTermino) < 0){
            this.errors = "Data invalida";
            return false;
        }
        if(this.dataInicio.getTarget() != null) {
            if (dataTermino.compareTo(this.dataInicio.getTarget()) >= 0) {
                this.dataTermino.setTarget(dataTermino);
                this.statusLeitura = "Lido";
                return true;
            } else {
                this.errors = "Data menor que a de inicio";
                return false;
            }
        } else {
            this.errors = "Data de Inicio não colocada";
            return false;
        }
    }

    public boolean setDataInicio(Data dataInicio) {
        if(dataInicio == null){
            this.dataInicio.setTarget(null);
            this.dataTermino.setTarget(null);
            return true;
        }
        Calendar c = Calendar.getInstance();
        Data dataAtual = new Data();
        dataAtual.setData(c.get(Calendar.DAY_OF_MONTH),
                c.get(Calendar.MONTH)+1, c.get(Calendar.YEAR));
        if(dataInicio.getAno() < ano){
            this.errors = "Data de inicio menor que a de publicação";
            return false;
        }
        if(dataAtual.compareTo(dataInicio) >= 0){
            this.dataInicio.setTarget(dataInicio);
            this.statusLeitura = "Lendo";
            return true;
        } else {
            this.errors = "Data invalida";
            return false;
        }
    }

    public boolean setPaginasLidas(int paginasLidas) {
        if (paginasLidas > totalPaginas) {
            this.errors = "Numero maior que o total de paginas";
            return false;
        } else if (totalPaginas < 0) {
            this.errors = "O número de paginas não pode ser negativo";
            return false;
        }
        this.paginasLidas = paginasLidas;
        return true;

    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public int getPaginasLidas() {
        return paginasLidas;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public String getDataInicio() {
        return (dataInicio.isNull())? null: dataInicio.getTarget().toString();
    }

    public String getDataTermino() {
        return (dataTermino.isNull())? null: dataTermino.getTarget().toString();
    }

    public long getId() {
        return id;
    }
}
