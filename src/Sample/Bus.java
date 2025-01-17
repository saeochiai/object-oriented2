package Sample;

public class Bus extends Car {

    int price;
    
   
    @Override
    void stepOnAccele(){
    super.stepOnAccele();
        System.out.println("スピードは"+speed+"km/hです");
    }

    void payment(){
    price = price +30;
        System.out.println("料金は"+price+"円です");

    }


    }


