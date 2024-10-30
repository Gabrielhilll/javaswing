import javax.swing.*;

public class Mainform {
    private JTextField txtNome;
    private JButton validarButton;
    private JLabel txtresultado;
    private JPanel mainPanel;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Minha primeira tela");
        frame.setContentPane(new Mainform().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Ajusta minha TV do tamanho do meu painel
        frame.pack();
        //frame.setSize(500, 500);
        //ligar TV
        frame.setVisible(true);
    }

}
