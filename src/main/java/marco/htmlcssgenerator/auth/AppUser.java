package marco.htmlcssgenerator.auth;

import jakarta.persistence.*;


@Entity
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;


    public AppUser() {}

    public AppUser(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
    this.email = email;
}
    
}
