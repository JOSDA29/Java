import javax.swing.JOptionPane;

public class PrecioCompra {
	public static void main(String Josda[]) {
		double precio, precioFinal;
		final double descuento=0.1;
		
		precio= Double.parseDouble(JOptionPane.showInputDialog("¿Cual es el precio de su compra?"));
		if(precio >= 50000) {
			precioFinal= precio-(precio*descuento);
			JOptionPane.showInternalMessageDialog(null, "El precio total de su compra es: $"+precioFinal, "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showInternalMessageDialog(null, "El descuento no aplica a productos con un precio menor a $50.000", "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
