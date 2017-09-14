package examen1_Solano_Tinajero_Luis_Emmanuel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Convertidor extends JFrame implements ActionListener
{
	JTextField numeros;
	JButton borrar, convertir;
	
	public Convertidor()
	{
		configurarVentana();
		iniciarComponentes();
	}
	public void configurarVentana()
	{
		setSize(500,500);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
	}
	public void iniciarComponentes()
	{
		numeros=new JTextField();
		numeros.setBounds(50,50,400,50);
		add(numeros);
		
		borrar=new JButton("borrar");
		borrar.setBounds(50,100,100,100);
		borrar.addActionListener(this);
		add(borrar);
		
		convertir=new JButton("convertir");
		convertir.setBounds(50,250,100,100);
		convertir.addActionListener(this);
		add(convertir);
	}

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getActionCommand().equals("borrar"))
      {
          if(numeros.getText()=="")
		  {
            JOptionPane.showMessageDialog(this,"Error, introduzca valor","Error",JOptionPane.ERROR_MESSAGE);
		  }
		  else
          numeros.setText("");
      }
	else 
          if(e.getActionCommand().equals("convertir"))
          {
              String texto=numeros.getText();
               float text=Float.parseFloat(texto);
               float resultado=text/19;
               numeros.setText(String.valueOf(resultado));
               
               
          }
    }
	
	
}