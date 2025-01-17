package Sample;

public class Zoo{
    public static void main(String[] args) {
        
        Animal[] animals = new Animal[5];

        animals[0] = new Sheep();   // 羊
        animals[1] = new Horse();   // 馬
        animals[2] = new Goat();    // やぎ
        animals[3] = new Monkey();  // サル
        animals[4] = new Bear();    // クマ 

    for(Animal animal : animals){
        animal.cry();
    }

    }
}
