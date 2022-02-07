package segregacioninterfaz;

public class CarroElectrico implements Vehiculo {
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
        throw new UnsupportedOperationException("Los carros electricos no llenan tanque");
    }

    @Override
    public void despegar() {
        throw new UnsupportedOperationException("Los carros electricos no despegan");
    }

    @Override
    public void aterrizar() {
        throw new UnsupportedOperationException("Los carros electricos no aterrizan");
    }

    @Override
    public void cargar() {

    }
}
