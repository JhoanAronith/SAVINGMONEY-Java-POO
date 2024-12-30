package controlador;

//Generales
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

//CRUD
import dao.CRUDInicioSesion;
import dao.CRUDIngreso;
import dao.CRUDGasto;
import dao.CRUDResumen;
import dao.CRUDMeta;
import dao.CRUDPerfil;
import modelo.Gasto;

//Vista
import vista.FInicioSesion;
import vista.FIngreso;
import vista.FGasto;
import vista.FPerfil;
import vista.FRegistro;
import vista.FResumen;
import vista.FMeta;
import vista.FEditarMeta;
import vista.FNuevaMeta;
import vista.FEditarPerfil;

//Modelo
import modelo.Usuario;
import modelo.Ingreso;

public class ControladorIngreso implements ActionListener {

    CRUDIngreso crudi;
    Ingreso in = new Ingreso();
    FIngreso fi = new FIngreso();

    public ControladorIngreso(FIngreso fi, CRUDIngreso crudi, Ingreso in) {
        this.fi = fi;
        this.crudi = crudi;
        this.in = in;

        this.fi.btnGasto.addActionListener(this);
        this.fi.btnResumen.addActionListener(this);
        this.fi.btnMeta.addActionListener(this);
        this.fi.btnPerfil.addActionListener(this);
        this.fi.btnCerrarSesion.addActionListener(this);
        this.fi.btnIngresar.addActionListener(this);
        this.fi.btnEliminar.addActionListener(this);
        this.fi.btnEditar.addActionListener(this);
    }

    public void viewGasto() {
        FGasto fg = new FGasto();
        CRUDGasto crudg = new CRUDGasto();
        Gasto ga = new Gasto();
        ControladorGasto cg = new ControladorGasto(fg, crudg, ga);
        fg.setVisible(true);
        fg.setLocationRelativeTo(null);
        fi.dispose();
    }

    public void viewResumen() {
        FResumen fr = new FResumen();
        CRUDResumen crudr = new CRUDResumen();
        ControladorResumen cr = new ControladorResumen(fr, crudr);
        fr.setVisible(true);
        fr.setLocationRelativeTo(null);
        fi.dispose();
    }

    public void viewMeta() {
        FMeta fm = new FMeta();
        FNuevaMeta fnm = new FNuevaMeta();
        FEditarMeta fem = new FEditarMeta();
        CRUDMeta crudm = new CRUDMeta();
        ControladorMeta cm = new ControladorMeta(crudm, fm, fnm, fem);
        fm.setVisible(true);
        fm.setLocationRelativeTo(null);
        fi.dispose();
    }

    public void viewPerfil() {
        FPerfil fp = new FPerfil();
        CRUDPerfil crudp = new CRUDPerfil();
        FEditarPerfil fep = new FEditarPerfil();
        ControladorPerfil cp = new ControladorPerfil(crudp, fp, fep);
        fp.setVisible(true);
        fp.setLocationRelativeTo(null);
        fi.dispose();
    }

    public void CerrarSesion() {
        FInicioSesion fis = new FInicioSesion();
        CRUDInicioSesion i = new CRUDInicioSesion();
        Usuario usr = new Usuario();
        FRegistro fr = new FRegistro();
        ControladorInicioSesion cis = new ControladorInicioSesion(fis, fr, i, usr);
        fis.setVisible(true);
        fis.setLocationRelativeTo(null);
        fi.dispose();
    }

    public void ConfirmarCierre() {
        int respuesta = JOptionPane.showConfirmDialog(
                null,
                "¿Estás seguro de cerrar sesión?",
                "Confirmar Cierre de Sesión",
                JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            CerrarSesion();
            fi.dispose();
        }
    }

    public void RegistrarIngreso() {
        String categoria = (String) fi.cbxCategoria.getSelectedItem();
        String descripcion = fi.txtDescripcion.getText();
        String fecha = fi.txtFecha.getText();
        String monto = fi.txtMonto.getText();

        if (categoria.isEmpty() || descripcion.isEmpty() || fecha.isEmpty() || monto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
        } else {
            in.setCategoria(categoria);
            in.setDescripcion(descripcion);
            in.setFecha(fecha);
            in.setMonto(monto);

            if (CRUDIngreso.InsertarIngreso(in)) {
                JOptionPane.showMessageDialog(null, "Ingreso Registrado");
            } else {
                JOptionPane.showMessageDialog(null, "Hubo un problema al registrar el ingreso.");
            }
        }
    }

    public void borrarEntradas() {
        fi.cbxCategoria.setSelectedItem(0);
        fi.txtDescripcion.setText("");
        fi.txtMonto.setText("");
        fi.txtFecha.setText("");
    }

    public void ActualizarTabla() {
        crudi.MostrarIngresos(fi.jtblIngresos);
    }

    public void MostrarMonto() {
        crudi.MostrarMontoTotal(fi.lblTotal);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == fi.btnGasto) {
            viewGasto();
        }

        if (e.getSource() == fi.btnResumen) {
            viewResumen();
        }

        if (e.getSource() == fi.btnMeta) {
            viewMeta();
        }

        if (e.getSource() == fi.btnPerfil) {
            viewPerfil();
        }

        if (e.getSource() == fi.btnCerrarSesion) {
            ConfirmarCierre();
        }

        if (e.getSource() == fi.btnIngresar) {
            RegistrarIngreso();
            ActualizarTabla();
            borrarEntradas();
            MostrarMonto();
        }

        if (e.getSource() == fi.btnEliminar) {
            crudi.EliminarIngreso();
        }

        if (e.getSource() == fi.btnEditar) {
            crudi.EditarIngreso();
        }

    }

}
