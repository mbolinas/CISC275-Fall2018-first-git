public class  Dog extends Animal implements Comparable<Animal>{
    String name;
    int legs;

    public Dog(String n, int l){
	name = n;
	legs = l;
    }
    
    public int getLegs(){
	return legs;
    }

    public String getName(){
	return name;
    }

    public int  compareTo(Animal a){
	return name.compareToIgnoreCase(a.getName());
    }

    public String toString(){
	return "Name: " + name + ", legs: " + legs;
    }

}