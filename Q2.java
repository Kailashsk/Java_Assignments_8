/* Create an abstract class 'Animals' with two abstract methods 'cats()' and 
'dogs()'. Now create a class 'CatAnimals' with a method 'cats()' which prints 
"Cats meow" and a class 'DogAnimals' with a method 'dogs()' which prints 
"Dogs bark", both inheriting the class 'Animals'. Create an object for each of 
the subclasses and call their respective methods to display sound of the animals
respectively. */

abstract class Animals{
    abstract void cats();
    abstract void dogs();
}

class CatAnimals extends Animals{

    void dogs(){}

    void cats()
    {
        System.out.println("Cats Meow");
    }
    
}

 class DogAnimals extends Animals{

    void cats(){}
    void dogs()
    {
        System.out.println("Dogs bark");
    }
    
}


public class as82 {
    public static void main(String[] args) {
        
        CatAnimals c=new CatAnimals();
        c.cats();

        DogAnimals d=new DogAnimals();
        d.dogs();
    }
    
}
