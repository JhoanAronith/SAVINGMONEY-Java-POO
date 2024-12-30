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
import modelo.Gasto;
import modelo.Ingreso;

public class ControladorGasto implements ActionListener {

    CRUDGasto crudg = new CRUDGasto();
    Gasto ga = new Gasto();
    FGasto fg = new FGasto();

    public ControladorGasto(FGasto fg, CRUDGasto crudg, Gasto ga) {
        this.fg = fg;
        this.crudg = crudg;
        this.ga = ga;

        this.fg.btnIngreso.addActionListener(this);
        this.fg.btnResumen.addActionListener(this);
        this.fg.btnMeta.addActionListener(this);
        this.fg.btnPerfil.addActionListener(this);
        this.fg.btnCerrarSesion.addActionListener(this);
        this.fg.btnIngresar.addActionListener(this);
        this.fg.btnEditar.addActionListener(this);
        this.fg.btnEliminar.addActionListener(this);
    }

    public void viewIngreso() {
        FIngreso fi = new FIngreso();
        CRUDIngreso crudi = new CRUDIngreso();
        Ingreso in = new Ingreso();
        ControladorIngreso ci = new ControladorIngreso(fi, crudi, in);
        fi.setVisible(true);
        fi.setLocationRelativeTo(null);
        fg.dispose();
    }

    public void viewResumen() {
        FResumen fr = new FResumen();
        CRUDResumen crudr = new CRUDResumen();
        ControladorResumen cr = new ControladorResumen(fr, crudr);
        fr.setVisible(true);
        fr.setLocationRelativeTo(null);
        fg.dispose();
    }

    public void viewMeta() {
        FMeta fm = new FMeta();
        FNuevaMeta fnm = new FNuevaMeta();
        FEditarMeta fem = new FEditarMeta();
        CRUDMeta crudm = new CRUDMeta();
        ControladorMeta cm = new ControladorMeta(crudm, fm, fnm, fem);
        fm.setVisible(true);
        fm.setLocationRelativeTo(null);
        fg.dispose();
    }

    public void viewPerfil() {
        FPerfil fp = new FPerfil();
        CRUDPerfil crudp = new CRUDPerfil();
        FEditarPerfil fep = new FEditarPerfil();
        ControladorPerfil cp = new ControladorPerfil(crudp, fp, fep);
        fp.setVisible(true);
        fp.setLocationRelativeTo(null);
        fg.dispose();
    }

    public void CerrarSesion() {
        FInicioSesion fis = new FInicioSesion();
        CRUDInicioSesion i = new CRUDInicioSesion();
        Usuario usr = new Usuario();
        FRegistro fr = new FRegistro();
        ControladorInicioSesion cis = new ControladorInicioSesion(fis, fr, i, usr);
        fis.setVisible(true);
        fis.setLocationRelativeTo(null);
        fg.dispose();
    }

    public void ConfirmarCierre() {
        int respuesta = JOptionPane.showConfirmDialog(
                null,
                "¿Estás seguro de cerrar sesión?",
                "Confirmar Cierre de Sesión",
                JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            CerrarSesion();
            fg.dispose();
        }
    }

    public void RegistrarGasto() {
        String categoria = (String) fg.cbxCategoria.getSelectedItem();
        String descripcion = fg.txtDescripcion.getText();
        String fecha = fg.txtFecha.getText();
        String monto = fg.txtMonto.getText();

        if (categoria.isEmpty() || descripcion.isEmpty() || fecha.isEmpty() || monto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
        } else {
            ga.setCategoria(categoria);
            ga.setDescripcion(descripcion);
            ga.setFecha(fecha);
            ga.setMonto(monto);

            if (CRUDGasto.InsertarGasto(ga)) {
                JOptionPane.showMessageDialog(null, "Ingreso Registrado");
            } else {
                JOptionPane.showMessageDialog(null, "Hubo un problema al registrar el ingreso.");
            }
        }
    }

    public void borrarEntradas() {
        fg.cbxCategoria.setSelectedItem(0);
        fg.txtDescripcion.setText("");
        fg.txtMonto.setText("");
        fg.txtFecha.setText("");
    }

    public void ActualizarTabla() {
        crudg.MostrarGastos(fg.jtblGastos);
    }

    public void MostrarMonto() {
        crudg.MostrarMontoTotal(fg.lblTotal);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == fg.btnIngreso) {
            viewIngreso();
        }

        if (e.getSource() == fg.btnResumen) {
            viewResumen();
        }

        if (e.getSource() == fg.btnMeta) {
            viewMeta();
        }

        if (e.getSource() == fg.btnPerfil) {
            viewPerfil();
        }

        if (e.getSource() == fg.btnCerrarSesion) {
            ConfirmarCierre();
        }

        if (e.getSource() == fg.btnIngresar) {
            RegistrarGasto();
            ActualizarTabla();
            borrarEntradas();
            MostrarMonto();
        }

        if (e.getSource() == fg.btnEliminar) {
            crudg.EliminarGasto();
        }

        if (e.getSource() == fg.btnEditar) {
            crudg.EditarGasto();
        }

    }
}
