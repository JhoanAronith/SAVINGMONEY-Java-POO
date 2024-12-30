package main;

//Controladores
import controlador.ControladorInicioSesion;
import controlador.ControladorIngreso;
import controlador.ControladorGasto;
import controlador.ControladorResumen;
import controlador.ControladorMeta;
import controlador.ControladorPerfil;

//CRUD
import dao.CRUDInicioSesion;
import dao.CRUDIngreso;
import dao.CRUDGasto;
import dao.CRUDResumen;
import dao.CRUDMeta;
import dao.CRUDPerfil;
import modelo.Gasto;
import modelo.Ingreso;

//Vistas
import vista.FInicioSesion;
import vista.FRegistro;
import vista.FIngreso;
import vista.FGasto;
import vista.FResumen;
import vista.FMeta;
import vista.FNuevaMeta;
import vista.FEditarMeta;
import vista.FPerfil;
import vista.FEditarPerfil;

//Modelos
import modelo.Usuario;

public class SavingMoney {

    public static void main(String[] args) {

        //Inicio Sesion - Registro
        CRUDInicioSesion i = new CRUDInicioSesion();
        FInicioSesion fi = new FInicioSesion();
        Usuario user = new Usuario();
        FRegistro fre = new FRegistro();

        //Ingreso
        Ingreso in = new Ingreso();
        CRUDIngreso crudi = new CRUDIngreso();
        FIngreso fin = new FIngreso();

        //Gasto
        CRUDGasto crudg = new CRUDGasto();
        Gasto ga = new Gasto();
        FGasto fg = new FGasto();

        //Resumen
        CRUDResumen crudr = new CRUDResumen();
        FResumen fr = new FResumen();

        //Meta
        CRUDMeta crudm = new CRUDMeta();
        FMeta fm = new FMeta();
        FNuevaMeta fnm = new FNuevaMeta();
        FEditarMeta fem = new FEditarMeta();

        //Perfil
        CRUDPerfil crudp = new CRUDPerfil();
        FPerfil fp = new FPerfil();
        FEditarPerfil fep = new FEditarPerfil();

        //Controladores
        ControladorInicioSesion c = new ControladorInicioSesion(fi, fre, i, user);
        ControladorIngreso ci = new ControladorIngreso(fin, crudi, in);
        ControladorGasto cg = new ControladorGasto(fg, crudg, ga);
        ControladorResumen cr = new ControladorResumen(fr, crudr);
        ControladorMeta cm = new ControladorMeta(crudm, fm, fnm, fem);
        ControladorPerfil cp = new ControladorPerfil(crudp, fp, fep);

        //Iniciar Sesion
        fi.setVisible(true);
        fi.setLocationRelativeTo(null);
    }
}
