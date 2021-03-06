package br.com.metodista.poo;

/**
 * @author Leandro Melão Medeiros - R.A. 250544
 * @since 15-08-2014
 * UNIVERSIDADE METODISTA DE SÃO PAULO - FACULDADE DE TECNOLOGIA
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblTitle01 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDistance = new javax.swing.JTextField();
        txtTime = new javax.swing.JTextField();
        lblAvgSpeed = new javax.swing.JLabel();
        btbCalcAvgSpeed = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        txtWidth = new javax.swing.JTextField();
        txtDepth = new javax.swing.JTextField();
        btnCalcVolume = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lblVolume = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtOpositeSide = new javax.swing.JTextField();
        txtAdjacentSide = new javax.swing.JTextField();
        btnCalcHypotenuse = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        lblHypotenuse = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblTitle2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtBRLValue = new javax.swing.JTextField();
        txtExchangeRate = new javax.swing.JTextField();
        lblDollarValue = new javax.swing.JLabel();
        btbCalcExchangeRate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto Orientado à Objetos - Aula 02");
        setName("mainFrame"); // NOI18N
        setResizable(false);

        jTabbedPane1.setOpaque(true);
        jTabbedPane1.setVerifyInputWhenFocusTarget(false);

        lblTitle01.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTitle01.setText("Cálculo de Velocidade Média");

        jLabel1.setText("Distância à percorer (km)");

        jLabel2.setText("Tempo de viagem desejado (h)");

        jLabel3.setText("Velocidade média necessária:");

        lblAvgSpeed.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N

        btbCalcAvgSpeed.setText("Calcular");
        btbCalcAvgSpeed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbCalcAvgSpeedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTitle01, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAvgSpeed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDistance)
                            .addComponent(txtTime)
                            .addComponent(btbCalcAvgSpeed, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle01)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDistance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btbCalcAvgSpeed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblAvgSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lblAvgSpeed.getAccessibleContext().setAccessibleDescription("");

        jTabbedPane1.addTab("Exercício 01", jPanel1);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Cálculo do Volume de um Cubo");

        jLabel5.setText("Altura (Y)");

        jLabel6.setText("Largura (X)");

        jLabel7.setText("Profundidade (Z)");

        btnCalcVolume.setText("Calcular");
        btnCalcVolume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcVolumeActionPerformed(evt);
            }
        });

        jLabel8.setText("Volume:");

        lblVolume.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHeight)
                            .addComponent(txtWidth, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(txtDepth)
                            .addComponent(lblVolume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnCalcVolume)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcVolume))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDepth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblVolume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Exercício 02", jPanel2);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Teorema de Pitágoras");

        jLabel10.setText("Cateto Oposto (m)");

        jLabel11.setText("Cateto Adjacente (m)");

        btnCalcHypotenuse.setText("Calcular");
        btnCalcHypotenuse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcHypotenuseActionPerformed(evt);
            }
        });

        jLabel13.setText("Hipotenusa:");

        lblHypotenuse.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAdjacentSide, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtOpositeSide, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCalcHypotenuse, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(lblHypotenuse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtOpositeSide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtAdjacentSide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalcHypotenuse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHypotenuse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Exercício 03", jPanel5);

        lblTitle2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTitle2.setText("Conversor de Moedas");

        jLabel12.setText("Valor em Reais (R$)");

        jLabel14.setText("Cotação do Dólar");

        jLabel15.setText("Valor em Dólares:");

        lblDollarValue.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N

        btbCalcExchangeRate.setText("Calcular");
        btbCalcExchangeRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbCalcExchangeRateActionPerformed(evt);
            }
        });

        btnClear.setText("Limpar");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTitle2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDollarValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btbCalcExchangeRate, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                            .addComponent(txtExchangeRate, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBRLValue, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle2)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtBRLValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtExchangeRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btbCalcExchangeRate)
                    .addComponent(btnClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(lblDollarValue, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Exercício 04", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @author Leandro Melão Medeiros - R.A. 250544
    * @since 15-08-2014
    * Projeto Orientado à Objetos - Aula 01
    * EXERCÍCIO 01 - Cálculo de Velocidade Média
    */
    private void btbCalcAvgSpeedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbCalcAvgSpeedActionPerformed
        float fAvgSpeed = Float.parseFloat(txtDistance.getText())               //Converto o texto dos três campos
                        / Float.parseFloat(txtTime.getText());                  //em números, divido a distância pela
                                                                                //velocidade e guardo o quociente em uma variável.
        lblAvgSpeed.setText(fAvgSpeed + " km/h");                               //Por fim exibo o valor da variável na etiqueta "Velocidade"
    }//GEN-LAST:event_btbCalcAvgSpeedActionPerformed

    /**
    * @author Leandro Melão Medeiros - R.A. 250544
    * @since 15-08-2014
    * Projeto Orientado à Objetos - Aula 01
    * EXERCÍCIO 02 - Cálculo de Volume de um Cubo
    */
    private void btnCalcVolumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcVolumeActionPerformed
        float fVolume = Float.parseFloat(txtHeight.getText())                   //Converto o texto dos três campos em
                      * Float.parseFloat(txtWidth.getText())                    //números com ponto flutuante e depois guardo
                      * Float.parseFloat(txtDepth.getText());                   //o produto obtido a partir deles em uma variável
        
        lblVolume.setText(fVolume + " m³");                                     //Exibo o valor da variável na etiqueta "Volume"
    }//GEN-LAST:event_btnCalcVolumeActionPerformed

    /**
    * @author Leandro Melão Medeiros - R.A. 250544
    * @since 15-08-2014
    * Projeto Orientado à Objetos - Aula 01
    * EXERCÍCIO 03 - Cálculo de Hipotenusa
    */
    private void btnCalcHypotenuseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcHypotenuseActionPerformed
        /*  
            Para calcular a hipotenusa, primeiro obtenho o tamanho dos catetos
          convertendo o texto dos campos do formulários em números com casas
          decimais, então elevo os dois à 2ª potência e guardo a soma dos dois
          na variável hipotenusa.
            Depois extraio a raiz quadrada da hipotenusa e guardo o valor na mesma
          variável, sobreescrevendo o valor anterior.
            Por fim exibo o valor calculado na etiqueta "hipotenusa".
        */
        
        float cateto1    = Float.parseFloat(txtAdjacentSide.getText());        
        float cateto2    = Float.parseFloat(txtOpositeSide.getText());
        float hipotenusa = (cateto1 * cateto1) + (cateto2 * cateto2);
        
        double dHypotenuse = Math.pow(Double.parseDouble(txtAdjacentSide.getText()), 2)
                           + Math.pow(Double.parseDouble(txtOpositeSide.getText()), 2);
        
        dHypotenuse = Math.sqrt(dHypotenuse);;
        
        lblHypotenuse.setText(dHypotenuse + " m");
    }//GEN-LAST:event_btnCalcHypotenuseActionPerformed

    /**
    * @author Leandro Melão Medeiros - R.A. 250544
    * @since 15-08-2014
    * Projeto Orientado à Objetos - Aula 01
    * EXERCÍCIO 04 - Câmbio de Moedas
    */
    private void btbCalcExchangeRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbCalcExchangeRateActionPerformed
        float fDollarValue = Float.parseFloat(txtBRLValue.getText())            //Converto os valores em números de ponto
                           * Float.parseFloat(txtExchangeRate.getText());       //flutuante e armazeno o produto dos dois em uma variável
        
        lblDollarValue.setText("US$ " + fDollarValue);                          //Por fim exibo o valor convertido na etiqueta do formulário.
    }//GEN-LAST:event_btbCalcExchangeRateActionPerformed
    
    /**
     * Botão Limpar
     */
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtBRLValue.setText(null);                                              //Para limpar os campos
        txtExchangeRate.setText(null);                                          //basta definir o texto
        lblDollarValue.setText(null);                                           //de todos eles como "nulo"
    }//GEN-LAST:event_btnClearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbCalcAvgSpeed;
    private javax.swing.JButton btbCalcExchangeRate;
    private javax.swing.JButton btnCalcHypotenuse;
    private javax.swing.JButton btnCalcVolume;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAvgSpeed;
    private javax.swing.JLabel lblDollarValue;
    private javax.swing.JLabel lblHypotenuse;
    private javax.swing.JLabel lblTitle01;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JLabel lblVolume;
    private javax.swing.JTextField txtAdjacentSide;
    private javax.swing.JTextField txtBRLValue;
    private javax.swing.JTextField txtDepth;
    private javax.swing.JTextField txtDistance;
    private javax.swing.JTextField txtExchangeRate;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtOpositeSide;
    private javax.swing.JTextField txtTime;
    private javax.swing.JTextField txtWidth;
    // End of variables declaration//GEN-END:variables
}
