package view;

import javax.swing.*;
import java.awt.*;

public class TelaMercadoria extends JFrame { 
    
    //aqui colocamos os atributos que iremos utilizar para montarmos nossa tela

    //atributos para montagem dos labels
    private JFrame frm = new JFrame("Mercadoria");
    private JLabel lbl1 = new JLabel("Digite os dados da mercadoria: ");
    private JLabel lbl2 = new JLabel("Nome:");
    private JLabel lbl3 = new JLabel("Identificador:");
    private JLabel lbl4 = new JLabel("Valor:  R$");
    private JLabel lbl5 = new JLabel("Descrição:");
    private JLabel lbl6 = new JLabel("Data de validade:");
    private JLabel lbl7 = new JLabel("Fornecedor:");

    //atributos para os campos de texto
    private JTextField txt1 = new JTextField();
    private JTextField txt2 = new JTextField();
    private JTextField txt3 = new JTextField();
    private JTextArea txt4 = new JTextArea(5, 5);
    private JTextField txt5 = new JTextField();
    private JTextField txt6 = new JTextField();

    //botões
    private JButton btn4 = new JButton("Salvar");
    private JButton btn5 = new JButton("Excluir");

    //método construtor que irá gerar nossa tela
    public TelaMercadoria(){

        //aqui setamos as medidas e as posições de nossos labels
        lbl1.setFont(new Font("Arial", Font.BOLD, 15));
        lbl1.setBounds(30, 20, 250, 25);
        lbl2.setBounds(30, 60, 200, 25);
        lbl3.setBounds(30, 100, 200, 25);
        lbl4.setBounds(30, 140, 200, 25);
        lbl5.setBounds(30, 180, 200, 25);
        lbl6.setBounds(30, 230, 200, 25);
        lbl7.setBounds(30, 270, 200, 25);

        //medidas e posições dos botões
        btn4.setBounds(30, 330, 100, 30);
        btn5.setBounds(190, 330, 100, 30);
     

        //campos de texto
        txt1.setPreferredSize(new Dimension(300, 25));
        txt1.setBounds(80, 60, 100, 25);
        txt2.setPreferredSize(new Dimension(300, 25));
        txt2.setBounds(110, 100, 160, 25);
        txt3.setPreferredSize(new Dimension(300, 25));
        txt3.setBounds(90, 140, 160, 25);
        txt4.setBounds(100, 180, 160, 40);
        txt5.setPreferredSize(new Dimension(300, 25));
        txt5.setBounds(130, 230, 160, 25);
        txt6.setPreferredSize(new Dimension(300, 25));
        txt6.setBounds(110, 270, 160, 25);
        
        
        frm.setLayout(null);
        
        //aqui adicionamos todos os elementos em nosso JFrame
        frm.add(lbl1);
        frm.add(lbl2);
        frm.add(lbl3);
        frm.add(lbl4);
        frm.add(lbl5);
        frm.add(lbl6);
        frm.add(lbl7);
        frm.add(txt1);
        frm.add(txt2);
        frm.add(txt3);
        frm.add(txt4);
        frm.add(txt5);
        frm.add(txt6);
        frm.add(btn4);
        frm.add(btn5);



        //aqui configuramos o nosso JFrame
        frm.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frm.setVisible(true);
        frm.setLocationRelativeTo(null); 
        frm.setSize(350, 430);     
    }

    public static void main(String[] args) {
        new TelaMercadoria().setVisible(true);
    }
}
