/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vista.*;

/**
 *
 * @author Nico
 */
public class Qsql {

    PreparedStatement ps = null;
    ResultSet rs = null;
    ConnectDB cn = new ConnectDB();
    Connection con = cn.getConexion();

    //vista.Login
    public int validarLogin() {

        String usuario = Login.IngresoUsuario.getText();
        String contraseña = String.valueOf(Login.IngresoContraseña.getPassword());
        
        
        int resultado = 0;

        String sql = "SELECT * FROM usuario WHERE username='" + usuario + "' && password='" + contraseña + "'";

        try {
            con = cn.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                resultado = 1;
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error de conexión", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex, "Error de conexión", JOptionPane.ERROR_MESSAGE);
            }
        }

        return resultado;
    }

    public void datosVehiculos() {

        //COMBO BOX MARCAS VEHICULOS
        try {
            String sql = "SELECT * FROM `marca` ORDER BY `marca`.`nombreMarca` ASC";
//            String sqlid = "SELECT * FROM `marca` ORDER BY `marca`.`idMarca` ASC";

            ps = (PreparedStatement) con.prepareStatement(sql);
//            ps = (PreparedStatement) con.prepareStatement(sqlid);
            rs = ps.executeQuery(sql);
//            rs = ps.executeQuery(sqlid);

            registroVehiculo.marcaCB.addItem("Seleccione marca");
            while (rs.next()) {
                registroVehiculo.marcaCB.addItem(rs.getString("nombreMarca"));
//                registroVehiculo.idMarcaText.setText(rs.getString("idMarca"));
            }

            rs.close();

        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }

        //COMBO BOX TIPOS VEHICULOS
        try {
            String sql = "SELECT * FROM `tipovehiculo` ORDER BY `tipovehiculo`.`nombreTipoVehiculo` ASC";
//            String sqlid = "SELECT * FROM `tipovehiculo` ORDER BY `tipovehiculo`.`idTipoVehiculo` ASC";
            ps = (PreparedStatement) con.prepareStatement(sql);
//            ps = (PreparedStatement) con.prepareStatement(sqlid);
            rs = ps.executeQuery(sql);
//            rs = ps.executeQuery(sqlid);

            registroVehiculo.tipoVehiculoCB.addItem("Seleccione tipo vehiculo");
            while (rs.next()) {
                registroVehiculo.tipoVehiculoCB.addItem(rs.getString("nombreTipoVehiculo"));
//                registroVehiculo.idTipoVehiculoText.setText(rs.getString("idTipoVehiculo"));
            }

            rs.close();

        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }

        //COMBO BOX TIPOS CARROCERIAS
        try {
            String sql = "SELECT * FROM `tipocarroceria` ORDER BY `tipocarroceria`.`nombreTipoCarroceria` ASC";
//            String sqlid = "SELECT * FROM `tipocarroceria` ORDER BY `tipocarroceria`.`idTipoCarroceria` ASC";
            ps = (PreparedStatement) con.prepareStatement(sql);
//            ps = (PreparedStatement) con.prepareStatement(sqlid);
            rs = ps.executeQuery(sql);
//            rs = ps.executeQuery(sqlid);

            registroVehiculo.tipoCarroceriaCB.addItem("Seleccione tipo carrocería");
            while (rs.next()) {
                registroVehiculo.tipoCarroceriaCB.addItem(rs.getString("nombreTipoCarroceria"));
//                registroVehiculo.idTipoCarroceriaText.setText(rs.getString("idTipoCarroceria"));
            }

            rs.close();

        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }

        //COMBO BOX COLOR VEHICULOS
        try {
            String sql = "SELECT * FROM `colorvehiculo` ORDER BY `colorvehiculo`.`nombreColor` ASC";
//            String sqlid = "SELECT * FROM `colorvehiculo` ORDER BY `colorvehiculo`.`idColorVehiculo` ASC";
            ps = (PreparedStatement) con.prepareStatement(sql);
//            ps = (PreparedStatement) con.prepareStatement(sqlid);
            rs = ps.executeQuery(sql);
//            rs = ps.executeQuery(sqlid);

            registroVehiculo.colorCB.addItem("Seleccione color");
            while (rs.next()) {
                registroVehiculo.colorCB.addItem(rs.getString("nombreColor"));
//                registroVehiculo.idColorText.setText(rs.getString("idColorVehiculo"));
            }

            rs.close();

        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }

        //COMBO BOX ESTADO VEHICULO
        try {
            String sql = "SELECT * FROM `estadovehiculo` ORDER BY `estadovehiculo`.`nombreEstadoVehiculo` ASC";
//            String sqlid = "SELECT * FROM `estadovehiculo` ORDER BY `estadovehiculo`.`idEstadoVehiculo` ASC";
            ps = (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery(sql);
//            rs = ps.executeQuery(sqlid);

            registroVehiculo.estadoVehiculoCB.addItem("Seleccione estado");
            while (rs.next()) {
                registroVehiculo.estadoVehiculoCB.addItem(rs.getString("nombreEstadoVehiculo"));
//                registroVehiculo.idEstadoVehiculoText.setText(rs.getString("idEstadoVehiculo"));
            }

            rs.close();

        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }

    }

    public void registrarVehiculo() {

        java.sql.Timestamp fecha = new java.sql.Timestamp(new java.util.Date().getTime());

        try {
            con = cn.getConexion();
            ps = con.prepareStatement("INSERT INTO vehiculo (idMarca, idTipoVehiculo, idTipoCarroceria, modelo, año, cilindrada, patente, idColor, idEstadoVehiculo, valorArriendo, kilometrajeActual,idVehiculo, fechaRegistro, usuarioRegistro) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?) ");
            //ps.setString(1, registroVehiculo.marcaCB.getSelectedIndex());
            ps.setInt(1, registroVehiculo.marcaCB.getSelectedIndex());
            ps.setInt(2, registroVehiculo.tipoVehiculoCB.getSelectedIndex());
            ps.setInt(3, registroVehiculo.tipoCarroceriaCB.getSelectedIndex());
            ps.setString(4, registroVehiculo.modeloText.getText());
            ps.setInt(5, Integer.parseInt(registroVehiculo.añoText.getText()));
            ps.setInt(6, Integer.parseInt(registroVehiculo.cilindradaText.getText()));
            ps.setString(7, registroVehiculo.patenteText.getText());
            ps.setInt(8, registroVehiculo.colorCB.getSelectedIndex());
            ps.setInt(9, registroVehiculo.estadoVehiculoCB.getSelectedIndex());
            ps.setDouble(10, Double.valueOf(registroVehiculo.valorArriendoText.getText()));
            ps.setInt(11, Integer.parseInt(registroVehiculo.kilometrajeActText.getText()));
            ps.setInt(12, Integer.parseInt(registroVehiculo.idVehiculoText.getText()));
            ps.setTimestamp(13, fecha);
            ps.setString(14, "1");

            int res = ps.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Se agregó el vehiculo");
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar el vehiculo");
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Qsql.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println(ex);
        }

    }

    public void buscarVehiculos() {

        try {
            con = cn.getConexion();
            ps = con.prepareStatement("SELECT * FROM vehiculo WHERE patente = ?");
            ps.setString(1, registroVehiculo.patenteText.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                registroVehiculo.marcaCB.setSelectedIndex(rs.getInt("idMarca"));
                registroVehiculo.tipoVehiculoCB.setSelectedIndex(rs.getInt("idTipoVehiculo"));
                registroVehiculo.tipoCarroceriaCB.setSelectedIndex(rs.getInt("idTipoCarroceria"));
                registroVehiculo.modeloText.setText(rs.getString("modelo"));
                registroVehiculo.añoText.setText(rs.getString("año"));
                registroVehiculo.cilindradaText.setText(rs.getString("cilindrada"));
                registroVehiculo.patenteText.setText(rs.getString("patente"));
                registroVehiculo.colorCB.setSelectedIndex(rs.getInt("idColor"));
                registroVehiculo.estadoVehiculoCB.setSelectedIndex(rs.getInt("idEstadoVehiculo"));
                registroVehiculo.valorArriendoText.setText(rs.getString("valorArriendo"));
                registroVehiculo.kilometrajeActText.setText(rs.getString("kilometrajeActual"));
                registroVehiculo.idVehiculoText.setText(rs.getString("idVehiculo"));
            } else {
                JOptionPane.showMessageDialog(null, "No se ha encontrado la patente");
            }

        } catch (Exception ex) {
            System.err.println(ex);
        }
    }
        
        

        

   public void modificarVehiculo(){
       try {
            con = cn.getConexion();
            ps = con.prepareStatement("UPDATE vehiculo SET idMarca=?,idTipoVehiculo=?,idTipoCarroceria=?,modelo=?,año=?,cilindrada=?,patente=?,idColor=?,idEstadoVehiculo=?,valorArriendo=?,kilometrajeActual=? WHERE idVehiculo=?");

            //rs = ps.executeQuery();
            ps.setInt(1, registroVehiculo.marcaCB.getSelectedIndex());
            ps.setInt(2, registroVehiculo.tipoVehiculoCB.getSelectedIndex());
            ps.setInt(3, registroVehiculo.tipoCarroceriaCB.getSelectedIndex());
            ps.setString(4, registroVehiculo.modeloText.getText());
            ps.setInt(5, Integer.parseInt(registroVehiculo.añoText.getText()));
            ps.setInt(6, Integer.parseInt(registroVehiculo.cilindradaText.getText()));
            ps.setString(7, registroVehiculo.patenteText.getText());
            ps.setInt(8, registroVehiculo.colorCB.getSelectedIndex());
            ps.setInt(9, registroVehiculo.estadoVehiculoCB.getSelectedIndex());
            ps.setDouble(10, Double.valueOf(registroVehiculo.valorArriendoText.getText()));
            ps.setInt(11, Integer.parseInt(registroVehiculo.kilometrajeActText.getText()));
            ps.setInt(12, Integer.parseInt(registroVehiculo.idVehiculoText.getText()));
            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Se ha modificado el vehiculo");
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar el vehiculo");
            }
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(Qsql.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println(ex);
        }
   }

    public void rolesUsuarios() {

        //COMBO BOX ROLES USUARIOS
        try {
            String sql = "SELECT * FROM `rol` ORDER BY `rol`.`nombreRol` ASC";
            ps = (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery(sql);

            crearCuenta.rolCB.addItem("Seleccione rol");
            while (rs.next()) {
                crearCuenta.rolCB.addItem(rs.getString("nombreRol"));
            }

            rs.close();

        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }

    }

    private void limpiarCliente() {
        registroCliente.rutText.setText(null);
        registroCliente.DVText.setText(null);
        registroCliente.nombreText.setText(null);
        registroCliente.apellidoText.setText(null);
        registroCliente.emailText.setText(null);
        registroCliente.telefonoText.setText(null);
    }

    public void registrarCliente() {
        java.sql.Timestamp fecha = new java.sql.Timestamp(new java.util.Date().getTime());

        try {
            con = cn.getConexion();
            ps = con.prepareStatement("INSERT INTO cliente (rut, dv, nombres, apellidos, email, celular, fechaRegistro, usuarioRegistro) VALUES(?,?,?,?,?,?,?,?) ");
            ps.setString(1, registroCliente.rutText.getText());
            ps.setString(2, registroCliente.DVText.getText());
            ps.setString(3, registroCliente.nombreText.getText());
            ps.setString(4, registroCliente.apellidoText.getText());
            ps.setString(5, registroCliente.emailText.getText());
            ps.setString(6, registroCliente.telefonoText.getText());
            ps.setTimestamp(7, fecha);
            ps.setString(8, "1");

            int res = ps.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Se agregó el cliente");
                limpiarCliente();
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar el cliente");
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Qsql.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println(ex);
        }
    }

    public void buscarCliente() {

        try {
            con = cn.getConexion();
            ps = con.prepareStatement("SELECT * FROM cliente WHERE rut = ?");
            ps.setString(1, registroCliente.rutText.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                registroCliente.rutText.setText(rs.getString("rut"));
                registroCliente.DVText.setText(rs.getString("dv"));
                registroCliente.nombreText.setText(rs.getString("nombres"));
                registroCliente.apellidoText.setText(rs.getString("apellidos"));
                registroCliente.emailText.setText(rs.getString("email"));
                registroCliente.telefonoText.setText(rs.getString("celular"));
                registroCliente.idClienteText.setText(rs.getString("idCliente"));
            } else {
                JOptionPane.showMessageDialog(null, "No se ha encontrado el cliente");
            }

        } catch (Exception ex) {
            System.err.println(ex);
        }

    }

    public void modificarCliente() {

        try {
            con = cn.getConexion();
            ps = con.prepareStatement("UPDATE cliente SET  rut=?, dv=?, nombres=?, apellidos=?, email=?, celular=? WHERE idCliente=? ");
            ps.setString(1, registroCliente.rutText.getText());
            ps.setString(2, registroCliente.DVText.getText());
            ps.setString(3, registroCliente.nombreText.getText());
            ps.setString(4, registroCliente.apellidoText.getText());
            ps.setString(5, registroCliente.emailText.getText());
            ps.setString(6, registroCliente.telefonoText.getText());
            ps.setString(7, registroCliente.idClienteText.getText());
            int res = ps.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Se ha modificado el cliente");
                limpiarCliente();
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar el cliente");
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Qsql.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println(ex);
        }
    }
}

