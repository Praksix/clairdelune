package com.praksix.clairdelune.models;

import java.util.Objects;
import jakarta.persistence.*;

@Entity
@Table(name = "suite")
class Suite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String description;
    private String prix;
    private String photoroom;

    // constructeur par défaut
    Suite() {

    }

    // constructeur appelé si arguments
    Suite(String a_titre, String a_description, String a_prix, String a_photoroom) {
        this.titre = a_titre;
        this.description = a_description;
        this.prix = a_prix;
        this.photoroom = a_photoroom;
    }

    // getter
    public Long getId() {
        return this.id;
    }

    public String getTitre() {
        return this.titre;
    }


    public String getDescription() {
        return this.description;
    }

    public String getPrix() {
        return this.prix;
    }

    public String getPhotoroom() {
        return this.photoroom;
    }




    // setter
    public void setTitre(String a_titre) {
        this.titre = a_titre;
    }

    public void setDescription(String a_description) {
        this.description = a_description;
    }

    public void setPrix(String a_prix) {
        this.prix = a_prix;
    }

    public void setPhotoroom(String a_photoroom) {
        this.photoroom = a_photoroom;
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
        Suite a_suite = (Suite) o;
        return Objects.equals(this.id, a_suite.id)
            && Objects.equals(this.titre, a_suite.titre)
            && Objects.equals(this.prix, a_suite.prix)
            && Objects.equals(this.description, a_suite.description)
            && Objects.equals(this.photoroom, a_suite.photoroom);
    }

    //hash ça va etre utile plus tard pour bien différencier
    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.titre, this.description, this.prix, this.photoroom);
    }


    @Override
    public String toString() {
    return "User{" + "id=" + this.id + ", titre='" + this.titre + "', description='" + this.description + "', prix'" + this.prix + "', photoroom='" + this.photoroom + "''}";
    }

}
