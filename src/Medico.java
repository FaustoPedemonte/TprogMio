import java.util.HashSet;
import java.util.Set;

public class Medico extends Usuario {
    private int numRegistro;
    private int mesLicencia;
    private float adicional;
    private String link;
    
    private Set<Especialidad> especialidades;
    public Medico(String nickname, String nombre, String apellido, String email, int numRegistro, int mesLicencia, float adicional, String link, Set<Especialidad> especialidades) {
        super(nickname, nombre, apellido, email);
        this.numRegistro = numRegistro;
        this.mesLicencia = mesLicencia;
        this.adicional = adicional;
        this.link = link;
        this.especialidades = new HashSet<>(especialidades);
    }
    publiic void agregarEspecialidad(Especialidad esp) {
        this.especialidades.add(esp);
    }
    
    public Set<Especialidad> getEspecialidad() {
        return especialidades;
    }
    public void setPaginaWeb(String link) {
        this.link = link;
    }
    public set<DTConsulta> listadoConsultas() {
        return null; // implemento despues
    }

    
    @Override
    public DTUsuario crearDTUsuario() {
       return new DTMedico(getNickname(), getNombre(), getApellido(), getEmail(), this.numRegistro, this.mesLicencia, this.adicional, this.link, this.especialidades);
    
    @Override
    public boolean esPaciente() {
        return false;
    }
    
}
