package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] arg) {


       Zoo myZoo=null;
       try{
           myZoo = new Zoo( "ll" , "Nairobi");
           System.out.println(myZoo);
       }catch (IllegalArgumentException e){
           System.out.println(e.getMessage());
       }
        Zoo ourZoo=null;
        try{
            ourZoo = new Zoo( "lll" , "Nairobi");
            System.out.println(ourZoo);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

      //  Zoo ourZoo = new Zoo("Safari Parkkk", "Nairobiii");
        Animal lion =new Animal("félidale","semba",1,true);
        Animal tigre =new Animal("félidale","kkk",2,true);
        Animal fahed =new Animal("félidale","pppp",4,true);
        Animal kaleb =new Animal("félidale","ppp",4,true);
        Animal katous =new Animal("félidale","p",4,true);
        Animal asfour =new Animal("félidale","pp",4,true);

        Terrestre AnimalTerrest=new Terrestre();
       Dolphin daulphine=new Dolphin();
        Penguin penguin=new Penguin();
        Aquatiques AnimalAquatiques=new Aquatiques();
       System.out.println("aquatic animal created: "+AnimalAquatiques);
        System.out.println("terrest animal created: "+AnimalTerrest);
        System.out.println("daulphine created: "+daulphine);
       System.out.println("penguin created: "+penguin);
        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(tigre));
        System.out.println(myZoo.addAnimal(fahed));
        System.out.println(myZoo.addAnimal(kaleb));
        System.out.println(ourZoo.addAnimal(fahed));
      System.out.println(ourZoo.addAnimal(kaleb));
   System.out.println(myZoo.searchAnimal(fahed));
      //  myZoo.removeAnimal(katous);
//myZoo.isZooFull();
        myZoo.affiche();
       // System.out.println(myZoo.isZooFull());
      Zoo kzoo=myZoo.comparerZoo(myZoo,ourZoo);
        System.out.println("le zoo le plus plein " +kzoo.getName());


    }



    }
