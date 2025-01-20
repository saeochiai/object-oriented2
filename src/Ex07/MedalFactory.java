package Ex07;

public class MedalFactory {

    private Employee[] employees;//工場で働く従業員

    public MedalFactory(Employee[] employees) {
        this.employees = employees;
    }

    private int totalSalary = 0;

    for (Employee employee:employees){
        totalSalary = totalSalary+employee.getSalary();
    }
    
    public void makeMedal(Material[] materials){
        String medalName = "";
        int price = 0;

        if (material.getName().equals("金")){
            medalName = "金メダル";
            price = price+(getSalary/10)*1.2;
        }
         }
    }

    //Material10個に対して、10個の商品(メダル)が出来上がる

    return medals;

    // public void makeMedal(materials){
        

}
