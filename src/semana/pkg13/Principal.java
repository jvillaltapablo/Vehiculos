
package semana.pkg13;


public class Principal {

    public static void main(String[] args) {
        Vehiculo misVehiculos[] = new Vehiculo[2];
        
        misVehiculos[0] = new Vehiculo("GH67","Ferrari","A89");
        misVehiculos[1] = new VehiculoTurismo(4,"78HJ","Audi","P14");
        
        for(Vehiculo vehiculos: misVehiculos){
            System.out.println(vehiculos.mostrarDatos());
            
        }
    }

}
