package Vista;

import Vista.Herramientas.colorMaker;
import Vista.Herramientas.windowMaker;

public class VentanaVentas extends windowMaker{
    private static final long serialVersionUID = 1L;
    
    public VentanaVentas(int width, int height, String rutaIconoAplicacion) {
        /**Constructor y personalizacion basica de la ventana */
        super(width, height, rutaIconoAplicacion);
        setTitle("Modulo de Facturacion - Ventas");
        setBackground(new colorMaker().obtainColor("grisEnfasisClaro"));
        /**Añadido de componentes */
        add(new PanelVentas().getPanel());
        //add(new PanelBuscarFactura().getPanel());
        add(new PanelBuscarCotizacion().getPanel());
        //add(new PanelNuevaFactura().getPanel());
        //add(new PanelNuevaCotizacion().getPanel());
        /**Ajuste de comportamiento */
        setLocationRelativeTo(null);
        setVisible(true);
    }

}