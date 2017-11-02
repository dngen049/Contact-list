/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetfinale;

import javax.swing.ImageIcon;

/**
 *
 * @author CECCE
 */
class InfoEx implements Comparable<InfoEx>{

    private String nom;
    private String numero;
    private String Ville;
    private String Province;
    private String Pays;
    private ImageIcon con;

   // le constructeur
   public InfoEx () {
      nom="PasDeNom";
      numero="";
      Ville = "";
      Province = "";
      Pays = "";
      con = null;
 
   }

   // Les mutateurs
   public void SetNom(String nm) {
      this.nom = nm;
   }
   public void SetNumero(String num){
       this.numero = num;
   }
   public void Setville(String vll){
       this.Ville= vll;
   }
   public void Setprovince(String prov){
       this.Province = prov;
   }
   public void Setpays(String pay){
       this.Pays = pay;
   }
   public void SetImage( ImageIcon Con){
       this.con = Con;
   }
  // les accesseurs
   public InfoEx GetInfo () {
      return this;
   }
   public String GetNom() {
      return this.nom;
   }
   public String GetNumero() {
      return this.numero;
   }
   public String Getville() {
      return this.Ville;
   }
   public String Getprovince() {
      return this.Province;
   }
   public String Getpays() {
      return this.Pays;
   }
   public ImageIcon GetImage(){
       return this.con;
   }
   

   // pour affichage
   public String ToString(){
      return "nom="+this.nom+ " numero= "+this.numero+ " Ville= "+this.Ville+" Province= "+this.Province+" Pays= "+this.Pays;
   }
   // Comparer les nom
   @Override
    public int compareTo(InfoEx other) {
        int compareInt = this.GetNom().compareTo(other.GetNom());
       if(compareInt<0){
           return -1;// le nom est plus gramp(A>B)
       }
       if(compareInt>0){
           return 1;// le nom est petit(B<A)
       }
       return 0;//L ordre est bon
   
    }

    

   
}
