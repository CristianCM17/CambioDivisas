
import javax.swing.JOptionPane;

public class Menus {

    Conversion con = new Conversion();
    double dinero;

    public void Menu() {
        Object[] opciones = {"Dolar", "Euro", "Yen", "Won Coreano"};

        int eleccion = JOptionPane.showOptionDialog(null, "Elige la divisa que quieras cambiar", "Monedas", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        switch (eleccion) {
            case JOptionPane.YES_OPTION:
                dinero = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el dinero"));
                JOptionPane.showMessageDialog(null, "Son: $" + con.cambioPesoDolar(dinero) + " Dolares");
                MenuSalida();
                break;
            case JOptionPane.NO_OPTION:
                dinero = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el dinero"));
                JOptionPane.showMessageDialog(null, "Son: $" + con.cambioPesoEuro(dinero) + " Euros");
                MenuSalida();
                break;
            case JOptionPane.CANCEL_OPTION:
                dinero = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el dinero"));
                JOptionPane.showMessageDialog(null, "Son: $" + con.cambioPesoYen(dinero) + " Yenes");
                MenuSalida();
                break;
            case 3:
                dinero = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el dinero"));
                JOptionPane.showMessageDialog(null, "Son: $" + con.cambioPesoWon(dinero) + " Wones");
                MenuSalida();
                break;

        }

    }

    public void MenuSalida() {

        Object[] opciones = {"Si", "No"};

        int eleccion = JOptionPane.showOptionDialog(null, "Deseas Continuar?", "Monedas", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        if (eleccion == JOptionPane.YES_OPTION) {

            Menu();

        } else if (eleccion == JOptionPane.NO_OPTION) {
            System.exit(0);
        }

    }
}
