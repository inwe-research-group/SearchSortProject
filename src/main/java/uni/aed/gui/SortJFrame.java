package uni.aed.gui;

import java.util.Arrays;
import javax.swing.DefaultListModel;
import uni.aed.ordenamiento.Complejidad;
import uni.aed.ordenamiento.Ordenamiento;

public class SortJFrame extends javax.swing.JFrame {
    
    private final DefaultListModel modeloList1 = new DefaultListModel();
    private final DefaultListModel modeloList2 = new DefaultListModel();     
    private final String CADENA_VACIA="";
    private final long FACTOR_CONVERSION_NS_TO_MS=1000000;
    /**
     * Creates new form SortJFrame
     */
    public SortJFrame() {
        initComponents();
        ListaInicial.setModel(modeloList1);
        ListaOrdenada.setModel(modeloList2);
        lblMsg.setText("");
        jpIntervalo.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        cbCarga = new javax.swing.JComboBox<>();
        cbMetodo = new javax.swing.JComboBox<>();
        lblMetodo = new javax.swing.JLabel();
        lblCarga = new javax.swing.JLabel();
        rbDuplicados = new javax.swing.JRadioButton();
        rbUnicos = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaInicial = new javax.swing.JList<>();
        BtnOrdenar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaOrdenada = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        txtValor = new javax.swing.JTextField();
        lblValor = new javax.swing.JLabel();
        jpIntervalo = new javax.swing.JPanel();
        jsIni1 = new javax.swing.JSpinner();
        jsFin1 = new javax.swing.JSpinner();
        BtnGenerar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblMsg = new javax.swing.JLabel();
        BtnLimpiar = new javax.swing.JButton();
        lblIntercambios = new javax.swing.JLabel();
        lblComparaciones = new javax.swing.JLabel();
        lblTEjecucion = new javax.swing.JLabel();
        lblComplejidad = new javax.swing.JLabel();
        txtComplejidad = new javax.swing.JTextField();
        txtTiempoEjecucion = new javax.swing.JTextField();
        txtComparaciones = new javax.swing.JTextField();
        txtIntercambios = new javax.swing.JTextField();
        lblFIntercambios = new javax.swing.JLabel();
        lblFComparaciones = new javax.swing.JLabel();
        lblMSTEjecucion = new javax.swing.JLabel();
        BtnCerrar = new javax.swing.JButton();

        setTitle("Algoritmos Sort && Search");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Criterios"));
        jPanel1.setName("Criterios"); // NOI18N

        cbCarga.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manual", "Aleatoria" }));
        cbCarga.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCargaItemStateChanged(evt);
            }
        });
        cbCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCargaActionPerformed(evt);
            }
        });

        cbMetodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Burbuja", "Insercion", "Insercion Binaria", "Seleccion4c", "Shell", "QuickSort", "MergeSort", "HeapSort" }));
        cbMetodo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMetodoItemStateChanged(evt);
            }
        });
        cbMetodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMetodoActionPerformed(evt);
            }
        });

        lblMetodo.setText("Metodo Ordenamiento:");

        lblCarga.setText("Tipo de Carga:");

        rbDuplicados.setText("Permite Duplicados");
        rbDuplicados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDuplicadosActionPerformed(evt);
            }
        });

        rbUnicos.setSelected(true);
        rbUnicos.setText("Valores Unicos");
        rbUnicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbUnicosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbUnicos)
                .addGap(18, 18, 18)
                .addComponent(rbDuplicados, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(250, 250, 250))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbCarga, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCarga)
                    .addComponent(cbCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMetodo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbUnicos)
                    .addComponent(rbDuplicados))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jScrollPane1.setViewportView(ListaInicial);

        BtnOrdenar.setText("Ordenar");
        BtnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOrdenarActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(ListaOrdenada);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(BtnOrdenar)
                .addGap(54, 54, 54)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(BtnOrdenar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });
        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorKeyTyped(evt);
            }
        });

        lblValor.setText("Ingrese los Valores a Ordenar:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValor))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        BtnGenerar.setText("Generar");
        BtnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGenerarActionPerformed(evt);
            }
        });

        jLabel2.setText("Ini:");

        jLabel3.setText("Fin:");

        javax.swing.GroupLayout jpIntervaloLayout = new javax.swing.GroupLayout(jpIntervalo);
        jpIntervalo.setLayout(jpIntervaloLayout);
        jpIntervaloLayout.setHorizontalGroup(
            jpIntervaloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIntervaloLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsIni1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsFin1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(BtnGenerar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpIntervaloLayout.setVerticalGroup(
            jpIntervaloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpIntervaloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpIntervaloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jsIni1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsFin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(BtnGenerar))
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblMsg.setText("Se generaron ...");

        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        lblIntercambios.setText("#Intercambios:");

        lblComparaciones.setText("#Comparaciones:");

        lblTEjecucion.setText("Tiempo Ejecucion (ns):");

        lblComplejidad.setText("Complejidad Asintótica:");

        txtComplejidad.setEditable(false);

        txtTiempoEjecucion.setEditable(false);

        txtComparaciones.setEditable(false);

        txtIntercambios.setEditable(false);

        lblFIntercambios.setText(".");

        lblFComparaciones.setText(".");

        lblMSTEjecucion.setText(".");

        BtnCerrar.setText("Cerrar");
        BtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblComparaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIntercambios, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblComplejidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTEjecucion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIntercambios)
                            .addComponent(txtComparaciones)
                            .addComponent(txtTiempoEjecucion)
                            .addComponent(txtComplejidad, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFIntercambios, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblMSTEjecucion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblFComparaciones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(BtnCerrar)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIntercambios)
                            .addComponent(txtIntercambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFIntercambios))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtComparaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblComparaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFComparaciones))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTiempoEjecucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTEjecucion)
                            .addComponent(lblMSTEjecucion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblComplejidad)
                            .addComponent(txtComplejidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(BtnCerrar))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lblMsg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnLimpiar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpIntervalo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpIntervalo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:        
        switch(cbCarga.getSelectedIndex()){                
            case 0->{//manual 
                if (rbUnicos.isSelected())                                            
                    if (!modeloList1.contains(txtValor.getText()))
                        modeloList1.addElement(txtValor.getText());
                if (rbDuplicados.isSelected())                    
                    modeloList1.addElement(txtValor.getText());
                txtValor.setText("");

            }//            
        }
    }//GEN-LAST:event_txtValorActionPerformed

    private void BtnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOrdenarActionPerformed
        Integer N=modeloList1.size();
        if (N<=1) return;                
        Integer[] X = Arrays.stream(modeloList1.toArray())
              .map(obj -> Integer.valueOf(obj.toString()) ).toArray(Integer[]::new);        
        Ordenamiento o=new Ordenamiento(); 
        Integer[] Y=null;        
        switch(cbMetodo.getSelectedIndex()){
            case 0->{//burbuja
                //Realizar el ordenamiento
                o.burbuja(X); 
                lblFComparaciones.setText(Complejidad.BURBUJA_NCOMPARACIONES);
                lblFIntercambios.setText(Complejidad.BURBUJA_NINTERCAMBIOS);
                txtComplejidad.setText(Complejidad.BURBUJA_COMPLEJIDAD_WORSTCASE);
            }
            case 1->{//insercion
                o.insercion(X);                
                lblFComparaciones.setText(Complejidad.INSERCION_NCOMPARACIONES_WORSTCASE);
                lblFIntercambios.setText(Complejidad.INSERCION_NINTERCAMBIOS_WORSTCASE);
                txtComplejidad.setText(Complejidad.INSERCION_COMPLEJIDAD_WORSTCASE);
            }
            case 2->{//insercionBinaria
                o.insercionBinaria(X);                
                lblFComparaciones.setText(Complejidad.INSERCIONBINARIA_NCOMPARACIONES_WORSTCASE);
                lblFIntercambios.setText(Complejidad.INSERCIONBINARIA_NINTERCAMBIOS_WORSTCASE);
                txtComplejidad.setText(Complejidad.INSERCIONBINARIA_COMPLEJIDAD_WORSTCASE);
            }
            case 3->{//seleccion4c
                o.seleccion4c(X);                
                lblFComparaciones.setText(Complejidad.SELECCION_NCOMPARACIONES_WORSTCASE);
                lblFIntercambios.setText(Complejidad.SELECCION_NINTERCAMBIOS_WORSTCASE);
                txtComplejidad.setText(Complejidad.SELECCION_COMPLEJIDAD_WORSTCASE);
            }
            case 4->{//shell
                o.ShellSort(X);                
                lblFComparaciones.setText(Complejidad.SHELL_NCOMPARACIONES_WORSTCASE);
                lblFIntercambios.setText(Complejidad.SHELL_NINTERCAMBIOS_WORSTCASE);
                txtComplejidad.setText(Complejidad.SHELL_COMPLEJIDAD_WORSTCASE);
            }
            case 5->{//Quicksort
                o.CallQuickSort(X);                
                lblFComparaciones.setText(Complejidad.QUICKSORT_NCOMPARACIONES);
                lblFIntercambios.setText(Complejidad.QUICKSORT_NINTERCAMBIOS);
                txtComplejidad.setText(Complejidad.QUICKSORT_COMPLEJIDAD_MIDLECASE);            
            }
            case 6->{//Mergesort
                o.CallMergeSort(X);                                
                lblFComparaciones.setText(Complejidad.MERGESORT_NCOMPARACIONES_WORSTCASE);
                lblFIntercambios.setText(Complejidad.MERGESORT_NINTERCAMBIOS);
                txtComplejidad.setText(Complejidad.MERGESORT_COMPLEJIDAD_WORSTCASE);
            }
            case 7->{//Heapsort         
                Y=new Integer[N];                
                Y=o.HeapSort(X);
                lblFComparaciones.setText(Complejidad.HEAPSORT_NCOMPARACIONES_WORSTCASE);                
                txtComplejidad.setText(Complejidad.HEAPSORT_COMPLEJIDAD_WORSTCASE);
            }
        }//end switch   
               
        txtComparaciones.setText(Integer.toString(o.getnComparaciones()));
        txtIntercambios.setText(Integer.toString(o.getnIntercambios()));
        txtTiempoEjecucion.setText(Long.toString(o.gettEjecucion()));
        if (o.gettEjecucion()>0) 
            lblMSTEjecucion.setText(Double.toString(o.gettEjecucion()/FACTOR_CONVERSION_NS_TO_MS)+ " (ms)");
        modeloList2.removeAllElements();
        if (cbMetodo.getSelectedIndex()==7)
            for(Integer i: Y)
                    modeloList2.addElement(i);
        else
            for(Integer i: X)
                modeloList2.addElement(i);
    }//GEN-LAST:event_BtnOrdenarActionPerformed
    private static int random(int low,int high){
        return (int) Math.floor(Math.random()*(high-low+1)) + low;
    }
    private void ClearAll(){        
        modeloList1.removeAllElements();    
        modeloList2.removeAllElements();
        txtIntercambios.setText(CADENA_VACIA);
        txtComparaciones.setText(CADENA_VACIA);
        txtTiempoEjecucion.setText(CADENA_VACIA);
        txtValor.setText(CADENA_VACIA);
        jsIni1.setValue(0);
        jsFin1.setValue(0);
        lblFComparaciones.setText(CADENA_VACIA);
        lblFIntercambios.setText(CADENA_VACIA);
        txtComplejidad.setText(CADENA_VACIA);
        lblMSTEjecucion.setText(CADENA_VACIA);
    }
    private void ClearResult(){        
        modeloList2.removeAllElements();
        txtIntercambios.setText(CADENA_VACIA);
        txtComparaciones.setText(CADENA_VACIA);
        txtTiempoEjecucion.setText(CADENA_VACIA);
        lblFComparaciones.setText(CADENA_VACIA);
        lblFIntercambios.setText(CADENA_VACIA);
        txtComplejidad.setText(CADENA_VACIA);
        lblMSTEjecucion.setText(CADENA_VACIA);
    }
    private void txtValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyTyped
        // TODO add your handling code here:        
        int key =evt.getKeyChar();
        boolean numero=key>=48 && key<=57;
        if(!numero)
            evt.consume();
    }//GEN-LAST:event_txtValorKeyTyped

    private void cbMetodoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMetodoItemStateChanged
        // TODO add your handling code here:
        ClearResult();
    }//GEN-LAST:event_cbMetodoItemStateChanged

    private void cbMetodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMetodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMetodoActionPerformed

    private void cbCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCargaActionPerformed

    private void cbCargaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCargaItemStateChanged
        // TODO add your handling code here:        
        ClearAll();
        switch(cbCarga.getSelectedIndex()){
            case 0->{//manual 
                lblValor.setText("Ingrese los Valores a Ordenar:");
                jpIntervalo.setVisible(false);
            }    
        case 1->{//aleatoria                
                lblValor.setText("Ingrese la cantidad de numeros de Generar:");
                jpIntervalo.setVisible(true);
            }    
        } 
    }//GEN-LAST:event_cbCargaItemStateChanged

    private void rbDuplicadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDuplicadosActionPerformed
        // TODO add your handling code here:
        ClearAll();
        rbUnicos.setSelected(false);
    }//GEN-LAST:event_rbDuplicadosActionPerformed

    private void rbUnicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbUnicosActionPerformed
        // TODO add your handling code here:
        ClearAll();
        rbDuplicados.setSelected(false);
    }//GEN-LAST:event_rbUnicosActionPerformed

    private void BtnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGenerarActionPerformed
        // TODO add your handling code here:
        switch(cbCarga.getSelectedIndex()){                
                case 1->{//aleatorio
                     if (txtValor.getText().length()==0) return;
                     Integer N=Integer.valueOf(txtValor.getText());
                     if (N<=1) return;
                     Object valueIni=jsIni1.getValue();
                     Object valueFin=jsFin1.getValue();
                     if (("0".equals(valueIni.toString()) )|| ("0".equals(valueFin.toString()) )) return;
                     if (Integer.parseInt(valueFin.toString())<=(Integer.valueOf(valueIni.toString()) + N)) return;
                     for(int i=0;i<N;i++){                        
                        int valor=random(Integer.parseInt(valueIni.toString()),Integer.parseInt(valueFin.toString())); 
                        if (rbUnicos.isSelected())
                            if (!modeloList1.contains(valor))
                                modeloList1.addElement(valor);                            
                        if (rbDuplicados.isSelected())                              
                            modeloList1.addElement(valor);
                     }
                     lblMsg.setText("Se Generaron " +modeloList1.size()+" valores");
                }
        }
    }//GEN-LAST:event_BtnGenerarActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BtnCerrarActionPerformed

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
            java.util.logging.Logger.getLogger(SortJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SortJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SortJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SortJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SortJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrar;
    private javax.swing.JButton BtnGenerar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnOrdenar;
    private javax.swing.JList<String> ListaInicial;
    private javax.swing.JList<String> ListaOrdenada;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbCarga;
    private javax.swing.JComboBox<String> cbMetodo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpIntervalo;
    private javax.swing.JSpinner jsFin1;
    private javax.swing.JSpinner jsIni1;
    private javax.swing.JLabel lblCarga;
    private javax.swing.JLabel lblComparaciones;
    private javax.swing.JLabel lblComplejidad;
    private javax.swing.JLabel lblFComparaciones;
    private javax.swing.JLabel lblFIntercambios;
    private javax.swing.JLabel lblIntercambios;
    private javax.swing.JLabel lblMSTEjecucion;
    private javax.swing.JLabel lblMetodo;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JLabel lblTEjecucion;
    private javax.swing.JLabel lblValor;
    private javax.swing.JRadioButton rbDuplicados;
    private javax.swing.JRadioButton rbUnicos;
    private javax.swing.JTextField txtComparaciones;
    private javax.swing.JTextField txtComplejidad;
    private javax.swing.JTextField txtIntercambios;
    private javax.swing.JTextField txtTiempoEjecucion;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
