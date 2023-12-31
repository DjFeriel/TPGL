package fr.ufrsciencestech.panier;

/**
 *
 * @author roudet
 */
public class Orange {
    private double prix;
    private String origine;
	
    public Orange() 
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Espagne";
    }
    
    public Orange(double prix, String origine) 
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "Espagne";  //Espagne par défaut
	else
            this.origine = origine;   
    }

    public double getPrix(){
	return prix;
    }

    public void setPrix(double prix){
	this.prix=prix;
    }

    public String getOrigine(){
	return origine;
    }
 
    public void setOrigine(String origine){
	this.origine=origine;
    }

    @Override
    public String toString(){
        return "Orange de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 oranges sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Orange or = (Orange) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une orange a des pepins
        return false;
    }


    public static void main (String[] args){
        //Ecrire ici vos tests
	System.out.println("premier test Orange");
    Orange o1= new Orange();
    Orange o2=new Orange(1.0,"France");
    Orange o3= new Orange(2.0,"Italie");
    System.out.println("le prix de la premiere orange est "+o1.getPrix()+" euro et d'origine "+o1.getOrigine());
    System.out.println("le prix de la 2eme orange est "+o2.getPrix()+" euro et d'origine "+o2.getOrigine());
    System.out.println("la 3eme orange "+o3.toString());
    System.out.println(" equivalence 3eme avec elle meme "+o3.equals(o3));
    
    
 


   }
}
