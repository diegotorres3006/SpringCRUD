/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;


public class Persona {
    
    int id;
    String nom;
    String correo;
    String nacio;

    public Persona() {
    }

    public Persona(int id, String nom, String correo, String nacio) {
        this.id = id;
        this.nom = nom;
        this.correo = correo;
        this.nacio = nacio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNacio() {
        return nacio;
    }

    public void setNacio(String nacio) {
        this.nacio = nacio;
    }
    
    
    
    
    
}
