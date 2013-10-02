/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * InterfazBanco.java
 *
 * Created on 20/11/2011, 03:27:34 PM
 */
package banco;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.metal.MetalLookAndFeel;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.ParseException;
import javax.swing.UnsupportedLookAndFeelException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import javax.swing.plaf.synth.SynthLookAndFeel;

/**
 *
 * @author Joe Luis
 */
public class InterfazBanco extends javax.swing.JFrame {

    CBanco banco;
    File fichero;
    //boolean eliminado = false;
    boolean listaModificada = false;

    /** Creates new form InterfazBanco */
    public InterfazBanco() {
        initComponents();
        banco = new CBanco();
        //Base.mostrarOpcion("\nBienvenido a la aplicacion Banco, se ha creado una nueva lista de cuentas.", JOptionPane.INFORMATION_MESSAGE);
        ponIconitos();

        //cargarArchivo();
        Base.centrarVentana(this);

    }

    /*Esta Funcion esta con errores, asi esta en su main original */
    public void cargarArchivo() {
        try {
            fichero = new File("banco.txt");
            if (!fichero.exists()) {
                banco = new CBanco();
                Base.mostrarOpcion("\nBienvenido a la aplicacion Banco, se ha creado una nueva lista de cuentas.", JOptionPane.INFORMATION_MESSAGE);
            } else {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("banco.txt"));
                CBanco b;
                while ((b = (CBanco) ois.readObject()) != null) {
                    banco = b;
                }
                Base.mostrarOpcion("Se ha creado el archivo con exito", JOptionPane.INFORMATION_MESSAGE);

                //banco = (CBanco) ois.readObject();
                ois.close();


            }
        } catch (IOException e) {
            Base.mostrarOpcion("Error de entrada/salida :\n " + e.getMessage(), JOptionPane.ERROR_MESSAGE);

        } catch (ClassNotFoundException e) {
            Base.mostrarOpcion("Error de clase no encontrada ;\n" + e.getMessage(), JOptionPane.ERROR_MESSAGE);

        }

    }

    private void cambiarPanelesCambiante(String nombre) {
        ((CardLayout) PanelFunciones.getLayout()).show(PanelFunciones, nombre);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupEliminar = new javax.swing.ButtonGroup();
        buttonGroupReintegro = new javax.swing.ButtonGroup();
        PanelPrincipal = new javax.swing.JPanel();
        PanelFunciones = new javax.swing.JPanel();
        PanelInicial = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanelEdicion = new javax.swing.JPanel();
        jButtonAnadir = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanelFunciones = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButtonInfoCuenta = new javax.swing.JButton();
        jButtonConsulta = new javax.swing.JButton();
        jButtonIngresoDinero = new javax.swing.JButton();
        jButtonReintegro = new javax.swing.JButton();
        jButtonAyuda = new javax.swing.JButton();
        jButtonAcerca = new javax.swing.JButton();
        jPanelAnadir = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanelDatos = new javax.swing.JPanel();
        jButtonAnadirLimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellidos = new javax.swing.JTextField();
        jTextFieldNumCuenta = new javax.swing.JTextField();
        jTextFieldSaldoIni = new javax.swing.JTextField();
        jComboBoxTipoCuenta = new javax.swing.JComboBox();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldMantenimiento = new javax.swing.JTextField();
        jTextFieldImporte = new javax.swing.JTextField();
        jTextFieldTransac = new javax.swing.JTextField();
        jButtonVistaPrevia = new javax.swing.JButton();
        jPanelVistaPrevia = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAnadirVista = new javax.swing.JTextArea();
        jButtonGuardar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonAtras = new javax.swing.JButton();
        jPanelEliminar = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButtonAtras1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jRadioButtonEliminarNombre = new javax.swing.JRadioButton();
        jRadioButtonEliminarCuenta = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaEliminarVista = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldNombreBuscar = new javax.swing.JTextField();
        jTextFieldNumBuscar = new javax.swing.JTextField();
        jButtonEliminarBuscar = new javax.swing.JButton();
        jButtonEliminarCuenta = new javax.swing.JButton();
        jButtonEliminarCancelar = new javax.swing.JButton();
        jPanelConsultarSaldo = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButtonAtras2 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jTextFieldNombreSaldo = new javax.swing.JTextField();
        jButtonConsultarSaldo = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaConsulta = new javax.swing.JTextArea();
        jPanelBuscarCuenta = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButtonAtras3 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jRadioButtonEliminarNombre1 = new javax.swing.JRadioButton();
        jRadioButtonEliminarCuenta1 = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextAreaBusqueda = new javax.swing.JTextArea();
        jLabel33 = new javax.swing.JLabel();
        jTextFieldNombreBuscar2 = new javax.swing.JTextField();
        jTextFieldNumBuscar2 = new javax.swing.JTextField();
        jButtonEliminarBuscar2 = new javax.swing.JButton();
        jButtonEliminarCancelar2 = new javax.swing.JButton();
        jPanelInfoCuentas = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButtonAtras4 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextAreaTodo = new javax.swing.JTextArea();
        jLabel35 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanelEditarSaldo = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jButtonAtras5 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jTextFieldNumOpe = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jRadioButtonIngreso = new javax.swing.JRadioButton();
        jRadioButtonReintegro = new javax.swing.JRadioButton();
        jLabel38 = new javax.swing.JLabel();
        jTextFieldCantidad = new javax.swing.JTextField();
        jButtonoperacion = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        jTextFieldSaldoNuevo = new javax.swing.JTextField();
        jButtonCerrar1 = new javax.swing.JButton();
        jPanelAyuda = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jButtonCerrar = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jButtonAtras6 = new javax.swing.JButton();
        PanelEstado = new javax.swing.JPanel();
        Info = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMenuItemPanInicial = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenuEdicion = new javax.swing.JMenu();
        jMenuItemNuevaCuenta = new javax.swing.JMenuItem();
        jMenuItemEliminarCuenta = new javax.swing.JMenuItem();
        jMenuFuncion = new javax.swing.JMenu();
        jMenuItemConsultar = new javax.swing.JMenuItem();
        jMenuItemInfoCuenta = new javax.swing.JMenuItem();
        jMenuItemIngresoDinero = new javax.swing.JMenuItem();
        jMenuItemReintegro = new javax.swing.JMenuItem();
        jMenuItemInfoCuentas = new javax.swing.JMenuItem();
        jMenuHelp = new javax.swing.JMenu();
        jMenuItemAcercaFunciones = new javax.swing.JMenuItem();
        jMenuItemIntegrantes = new javax.swing.JMenuItem();
        jMenuItemAcerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Banco Fisi");
        setResizable(false);

        PanelPrincipal.setMaximumSize(new java.awt.Dimension(688, 500));
        PanelPrincipal.setLayout(new java.awt.BorderLayout());

        PanelFunciones.setMaximumSize(new java.awt.Dimension(940, 580));
        PanelFunciones.setMinimumSize(new java.awt.Dimension(940, 580));
        PanelFunciones.setPreferredSize(new java.awt.Dimension(940, 580));
        PanelFunciones.setLayout(new java.awt.CardLayout());

        PanelInicial.setMaximumSize(new java.awt.Dimension(940, 580));
        PanelInicial.setMinimumSize(new java.awt.Dimension(940, 580));
        PanelInicial.setPreferredSize(new java.awt.Dimension(940, 580));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inicio/titulo.png"))); // NOI18N

        jPanelEdicion.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonAnadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inicio/Añadir Usuario.png"))); // NOI18N
        jButtonAnadir.setText("Añadir usuario al Sistema");
        jButtonAnadir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAnadir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnadirActionPerformed(evt);
            }
        });

        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inicio/Eliminar Usuario.png"))); // NOI18N
        jButtonEliminar.setText("Eliminar Usuario");
        jButtonEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inicio/edicion.png"))); // NOI18N

        javax.swing.GroupLayout jPanelEdicionLayout = new javax.swing.GroupLayout(jPanelEdicion);
        jPanelEdicion.setLayout(jPanelEdicionLayout);
        jPanelEdicionLayout.setHorizontalGroup(
            jPanelEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEdicionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAnadir, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
            .addGroup(jPanelEdicionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelEdicionLayout.setVerticalGroup(
            jPanelEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEdicionLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jButtonAnadir, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanelFunciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inicio/funciones.png"))); // NOI18N

        jButtonInfoCuenta.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonInfoCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inicio/Estadisticas.png"))); // NOI18N
        jButtonInfoCuenta.setText("Informacion de las Cuentas");
        jButtonInfoCuenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonInfoCuenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonInfoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInfoCuentaActionPerformed(evt);
            }
        });

        jButtonConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inicio/cuenta.png"))); // NOI18N
        jButtonConsulta.setText("Consultar Saldo");
        jButtonConsulta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonConsulta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultaActionPerformed(evt);
            }
        });

        jButtonIngresoDinero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inicio/buscar.png"))); // NOI18N
        jButtonIngresoDinero.setText("Buscar una Cuenta");
        jButtonIngresoDinero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonIngresoDinero.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonIngresoDinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresoDineroActionPerformed(evt);
            }
        });

        jButtonReintegro.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonReintegro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inicio/reintegro.png"))); // NOI18N
        jButtonReintegro.setText("Ingreso / Reintegro de saldo");
        jButtonReintegro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonReintegro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonReintegro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReintegroActionPerformed(evt);
            }
        });

        jButtonAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inicio/Ayuda.png"))); // NOI18N
        jButtonAyuda.setText("Ayuda");
        jButtonAyuda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAyuda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAyudaActionPerformed(evt);
            }
        });

        jButtonAcerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/Ideas.png"))); // NOI18N
        jButtonAcerca.setText("Acerca de...");
        jButtonAcerca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAcerca.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcercaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFuncionesLayout = new javax.swing.GroupLayout(jPanelFunciones);
        jPanelFunciones.setLayout(jPanelFuncionesLayout);
        jPanelFuncionesLayout.setHorizontalGroup(
            jPanelFuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFuncionesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelFuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFuncionesLayout.createSequentialGroup()
                        .addGroup(jPanelFuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonReintegro, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonIngresoDinero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonAcerca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonInfoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFuncionesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addGap(47, 47, 47)))
                .addGap(31, 31, 31))
        );
        jPanelFuncionesLayout.setVerticalGroup(
            jPanelFuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFuncionesLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addGap(28, 28, 28)
                .addGroup(jPanelFuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButtonConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonInfoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonIngresoDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanelFuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAyuda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAcerca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonReintegro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout PanelInicialLayout = new javax.swing.GroupLayout(PanelInicial);
        PanelInicial.setLayout(PanelInicialLayout);
        PanelInicialLayout.setHorizontalGroup(
            PanelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInicialLayout.createSequentialGroup()
                .addGroup(PanelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelInicialLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanelEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelFunciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelInicialLayout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jLabel2)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        PanelInicialLayout.setVerticalGroup(
            PanelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelFunciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        PanelFunciones.add(PanelInicial, "PanelInicial");

        jPanelAnadir.setMaximumSize(new java.awt.Dimension(940, 580));
        jPanelAnadir.setMinimumSize(new java.awt.Dimension(940, 580));
        jPanelAnadir.setPreferredSize(new java.awt.Dimension(940, 580));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingreso de Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        jPanelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 51, 102))); // NOI18N

        jButtonAnadirLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/limpiar.png"))); // NOI18N
        jButtonAnadirLimpiar.setText("Limpiar Campos");
        jButtonAnadirLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnadirLimpiarActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/item.png"))); // NOI18N
        jLabel6.setText("Nombre: ");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/item.png"))); // NOI18N
        jLabel7.setText("Apellidos:");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/item.png"))); // NOI18N
        jLabel8.setText("Numero de Cuenta:");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/item.png"))); // NOI18N
        jLabel9.setText("Saldo Inicial:");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/item.png"))); // NOI18N
        jLabel10.setText("Tipo de Cuenta:");

        jTextFieldNombre.setBackground(new java.awt.Color(153, 255, 204));

        jTextFieldApellidos.setBackground(new java.awt.Color(153, 255, 204));

        jTextFieldNumCuenta.setBackground(new java.awt.Color(153, 255, 204));

        jTextFieldSaldoIni.setBackground(new java.awt.Color(153, 255, 204));

        jComboBoxTipoCuenta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione......", "Cuenta de Ahorro", "Cuenta Corriente", "Cuenta Corriente con Intereses" }));
        jComboBoxTipoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoCuentaActionPerformed(evt);
            }
        });

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Intereses", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(51, 102, 255)));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/item.png"))); // NOI18N
        jLabel11.setText("Mantenimiento:");
        jLabel11.setEnabled(false);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/item.png"))); // NOI18N
        jLabel12.setText("Importe de transacciones:");
        jLabel12.setEnabled(false);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/item.png"))); // NOI18N
        jLabel13.setText("Transacciones exentas:");
        jLabel13.setEnabled(false);

        jTextFieldMantenimiento.setBackground(new java.awt.Color(153, 255, 204));
        jTextFieldMantenimiento.setEnabled(false);

        jTextFieldImporte.setBackground(new java.awt.Color(153, 255, 204));
        jTextFieldImporte.setEnabled(false);

        jTextFieldTransac.setBackground(new java.awt.Color(153, 255, 204));
        jTextFieldTransac.setEnabled(false);
        jTextFieldTransac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTransacActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTransac)
                    .addComponent(jTextFieldImporte))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel13))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldTransac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonVistaPrevia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/vistaprevia.png"))); // NOI18N
        jButtonVistaPrevia.setText("Vista Previa");
        jButtonVistaPrevia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVistaPreviaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDatosLayout = new javax.swing.GroupLayout(jPanelDatos);
        jPanelDatos.setLayout(jPanelDatosLayout);
        jPanelDatosLayout.setHorizontalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelDatosLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNombre))
                            .addGroup(jPanelDatosLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldApellidos))
                            .addGroup(jPanelDatosLayout.createSequentialGroup()
                                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanelDatosLayout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addGap(35, 35, 35))
                                        .addComponent(jLabel8))
                                    .addComponent(jLabel9))
                                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jTextFieldSaldoIni))
                                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBoxTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldNumCuenta))))))
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButtonAnadirLimpiar)
                        .addGap(32, 32, 32)
                        .addComponent(jButtonVistaPrevia, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDatosLayout.setVerticalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldNumCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldSaldoIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBoxTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVistaPrevia, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAnadirLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelVistaPrevia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vista Previa de los Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 51, 153))); // NOI18N

        jTextAreaAnadirVista.setBackground(new java.awt.Color(255, 255, 204));
        jTextAreaAnadirVista.setColumns(20);
        jTextAreaAnadirVista.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextAreaAnadirVista.setRows(5);
        jScrollPane1.setViewportView(jTextAreaAnadirVista);

        javax.swing.GroupLayout jPanelVistaPreviaLayout = new javax.swing.GroupLayout(jPanelVistaPrevia);
        jPanelVistaPrevia.setLayout(jPanelVistaPreviaLayout);
        jPanelVistaPreviaLayout.setHorizontalGroup(
            jPanelVistaPreviaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVistaPreviaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );
        jPanelVistaPreviaLayout.setVerticalGroup(
            jPanelVistaPreviaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVistaPreviaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/guardar.png"))); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/cancelar.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar ");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelVistaPrevia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelVistaPrevia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonCancelar, 0, 0, Short.MAX_VALUE)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
            .addComponent(jPanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/anadir.png"))); // NOI18N

        jButtonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/atras.png"))); // NOI18N
        jButtonAtras.setText("Atras");
        jButtonAtras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAtras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAtras)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAtras)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelAnadirLayout = new javax.swing.GroupLayout(jPanelAnadir);
        jPanelAnadir.setLayout(jPanelAnadirLayout);
        jPanelAnadirLayout.setHorizontalGroup(
            jPanelAnadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAnadirLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanelAnadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAnadirLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelAnadirLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel5)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanelAnadirLayout.setVerticalGroup(
            jPanelAnadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAnadirLayout.createSequentialGroup()
                .addGroup(jPanelAnadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAnadirLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelAnadirLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        PanelFunciones.add(jPanelAnadir, "jPanelAnadir");

        jPanelEliminar.setMaximumSize(new java.awt.Dimension(940, 580));
        jPanelEliminar.setMinimumSize(new java.awt.Dimension(940, 580));
        jPanelEliminar.setPreferredSize(new java.awt.Dimension(940, 580));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/eliminar.png"))); // NOI18N

        jButtonAtras1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/atras.png"))); // NOI18N
        jButtonAtras1.setText("Atras");
        jButtonAtras1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAtras1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonAtras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtras1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAtras1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAtras1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seleccione Metodo....", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        buttonGroupEliminar.add(jRadioButtonEliminarNombre);
        jRadioButtonEliminarNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButtonEliminarNombre.setText("Eliminar por nombre del propietario");
        jRadioButtonEliminarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonEliminarNombreActionPerformed(evt);
            }
        });

        buttonGroupEliminar.add(jRadioButtonEliminarCuenta);
        jRadioButtonEliminarCuenta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButtonEliminarCuenta.setText("Eliminar por numero de Cuenta");
        jRadioButtonEliminarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonEliminarCuentaActionPerformed(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/cliente.png"))); // NOI18N

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/numero.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonEliminarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonEliminarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonEliminarNombre)
                            .addComponent(jRadioButtonEliminarCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(37, 37, 37))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Proceso de Eliminacion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/item.png"))); // NOI18N
        jLabel17.setText("Nombre del Propietario");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/item.png"))); // NOI18N
        jLabel18.setText("Numero de Cuenta");
        jLabel18.setEnabled(false);

        jTextAreaEliminarVista.setBackground(new java.awt.Color(255, 255, 204));
        jTextAreaEliminarVista.setColumns(20);
        jTextAreaEliminarVista.setEditable(false);
        jTextAreaEliminarVista.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextAreaEliminarVista.setRows(5);
        jScrollPane2.setViewportView(jTextAreaEliminarVista);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/item.png"))); // NOI18N
        jLabel19.setText("Informacion de la cuenta a eliminar:");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/item.png"))); // NOI18N
        jLabel20.setText("Si todo es correcto y esta seguro presiones eliminar, sino marque cancelar:");

        jTextFieldNumBuscar.setEnabled(false);

        jButtonEliminarBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/buscarlupa.png"))); // NOI18N
        jButtonEliminarBuscar.setText("Buscar");
        jButtonEliminarBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarBuscarActionPerformed(evt);
            }
        });

        jButtonEliminarCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/eliminarcuenta.png"))); // NOI18N
        jButtonEliminarCuenta.setText("Eliminar Cuenta");
        jButtonEliminarCuenta.setEnabled(false);
        jButtonEliminarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarCuentaActionPerformed(evt);
            }
        });

        jButtonEliminarCancelar.setText("Cancelar");
        jButtonEliminarCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldNombreBuscar)
                                    .addComponent(jTextFieldNumBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addComponent(jButtonEliminarBuscar))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jButtonEliminarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButtonEliminarCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jTextFieldNombreBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jTextFieldNumBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButtonEliminarBuscar))
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEliminarCuenta)
                    .addComponent(jButtonEliminarCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelEliminarLayout = new javax.swing.GroupLayout(jPanelEliminar);
        jPanelEliminar.setLayout(jPanelEliminarLayout);
        jPanelEliminarLayout.setHorizontalGroup(
            jPanelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEliminarLayout.createSequentialGroup()
                .addGroup(jPanelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEliminarLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel14))
                    .addGroup(jPanelEliminarLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanelEliminarLayout.setVerticalGroup(
            jPanelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        PanelFunciones.add(jPanelEliminar, "jPanelEliminar");

        jPanelConsultarSaldo.setMaximumSize(new java.awt.Dimension(940, 580));
        jPanelConsultarSaldo.setMinimumSize(new java.awt.Dimension(940, 580));
        jPanelConsultarSaldo.setPreferredSize(new java.awt.Dimension(940, 580));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/consultasaldo.png"))); // NOI18N

        jButtonAtras2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/atras.png"))); // NOI18N
        jButtonAtras2.setText("Atras");
        jButtonAtras2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAtras2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonAtras2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtras2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAtras2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAtras2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta Rapida", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 153, 102))); // NOI18N

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/item.png"))); // NOI18N
        jLabel22.setText("Ingrese el nombre o el numero de cuenta:");

        jButtonConsultarSaldo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/consultabuscar.png"))); // NOI18N
        jButtonConsultarSaldo.setText("Consultar Saldo");
        jButtonConsultarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarSaldoActionPerformed(evt);
            }
        });

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/item.png"))); // NOI18N
        jLabel23.setText("Resultados:");

        jTextAreaConsulta.setColumns(20);
        jTextAreaConsulta.setEditable(false);
        jTextAreaConsulta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextAreaConsulta.setRows(5);
        jScrollPane3.setViewportView(jTextAreaConsulta);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNombreSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(jButtonConsultarSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jTextFieldNombreSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonConsultarSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanelConsultarSaldoLayout = new javax.swing.GroupLayout(jPanelConsultarSaldo);
        jPanelConsultarSaldo.setLayout(jPanelConsultarSaldoLayout);
        jPanelConsultarSaldoLayout.setHorizontalGroup(
            jPanelConsultarSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultarSaldoLayout.createSequentialGroup()
                .addGroup(jPanelConsultarSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelConsultarSaldoLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel21))
                    .addGroup(jPanelConsultarSaldoLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanelConsultarSaldoLayout.setVerticalGroup(
            jPanelConsultarSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultarSaldoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConsultarSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        PanelFunciones.add(jPanelConsultarSaldo, "jPanelConsultarSaldo");

        jPanelBuscarCuenta.setMaximumSize(new java.awt.Dimension(940, 580));
        jPanelBuscarCuenta.setMinimumSize(new java.awt.Dimension(940, 580));
        jPanelBuscarCuenta.setPreferredSize(new java.awt.Dimension(940, 580));

        jButtonAtras3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/atras.png"))); // NOI18N
        jButtonAtras3.setText("Atras");
        jButtonAtras3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAtras3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonAtras3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtras3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAtras3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAtras3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/busqueda.png"))); // NOI18N

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seleccione Metodo....", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        buttonGroupEliminar.add(jRadioButtonEliminarNombre1);
        jRadioButtonEliminarNombre1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButtonEliminarNombre1.setSelected(true);
        jRadioButtonEliminarNombre1.setText("Buscar por nombre del propietario");
        jRadioButtonEliminarNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonEliminarNombre1ActionPerformed(evt);
            }
        });

        buttonGroupEliminar.add(jRadioButtonEliminarCuenta1);
        jRadioButtonEliminarCuenta1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButtonEliminarCuenta1.setText("Buscar por numero de Cuenta");
        jRadioButtonEliminarCuenta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonEliminarCuenta1ActionPerformed(evt);
            }
        });

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/cliente.png"))); // NOI18N

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/numero.png"))); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonEliminarNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jLabel26)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonEliminarCuenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel25)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel26)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonEliminarNombre1)
                            .addComponent(jRadioButtonEliminarCuenta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(37, 37, 37))
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Proceso de Busqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/item.png"))); // NOI18N
        jLabel31.setText("Nombre del Propietario");

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/item.png"))); // NOI18N
        jLabel32.setText("Numero de Cuenta");
        jLabel32.setEnabled(false);

        jTextAreaBusqueda.setBackground(new java.awt.Color(255, 255, 204));
        jTextAreaBusqueda.setColumns(20);
        jTextAreaBusqueda.setEditable(false);
        jTextAreaBusqueda.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextAreaBusqueda.setRows(5);
        jScrollPane5.setViewportView(jTextAreaBusqueda);

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/item.png"))); // NOI18N
        jLabel33.setText("Informacion sobre el proceso:");

        jTextFieldNumBuscar2.setEnabled(false);

        jButtonEliminarBuscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/consulbusqueda.png"))); // NOI18N
        jButtonEliminarBuscar2.setText("Buscar");
        jButtonEliminarBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarBuscar2ActionPerformed(evt);
            }
        });

        jButtonEliminarCancelar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/cancelar.png"))); // NOI18N
        jButtonEliminarCancelar2.setText("Cerrar");
        jButtonEliminarCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarCancelar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNombreBuscar2)
                            .addComponent(jTextFieldNumBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEliminarBuscar2))
                    .addComponent(jScrollPane5))
                .addContainerGap(86, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonEliminarCancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(263, 263, 263))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(jTextFieldNombreBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNumBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32))
                        .addGap(25, 25, 25)
                        .addComponent(jLabel33))
                    .addComponent(jButtonEliminarBuscar2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonEliminarCancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout jPanelBuscarCuentaLayout = new javax.swing.GroupLayout(jPanelBuscarCuenta);
        jPanelBuscarCuenta.setLayout(jPanelBuscarCuentaLayout);
        jPanelBuscarCuentaLayout.setHorizontalGroup(
            jPanelBuscarCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscarCuentaLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanelBuscarCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelBuscarCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBuscarCuentaLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel24)
                        .addGap(12, 12, 12)))
                .addGap(129, 129, 129))
        );
        jPanelBuscarCuentaLayout.setVerticalGroup(
            jPanelBuscarCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscarCuentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBuscarCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        PanelFunciones.add(jPanelBuscarCuenta, "jPanelBuscarCuenta");

        jPanelInfoCuentas.setMaximumSize(new java.awt.Dimension(940, 580));
        jPanelInfoCuentas.setMinimumSize(new java.awt.Dimension(940, 580));
        jPanelInfoCuentas.setPreferredSize(new java.awt.Dimension(940, 580));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/informacioncuentas.png"))); // NOI18N

        jButtonAtras4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/atras.png"))); // NOI18N
        jButtonAtras4.setText("Volver");
        jButtonAtras4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAtras4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonAtras4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtras4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAtras4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAtras4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informacion de las Cuentas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(102, 102, 0))); // NOI18N

        jTextAreaTodo.setBackground(new java.awt.Color(204, 255, 204));
        jTextAreaTodo.setColumns(20);
        jTextAreaTodo.setEditable(false);
        jTextAreaTodo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextAreaTodo.setRows(5);
        jTextAreaTodo.setText("\n         Presione boton VER para obtener resultados\n         Presiones VOLVER para regresar al Panel de Funciones");
        jScrollPane6.setViewportView(jTextAreaTodo);

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/item.png"))); // NOI18N
        jLabel35.setText("Informacion de todas las cuentas registradas:");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/vistaprevia.png"))); // NOI18N
        jButton2.setText("  VER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelInfoCuentasLayout = new javax.swing.GroupLayout(jPanelInfoCuentas);
        jPanelInfoCuentas.setLayout(jPanelInfoCuentasLayout);
        jPanelInfoCuentasLayout.setHorizontalGroup(
            jPanelInfoCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoCuentasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel34)
                .addContainerGap(140, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInfoCuentasLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        jPanelInfoCuentasLayout.setVerticalGroup(
            jPanelInfoCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoCuentasLayout.createSequentialGroup()
                .addGroup(jPanelInfoCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInfoCuentasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelInfoCuentasLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel34)))
                .addGap(18, 18, 18)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        PanelFunciones.add(jPanelInfoCuentas, "jPanelInfoCuentas");

        jPanelEditarSaldo.setMaximumSize(new java.awt.Dimension(940, 580));
        jPanelEditarSaldo.setMinimumSize(new java.awt.Dimension(940, 580));
        jPanelEditarSaldo.setPreferredSize(new java.awt.Dimension(940, 580));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/editarsaldo.png"))); // NOI18N

        jButtonAtras5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/atras.png"))); // NOI18N
        jButtonAtras5.setText("Atras");
        jButtonAtras5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAtras5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonAtras5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtras5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAtras5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAtras5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingreso / Reintegro del Saldo de las Cuentas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 0, 204))); // NOI18N

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/item.png"))); // NOI18N
        jLabel37.setText("Numero de Cuenta: ");

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 153, 153))); // NOI18N

        buttonGroupReintegro.add(jRadioButtonIngreso);
        jRadioButtonIngreso.setSelected(true);
        jRadioButtonIngreso.setText("Ingresar Saldo");

        buttonGroupReintegro.add(jRadioButtonReintegro);
        jRadioButtonReintegro.setText("Reintegrar Saldo (Retiro)");

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/item.png"))); // NOI18N
        jLabel38.setText("Cantidad de dinero:");

        jButtonoperacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonoperacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/configuracion.png"))); // NOI18N
        jButtonoperacion.setText("Realizar Operacion");
        jButtonoperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonoperacionActionPerformed(evt);
            }
        });

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/item.png"))); // NOI18N
        jLabel39.setText("Nuevo Saldo:");

        jTextFieldSaldoNuevo.setEditable(false);
        jTextFieldSaldoNuevo.setBackground(new java.awt.Color(51, 0, 255));
        jTextFieldSaldoNuevo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldSaldoNuevo.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jRadioButtonIngreso)
                        .addGap(143, 143, 143)
                        .addComponent(jRadioButtonReintegro))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addComponent(jButtonoperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldSaldoNuevo)
                                    .addComponent(jTextFieldCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE))))))
                .addGap(121, 121, 121))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonReintegro)
                    .addComponent(jRadioButtonIngreso))
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jTextFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonoperacion)
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSaldoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonCerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/cancelar.png"))); // NOI18N
        jButtonCerrar1.setText("Cerrar Funcion");
        jButtonCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel37)
                                .addGap(55, 55, 55)
                                .addComponent(jTextFieldNumOpe, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jButtonCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNumOpe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addGap(27, 27, 27)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCerrar1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelEditarSaldoLayout = new javax.swing.GroupLayout(jPanelEditarSaldo);
        jPanelEditarSaldo.setLayout(jPanelEditarSaldoLayout);
        jPanelEditarSaldoLayout.setHorizontalGroup(
            jPanelEditarSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEditarSaldoLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel36)
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEditarSaldoLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );
        jPanelEditarSaldoLayout.setVerticalGroup(
            jPanelEditarSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditarSaldoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEditarSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEditarSaldoLayout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(30, 30, 30)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        PanelFunciones.add(jPanelEditarSaldo, "jPanelEditarSaldo");

        jPanelAyuda.setMaximumSize(new java.awt.Dimension(940, 580));
        jPanelAyuda.setMinimumSize(new java.awt.Dimension(940, 580));
        jPanelAyuda.setPreferredSize(new java.awt.Dimension(940, 580));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/panelayuda.png"))); // NOI18N

        jTextArea3.setBackground(new java.awt.Color(204, 204, 255));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("\nMiniguia del Programa Sistema Bancario\n------------------------------------------------------------\n\nAntes de usar esta aplicacion asegurese de tener cuentas ingresadas o que cargue algun archivo con la informacion\nde estas cuentas. Si no el programa de alertara de la ausencia de estas.\n\n\nFunciones generales\n-Añadir Usuario\n-Eliminar Usuario\n\n\nFunciones especiales\n-Consulta rapida de Saldo\n-Busqueda de la informacion de una Cuenta\n-Informacion de todas las cuentas\n-Añadir/Quitar fondos de sus cuentas");
        jScrollPane7.setViewportView(jTextArea3);

        jButtonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/cancelar.png"))); // NOI18N
        jButtonCerrar.setText("Cerrar ayuda");
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });

        jButtonAtras6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paneles/atras.png"))); // NOI18N
        jButtonAtras6.setText("Atras");
        jButtonAtras6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAtras6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonAtras6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtras6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAtras6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAtras6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelAyudaLayout = new javax.swing.GroupLayout(jPanelAyuda);
        jPanelAyuda.setLayout(jPanelAyudaLayout);
        jPanelAyudaLayout.setHorizontalGroup(
            jPanelAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAyudaLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                .addGap(143, 143, 143))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAyudaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAyudaLayout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel40)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAyudaLayout.createSequentialGroup()
                        .addComponent(jButtonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(355, 355, 355))))
        );
        jPanelAyudaLayout.setVerticalGroup(
            jPanelAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAyudaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel40)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButtonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAyudaLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(465, 465, 465))
        );

        PanelFunciones.add(jPanelAyuda, "jPanelAyuda");

        PanelPrincipal.add(PanelFunciones, java.awt.BorderLayout.NORTH);

        PanelEstado.setPreferredSize(new java.awt.Dimension(955, 40));

        Info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu/ayudamenu.png"))); // NOI18N
        Info.setText("Bienvenido al Programa");

        javax.swing.GroupLayout PanelEstadoLayout = new javax.swing.GroupLayout(PanelEstado);
        PanelEstado.setLayout(PanelEstadoLayout);
        PanelEstadoLayout.setHorizontalGroup(
            PanelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEstadoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Info, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        PanelEstadoLayout.setVerticalGroup(
            PanelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEstadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Info, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanelPrincipal.add(PanelEstado, java.awt.BorderLayout.SOUTH);

        jMenuArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu/archivo.png"))); // NOI18N
        jMenuArchivo.setText("Archivo       ");

        jMenuItemPanInicial.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_HOME, 0));
        jMenuItemPanInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu/bienvenida.png"))); // NOI18N
        jMenuItemPanInicial.setText("Pantalla Inicial");
        jMenuItemPanInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPanInicialActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemPanInicial);
        jMenuArchivo.add(jSeparator1);

        jMenuItemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu/Parar.png"))); // NOI18N
        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemSalir);

        jMenuBar1.add(jMenuArchivo);

        jMenuEdicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu/edicion.png"))); // NOI18N
        jMenuEdicion.setText("Editar       ");

        jMenuItemNuevaCuenta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemNuevaCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu/anadirPaciente.png"))); // NOI18N
        jMenuItemNuevaCuenta.setText("Ingresar nueva cuenta");
        jMenuItemNuevaCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNuevaCuentaActionPerformed(evt);
            }
        });
        jMenuEdicion.add(jMenuItemNuevaCuenta);

        jMenuItemEliminarCuenta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemEliminarCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu/eliminarPaciente.png"))); // NOI18N
        jMenuItemEliminarCuenta.setText("Eliminar cuenta");
        jMenuItemEliminarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEliminarCuentaActionPerformed(evt);
            }
        });
        jMenuEdicion.add(jMenuItemEliminarCuenta);

        jMenuBar1.add(jMenuEdicion);

        jMenuFuncion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu/herramientas.png"))); // NOI18N
        jMenuFuncion.setText("Funciones     ");

        jMenuItemConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu/herramientas.png"))); // NOI18N
        jMenuItemConsultar.setText("Consultar Saldo");
        jMenuItemConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultarActionPerformed(evt);
            }
        });
        jMenuFuncion.add(jMenuItemConsultar);

        jMenuItemInfoCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu/herramientas.png"))); // NOI18N
        jMenuItemInfoCuenta.setText("Ver informacion de una cuenta");
        jMenuItemInfoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInfoCuentaActionPerformed(evt);
            }
        });
        jMenuFuncion.add(jMenuItemInfoCuenta);

        jMenuItemIngresoDinero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu/herramientas.png"))); // NOI18N
        jMenuItemIngresoDinero.setText("Ingreso de dinero");
        jMenuItemIngresoDinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemIngresoDineroActionPerformed(evt);
            }
        });
        jMenuFuncion.add(jMenuItemIngresoDinero);

        jMenuItemReintegro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu/herramientas.png"))); // NOI18N
        jMenuItemReintegro.setText("Reintegro (Retiro)");
        jMenuItemReintegro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemReintegroActionPerformed(evt);
            }
        });
        jMenuFuncion.add(jMenuItemReintegro);

        jMenuItemInfoCuentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu/herramientas.png"))); // NOI18N
        jMenuItemInfoCuentas.setText("Informacion de las Cuentas");
        jMenuItemInfoCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInfoCuentasActionPerformed(evt);
            }
        });
        jMenuFuncion.add(jMenuItemInfoCuentas);

        jMenuBar1.add(jMenuFuncion);

        jMenuHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu/ayuda.png"))); // NOI18N
        jMenuHelp.setText("Ayuda   ");

        jMenuItemAcercaFunciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu/ayudamenu.png"))); // NOI18N
        jMenuItemAcercaFunciones.setText("Ayuda acerca de las funciones");
        jMenuItemAcercaFunciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAcercaFuncionesActionPerformed(evt);
            }
        });
        jMenuHelp.add(jMenuItemAcercaFunciones);

        jMenuItemIntegrantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu/skin.png"))); // NOI18N
        jMenuItemIntegrantes.setText("Integrantes del Grupo");
        jMenuItemIntegrantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemIntegrantesActionPerformed(evt);
            }
        });
        jMenuHelp.add(jMenuItemIntegrantes);

        jMenuItemAcerca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItemAcerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu/skin.png"))); // NOI18N
        jMenuItemAcerca.setText("Acerca de...");
        jMenuItemAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAcercaActionPerformed(evt);
            }
        });
        jMenuHelp.add(jMenuItemAcerca);

        jMenuBar1.add(jMenuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxTipoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoCuentaActionPerformed
        if (jComboBoxTipoCuenta.getSelectedIndex() == 0) {
            jLabel11.setEnabled(false);
            jLabel12.setEnabled(false);
            jLabel13.setEnabled(false);
            jTextFieldMantenimiento.setEnabled(false);
            jTextFieldImporte.setEnabled(false);
            jTextFieldTransac.setEnabled(false);
        }
        if (jComboBoxTipoCuenta.getSelectedIndex() == 1) {
            jLabel11.setEnabled(true);
            jLabel12.setEnabled(false);
            jLabel13.setEnabled(false);
            jTextFieldMantenimiento.setEnabled(true);
            jTextFieldImporte.setEnabled(false);
            jTextFieldTransac.setEnabled(false);
        }
        if (jComboBoxTipoCuenta.getSelectedIndex() == 2 || jComboBoxTipoCuenta.getSelectedIndex() == 3) {
            jLabel11.setEnabled(false);
            jLabel12.setEnabled(true);
            jLabel13.setEnabled(true);
            jTextFieldMantenimiento.setEnabled(false);
            jTextFieldImporte.setEnabled(true);
            jTextFieldTransac.setEnabled(true);
        }
    }//GEN-LAST:event_jComboBoxTipoCuentaActionPerformed

    private void jTextFieldTransacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTransacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTransacActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        limpiarAnadir();
        cambiarAlinicio();
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonAtras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtras1ActionPerformed
        limpiarEliminar();
        cambiarAlinicio();
    }//GEN-LAST:event_jButtonAtras1ActionPerformed
    private void jRadioButtonEliminarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonEliminarNombreActionPerformed
        jLabel17.setEnabled(true);
        jTextFieldNombreBuscar.setEnabled(true);
        jLabel18.setEnabled(false);
        jTextFieldNumBuscar.setEnabled(false);
    }//GEN-LAST:event_jRadioButtonEliminarNombreActionPerformed

    private void jButtonAtras2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtras2ActionPerformed
        jTextFieldNombreSaldo.setText("");
        jTextAreaConsulta.setText("");
        cambiarAlinicio();
    }//GEN-LAST:event_jButtonAtras2ActionPerformed

    private void jButtonAtras3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtras3ActionPerformed
        limpiarBuscar();
        cambiarAlinicio();
    }//GEN-LAST:event_jButtonAtras3ActionPerformed

    private void jRadioButtonEliminarNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonEliminarNombre1ActionPerformed
        jLabel31.setEnabled(true);
        jTextFieldNombreBuscar2.setEnabled(true);
        jLabel32.setEnabled(false);
        jTextFieldNumBuscar2.setEnabled(false);
    }//GEN-LAST:event_jRadioButtonEliminarNombre1ActionPerformed

    private void jButtonAtras4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtras4ActionPerformed
        limpiarInfoTodo();
        cambiarAlinicio();
    }//GEN-LAST:event_jButtonAtras4ActionPerformed

    private void jButtonAtras5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtras5ActionPerformed
        limpiarOperacion();
        cambiarAlinicio();
    }//GEN-LAST:event_jButtonAtras5ActionPerformed

    private void jButtonAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnadirActionPerformed
        cambiarPanelesCambiante("jPanelAnadir");
    }//GEN-LAST:event_jButtonAnadirActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        cambiarPanelesCambiante("jPanelEliminar");
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultaActionPerformed
        cambiarPanelesCambiante("jPanelConsultarSaldo");
    }//GEN-LAST:event_jButtonConsultaActionPerformed

    private void jButtonIngresoDineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresoDineroActionPerformed
        cambiarPanelesCambiante("jPanelBuscarCuenta");
    }//GEN-LAST:event_jButtonIngresoDineroActionPerformed

    private void jButtonInfoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInfoCuentaActionPerformed
        cambiarPanelesCambiante("jPanelInfoCuentas");
    }//GEN-LAST:event_jButtonInfoCuentaActionPerformed

    private void jButtonReintegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReintegroActionPerformed
        cambiarPanelesCambiante("jPanelEditarSaldo");
    }//GEN-LAST:event_jButtonReintegroActionPerformed

    private void jButtonAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAyudaActionPerformed
        cambiarPanelesCambiante("jPanelAyuda");
    }//GEN-LAST:event_jButtonAyudaActionPerformed

    private void jButtonAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcercaActionPerformed
        mostrarOption("\n\nRelizado por los alumnos : \n Kelly Melo  \n -Denith Silva \n   -Andrea Lopez \n    -Lizeth Ñaupari  \n  -Tania  Lopez  \n  ", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButtonAcercaActionPerformed

    private void jMenuItemPanInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPanInicialActionPerformed
        cambiarPanelesCambiante("PanelInicial");
    }//GEN-LAST:event_jMenuItemPanInicialActionPerformed

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        int a = JOptionPane.showConfirmDialog(this, "Seguro de salir de la aplicacion", "Aplicacion Banco FISI", JOptionPane.OK_CANCEL_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jMenuItemNuevaCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNuevaCuentaActionPerformed
        cambiarPanelesCambiante("jPanelAnadir");
    }//GEN-LAST:event_jMenuItemNuevaCuentaActionPerformed

    private void jMenuItemEliminarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEliminarCuentaActionPerformed
        cambiarPanelesCambiante("jPanelEliminar");
    }//GEN-LAST:event_jMenuItemEliminarCuentaActionPerformed

    private void jMenuItemConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultarActionPerformed
        cambiarPanelesCambiante("jPanelConsultarSaldo");
    }//GEN-LAST:event_jMenuItemConsultarActionPerformed

    private void jMenuItemInfoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInfoCuentaActionPerformed
        cambiarPanelesCambiante("jPanelBuscarCuenta");
    }//GEN-LAST:event_jMenuItemInfoCuentaActionPerformed

    private void jMenuItemIngresoDineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemIngresoDineroActionPerformed
        cambiarPanelesCambiante("jPanelEditarSaldo");
    }//GEN-LAST:event_jMenuItemIngresoDineroActionPerformed

    private void jMenuItemReintegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemReintegroActionPerformed
        jRadioButtonReintegro.setSelected(true);
        cambiarPanelesCambiante("jPanelEditarSaldo");
    }//GEN-LAST:event_jMenuItemReintegroActionPerformed

    private void jMenuItemInfoCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInfoCuentasActionPerformed
        cambiarPanelesCambiante("jPanelInfoCuentas");
    }//GEN-LAST:event_jMenuItemInfoCuentasActionPerformed

    private void jMenuItemAcercaFuncionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAcercaFuncionesActionPerformed
        cambiarPanelesCambiante("jPanelAyuda");
    }//GEN-LAST:event_jMenuItemAcercaFuncionesActionPerformed

    private void jMenuItemIntegrantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemIntegrantesActionPerformed
        mostrarOption("\n\nRelizado por los alumnos : \n  - \n  - \n  - \n  - \n  - ", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItemIntegrantesActionPerformed

    private void jMenuItemAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAcercaActionPerformed
        mostrarOption("\nSistema para gestionar un Banco - FISI", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItemAcercaActionPerformed

    private void jButtonAtras6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtras6ActionPerformed
        cambiarAlinicio();
    }//GEN-LAST:event_jButtonAtras6ActionPerformed

    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
        cambiarAlinicio();
    }//GEN-LAST:event_jButtonCerrarActionPerformed

    private void jButtonCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrar1ActionPerformed
        limpiarOperacion();
        cambiarAlinicio();
    }//GEN-LAST:event_jButtonCerrar1ActionPerformed

    private void jButtonEliminarCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarCancelar2ActionPerformed
        limpiarBuscar();
        cambiarAlinicio();
    }//GEN-LAST:event_jButtonEliminarCancelar2ActionPerformed

    private void jButtonEliminarCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarCancelarActionPerformed
        limpiarEliminar();
        cambiarAlinicio();
    }//GEN-LAST:event_jButtonEliminarCancelarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        limpiarAnadir();
        cambiarAlinicio();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAnadirLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnadirLimpiarActionPerformed
        limpiarAnadir();
    }//GEN-LAST:event_jButtonAnadirLimpiarActionPerformed

    private void jButtonVistaPreviaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVistaPreviaActionPerformed
        if (comprobarAnadir()) {

            String cad = "\n\n\nINFORMACION DE LA CUENTA A INGRESAR: \n"
                    + "==============================\n" + " - Nombre del cliente : " + jTextFieldNombre.getText() + "\n - Numero de Cuenta : " + jTextFieldNumCuenta.getText()
                    + "\n - Saldo Inicial : " + jTextFieldSaldoIni.getText() + "\n - Tipo de Cuenta :  " + jComboBoxTipoCuenta.getSelectedItem() + "\n - Intereses : ";

            if (jComboBoxTipoCuenta.getSelectedIndex() == 1) {
                cad = cad + "\n    - Mantenimiento : " + jTextFieldMantenimiento.getText();
            }
            if (jComboBoxTipoCuenta.getSelectedIndex() == 2 || jComboBoxTipoCuenta.getSelectedIndex() == 3) {
                cad = cad + "\n    - Importe : " + jTextFieldImporte.getText() + "\n    - Transacciones : " + jTextFieldTransac.getText();
            }

            cad = cad + "\n\nPresione Guardar para almacenar estos datos o \ncancelar para volver al panel de funciones.";
            jTextAreaAnadirVista.setText(cad);
        } else {
            Base.mostrarOpcion("Error, no ha completado los campos necesarios", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonVistaPreviaActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        if (comprobarAnadir()) {
            CCuenta obj = null;
            if (jComboBoxTipoCuenta.getSelectedIndex() == 1) {
                obj = new CCuentaAhorro(jTextFieldNombre.getText() + " " + jTextFieldApellidos.getText(), jTextFieldNumCuenta.getText(), Base.convertirCadenaReal(jTextFieldSaldoIni.getText()), jComboBoxTipoCuenta.getSelectedIndex(), Base.convertirCadenaReal(jTextFieldMantenimiento.getText()));
            }
            if (jComboBoxTipoCuenta.getSelectedIndex() == 2) {
                obj = new CCuentaCorriente(jTextFieldNombre.getText() + " " + jTextFieldApellidos.getText(), jTextFieldNumCuenta.getText(), Base.convertirCadenaReal(jTextFieldSaldoIni.getText()), jComboBoxTipoCuenta.getSelectedIndex(), Base.convertirCadenaReal(jTextFieldImporte.getText()), Base.convertirCadenaEntero(jTextFieldTransac.getText()));
            }
            if (jComboBoxTipoCuenta.getSelectedIndex() == 3) {
                obj = new CCuentaCorriente(jTextFieldNombre.getText() + " " + jTextFieldApellidos.getText(), jTextFieldNumCuenta.getText(), Base.convertirCadenaReal(jTextFieldSaldoIni.getText()), jComboBoxTipoCuenta.getSelectedIndex(), Base.convertirCadenaReal(jTextFieldImporte.getText()), Base.convertirCadenaEntero(jTextFieldTransac.getText()));
            }
            banco.añadir(obj);
            mostrarOption(" Cuenta Guardada Exitosamente ", JOptionPane.INFORMATION_MESSAGE);
            limpiarAnadir();
            listaModificada = true;
        } else {
            Base.mostrarOpcion("Error, no ha completado los campos necesarios", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jRadioButtonEliminarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonEliminarCuentaActionPerformed
        jLabel17.setEnabled(false);
        jTextFieldNombreBuscar.setEnabled(false);
        jLabel18.setEnabled(true);
        jTextFieldNumBuscar.setEnabled(true);
    }//GEN-LAST:event_jRadioButtonEliminarCuentaActionPerformed

    private void jButtonEliminarBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarBuscarActionPerformed
        if (banco.longitud() == 0) {
            mostrarOption("Error: No hay clientes registrados en el banco.\n Ingrese las cuentas antes de hacer esta operacion.", JOptionPane.ERROR_MESSAGE);

        } else {

            if (jRadioButtonEliminarNombre.isSelected()) {
                if (jTextFieldNombreBuscar.getText().trim().compareToIgnoreCase("") == 0) {
                    mostrarOption("Error, ingrese el nombre a buscar", JOptionPane.ERROR_MESSAGE);
                } else {
                    String nom = jTextFieldNombreBuscar.getText().trim();
                    int pos = banco.buscar(nom, 0);
                    if (pos == -1) {
                        jTextAreaEliminarVista.setText("\nError, cuenta no encontrada");
                    } else {
                        String t = banco.verCuenta(pos);
                        jTextAreaEliminarVista.setText("\nEncontrado! " + "\n" + t + "\nPresione eliminar para acabar con la accion.");
                        jButtonEliminarCuenta.setEnabled(true);

                    }
                }
            } else {
                if (jTextFieldNumBuscar.getText().trim().compareToIgnoreCase("") == 0) {
                    mostrarOption("Error, ingrese el numero de cuenta a buscar", JOptionPane.ERROR_MESSAGE);
                } else {
                    String cue = jTextFieldNumBuscar.getText().trim();
                    int pos = banco.buscar(cue, 0);
                    if (pos == -1) {
                        jTextAreaEliminarVista.setText("\nError, cuenta no encontrada");
                    } else {
                        String t = banco.verCuenta(pos);
                        jTextAreaEliminarVista.setText("\nEncontrado! " + "\n" + t + "\nPresione eliminar para acabar con la accion.");
                        jButtonEliminarCuenta.setEnabled(true);
                    }
                }
            }
        }
    }//GEN-LAST:event_jButtonEliminarBuscarActionPerformed

    private void jButtonEliminarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarCuentaActionPerformed
        boolean eliminado;
        if (jRadioButtonEliminarNombre.isSelected()) {
            eliminado = banco.eliminarNom(jTextFieldNombreBuscar.getText().trim());
            if (eliminado) {
                mostrarOption("Listo, cliente eliminado", JOptionPane.INFORMATION_MESSAGE);
                jButtonEliminarCuenta.setEnabled(false);
            }
        } else {
            eliminado = banco.eliminarCue(jTextFieldNumBuscar.getText().trim());
            if (eliminado) {
                mostrarOption("Listo, cuenta eliminado", JOptionPane.INFORMATION_MESSAGE);
                jButtonEliminarCuenta.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jButtonEliminarCuentaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (banco.longitud() == 0) {
            mostrarOption("Error: No hay clientes registrados en el banco.\n Ingrese las cuentas antes de hacer esta operacion.", JOptionPane.ERROR_MESSAGE);

        } else {
            jTextAreaTodo.setText(banco.verTodo());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonConsultarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarSaldoActionPerformed
        if (banco.longitud() == 0) {
            mostrarOption("Error: No hay clientes registrados en el banco.\n Ingrese las cuentas antes de hacer esta operacion.", JOptionPane.ERROR_MESSAGE);
        } else {
            int pos = banco.buscar(jTextFieldNombreSaldo.getText(), 0);
            if (pos == -1) {
                mostrarOption("No se encontro el objeto", pos);
                jTextAreaConsulta.setText("\n\nBusqueda fallida");
            } else {
                jTextAreaConsulta.setText(banco.verCuenta(pos));
            }
        }
    }//GEN-LAST:event_jButtonConsultarSaldoActionPerformed

    private void jButtonEliminarBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarBuscar2ActionPerformed
        if (banco.longitud() == 0) {
            mostrarOption("Error: No hay clientes registrados en el banco.\n Ingrese las cuentas antes de hacer esta operacion.", JOptionPane.ERROR_MESSAGE);

        } else {
            if (jRadioButtonEliminarNombre1.isSelected()) {
                if (jTextFieldNombreBuscar2.getText().trim().compareToIgnoreCase("") == 0) {
                    mostrarOption("Error, ingrese el nombre a buscar", JOptionPane.ERROR_MESSAGE);
                } else {
                    String nom = jTextFieldNombreBuscar2.getText().trim();
                    int pos = banco.buscar(nom, 0);
                    if (pos == -1) {
                        jTextAreaBusqueda.setText("\nError, cuenta no encontrada");
                    } else {
                        String t = banco.verCuenta(pos);
                        jTextAreaBusqueda.setText("\nEncontrado! " + "\n" + t);
                    }
                }
            } else {
                if (jTextFieldNumBuscar2.getText().trim().compareToIgnoreCase("") == 0) {
                    mostrarOption("Error, ingrese el numero de cuenta a buscar", JOptionPane.ERROR_MESSAGE);
                } else {
                    String cue = jTextFieldNumBuscar2.getText().trim();
                    int pos = banco.buscar(cue, 0);
                    if (pos == -1) {
                        jTextAreaBusqueda.setText("\nError, cuenta no encontrada");
                    } else {
                        String t = banco.verCuenta(pos);
                        jTextAreaBusqueda.setText("\nEncontrado! " + "\n" + t);
                    }
                }
            }
        }
    }//GEN-LAST:event_jButtonEliminarBuscar2ActionPerformed

    private void jRadioButtonEliminarCuenta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonEliminarCuenta1ActionPerformed
        jLabel31.setEnabled(false);
        jTextFieldNombreBuscar2.setEnabled(false);
        jLabel32.setEnabled(true);
        jTextFieldNumBuscar2.setEnabled(true);
    }//GEN-LAST:event_jRadioButtonEliminarCuenta1ActionPerformed

    private void jButtonoperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonoperacionActionPerformed
         if (banco.longitud() == 0) {
            mostrarOption("Error: No hay clientes registrados en el banco.\n Ingrese las cuentas antes de hacer esta operacion.", JOptionPane.ERROR_MESSAGE);
        } else {
            
            int pos = banco.buscar(jTextFieldNumOpe.getText(), 0);
            if (pos == -1) {
                mostrarOption("No se encontro cliente", JOptionPane.ERROR_MESSAGE);
            } else {
                mostrarOption("Encontrado! "+banco.verCuenta(pos),JOptionPane.INFORMATION_MESSAGE);
                
                if(jRadioButtonReintegro.isSelected()){
                    double cant=Base.convertirCadenaReal(jTextFieldCantidad.getText());
                    banco.clienteEn(pos).reintegro(cant);
                    mostrarOption("Cantidad retirada de su saldo", JOptionPane.INFORMATION_MESSAGE);
                    jTextFieldSaldoNuevo.setText(" "+ banco.clienteEn(pos).estado());
                }
                if(jRadioButtonIngreso.isSelected()){
                    double cant=Base.convertirCadenaReal(jTextFieldCantidad.getText());
                    banco.clienteEn(pos).ingreso(cant);
                    mostrarOption("Cantidad añadida a su saldo", JOptionPane.INFORMATION_MESSAGE);
                    jTextFieldSaldoNuevo.setText(" "+ banco.clienteEn(pos).estado());
                }
            }
        }
    }//GEN-LAST:event_jButtonoperacionActionPerformed

    
    //Funciones de Limpieza de Interfaz
    
    public void limpiarOperacion(){
        jTextFieldNumOpe.setText("");
        jTextFieldCantidad.setText("");
        jTextFieldSaldoNuevo.setText("");
        jRadioButtonIngreso.setSelected(true);                
    }
    
    
    public void limpiarBuscar() {
        jTextFieldNombreBuscar2.setText("");
        jTextFieldNumBuscar2.setText("");
        jTextAreaBusqueda.setText("");
        jRadioButtonEliminarNombre1.setSelected(true);
    }

    public void limpiarInfoTodo() {
        jTextAreaTodo.setText("Presione boton VER para obtener resultados +\n    Presione VOLVER para regresar al Panel de Funciones");
    }

    public void limpiarEliminar() {
        jRadioButtonEliminarNombre.setSelected(true);
        jTextFieldNombreBuscar.setText("");
        jTextFieldNumBuscar.setText("");
        jTextAreaEliminarVista.setText("");
        jButtonEliminarCuenta.setEnabled(false);
        jLabel17.setEnabled(true);
        jTextFieldNombreBuscar.setEnabled(true);
        jLabel18.setEnabled(false);
        jTextFieldNumBuscar.setEnabled(false);
    }

    public void limpiarAnadir() {
        jTextFieldNombre.setText("");
        jTextFieldApellidos.setText("");
        jTextFieldNumCuenta.setText("");
        jTextFieldSaldoIni.setText("");
        jComboBoxTipoCuenta.setSelectedIndex(0);
        jTextFieldMantenimiento.setText("");
        jTextFieldMantenimiento.setEnabled(false);
        jTextFieldImporte.setText("");
        jTextFieldImporte.setEnabled(false);
        jTextFieldTransac.setText("");
        jTextFieldTransac.setEnabled(false);
        jTextAreaAnadirVista.setText("");
    }

    public boolean comprobarAnadir() {
        boolean z = true;
        if (jTextFieldNombre.getText().compareToIgnoreCase("") == 0 || jTextFieldApellidos.getText().compareToIgnoreCase("") == 0 || jTextFieldApellidos.getText().compareToIgnoreCase("") == 0 || jTextFieldNumCuenta.getText().compareToIgnoreCase("") == 0
                || jTextFieldSaldoIni.getText().compareToIgnoreCase("") == 0 || jComboBoxTipoCuenta.getSelectedIndex() == 0) {
            z = false;
        }

        return z;
    }

    public void cambiarAlinicio() {
        cambiarPanelesCambiante("PanelInicial");
        Info.setText("Seleccione una funcion para iniciar las operaciones...");
    }

    public void mostrarOption(String cad, int tipo) {
        JOptionPane.showMessageDialog(this, cad, "Sistema de Banco Fisi ", tipo);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /**Modo Office 2007**/
//        try {
//          UIManager.setLookAndFeel(new SynthLookAndFeel());
//        } catch (ParseException ex) {
//            System.out.println(ex.getMessage());
//        } catch (UnsupportedLookAndFeelException ex) {
//            System.out.println(ex.getMessage());
//        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new InterfazBanco().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Info;
    private javax.swing.JPanel PanelEstado;
    private javax.swing.JPanel PanelFunciones;
    private javax.swing.JPanel PanelInicial;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.ButtonGroup buttonGroupEliminar;
    private javax.swing.ButtonGroup buttonGroupReintegro;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAcerca;
    private javax.swing.JButton jButtonAnadir;
    private javax.swing.JButton jButtonAnadirLimpiar;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonAtras1;
    private javax.swing.JButton jButtonAtras2;
    private javax.swing.JButton jButtonAtras3;
    private javax.swing.JButton jButtonAtras4;
    private javax.swing.JButton jButtonAtras5;
    private javax.swing.JButton jButtonAtras6;
    private javax.swing.JButton jButtonAyuda;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JButton jButtonCerrar1;
    private javax.swing.JButton jButtonConsulta;
    private javax.swing.JButton jButtonConsultarSaldo;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonEliminarBuscar;
    private javax.swing.JButton jButtonEliminarBuscar2;
    private javax.swing.JButton jButtonEliminarCancelar;
    private javax.swing.JButton jButtonEliminarCancelar2;
    private javax.swing.JButton jButtonEliminarCuenta;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonInfoCuenta;
    private javax.swing.JButton jButtonIngresoDinero;
    private javax.swing.JButton jButtonReintegro;
    private javax.swing.JButton jButtonVistaPrevia;
    private javax.swing.JButton jButtonoperacion;
    private javax.swing.JComboBox jComboBoxTipoCuenta;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuEdicion;
    private javax.swing.JMenu jMenuFuncion;
    private javax.swing.JMenu jMenuHelp;
    private javax.swing.JMenuItem jMenuItemAcerca;
    private javax.swing.JMenuItem jMenuItemAcercaFunciones;
    private javax.swing.JMenuItem jMenuItemConsultar;
    private javax.swing.JMenuItem jMenuItemEliminarCuenta;
    private javax.swing.JMenuItem jMenuItemInfoCuenta;
    private javax.swing.JMenuItem jMenuItemInfoCuentas;
    private javax.swing.JMenuItem jMenuItemIngresoDinero;
    private javax.swing.JMenuItem jMenuItemIntegrantes;
    private javax.swing.JMenuItem jMenuItemNuevaCuenta;
    private javax.swing.JMenuItem jMenuItemPanInicial;
    private javax.swing.JMenuItem jMenuItemReintegro;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelAnadir;
    private javax.swing.JPanel jPanelAyuda;
    private javax.swing.JPanel jPanelBuscarCuenta;
    private javax.swing.JPanel jPanelConsultarSaldo;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JPanel jPanelEdicion;
    private javax.swing.JPanel jPanelEditarSaldo;
    private javax.swing.JPanel jPanelEliminar;
    private javax.swing.JPanel jPanelFunciones;
    private javax.swing.JPanel jPanelInfoCuentas;
    private javax.swing.JPanel jPanelVistaPrevia;
    private javax.swing.JRadioButton jRadioButtonEliminarCuenta;
    private javax.swing.JRadioButton jRadioButtonEliminarCuenta1;
    private javax.swing.JRadioButton jRadioButtonEliminarNombre;
    private javax.swing.JRadioButton jRadioButtonEliminarNombre1;
    private javax.swing.JRadioButton jRadioButtonIngreso;
    private javax.swing.JRadioButton jRadioButtonReintegro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextAreaAnadirVista;
    private javax.swing.JTextArea jTextAreaBusqueda;
    private javax.swing.JTextArea jTextAreaConsulta;
    private javax.swing.JTextArea jTextAreaEliminarVista;
    private javax.swing.JTextArea jTextAreaTodo;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldCantidad;
    private javax.swing.JTextField jTextFieldImporte;
    private javax.swing.JTextField jTextFieldMantenimiento;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldNombreBuscar;
    private javax.swing.JTextField jTextFieldNombreBuscar2;
    private javax.swing.JTextField jTextFieldNombreSaldo;
    private javax.swing.JTextField jTextFieldNumBuscar;
    private javax.swing.JTextField jTextFieldNumBuscar2;
    private javax.swing.JTextField jTextFieldNumCuenta;
    private javax.swing.JTextField jTextFieldNumOpe;
    private javax.swing.JTextField jTextFieldSaldoIni;
    private javax.swing.JTextField jTextFieldSaldoNuevo;
    private javax.swing.JTextField jTextFieldTransac;
    // End of variables declaration//GEN-END:variables

    private void ponIconitos() {

        Image ic1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/idea.png"));

        this.setIconImage(ic1);
    }
}
