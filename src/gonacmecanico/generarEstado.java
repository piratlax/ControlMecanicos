/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gonacmecanico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Conector;
import logica.Utilerias;

/**
 *
 * @author MaoRivera
 */
public class generarEstado extends javax.swing.JFrame {

    // Se instancia una conexion de la clase conecta
    Conector con=new Conector();
    // se asigna la conexion a la base de datos con la variable cn
    Connection cn=con.conecta();
    DefaultTableModel modelo;
    DefaultComboBoxModel modeloCombo;
    public generarEstado() {
        modeloCombo = new DefaultComboBoxModel(new String [] {});
        initComponents();
        this.setLocationRelativeTo(null);
        llenaComboBox();
        Utilerias util=new Utilerias();
        txtServicio.setText("170652");
        mostrarTabla();
        //txtServicio.setText(util.darNumeroServicio());
     
        //mostramos la hora
        Calendar calendario = Calendar.getInstance();
        int hora, minutos, segundos;
        hora =calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        txtHora.setText(hora+":"+minutos);
        auxiliarOff();
        txtId.setVisible(false);
    }
    
    private void llenaComboBox(){
 
try {
 
/* Realizamos la consulta a la base de datos*/
 
String sql = "SELECT * FROM mecanico";
 
/* Se prepara la consulta */

Statement verCoordinadores=cn.createStatement();

//PreparedStatement verUsuarios = con.conexion().prepareStatement(sql);
 
/* Y se ejecuta en la siguiente línea */
 
ResultSet ver = verCoordinadores.executeQuery(sql);
 
/* while recorremos el resultado generado por la consulta */
 
while(ver.next()){
 
/* fijate como con nuestro modelo y su método addElement vamos a agregar cada resultado a nuestro ComboBox, en lo personal concatene el resultado */
 
modeloCombo.addElement(ver.getString("completo"));
 
     }
 
 } catch (SQLException ex){
           System.out.println ("Sin poder ejecutar el query a la tabla");
 }
 
//acaba llenaComboBox
 
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtServicio = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcServicio = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jcReparacion = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jcPreventivo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jcMecanico = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jdFecha = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jcHora = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jcMinuto = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jcBahia = new javax.swing.JComboBox<>();
        btnGenerar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtHora = new javax.swing.JLabel();
        txtUnidad = new javax.swing.JTextField();
        txtId = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtAuxiliar = new javax.swing.JLabel();
        jcAuxiliar = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Generar Servicio"));

        jLabel1.setText("Servicio No.");

        txtServicio.setText("__");

        jLabel3.setText("Generar servicio:");

        jcServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Preventivo", "Predictivo", "Daño Operativo" }));

        jLabel4.setText("Tipo de reparación");

        jcReparacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Motor", "Electrico", "Suspension", "Freno", "Carroceria", "Direccion", "Llantas" }));

        jLabel5.setText("Servicio Preventivo");

        jcPreventivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Tipo A", "Tipo B", "Tipo C" }));

        jLabel6.setText("Mecanico Principal:");

        jcMecanico.setModel(modeloCombo);

        jLabel7.setText("Asignar Unidad:");

        jLabel8.setText("Fecha de Entrega");

        jdFecha.setDateFormatString("dd-MM-yy");

        jLabel9.setText("Hora de Entrega");

        jcHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        jLabel10.setText(":");

        jcMinuto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "15", "30", "45" }));

        jLabel11.setText("Bahia");

        jcBahia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));

        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        jLabel12.setText("Hora de entrada:");

        txtHora.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtHora.setText("__");

        txtId.setText("id");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel1))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtServicio)
                                .addComponent(jcPreventivo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcServicio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcReparacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(jcMecanico, 0, 185, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addComponent(txtUnidad))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jcHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jcMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel9)
                                            .addComponent(txtId))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jcBahia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(btnGenerar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtServicio)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jcPreventivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcMecanico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcReparacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jcMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcBahia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerar)
                    .addComponent(jLabel12)
                    .addComponent(txtHora)
                    .addComponent(txtId)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Auxiliares"));

        txtAuxiliar.setText("Integrar Mecanico auxiliar:");

        jcAuxiliar.setModel(modeloCombo);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAuxiliar)
                .addGap(18, 18, 18)
                .addComponent(jcAuxiliar, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAuxiliar)
                    .addComponent(jcAuxiliar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Servicio"));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Servicio", "Unidad", "Reparacion", "Mecanico", "Bahia"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Editar servicio"));

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jButton4.setText("Borrar elemento");

        jButton5.setText("Cancelar");

        jButton6.setText("Generar servicio");

        jButton7.setText("Regresar al menu principal");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       Principal frm=new Principal();
       frm.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        txtUnidad.setText(txtUnidad.getText().toUpperCase());
        //iniciemos
        if (txtUnidad.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Te falta colocar la unidad");
            txtUnidad.requestFocus();
        }else if (jdFecha.getDate()==null){
            JOptionPane.showMessageDialog(this, "Te falta colocar la fecha");
            
        }else{
        //verificamos que exista la unidad
        boolean existeUnidad=false;
        try {
            String unidad=txtUnidad.getText().toUpperCase();
            String sql = "SELECT * FROM vehiculo where numero='"+unidad+"'";
            Statement st;
            st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while (rs.next()){
                existeUnidad=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(generarEstado.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (existeUnidad==false){
            JOptionPane.showMessageDialog(this, "La unidad no existe");
        }else{
            //se inicia el proceso
            if (jcPreventivo.getSelectedItem().equals("Ninguno")){
                String formato=jdFecha.getDateFormatString();
                Date date=jdFecha.getDate();
                SimpleDateFormat sdf= new SimpleDateFormat(formato);
                
                String mensaje="se va a crear el siguiente servicio\n"+
                        "Servicio No."+txtServicio.getText()+" tipo: "+jcServicio.getSelectedItem()+"\n"+
                        "con tipo de reparacion:  "+jcReparacion.getSelectedItem()+"\n"+
                        "Encargado al mecanico principal\n"+jcMecanico.getSelectedItem()+"\n"+
                        "para la unidad "+txtUnidad.getText()+" a entregar\n"+
                        String.valueOf(sdf.format(date))+" a las "+jcHora.getSelectedItem()+":"+jcMinuto.getSelectedItem()+
                        " en la bahia "+jcBahia.getSelectedItem();
                int respuesta=JOptionPane.showConfirmDialog(this, mensaje, "Atencion", 0);
                System.out.println (respuesta);
                if (respuesta==0){
                    System.out.println ("iniciamos");
                    //procedemos a crear el servicio
                    //añadimos campos
                    String numero=txtServicio.getText();
                    String servicio=jcServicio.getSelectedItem().toString();
                    String reparacion=jcReparacion.getSelectedItem().toString();
                    String bahia=jcBahia.getSelectedItem().toString();
                    String mecanico=jcMecanico.getSelectedItem().toString();
                    Date fecha=jdFecha.getDate();
                    SimpleDateFormat Date_Format = new SimpleDateFormat("yyyy-MM-dd"); 
                    Date_Format.format(jdFecha.getDate());
                    String unidad=txtUnidad.getText();
                    String hora=jcHora.getSelectedItem().toString()+":"+jcMinuto.getSelectedItem().toString();
                    
                    try {
                        String sql="INSERT INTO servicio (servicio,tipo_servicio,reparacion,mecanico,principal,unidad,fecha_entrega,hora_entrega,bahia) "+
                                "VALUES (?,?,?,?,?,?,?,?,?)";
                        PreparedStatement ps=cn.prepareStatement(sql);
                        ps.setString(1,numero);
                        ps.setString(2,servicio);
                        ps.setString(3,reparacion);
                        ps.setString(4,mecanico);
                        ps.setBoolean(5,true);
                        ps.setString(6,unidad);
                        ps.setDate(7, new java.sql.Date(fecha.getTime()));
                        ps.setString(8,hora);
                        ps.setString(9,bahia);
                        ps.executeUpdate();
                        System.out.println ("integrado en la bd");
                        auxiliarOn();
                        mostrarTabla();
                        desactivarPrincipal();
                        btnGenerar.setEnabled(false);
                    } catch (SQLException e) {
                         Logger.getLogger(generarEstado.class.getName()).log(Level.SEVERE, null, e);
                    }
                }
            }
            
        }
        }
    }//GEN-LAST:event_btnGenerarActionPerformed
    private void desactivarPrincipal(){
        jcPreventivo.setEnabled(false);
        jcBahia.setEnabled(false);
        jcHora.setEnabled(false);
        jcMinuto.setEnabled(false);
        jcReparacion.setEnabled(false);
        jcServicio.setEnabled(false);
        jdFecha.setEnabled(false);
        txtUnidad.setEnabled(false);
        jcMecanico.setEnabled(false);
    }
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
                    String numero=txtServicio.getText();
                    
                    String mecanico=jcMecanico.getSelectedItem().toString();
                    
                    
                    try {
                        String sql="INSERT INTO servicio (servicio,mecanico,principal) "+
                                "VALUES (?,?,?)";
                        PreparedStatement ps=cn.prepareStatement(sql);
                        ps.setString(1,numero);
                        
                        ps.setString(2,mecanico);
                        ps.setBoolean(3,false);
                        ps.executeUpdate();
                        System.out.println ("integrado en la bd");
                        
                        mostrarTabla();
                        
                    } catch (SQLException e) {
                         Logger.getLogger(generarEstado.class.getName()).log(Level.SEVERE, null, e);
                    }
                
            
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       if (btnEditar.getText().equals("Editar")){
        int fila=tabla.getSelectedRow();
        
       if (fila>0){
          btnEditar.setText("Actualizar");
          btnGenerar.setEnabled(false);
          auxiliarOn();
          String buscarProducto;
          buscarProducto = tabla.getValueAt(fila,1).toString();
          
          try{
              Statement buscar=cn.createStatement();
              String sql=("SELECT * FROM servicio WHERE servicio='"+buscarProducto+"' and principal=1");
              ResultSet resultado= buscar.executeQuery(sql);
              
              while (resultado.next()){
                 txtId.setText(resultado.getString("id")); 
                 txtServicio.setText(resultado.getString("servicio")); 
                 jcServicio.setSelectedItem(resultado.getString("tipo_servicio")); 
                 jcReparacion.setSelectedItem(resultado.getString("reparacion")); 
                 jcMecanico.setSelectedItem(resultado.getString("mecanico")); 
                 jcBahia.setSelectedItem(resultado.getString("bahia")); 
                 txtUnidad.setText(resultado.getString("unidad"));
                 txtHora.setText(resultado.getString("hora_entrada"));
                 String valorFecha = resultado.getString("fecha_entrega"); // What ever column
                 
                java.util.Date date;
                  try {
                      date = new SimpleDateFormat("yyyy-MM-dd").parse(valorFecha);
                      jdFecha.setDate(date);
                  } catch (ParseException ex) {
                      Logger.getLogger(generarEstado.class.getName()).log(Level.SEVERE, null, ex);
                  }

                
                 
                // obtenemos la hora de entrega
                 String hora=resultado.getString("hora_entrega");
                 char hora1=hora.charAt(0);
                 char hora2=hora.charAt(1);
                 String horauno=String.valueOf(hora1);
                 String horados=String.valueOf(hora2);
                 String Hora=horauno+horados;
                 
                 char min1=hora.charAt(3);
                 char min2=hora.charAt(4);
                 String minuno=String.valueOf(min1);
                 String mindos=String.valueOf(min2);
                 String minuto=minuno+mindos;
                 
                 jcHora.setSelectedItem(Hora);
                 jcMinuto.setSelectedItem(minuto);
                 
              }
          } catch (SQLException ex) {
               Logger.getLogger(generarEstado.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       }else {
           System.out.println ("Actualizamos");
       }    
        
        
    }//GEN-LAST:event_btnEditarActionPerformed
    private void auxiliarOff(){
        txtAuxiliar.setEnabled(false);
        btnAgregar.setEnabled(false);
        jcAuxiliar.setEnabled(false);
    }
    private void mostrarTabla(){
        String[] cabecera = {"Id", "Servicio", "Unidad", "Reparacion", "Mecanico","Bahia"};
        String[] registros = new String[6];
        String sql = "SELECT * FROM servicio WHERE servicio ='"+txtServicio.getText()+"'";
        //establecemos los anchos en pixeles de las columnas
        int[] anchos = {0, 120, 120, 200, 300, 80};

        modelo = new DefaultTableModel(null, cabecera);
        try {

            Statement table;
            table = cn.createStatement();
            ResultSet rs = table.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("id");
                registros[1] = rs.getString("servicio");
                registros[2] = rs.getString("unidad");
                registros[3] = rs.getString("reparacion");
                registros[4] = rs.getString("mecanico");
                registros[5] = rs.getString("bahia");
                modelo.addRow(registros);

            }
            tabla.setModel(modelo);
            for (int i = 0; i < cabecera.length; i++) {
                tabla.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
                tabla.setFont(new java.awt.Font("Tahoma", 0, 12));
            }
            tabla.getColumnModel().getColumn(0).setMaxWidth(0);
        tabla.getColumnModel().getColumn(0).setMinWidth(0);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(0);
        } catch (SQLException ex) {
            System.out.println("Sin poder ejecutar el query a la tabla");
        }
    }
    private void auxiliarOn(){
        txtAuxiliar.setEnabled(true);
        btnAgregar.setEnabled(true);
        jcAuxiliar.setEnabled(true);
    }
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
            java.util.logging.Logger.getLogger(generarEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(generarEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(generarEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(generarEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new generarEstado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcAuxiliar;
    private javax.swing.JComboBox<String> jcBahia;
    private javax.swing.JComboBox<String> jcHora;
    private javax.swing.JComboBox<String> jcMecanico;
    private javax.swing.JComboBox<String> jcMinuto;
    private javax.swing.JComboBox<String> jcPreventivo;
    private javax.swing.JComboBox<String> jcReparacion;
    private javax.swing.JComboBox<String> jcServicio;
    private com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel txtAuxiliar;
    private javax.swing.JLabel txtHora;
    private javax.swing.JLabel txtId;
    private javax.swing.JLabel txtServicio;
    private javax.swing.JTextField txtUnidad;
    // End of variables declaration//GEN-END:variables
}
