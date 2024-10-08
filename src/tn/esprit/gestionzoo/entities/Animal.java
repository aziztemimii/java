package tn.esprit.gestionzoo.entities;
public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;
public Animal (String family,String name,int age,boolean isMammal ){
    this.family=family;
    this.name=name;

    this.age=age;
    this.isMammal=isMammal;
}
    public String getName(){
        return name;
    }
    public int getage(){
        return age;
    }
    public void setage(){
        this.age=age;
    }
    public void setName(){
        this.name=name;
    }
    public String getFamily(){
    return family;
    }
    public void setFamily(String family){
    this.family=family;
    }
    @Override
    public String toString() {
        return "Animal{" + "family='" + family + '\'' + ", name='" + name + '\'' + ", age=" + age + ", isMammal=" + isMammal + '}';
    }

}
