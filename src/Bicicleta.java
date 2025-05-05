public class Bicicleta {

    private String marca;
    private String serial;
    private String modelo;

    public Bicicleta(String marca, String modelo, String serial) {
        this.marca = marca;
        this.modelo = modelo;
        this.serial = serial;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
}
