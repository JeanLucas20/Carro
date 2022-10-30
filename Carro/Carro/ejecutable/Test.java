package ejecutable;
import controlador.Controlador;
import modelo.Carro;
import vista.VentanaPrincipal;
public class Test 

{
    public static void main(String[] args) 
    {
        Carro miModelo = new Carro();
        VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
        Controlador miControlador = new Controlador(miVentanaPrincipal, miModelo);    
    }
}
