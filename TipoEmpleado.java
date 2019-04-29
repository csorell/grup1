/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author perro
 */
public class TipoEmpleado {
    private float salarioBase;
    private puestoTrabajo pt;
    
    enum puestoTrabajo{
        VENDEDOR,
        ENCARGADO
    }

    public TipoEmpleado(puestoTrabajo pt) {
        this.pt = pt;
        if(pt == puestoTrabajo.VENDEDOR){
            this.salarioBase = 1000;
        } else {
            this.salarioBase = 1500;
        }
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public puestoTrabajo getPt() {
        return pt;
    }
}
