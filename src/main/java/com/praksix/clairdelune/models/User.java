package com.praksix.clairdelune.models;

import java.util.Objects;
import jakarta.persistence.*;

@Entity
@Table(name = "user")
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String role;
    private String nom;
    private String prenom;
    private String email;
    private String password;

    // constructeur par défaut
    User() {

    }

    // constructeur appelé si arguments
    User(String a_role, String a_nom, String a_prenom, String an_email, String a_password) {
        this.role = a_role;
        this.nom = a_nom;
        this.prenom = a_prenom;
        this.email = an_email;
        this.password = a_password;
    }

    // getter
    public Long getId() {
        return this.id;
    }

    public String getRole() {
        return this.role;
    }


    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }







    // setter
    public void setRole(String a_role) {
        this.role = a_role;
    }

    public void setNom(String a_nom) {
        this.nom = a_nom;
    }

    public void setPrenom(String a_prenom) {
        this.prenom = a_prenom;
    }

    public void setEmail(String an_email) {
        this.email = an_email;
    }

    public void setPasswword(String a_password) {
        this.password = a_password;
    }


    //@ManyToOne
    //@JoinColumn(name = "user_id")
    //private User user;
    // Un hôtel est géré par un seul user, mais un user peut gérer plusieurs hôtels
    // @Many du coté où il y a N
    // @JoinColumn = la colonne FK ajoutée à la table Hotel





    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof User))
            return false;

        //on compare chaque champ de 2 userss pour voir s'ils sont identiques
        User an_user = (User) o;
        return Objects.equals(this.id, an_user.id)
            && Objects.equals(this.role, an_user.role)
            && Objects.equals(this.nom, an_user.nom)
            && Objects.equals(this.prenom, an_user.prenom)
            && Objects.equals(this.email, an_user.email)
            && Objects.equals(this.password, an_user.password);
    }

    //hash ça va etre utile plus tard pour bien différencier
    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.role, this.nom, this.prenom, this.email, this.password);
    }


    @Override
    public String toString() {
    return "User{" + "id=" + this.id + ", role='" + this.role + "', nom='" + this.nom + "', prenom'" + this.prenom + "', email='" + this.email +"', password'" + this.password + "''}";
    }

}
