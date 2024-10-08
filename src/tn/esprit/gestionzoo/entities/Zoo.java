package tn.esprit.gestionzoo.entities;
public class Zoo {
 private Animal[]animals ;
 private String name ;
 private String city;
 final int nbrCages=5 ;
 public Zoo (String name,String city){
     if (name == null || name.isEmpty()) {
         throw new IllegalArgumentException("Le nom du zoo ne peut pas être vide.");
     }
     this.name=name;
     this.city=city;
    // this.nbrCages=nbrCages;
     this.animals=new Animal[nbrCages];
 }
 public String getName(){
     return name;
 }
public String getCity(){
     return city;
}

    public Animal[] getAnimals() {
        return animals;
    }

    public void setName(String name){
     this.name=name;
}
public void setCity(String city){
     this.city=city;
}
public void setAnimals(Animal[]animals){
     this.animals=animals;
}

    @Override
    public String toString() {
        return "the name "+name+"and city "+city+"nombre "+nbrCages;
    }
    public boolean addAnimal(Animal animal) {
       if (isZooFull()) {
            System.out.println("interdire de depasser le nombre maximale d'animaux dans un zoo");
            return false;
        }
            if (searchAnimal(animal) != -1) {
                System.out.println("l'animal est existe déja");
                return false;
            }

            for (int count = 0; count < animals.length; count++) {

                if (animals[count] == null) {
                    if(animal.getage()<0 ){
                        System.out.println("l'age ne doit pas etre negative");
                        return false;

                    }
                    animals[count] = animal;
                    return true;
                }
            }
           // System.out.println("interdire de depasser le nombre maximale d'animaux dans un zoo");
            return false;
        }
    public void affiche (){
     for(int i=0;i< animals.length;i++){
         if(animals[i]!=null){
             System.out.println(animals[i]);
         }
     }

    }
   public int searchAnimal(Animal animal){
     for(int i=0;i<animals.length;i++){
         if(animals[i]!=null && animals[i].getName()==animal.getName()){
             return i;
         }
     }return -1;
   }
    public boolean removeAnimal(Animal animal){
    for(int i=0;i<animals.length;i++){
        if(animals[i]!=null && animals[i].getName()==animal.getName()){
            animals[i]=null;
            System.out.println("l'animal est supprime");
        return true;}
    }
    System.out.println("l'animal n'existe pas ");
    return false;
    }

    public boolean isZooFull() {
        int a=0;
        for (int i = 0; i < animals.length ; i++) {
            if (animals[i ] != null) {
                a++;
            }
        }
        if (a > nbrCages) {
            System.out.println("le zoo est  plein");
            return true;
        }System.out.println("le zoo n'est pas plein   ");
        return false;
    }
    int aa=0;
    int b=0;
    public Zoo comparerZoo(Zoo z1,Zoo z2){
        for(int i=0;i<z1.animals.length;i++) {
            if (z1.animals[i] != null) {
                aa++;
            }
        }
            for(int i=0;i<z2.animals.length;i++){
                if(z2.animals[i] !=null){
                    b++;
                }
        }
            if(aa>b){
                return z1;
            }
            return z2;
    }

}
