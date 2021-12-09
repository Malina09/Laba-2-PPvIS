package library.model;

public class User {
    private Long identifier;
    private String login;
    private String pass;
    private Role role;

    public User(){

    }

    public User(Long identifier, String login, String pass, Role role) {
        this.identifier = identifier;
        this.login = login;
        this.pass = pass;
        this.role = role;
    }
    public Long getIdentifier() { return identifier; }
    public void setIdentifier(Long identifier) { this.identifier = identifier; }

    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }

    public String getPass() { return pass; }
    public void setPass(String pass) { this.pass = pass; }

    public Role getRole() { return role; }
    public void setRole(Role role) { this.role = role; }
}
