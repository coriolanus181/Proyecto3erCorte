import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private String documento;
    private List<Bicicleta> bicicletas = new ArrayList<>();
    private String jornada;
    private double cobro;
    private int horas;

    public Persona(String documento, String nombre) {
        this.documento = documento;
        this.nombre = nombre;
    }

    public void registrarJornada(int tiempo){
        if (tiempo==1){
            this.jornada = "Diurna";
        }else if(tiempo==2){
            this.jornada= "Nocturna";
        }
    }

    public double getCobro() {
        return cobro;
    }

    public void setCobro(double cobro) {
        this.cobro = cobro;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public void valorTiempoJornada(){

    }

    public void registrarBicicleta (Bicicleta bicicleta){
        bicicletas.add(bicicleta);
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "bicicletas=" + bicicletas +
                ", nombre='" + nombre + '\'' +
                ", documento='" + documento + '\'' +
                '}';
    }
}
