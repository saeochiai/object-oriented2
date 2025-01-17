package Ex07;

public class Main {

    public static void main(String[] args) {

        Employee employees[]= new Employee[3];

        employees[0] = new Employee();
        employees[0].setName("山田");
        employees[0].setSalary(200000);

        employees[1] = new Employee();
        employees[1].setName("海田");
        employees[1].setSalary(220000);

        employees[2] = new Employee();
        employees[2].setName("川田");
        employees[2].setSalary(240000);

        Material materials[] = new Material[4];
        
        materials[0] = new Material();
        materials[0].setName("金");
        materials[0].setCost(10000);

        materials[1] = new Material();
        materials[1].setName("銀");
        materials[1].setCost(5000);

        materials[2] = new Material();
        materials[2].setName("銅");
        materials[2].setCost(1000);

        materials[3] = new Material();
        materials[3].setName("木");
        materials[3].setCost(500);

        //MedalFactoryの作成
        //工場を稼働させ、出来あがった情報の開示



        public static void makeMedal(Employee employee, Material material) {
            // 製品名と価格（給与 + コスト）を計算して出力
            int price = employee.getSalary() + material.getCost();
            System.out.println("製品名: " + material.getName() + "メダル / 価格: " + material.getCost + "円");
        }
    
        }
        
    }


