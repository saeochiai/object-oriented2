package Ex07;

public class MedalFactory {

    private Employee[] employees;//工場で働く従業員

    public MedalFactory(Employee[] employees) {
        this.employees = employees;
    }

    //材料からメダルを作成する
    public Medal[] makeMedal[medalCount];

    //材料からメダルを精製する
    for (int i = 0; i< medalCount; i++){
        Medal medal = new Medal();

        Material material = materials[i];


        if(MedalConstant.Gold_NAME.equals(material.getName())){
            medal.setName(MedalConstant.GOLD_MEDAL_NAME);
            medal.setPrice(calcMedalPrice(material.getCost(),medalCount));

        }else if(MedalConstant.GOLD_NAME.equals(material.getName())){
            medal.setName(MedalConstant.GOLD_MEDAL_NAME);
            medal.setName(calcMedalPrice(material.getCost(),medalCount)),
        
        }else if(medalConstant.SILVER_NAME.equals(material.getName())) {
            medal.setName(MedalConstant.SILVER_MEDAL_NAME);
            medal.setPrice(calcMedalPrice(material.getCost(), medalCount));
        } else if (MedalConstant.BRONZE_NAME.equals(material.getName())) {
            medal.setName(MedalConstant.BRONZE_MEDAL_NAME);
            medal.setPrice(calcMedalPrice(material.getCost(), medalCount));
        } else {
            medal.setName(MedalConstant.DEFECTIVE_NAME);
            medal.setPrice(0);
        }
        medals[i] = medal;
    }
    return medals;


    }
    //メダルの価格を求める
	//メダルの価格 = 材料のコスト + (従業員の給料の合計 / 製品数) * 1.5(←利益上乗せ分、端数切り捨て)
	


	/*
	 * 従業員の給料の合計を求める.
	 */
	private int getTotalSalary() {
		int totalSalary = 0;
		for (Employee employee : employees) {
			totalSalary += employee.getSalary();
		}
		return totalSalary;
	}



// 	private int calcMedalPrice(int materialCost, int medalCount) {
		
// 		final double PROFIT = 1.2;
		
// 		// 従業員の給料の合計
// 		int totalSalary = getTotalSalary();

// 		// メダルの価格
// 		int medalPrice = (int)(materialCost + (totalSalary / medalCount) * PROFIT);
		
// 		return medalPrice;
// 	}
    
    
    
    
    
//     private int totalSalary = 0;

//     for (Employee employee:employees){
//         totalSalary = totalSalary+employee.getSalary();
//     }
    
//     public void makeMedal(Material[] materials){
//         String medalName = "";
//         int price = 0;

//         if (material.getName().equals("金")){
//             medalName = "金メダル";
//             price = price+(getSalary/10)*1.2;
//         }
//          }
//     }

//     //Material10個に対して、10個の商品(メダル)が出来上がる

//     return medals;

//     // public void makeMedal(materials){
        

// }
