package modelos;

import java.util.Locale;
import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

@Entity
public class Data {
    @Id long id;
    private int dia;
    private int mes;
    private int ano;

    public Data() {
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    void setData(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    int compareTo(Data data){
        if(this.ano > data.ano){
            return 1;
        } else if(this.ano < data.ano){
            return -1;
        } else {
            if(this.mes > data.mes){
                return 1;
            } else if (this.mes < data.mes){
                return -1;
            } else {
                if(this.dia > data.dia){
                    return 1;
                } else if(this.dia < data.dia){
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }

    @Override
    public String toString() {
        return String.format(Locale.getDefault(), "%s/%s/%d",
                ((dia < 10)? "0"+dia:""+dia),((mes < 10)? "0"+mes:""+mes), ano);
    }

    int getDia() {
        return dia;
    }

    int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
}
