import futbol.Jugador;
import futbol.Portero;
import org.w3c.dom.ls.LSOutput;

public class Ejecutar {
    public static void main(String[] args) {
        Portero f = new Portero("Santiago", 23, (short) 6, (byte) 8);
        String  comp = "El futbolista Santiago tiene 23, y juega de Portero con el dorsal 8. Le han marcado 6";
        boolean ok = false;
        if (f.toString().equals(comp)) {
            ok = true;
        }
        System.out.println(f.toString());

    }


}
