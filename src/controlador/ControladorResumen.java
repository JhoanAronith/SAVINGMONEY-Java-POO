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

public class ControladorResumen implements ActionListener {

    CRUDResumen crudr = new CRUDResumen();
    FResumen fr = new FResumen();

    public ControladorResumen(FResumen fr, CRUDResumen crudr) {
        this.crudr = crudr;
        this.fr = fr;

        this.fr.btnIngreso.addActionListener(this);
        this.fr.btnGasto.addActionListener(this);
        this.fr.btnMeta.addActionListener(this);
        this.fr.btnPerfil.addActionListener(this);
        this.fr.btnCerrarSesion.addActionListener(this);
        this.fr.btnActualizar.addActionListener(this);
    }

    public void viewIngreso() {
        FIngreso fi = new FIngreso();
        CRUDIngreso crudi = new CRUDIngreso();
        Ingreso in = new Ingreso();
        ControladorIngreso ci = new ControladorIngreso(fi, crudi, in);
        fi.setVisible(true);
        fi.setLocationRelativeTo(null);
        fr.dispose();
    }

    public void viewGasto() {
        FGasto fg = new FGasto();
        CRUDGasto crudg = new CRUDGasto();
        Gasto ga = new Gasto();
        ControladorGasto cg = new ControladorGasto(fg, crudg, ga);
        fg.setVisible(true);
        fg.setLocationRelativeTo(null);
        fr.dispose();
    }

    public void viewMeta() {
        FMeta fm = new FMeta();
        FNuevaMeta fnm = new FNuevaMeta();
        FEditarMeta fem = new FEditarMeta();
        CRUDMeta crudm = new CRUDMeta();
        ControladorMeta cm = new ControladorMeta(crudm, fm, fnm, fem);
        fm.setVisible(true);
        fm.setLocationRelativeTo(null);
        fr.dispose();
    }

    public void viewPerfil() {
        FPerfil fp = new FPerfil();
        CRUDPerfil crudp = new CRUDPerfil();
        FEditarPerfil fep = new FEditarPerfil();
        ControladorPerfil cp = new ControladorPerfil(crudp, fp, fep);
        fp.setVisible(true);
        fp.setLocationRelativeTo(null);
        fr.dispose();
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
            fr.dispose();
        }
    }

    public void MostrarI() {
        crudr.MostrarIngreso(fr.tblIngreso1);
    }

    public void MostrarG() {
        crudr.MostrarGasto(fr.tblGasto);
    }

    public void MostrarD() {
        fr.lblDiferencia.setText("" + crudr.MostrarDiferencia());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == fr.btnIngreso) {
            viewIngreso();
        }

        if (e.getSource() == fr.btnGasto) {
            viewGasto();
        }

        if (e.getSource() == fr.btnMeta) {
            viewMeta();
        }

        if (e.getSource() == fr.btnPerfil) {
            viewPerfil();
        }

        if (e.getSource() == fr.btnCerrarSesion) {
            ConfirmarCierre();
        }

        if (e.getSource() == fr.btnActualizar) {
            MostrarI();
            MostrarG();
            MostrarD();
        }

    }
}
