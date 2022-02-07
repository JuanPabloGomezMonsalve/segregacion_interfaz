package segregacioninterfaz;

public class Moto implements Vehiculo {
    @Override
    public void encender() {

    }

    @Override
    public void apagar() {

    }

    @Override
    public void acelerar() {

    }

    @Override
    public void frenar() {

    }

    @Override
    public void llenarTanque() {

    }

    @Override
    public void despegar() {
        throw new UnsupportedOperationException("Las motos no despegan");
    }

    @Override
    public void aterrizar() {
        throw new UnsupportedOperationException("Las motos no aterrizan");
    }

    @Override
    public void cargar() {
        throw new UnsupportedOperationException("Las motos no cargan");
    }
}
