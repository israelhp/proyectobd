/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd.vistas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyectobd.dao.intefaces.EmpleadoDAO;
import proyectobd.dao.intefaces.HorarioDAO;
import proyectobd.dao.intefaces.PersonaDAO;
import proyectobd.dao.intefaces.PuestoDAO;
import proyectobd.dao.mysql.MySQLAsistencia;
import proyectobd.dao.mysql.MySQLCarro;
import proyectobd.dao.mysql.MySQLDetalleEquipo;
import proyectobd.dao.mysql.MySQLDetalleFacturaCompra;
import proyectobd.dao.mysql.MySQLDetalleFacturaProducto;
import proyectobd.dao.mysql.MySQLDetalleFacturaVenta;
import proyectobd.dao.mysql.MySQLDetallePago;
import proyectobd.dao.mysql.MySQLEmpleado;
import proyectobd.dao.mysql.MySQLEmpresa;
import proyectobd.dao.mysql.MySQLEquipo;
import proyectobd.dao.mysql.MySQLEstadoPieza;
import proyectobd.dao.mysql.MySQLFacturaCompra;
import proyectobd.dao.mysql.MySQLFacturaGeneral;
import proyectobd.dao.mysql.MySQLFacturaProducto;
import proyectobd.dao.mysql.MySQLFacturaVenta;
import proyectobd.dao.mysql.MySQLHorario;
import proyectobd.dao.mysql.MySQLInasistencia;
import proyectobd.dao.mysql.MySQLInventarioGeneral;
import proyectobd.dao.mysql.MySQLInventarioPieza;
import proyectobd.dao.mysql.MySQLMarcaPieza;
import proyectobd.dao.mysql.MySQLMovimientoFinanciero;
import proyectobd.dao.mysql.MySQLNombrePieza;
import proyectobd.dao.mysql.MySQLPago;
import proyectobd.dao.mysql.MySQLPersona;
import proyectobd.dao.mysql.MySQLPieza;
import proyectobd.dao.mysql.MySQLProducto;
import proyectobd.dao.mysql.MySQLProveedor;
import proyectobd.dao.mysql.MySQLPuesto;
import proyectobd.dao.mysql.MySQLTelefonoPersona;
import proyectobd.dao.mysql.MySQLTelefonoProveedor;
import proyectobd.dao.mysql.MySQLTipoFactura;
import proyectobd.dao.mysql.MySQLTipoInasistencia;
import proyectobd.dao.mysql.MySQLTipoPago;
import proyectobd.dao.mysql.MySQLTipoTransaccion;
import proyectobd.dao.mysql.MySQLVacaciones;
import proyectobd.modelos.Asistencia;
import proyectobd.modelos.Carro;
import proyectobd.modelos.DetalleEquipo;
import proyectobd.modelos.DetalleFacturaCompra;
import proyectobd.modelos.DetalleFacturaProducto;
import proyectobd.modelos.DetalleFacturaVenta;
import proyectobd.modelos.DetallePago;
import proyectobd.modelos.Empleado;
import proyectobd.modelos.Empresa;
import proyectobd.modelos.Equipo;
import proyectobd.modelos.EstadoPieza;
import proyectobd.modelos.Horario;
import proyectobd.modelos.Persona;
import proyectobd.modelos.Puesto;
import proyectobd.modelos.EstadoPieza;
import proyectobd.modelos.FacturaCompra;
import proyectobd.modelos.FacturaGeneral;
import proyectobd.modelos.FacturaProducto;
import proyectobd.modelos.FacturaVenta;
import proyectobd.modelos.Inasistencia;
import proyectobd.modelos.InventarioGeneral;
import proyectobd.modelos.InventarioPieza;
import proyectobd.modelos.MarcaPieza;
import proyectobd.modelos.MovimientoFinanciero;
import proyectobd.modelos.NombrePieza;
import proyectobd.modelos.Pago;
import proyectobd.modelos.Pieza;
import proyectobd.modelos.Producto;
import proyectobd.modelos.Proveedor;
import proyectobd.modelos.TelefonoPersona;
import proyectobd.modelos.TelefonoProveedor;
import proyectobd.modelos.TipoFactura;
import proyectobd.modelos.TipoInasistencia;
import proyectobd.modelos.TipoPago;
import proyectobd.modelos.TipoTransaccion;
import proyectobd.modelos.Vacaciones;
/**
 *
 * @author israe
 */
public class vistaprueba {

    public static void main(String args[]) throws ParseException {
       //ejemplo
       /* MySQLMovimientoFinanciero nuevo = new MySQLMovimientoFinanciero();
        
        MovimientoFinanciero aux = new MovimientoFinanciero();
        
        aux.setIdMovimientoFinanciero(2);
        aux.setTotal(0);
        aux.setMonto(3900);
        aux.setFecha(MySQLMovimientoFinanciero.obtenerDate("2020-11-30"));
        aux.setIdTipoTransaccion(1);
        
        //nuevo.insertar(aux);
        //nuevo.modificar(aux);
        
        aux = nuevo.obtenerId(1); 
        
        System.out.println("ID: "+aux.getIdMovimientoFinanciero()+" Nombre: "+ aux.getMonto());
        
        System.out.println("Lista:");
        ArrayList<MovimientoFinanciero> lista = nuevo.listar();
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("ID: "+ lista.get(i).getIdMovimientoFinanciero()+" Nombre: "+ lista.get(i).getMonto()+"Fecha:"+lista.get(i).getFecha());
            System.out.println("Dia:" + lista.get(i).obtenerCalendar().get(Calendar.DATE) + "Mes: " + lista.get(i).obtenerCalendar().get(Calendar.MONTH) + "Año: " +lista.get(i).obtenerCalendar().get(Calendar.YEAR) );
        }
*/  MySQLTipoFactura aux = new MySQLTipoFactura();
    ArrayList <TipoFactura> lista = aux.listar();
    
    for(int i=0; i<lista.size(); i++){
        System.out.println("ID: "+lista.get(i).getIdTipoFactura() +  " Tipo:"+ lista.get(i).getTipo());
    }    

    }

}
