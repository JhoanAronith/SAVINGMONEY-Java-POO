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

public class ControladorMeta implements ActionListener {

    CRUDMeta crudm = new CRUDMeta();
    //Meta m = new Meta();
    FMeta fm = new FMeta();
    FNuevaMeta fnm = new FNuevaMeta();
    FEditarMeta fem = new FEditarMeta();

    public ControladorMeta(CRUDMeta crudm, FMeta fm, FNuevaMeta fnm, FEditarMeta fem) {
        this.crudm = crudm;
        this.fm = fm;
        this.fnm = fnm;
        this.fem = fem;

        this.fm.btnIngreso.addActionListener(this);
        this.fm.btnGasto.addActionListener(this);
        this.fm.btnResumen.addActionListener(this);
        this.fm.btnPerfil.addActionListener(this);
        this.fm.btnCerrarSesion.addActionListener(this);
        this.fm.btnNuevaMeta.addActionListener(this);
        this.fm.btnEditarMeta.addActionListener(this);
    }

    public void viewIngreso() {
        FIngreso fi = new FIngreso();
        CRUDIngreso crudi = new CRUDIngreso();
        Ingreso in = new Ingreso();
        ControladorIngreso ci = new ControladorIngreso(fi, crudi, in);
        fi.setVisible(true);
        fi.setLocationRelativeTo(null);
        fm.dispose();
    }

    public void viewGasto() {
        FGasto fg = new FGasto();
        CRUDGasto crudg = new CRUDGasto();
        Gasto ga = new Gasto();
        ControladorGasto cg = new ControladorGasto(fg, crudg, ga);
        fg.setVisible(true);
        fg.setLocationRelativeTo(null);
        fm.dispose();
    }

    public void viewResumen() {
        FResumen fr = new FResumen();
        CRUDResumen crudr = new CRUDResumen();
        ControladorResumen cr = new ControladorResumen(fr, crudr);
        fr.setVisible(true);
        fr.setLocationRelativeTo(null);
        fm.dispose();
    }

    public void viewNuevaMeta() {
        FNuevaMeta fnm = new FNuevaMeta();
        fnm.setVisible(true);
        fnm.setLocationRelativeTo(null);
    }

    public void viewEditarMeta() {
        FEditarMeta fem = new FEditarMeta();
        fem.setVisible(true);
        fem.setLocationRelativeTo(null);
    }

    public void viewPerfil() {
        FPerfil fp = new FPerfil();
        CRUDPerfil crudp = new CRUDPerfil();
        FEditarPerfil fep = new FEditarPerfil();
        ControladorPerfil cp = new ControladorPerfil(crudp, fp, fep);
        fp.setVisible(true);
        fp.setLocationRelativeTo(null);
        fm.dispose();
    }

    public void CerrarSesion() {
        FInicioSesion fis = new FInicioSesion();
        CRUDInicioSesion i = new CRUDInicioSesion();
        Usuario usr = new Usuario();
        FRegistro fr = new FRegistro();
        ControladorInicioSesion cis = new ControladorInicioSesion(fis, fr, i, usr);
        fis.setVisible(true);
        fis.setLocationRelativeTo(null);
        fr.dispose();
    }

    public void ConfirmarCierre() {
        int respuesta = JOptionPane.showConfirmDialog(
                null,
                "¿Estás seguro de cerrar sesión?",
                "Confirmar Cierre de Sesión",
                JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            CerrarSesion();
            fm.dispose();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == fm.btnIngreso) {
            viewIngreso();
        }

        if (e.getSource() == fm.btnGasto) {
            viewGasto();
        }

        if (e.getSource() == fm.btnResumen) {
            viewResumen();
        }

        if (e.getSource() == fm.btnNuevaMeta) {
            viewNuevaMeta();
        }

        if (e.getSource() == fm.btnEditarMeta) {
            viewEditarMeta();
        }

        if (e.getSource() == fm.btnPerfil) {
            viewPerfil();
        }

        if (e.getSource() == fm.btnCerrarSesion) {
            ConfirmarCierre();
        }

    }
}
