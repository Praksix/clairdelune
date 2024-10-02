package com.praksix.clairdelune.models;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.*;



@Entity
@Table(name = "etablissement")
public class Etablissement {
    //private @Id @GeneratedValue Long id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String city;
    private String address;
    private String description;
    private String photohotel;

    // constructeur par défaut
    Etablissement() {

    }

    // constructeur appelé si arguments
    Etablissement(String a_name, String a_city, String an_address, String a_description, String a_photohotel) {
        this.name = a_name;
        this.city = a_city;
        this.address = an_address;
        this.description = a_description;
        this.photohotel = a_photohotel;

    }

    // getter
    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getCity() {
        return this.city;
    }

    public String getAddress() {
        return this.address;
    }

    public String getDescription() {
        return this.description;
    }

    public String getPhotohotel() {
        return this.photohotel;
    }







    // setter
    public void setName(String a_name) {
        this.name = a_name;
    }

    public void setCity(String a_city) {
        this.city = a_city;
    }

    public void setAddress(String an_address) {
        this.address = an_address;
    }

    public void setDescription(String a_description) {
        this.description = a_description;
    }

    public void setPhotohotel(String a_photohotel) {
        this.photohotel = a_photohotel;
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
        if (!(o instanceof Etablissement))
            return false;

        //on compare chaque champ de 2 établissements pour voir s'ils sont identiques
        Etablissement an_etablissement = (Etablissement) o;
        return Objects.equals(this.id, an_etablissement.id)
            && Objects.equals(this.name, an_etablissement.name)
            && Objects.equals(this.city, an_etablissement.city)
            && Objects.equals(this.address, an_etablissement.address)
            && Objects.equals(this.description, an_etablissement.description);
    }

    //hash ça va etre utile plus tard pour bien différencier
    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.city, this.address, this.description);
    }


    @Override
    public String toString() {
    return "Etablissement{" + "id=" + this.id + ", name='" + this.name + "', city='" + this.city + "', address='" + this.address + "', description='" + this.description + "'}";
    }

}
