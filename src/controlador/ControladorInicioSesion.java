package controlador;

//Generales
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

//CRUD
import dao.CRUDInicioSesion;
import dao.CRUDIngreso;

//Vistas
import vista.FInicioSesion;
import vista.FRegistro;
import vista.FIngreso;

//Modelos
import modelo.Usuario;
import modelo.Ingreso;

public class ControladorInicioSesion implements ActionListener {

    CRUDInicioSesion crudis = new CRUDInicioSesion();
    FInicioSesion fi = new FInicioSesion();
    FRegistro fre = new FRegistro();
    Usuario usr = new Usuario();

    public ControladorInicioSesion(FInicioSesion fi, FRegistro fre, CRUDInicioSesion crudis, Usuario usr) {
        this.fi = fi;
        this.fre = fre;
        this.crudis = crudis;
        this.usr = usr;

        this.fi.btnIngresar.addActionListener(this);
        this.fi.btnRegistrarme.addActionListener(this);
        this.fi.chkMostrarPassword.addActionListener(this);
        this.fre.btnRegistrar.addActionListener(this);
    }

    public void Registrar() {
        String nombre = fre.txtRegistrarNombres.getText();
        String apellido = fre.txtRegistrarApellidos.getText();
        String usuario = fre.txtRegistrarUsuario.getText();
        String password = fre.txtRegistrarPassword.getText();

        if (nombre.isEmpty() || apellido.isEmpty() || usuario.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
        } else {
            usr.setNombre(nombre);
            usr.setApellido(apellido);
            usr.setUsuario(usuario);
            usr.setPass(password);

            if (CRUDInicioSesion.InsertarUsuario(usr)) {
                JOptionPane.showMessageDialog(null, "Usuario Registrado");
                fre.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Hubo un problema al registrar el usuario.");
            }
        }
    }

    public void mostrarRegistrar() {
        fre.setVisible(true);
        fre.setLocationRelativeTo(null);
    }

    public void MostrarFIngreso() {
        FIngreso fin = new FIngreso();
        CRUDIngreso crudi = new CRUDIngreso();
        Ingreso in = new Ingreso();
        ControladorIngreso ci = new ControladorIngreso(fin, crudi, in);
        fin.setVisible(true);
        fin.setLocationRelativeTo(null);
        fi.dispose();

    }

    public void viewIngreso() {
        String us = fi.txtIngresarUsuario1.getText();
        String pw = fi.txtIngresarPassword.getText();

        if (CRUDInicioSesion.Autentication(us, pw)) {
            MostrarFIngreso();
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrecto");
        }
    }

    public void MostrarPassword() {
        if (fi.chkMostrarPassword.isSelected()) {
            fi.txtIngresarPassword.setEchoChar((char) 0);
        } else {
            fi.txtIngresarPassword.setEchoChar('*');
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == fre.btnRegistrar) {
            Registrar();
        }

        if (e.getSource() == fi.btnRegistrarme) {
            mostrarRegistrar();
        }

        if (e.getSource() == fi.btnIngresar) {
            MostrarFIngreso();
        }

        if (e.getSource() == fi.chkMostrarPassword) {
            MostrarPassword();
        }
    }

}
