/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author perro
 */
public class EmpleadoBR {
   float calculaSalarioBruto(TipoEmpleado.puestoTrabajo pt, float ventasMes, float horasExtra) {
        if(ventasMes <= 0 || horasExtra <= 0){
            throw new BRException("Pene");
        }
    }

    public static void main(String[] args) {
        TipoEmpleado t1 = new TipoEmpleado(TipoEmpleado.puestoTrabajo.ENCARGADO);
        TipoEmpleado t2 = new TipoEmpleado(TipoEmpleado.puestoTrabajo.VENDEDOR);
    }

}
