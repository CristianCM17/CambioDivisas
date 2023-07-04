
import javax.swing.JOptionPane;

public class Conversion {

    private double conversion;

    public double cambioPesoDolar(double dinero) {
        //int eleccion = intercambio.Menu();

        this.conversion = dinero / 17.06;

        return this.conversion;

    }

    public double cambioPesoEuro(double dinero) {
        // int eleccion = intercambio.Menu();

        this.conversion = dinero / 18.63;

        return this.conversion;

    }

    public double cambioPesoYen(double dinero) {
        // int eleccion = intercambio.Menu();

        this.conversion = dinero / 0.12;

        return this.conversion;

    }

    public double cambioPesoWon(double dinero) {
        //  int eleccion = intercambio.Menu();

        this.conversion = dinero / 0.013;

        return this.conversion;

    }

}
