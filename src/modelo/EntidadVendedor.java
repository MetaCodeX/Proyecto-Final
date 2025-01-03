package modelo;

public class EntidadVendedor {
    private int id;
    private String dni;
    private String nom;
    private String tel;
    private String user;
    private String password;
    private String estado;

    public EntidadVendedor() {
    }

    public EntidadVendedor(int id, String dni, String nom, String tel, String user, String password, String estado) {
        this.id = id;
        this.dni = dni;
        this.nom = nom;
        this.tel = tel;
        this.user = user;
        this.password = password;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
