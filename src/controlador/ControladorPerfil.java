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

public class ControladorPerfil implements ActionListener {

    CRUDPerfil crudp = new CRUDPerfil();
    FPerfil fp = new FPerfil();
    FEditarPerfil fep = new FEditarPerfil();

    public ControladorPerfil(CRUDPerfil crudp, FPerfil fp, FEditarPerfil fep) {
        this.crudp = crudp;
        this.fp = fp;
        this.fep = fep;

        this.fp.btnIngreso.addActionListener(this);
        this.fp.btnGasto.addActionListener(this);
        this.fp.btnResumen.addActionListener(this);
        this.fp.btnMeta.addActionListener(this);
        this.fp.btnCerrarSesion.addActionListener(this);
        this.fp.btnEditarPerfil.addActionListener(this);
        this.fep.btnEditar.addActionListener(this);
    }

    public void viewIngreso() {
        FIngreso fi = new FIngreso();
        CRUDIngreso crudi = new CRUDIngreso();
        Ingreso in = new Ingreso();
        ControladorIngreso ci = new ControladorIngreso(fi, crudi, in);
        fi.setVisible(true);
        fi.setLocationRelativeTo(null);
        fp.dispose();
    }

    public void viewGasto() {
        FGasto fg = new FGasto();
        CRUDGasto crudg = new CRUDGasto();
        Gasto ga = new Gasto();
        ControladorGasto cg = new ControladorGasto(fg, crudg, ga);
        fg.setVisible(true);
        fg.setLocationRelativeTo(null);
        fp.dispose();
    }

    public void viewResumen() {
        FResumen fr = new FResumen();
        CRUDResumen crudr = new CRUDResumen();
        ControladorResumen cr = new ControladorResumen(fr, crudr);
        fr.setVisible(true);
        fr.setLocationRelativeTo(null);
        fp.dispose();
    }

    public void viewMeta() {
        FMeta fm = new FMeta();
        FNuevaMeta fnm = new FNuevaMeta();
        FEditarMeta fem = new FEditarMeta();
        CRUDMeta crudm = new CRUDMeta();
        ControladorMeta cm = new ControladorMeta(crudm, fm, fnm, fem);
        fm.setVisible(true);
        fm.setLocationRelativeTo(null);
        fp.dispose();
    }

    public void viewEditarPerfil() {
        fep.setVisible(true);
        fep.setLocationRelativeTo(null);
    }

    public void CerrarSesion() {
        FInicioSesion fis = new FInicioSesion();
        CRUDInicioSesion i = new CRUDInicioSesion();
        Usuario usr = new Usuario();
        FRegistro fr = new FRegistro();
        ControladorInicioSesion cis = new ControladorInicioSesion(fis, fr, i, usr);
        fis.setVisible(true);
        fis.setLocationRelativeTo(null);
        fp.dispose();
    }

    public void ConfirmarCierre() {
        int respuesta = JOptionPane.showConfirmDialog(
                null,
                "¿Estás seguro de cerrar sesión?",
                "Confirmar Cierre de Sesión",
                JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            CerrarSesion();
            fp.dispose();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == fp.btnIngreso) {
            viewIngreso();
        }

        if (e.getSource() == fp.btnGasto) {
            viewGasto();
        }

        if (e.getSource() == fp.btnResumen) {
            viewResumen();
        }

        if (e.getSource() == fp.btnMeta) {
            viewMeta();
        }

        if (e.getSource() == fp.btnEditarPerfil) {
            viewEditarPerfil();
        }

        if (e.getSource() == fp.btnCerrarSesion) {
            ConfirmarCierre();
        }

    }
}
