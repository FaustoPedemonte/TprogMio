public abstract class Usuario {
    private String nickname;
    private String nombre;
    private String apellido;
    private String email;

    public Usuario(String nickname, String nombre, String apellido, String email) {
        this.nickname = nickname;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }
    public String getNickname() {
        return nickname;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getEmail() {
        return email;
    }

    public abstract DTUsuario crearDTUsuario();
    public abstract boolean esPaciente(); 
}