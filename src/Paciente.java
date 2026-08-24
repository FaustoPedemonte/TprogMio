import java.util.Set;
public class Paciente extends Usuario {
    private DTFecha fNacimiento;
    private DTFecha fIngreso;
    private int ci;
    private Set<String> antecedentes;
   
    public static Paciente create(String nickname, String nombre, String apellido, String email, DTFecha fNacimiento, DTFecha fIngreso, int ci, Set<String> antecedentes) {
        super(nickname, nombre, apellido, email);
        paciente.fNacimiento = fNacimiento;
        paciente.fIngreso = fIngreso;
        paciente.ci = ci;
        paciente.antecedentes = antecedentes;
    }
    public Set<DTReserva> listadoReservas() {
        return null; // implemento despues 
    }
    public String getNickname() {
        return nickname;
    }
    public void agregarReserva(Reserva reserva) {
        return null; // implemento despues
    }
    
    @Override
    public DTUsuario crearDTUsuario() {
        return new DTPaciente(getNickname(), getNombre(), getApellido(), getEmail(), this.fNacimiento, this.fIngreso, this.ci, this.antecedentes);
    }
    @Override 
    public boolean esPaciente() {
        return true;
    }
}
