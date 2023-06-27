package view;

import javax.swing.*;

import control.ControleDados;
import model.Dados;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TelaMercadoria extends JFrame { 

    ControleDados cd = new ControleDados();
    Dados dt = new Dados();
    
    //aqui colocamos os atributos que iremos utilizar para montarmos nossa tela

    //atributos para montagem dos labels
    private JFrame janelaMercadoria = new JFrame("Mercadoria");
    private JLabel lblDadosMercadoria = new JLabel("Digite os dados da mercadoria: ");
    private JLabel lblNomeMercadoria = new JLabel("Nome:");
    private JLabel lblIdMercadoria = new JLabel("Código:");
    private JLabel lblQntMercadoria = new JLabel("Quantidade: ");
    private JLabel lblValorMercadoria = new JLabel("Valor:  R$");
    private JLabel lblDataValidade = new JLabel("Data de validade:");
    private JLabel lblFornecedor = new JLabel("Fornecedor:");
    private JLabel lblPerecivel = new JLabel("Perecível:");
    private JLabel lblMassa = new JLabel("Massa:");
    private JLabel lblAlcool = new JLabel("Álcool:");
    private JLabel lblVolume = new JLabel("Volume:");
    private JLabel pdLimpeza = new JLabel("Produto de limpeza:");
    private JLabel estadoFis = new JLabel("Estado Físico:");
    private JLabel filial = new JLabel("Filial: ");


    //atributos para os campos de texto
    private JTextField txtNomeMercadoria = new JTextField();
    private JTextField txtQntMercadoria = new JTextField();
    private JTextField txtIdMercadoria = new JTextField();
    private JTextField txtValorMercadoria = new JTextField();
    private JTextField txtDataValidade = new JTextField();
    private JTextField txtFornecedor = new JTextField();
    private JTextField txtPerecivel = new JTextField();
    private JTextField txtMassa = new JTextField();
    private JTextField txtAlcool = new JTextField();
    private JTextField txtVolume = new JTextField();
    private JTextField txtPdLimpeza = new JTextField();
    private JTextField txtEstadoFis = new JTextField();

    private JComboBox<String> boxFilial = new JComboBox<String>();

    //botões
    private JButton btnSalvarMercadoria = new JButton("Salvar");

    public void alterarCadastro(int op){

        switch(op){
            case 1: //mostrar cadastro de alimentos
            lblDadosMercadoria.setFont(new Font("Arial", Font.BOLD, 15));
            lblDadosMercadoria.setBounds(30, 20, 250, 25);
            lblNomeMercadoria.setBounds(30, 60, 200, 25);
            lblQntMercadoria.setBounds(30, 100, 200, 25);
            lblIdMercadoria.setBounds(30, 140, 200, 25);
            lblValorMercadoria.setBounds(30, 180, 200, 25);
            lblDataValidade.setBounds(30, 230, 200, 25);
            lblFornecedor.setBounds(30, 270, 200, 25);
            lblPerecivel.setBounds(30, 310, 200, 25);
            lblMassa.setBounds(30, 350, 200, 25);
            filial.setBounds(30, 390, 200, 25);

            txtNomeMercadoria.setPreferredSize(new Dimension(300, 25));
            txtNomeMercadoria.setBounds(80, 60, 100, 25);
            txtQntMercadoria.setPreferredSize(new Dimension(300, 25));
            txtQntMercadoria.setBounds(110, 100, 100, 25);
            txtIdMercadoria.setPreferredSize(new Dimension(300, 25));
            txtIdMercadoria.setBounds(110, 140, 160, 25);
            txtValorMercadoria.setPreferredSize(new Dimension(300, 25));
            txtValorMercadoria.setBounds(90, 180, 160, 25);
            txtDataValidade.setPreferredSize(new Dimension(300, 25));
            txtDataValidade.setBounds(130, 230, 160, 25);
            txtFornecedor.setPreferredSize(new Dimension(300, 25));
            txtFornecedor.setBounds(110, 270, 160, 25);
            txtPerecivel.setPreferredSize(new Dimension(300, 25));
            txtPerecivel.setBounds(100, 310, 200, 25);
            txtMassa.setPreferredSize(new Dimension(300, 25));
            txtMassa.setBounds(90, 350, 200, 25);

            boxFilial.setBounds(70, 390, 100, 25);
            

            janelaMercadoria.setLayout(null);

            btnSalvarMercadoria.setBounds(30, 450, 100, 30);
            
            btnSalvarMercadoria.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	
                String nomeMercadoria = txtNomeMercadoria.getText();
                String qntMercadoria = txtQntMercadoria.getText();
                String idMercadoria = txtIdMercadoria.getText();
                String valorMercadoria = txtValorMercadoria.getText();
                //String dataValidade = txtDataValidade.getText();
                String fornecedor = txtFornecedor.getText();
                
                if(nomeMercadoria.isEmpty() == true || idMercadoria.isEmpty() == true || qntMercadoria.isEmpty() == true 
                || valorMercadoria.isEmpty() == true || /*dataValidade.isEmpty() == true*/ fornecedor.isEmpty() == true){
                    JOptionPane.showMessageDialog(null, "Preenche os campos seu animal");
                }else if(nomeMercadoria.matches("[0-9]+")){
                    JOptionPane.showMessageDialog(null, "Insira apenas letras no nome da mercadoria");
                }else if(!qntMercadoria.matches("[0-9]+")){
                    JOptionPane.showMessageDialog(null, "Insira apenas números na quantidade de mercadorias");
                }else if(!idMercadoria.matches("[0-9]+")){
                    JOptionPane.showMessageDialog(null, "Insira apenas números no identificador da mercadoria");
                }else if(!valorMercadoria.matches("[0-9]+")){
                    JOptionPane.showMessageDialog(null, "Insira apenas números no valor da mercadoria");
                }else if(fornecedor.matches("[0-9]+")){
                    JOptionPane.showMessageDialog(null, "Insira apenas letras no fornecedor");
                }
                else{

                //Dados.getMercadorias().add(cd.inserirMercadorias(nomeMercadoria));

                JOptionPane.showMessageDialog(null, "Mercadoria registrada com sucesso! :)");}
            }
            
        });

            janelaMercadoria.add(lblDadosMercadoria);
            janelaMercadoria.add(lblNomeMercadoria);
            janelaMercadoria.add(lblQntMercadoria);
            janelaMercadoria.add(lblIdMercadoria);
            janelaMercadoria.add(lblValorMercadoria);
            janelaMercadoria.add(lblDataValidade);
            janelaMercadoria.add(lblFornecedor);
            janelaMercadoria.add(lblPerecivel);
            janelaMercadoria.add(lblMassa);
            janelaMercadoria.add(filial);

            janelaMercadoria.add(txtNomeMercadoria);
            janelaMercadoria.add(txtQntMercadoria);
            janelaMercadoria.add(txtIdMercadoria);
            janelaMercadoria.add(txtValorMercadoria);
            janelaMercadoria.add(txtDataValidade);
            janelaMercadoria.add(txtFornecedor);
            janelaMercadoria.add(txtPerecivel);
            janelaMercadoria.add(txtMassa);
            janelaMercadoria.add(boxFilial);
            janelaMercadoria.add(btnSalvarMercadoria);
            



        //aqui configuramos o nosso JFrame
        janelaMercadoria.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        janelaMercadoria.setVisible(true);
        janelaMercadoria.setLocationRelativeTo(null); 
        janelaMercadoria.setSize(350, 560);
        break;

        case 2: //mostrar cadastro de bebidas
            
            lblDadosMercadoria.setFont(new Font("Arial", Font.BOLD, 15));
            lblDadosMercadoria.setBounds(30, 20, 250, 25);
            lblNomeMercadoria.setBounds(30, 60, 200, 25);
            lblQntMercadoria.setBounds(30, 100, 200, 25);
            lblIdMercadoria.setBounds(30, 140, 200, 25);
            lblValorMercadoria.setBounds(30, 180, 200, 25);
            lblDataValidade.setBounds(30, 230, 200, 25);
            lblFornecedor.setBounds(30, 270, 200, 25);
            lblAlcool.setBounds(30, 310, 200, 25);
            lblVolume.setBounds(30, 350, 200, 25);
            filial.setBounds(30, 390, 200, 25);

            txtNomeMercadoria.setPreferredSize(new Dimension(300, 25));
            txtNomeMercadoria.setBounds(80, 60, 100, 25);
            txtQntMercadoria.setPreferredSize(new Dimension(300, 25));
            txtQntMercadoria.setBounds(110, 100, 100, 25);
            txtIdMercadoria.setPreferredSize(new Dimension(300, 25));
            txtIdMercadoria.setBounds(110, 140, 160, 25);
            txtValorMercadoria.setPreferredSize(new Dimension(300, 25));
            txtValorMercadoria.setBounds(90, 180, 160, 25);
            txtDataValidade.setPreferredSize(new Dimension(300, 25));
            txtDataValidade.setBounds(130, 230, 160, 25);
            txtFornecedor.setPreferredSize(new Dimension(300, 25));
            txtFornecedor.setBounds(110, 270, 160, 25);
            txtAlcool.setPreferredSize(new Dimension(300, 25));
            txtAlcool.setBounds(100, 310, 200, 25);
            txtVolume.setPreferredSize(new Dimension(300, 25));
            txtVolume.setBounds(90, 350, 200, 25);
            boxFilial.setBounds(70, 390, 100, 25);

            janelaMercadoria.setLayout(null);

            btnSalvarMercadoria.setBounds(30, 450, 100, 30);
            
            btnSalvarMercadoria.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String nomeMercadoria = txtNomeMercadoria.getText();
                String qntMercadoria = txtQntMercadoria.getText();
                String idMercadoria = txtIdMercadoria.getText();
                String valorMercadoria = txtValorMercadoria.getText();
                //String dataValidade = txtDataValidade.getText();
                String fornecedor = txtFornecedor.getText();
                
                if(nomeMercadoria.isEmpty() == true || idMercadoria.isEmpty() == true || qntMercadoria.isEmpty() == true 
                || valorMercadoria.isEmpty() == true || /*dataValidade.isEmpty() == true*/ fornecedor.isEmpty() == true){
                    JOptionPane.showMessageDialog(null, "Preenche os campos seu animal");
                }else if(nomeMercadoria.matches("[0-9]+")){
                    JOptionPane.showMessageDialog(null, "Insira apenas letras no nome da mercadoria");
                }else if(!qntMercadoria.matches("[0-9]+")){
                    JOptionPane.showMessageDialog(null, "Insira apenas números na quantidade de mercadorias");
                }else if(!idMercadoria.matches("[0-9]+")){
                    JOptionPane.showMessageDialog(null, "Insira apenas números no identificador da mercadoria");
                }else if(!valorMercadoria.matches("[0-9]+")){
                    JOptionPane.showMessageDialog(null, "Insira apenas números no valor da mercadoria");
                }else if(fornecedor.matches("[0-9]+")){
                    JOptionPane.showMessageDialog(null, "Insira apenas letras no fornecedor");
                }
                else{
                //Dados.getMercadorias().add(cd.inserirMercadorias(nomeMercadoria));
                JOptionPane.showMessageDialog(null, "Mercadoria registrada com sucesso! :)");}
            }
            
        });

            janelaMercadoria.add(lblDadosMercadoria);
            janelaMercadoria.add(lblNomeMercadoria);
            janelaMercadoria.add(lblQntMercadoria);
            janelaMercadoria.add(lblIdMercadoria);
            janelaMercadoria.add(lblValorMercadoria);
            janelaMercadoria.add(lblDataValidade);
            janelaMercadoria.add(lblFornecedor);
            janelaMercadoria.add(lblAlcool);
            janelaMercadoria.add(lblVolume);
            janelaMercadoria.add(filial);

            janelaMercadoria.add(txtNomeMercadoria);
            janelaMercadoria.add(txtQntMercadoria);
            janelaMercadoria.add(txtIdMercadoria);
            janelaMercadoria.add(txtValorMercadoria);
            janelaMercadoria.add(txtDataValidade);
            janelaMercadoria.add(txtFornecedor);
            janelaMercadoria.add(txtAlcool);
            janelaMercadoria.add(txtVolume);
            janelaMercadoria.add(boxFilial);
            janelaMercadoria.add(btnSalvarMercadoria);
            
        //aqui configuramos o nosso JFrame
        janelaMercadoria.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        janelaMercadoria.setVisible(true);
        janelaMercadoria.setLocationRelativeTo(null); 
        janelaMercadoria.setSize(350, 560);
            
        break;

        case 3: //mostrar cadastro de produtos de casa
            lblDadosMercadoria.setFont(new Font("Arial", Font.BOLD, 15));
            lblDadosMercadoria.setBounds(30, 20, 250, 25);
            lblNomeMercadoria.setBounds(30, 60, 200, 25);
            lblQntMercadoria.setBounds(30, 100, 200, 25);
            lblIdMercadoria.setBounds(30, 140, 200, 25);
            lblValorMercadoria.setBounds(30, 180, 200, 25);
            lblDataValidade.setBounds(30, 230, 200, 25);
            lblFornecedor.setBounds(30, 270, 200, 25);
            pdLimpeza.setBounds(30, 310, 200, 25);
            estadoFis.setBounds(30, 350, 200, 25);
            filial.setBounds(30, 390, 200, 25);

            txtNomeMercadoria.setPreferredSize(new Dimension(300, 25));
            txtNomeMercadoria.setBounds(80, 60, 100, 25);
            txtQntMercadoria.setPreferredSize(new Dimension(300, 25));
            txtQntMercadoria.setBounds(110, 100, 100, 25);
            txtIdMercadoria.setPreferredSize(new Dimension(300, 25));
            txtIdMercadoria.setBounds(110, 140, 160, 25);
            txtValorMercadoria.setPreferredSize(new Dimension(300, 25));
            txtValorMercadoria.setBounds(90, 180, 160, 25);
            txtDataValidade.setPreferredSize(new Dimension(300, 25));
            txtDataValidade.setBounds(130, 230, 160, 25);
            txtFornecedor.setPreferredSize(new Dimension(300, 25));
            txtFornecedor.setBounds(110, 270, 160, 25);
            txtPdLimpeza.setPreferredSize(new Dimension(300, 25));
            txtPdLimpeza.setBounds(150, 310, 150, 25);
            txtEstadoFis.setPreferredSize(new Dimension(300, 25));
            txtEstadoFis.setBounds(120, 350, 200, 25);
            boxFilial.setBounds(70, 390, 100, 25);

            janelaMercadoria.setLayout(null);

            btnSalvarMercadoria.setBounds(30, 450, 100, 30);
            
            btnSalvarMercadoria.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String nomeMercadoria = txtNomeMercadoria.getText();
                String qntMercadoria = txtQntMercadoria.getText();
                String idMercadoria = txtIdMercadoria.getText();
                String valorMercadoria = txtValorMercadoria.getText();
                String dataValidade = txtDataValidade.getText();
                String fornecedor = txtFornecedor.getText();
                
                if(nomeMercadoria.isEmpty() == true || idMercadoria.isEmpty() == true || qntMercadoria.isEmpty() == true 
                || valorMercadoria.isEmpty() == true || /*dataValidade.isEmpty() == true*/ fornecedor.isEmpty() == true){
                    JOptionPane.showMessageDialog(null, "Preenche os campos seu animal");
                }else if(nomeMercadoria.matches("[0-9]+")){
                    JOptionPane.showMessageDialog(null, "Insira apenas letras no nome da mercadoria");
                }else if(!qntMercadoria.matches("[0-9]+")){
                    JOptionPane.showMessageDialog(null, "Insira apenas números na quantidade de mercadorias");
                }else if(!idMercadoria.matches("[0-9]+")){
                    JOptionPane.showMessageDialog(null, "Insira apenas números no identificador da mercadoria");
                }else if(!valorMercadoria.matches("[0-9]+")){
                    JOptionPane.showMessageDialog(null, "Insira apenas números no valor da mercadoria");
                }else if(fornecedor.matches("[0-9]+")){
                    JOptionPane.showMessageDialog(null, "Insira apenas letras no fornecedor");
                }
                else{
                //Dados.getMercadorias().add(cd.inserirMercadorias(nomeMercadoria, qntMercadoria, valorMercadoria,
                //idMercadoria, dataValidade, fornecedor, ABORT, ABORT, ABORT, ABORT, ABORT, ABORT, ABORT));
                JOptionPane.showMessageDialog(null, "Mercadoria registrada com sucesso! :)");}
            }
            
        });

            janelaMercadoria.add(lblDadosMercadoria);
            janelaMercadoria.add(lblNomeMercadoria);
            janelaMercadoria.add(lblQntMercadoria);
            janelaMercadoria.add(lblIdMercadoria);
            janelaMercadoria.add(lblValorMercadoria);
            janelaMercadoria.add(lblDataValidade);
            janelaMercadoria.add(lblFornecedor);
            janelaMercadoria.add(pdLimpeza);
            janelaMercadoria.add(estadoFis);
            janelaMercadoria.add(filial);

            janelaMercadoria.add(txtNomeMercadoria);
            janelaMercadoria.add(txtQntMercadoria);
            janelaMercadoria.add(txtIdMercadoria);
            janelaMercadoria.add(txtValorMercadoria);
            janelaMercadoria.add(txtDataValidade);
            janelaMercadoria.add(txtFornecedor);
            janelaMercadoria.add(txtPdLimpeza);
            janelaMercadoria.add(txtEstadoFis);
            janelaMercadoria.add(btnSalvarMercadoria);
            janelaMercadoria.add(boxFilial);
            



        //aqui configuramos o nosso JFrame
        janelaMercadoria.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        janelaMercadoria.setVisible(true);
        janelaMercadoria.setLocationRelativeTo(null); 
        janelaMercadoria.setSize(350, 560);
        break;
        }
    }

    public static void main(String[] args) {
        new TelaMercadoria();
    }
}