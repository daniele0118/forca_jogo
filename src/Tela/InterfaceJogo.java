
package Tela;

import Class.JogoDaForca;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class InterfaceJogo extends javax.swing.JFrame {
    private String temp = "";
    private String letrasUsadas = "";
    private ArrayList<JogoDaForca> jogoDaForca = new ArrayList();
    private JogoDaForca aux;
    public InterfaceJogo() {
        initComponents();
        criaInterface();
        setLocationRelativeTo(null);
        
    }
    
    private void criaInterface(){
        
        StringBuilder saida = new StringBuilder();
        
        imagem.setIcon(new ImageIcon(getClass().getResource("img7.png")));
        temp = "";
        
        JogoDaForca forca1 = new JogoDaForca("Artrópode que possui 8 pernas","aranha");
        jogoDaForca.add(forca1);
        JogoDaForca forca2 = new JogoDaForca("Usado para ajustar problemas de visão","oculos");
        jogoDaForca.add(forca2);
        JogoDaForca forca3 = new JogoDaForca("Legume muito utilizado para fazer lanternas no hallowen","abobora");
        jogoDaForca.add(forca3);
        JogoDaForca forca4 = new JogoDaForca("Objeto utilizado para iluminar que geralmente fica próximo a cama","abajur");
        jogoDaForca.add(forca4);
        JogoDaForca forca5 = new JogoDaForca("Capital nacional da literatura infantil","taubate");
        jogoDaForca.add(forca5);
        JogoDaForca forca6 = new JogoDaForca("Animal conhecido por ser o melhor amigo do homem","cachorro");
        jogoDaForca.add(forca6);
        JogoDaForca forca7 = new JogoDaForca("Virus responsável pela pandemia de 2020","covid");
        jogoDaForca.add(forca7);
        JogoDaForca forca8 = new JogoDaForca("Alimento ingerido nos cinemas","pipoca");
        jogoDaForca.add(forca8);
        JogoDaForca forca9 = new JogoDaForca("Veículo que normalmente possui 4 rodas","carro");
        jogoDaForca.add(forca9);
        JogoDaForca forca10 = new JogoDaForca("Felino doméstico","gato");
        jogoDaForca.add(forca10);
        
        int rand = (int)(Math.random()*9);
        aux = jogoDaForca.get(rand);
        
        jTFDica.setText(aux.getDica());  //Responsável por mostrar as dicas no jogo
        jTPErros.setText(aux.getContErros().toString());  //Mostra a quantidade de erros

        for (int i = 0; i < aux.getPalavra().length() ; i++) {
            saida.append("_ ");
            temp += "_";
        }
        jTPPalavra.setText(saida.toString()); // Mostra a palavra codificada
        jTPUltimoPalpite.setText(""); // Mostra o ultimo palpite
        letrasUsadas = ""; // Limpa as letras usadas quando um novo jogo começa
        jTPLetras.setText(letrasUsadas); // Mostra as letras usadas
        jTFLetra.setText(""); // Inicia o jogo sem nenhum valor onde o jogador coloca os palpites    
    }
    
    private void limpaTexto(){
        jTFLetra.setText(null); // Limpa a letra do palpite após o jogador apertar ENTER
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane5 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPPalavra = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTPUltimoPalpite = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTPErros = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTPLetras = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jTFLetra = new javax.swing.JTextField();
        jBAdicionar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTFDica = new javax.swing.JTextField();
        imagem = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMjogarNovamente = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        jLabel2.setText("jLabel2");

        jScrollPane3.setViewportView(jTextPane3);

        jScrollPane5.setViewportView(jTextPane5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Jogo da forca"));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações"));

        jLabel1.setText("Palavra:");

        jTPPalavra.setEditable(false);
        jScrollPane1.setViewportView(jTPPalavra);

        jLabel3.setText("Letras Usadas:");

        jLabel4.setText("Último Palpite:");

        jLabel5.setText("Erros Restantes:");

        jScrollPane2.setViewportView(jTPUltimoPalpite);

        jTPErros.setEditable(false);
        jScrollPane4.setViewportView(jTPErros);

        jTPLetras.setEditable(false);
        jScrollPane6.setViewportView(jTPLetras);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane4)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6)
                            .addComponent(jScrollPane1))))
                .addGap(10, 10, 10))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(10, 10, 10))
        );

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel6.setText("Adicione uma letra");

        jTFLetra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFLetra.setActionCommand("<Not Set>");
        jTFLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFLetraActionPerformed(evt);
            }
        });
        jTFLetra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFLetraKeyPressed(evt);
            }
        });

        jBAdicionar.setText("Adicionar letra");
        jBAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAdicionarActionPerformed(evt);
            }
        });
        jBAdicionar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBAdicionarKeyPressed(evt);
            }
        });

        jLabel7.setText("Dica:");

        jTFDica.setEditable(false);
        jTFDica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFDicaActionPerformed(evt);
            }
        });

        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tela/img7.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFDica)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jTFLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(imagem)
                .addGap(143, 143, 143))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTFDica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagem, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTFLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAdicionar))
                .addGap(16, 16, 16)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMjogarNovamente.setText("Jogo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem1.setText("Jogar Novamente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMjogarNovamente.add(jMenuItem1);

        jMenuBar1.add(jMjogarNovamente);

        jMenu2.setText("Opções");

        jMenuItem2.setText("Sair");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);
        jMenuItem2.getAccessibleContext().setAccessibleName("jMSair");

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFDicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFDicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFDicaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        criaInterface();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jBAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAdicionarActionPerformed
        String letra = jTFLetra.getText().toLowerCase();
        if(letra.length() > 1){
            JOptionPane.showMessageDialog(this,"Apenas uma letra!");
            return;
        }
        for(int i = 0 ; i < letrasUsadas.length() ; i++){
            if(letra.charAt(0) == letrasUsadas.charAt(i)){
                JOptionPane.showMessageDialog(this,"Letra repetida!");
                return;
            }
        }
        temp = aux.escolheLetra(letra.charAt(0),temp);
        
        if(temp.equals("sucesso")){
            String message = "Parabéns! Você Ganhou! :)";
            JOptionPane.showMessageDialog(null, message, "Vitória!",JOptionPane.INFORMATION_MESSAGE);
            criaInterface();
            return;
        }
        
        if(aux.getContErros()== 6 ){
           imagem.setIcon(new ImageIcon(getClass().getResource("img6.png")));
        }else if(aux.getContErros()== 5 ){
            imagem.setIcon(new ImageIcon(getClass().getResource("img5.png")));
        }else if(aux.getContErros()== 4 ){
            imagem.setIcon(new ImageIcon(getClass().getResource("img4.png")));
        }else if(aux.getContErros()== 3 ){
            imagem.setIcon(new ImageIcon(getClass().getResource("img3.png")));
        }else if(aux.getContErros()== 2 ){
            imagem.setIcon(new ImageIcon(getClass().getResource("img2.png")));
        }else if(aux.getContErros()== 1 ){
            imagem.setIcon(new ImageIcon(getClass().getResource("img1.png")));
        }else if(aux.getContErros()== 0 ){
            imagem.setIcon(new ImageIcon(getClass().getResource("imgPERDEU.png")));
            
            String message = "Que pena! Você perdeu! :( ";
            JOptionPane.showMessageDialog(null, message, "Derrota!",JOptionPane.ERROR_MESSAGE);
            criaInterface();
            return;
        }
        
        jTPPalavra.setText(temp); // Mostra as letras que o jogador acertou
        jTPUltimoPalpite.setText(letra); // Mostra ultimo palpite
        jTPErros.setText(aux.getContErros().toString()); // Mostra os erros
        letrasUsadas += " "+letra; // Inicia o jogo sem nada nas letras usadas e adiciona as letras conforme os palpites
        jTPLetras.setText(letrasUsadas); // Mostra as letras usadas
    }//GEN-LAST:event_jBAdicionarActionPerformed

    private void jTFLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFLetraActionPerformed
       limpaTexto();
    }//GEN-LAST:event_jTFLetraActionPerformed

    private void jBAdicionarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBAdicionarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBAdicionarKeyPressed

    private void jTFLetraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFLetraKeyPressed
    if(evt.getKeyCode()==KeyEvent.VK_ENTER)        
        jBAdicionar.doClick();
    //Adicionando o atalho (ENTER) para enviar a letra na hora que voce coloca 
    //(nao precisa ficar apertando o botao toda hora)
    }//GEN-LAST:event_jTFLetraKeyPressed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagem;
    private javax.swing.JButton jBAdicionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu jMjogarNovamente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField jTFDica;
    private javax.swing.JTextField jTFLetra;
    private javax.swing.JTextPane jTPErros;
    private javax.swing.JTextPane jTPLetras;
    private javax.swing.JTextPane jTPPalavra;
    private javax.swing.JTextPane jTPUltimoPalpite;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane jTextPane5;
    // End of variables declaration//GEN-END:variables
}
