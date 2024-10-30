import javax.swing.*;
import java.awt.event.ActionEvent;

public class Calculadora {
    private JTextField txtPrimeiroValor;
    private JTextField txtSegundoValor;
    private JButton btnSomar;
    private JTextField txtResultado;
    private JButton btnLimpar;
    private JPanel panelMain;


    public Calculadora() {

        btnSomar.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer primeiro= Integer.valueOf(txtPrimeiroValor.getText());
                Integer segundo= Integer.valueOf(txtSegundoValor.getText());


                Integer soma = primeiro + segundo;
                txtResultado.setText(soma.toString());

                System.out.println(primeiro);
                System.out.println(segundo);

            }
        });


    }



    public static void main(String[] args) {

        JFrame frame = new JFrame("Minha Calculadora");
        frame.setContentPane(new Calculadora().panelMain);
        frame.pack();
        frame.setSize(400,400);
        frame.setVisible(true);

    }
}
