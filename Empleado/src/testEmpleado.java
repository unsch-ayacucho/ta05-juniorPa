
public class testEmpleado {
    public static void main(String[] args) {
        Empleado E1=new Empleado();
        
        E1.codigo="27182524";
        E1.nombre="albert";
        E1.areaLaboral="secre";
        E1.horasExtras=24.28;
        E1.afiliacion="si";
        E1.sueldo=156555.5;
        
        
        E1.afiliacionAFP(E1.sueldo);
        E1.afiliacionSNP(E1.sueldo);
        E1.afiliacionSalud(E1.sueldo);
        E1.sueldoNeto(E1.sueldo);
        E1.montoHorasEx(E1.sueldo, (float) E1.horasExtras);
        E1.totalDescuento();
        System.out.println(E1);
    
    }
}
