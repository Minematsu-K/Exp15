import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Character character1=new Character();
		
		String selectJob;
		int selectMoney;
		
		Character.characterMakeInfo();
		String name=sc.nextLine();
		System.out.println();
		
		Character.jobSelectInfo();
		selectJob="";
		int select1=sc.nextInt();
		sc.nextLine();
		if(select1==1) {
			System.out.println("職業を入力してください：");
			selectJob=sc.nextLine();
			System.out.println();
		}else if(!(select1==1)&&!(select1==2)) {
			System.out.println("職業を登録できませんでした");
			System.out.println();
		}
		
		Character.moneySelectInfo();
		int select2=sc.nextInt();
		selectMoney=0;
		if(select2==1) {
			System.out.println("所持金を入力してください：");
			selectMoney=sc.nextInt();
			System.out.println();
		}else if(!(select2==1)&&!(select2==2)) {
			System.out.println("所持金を登録できませんでした");
			System.out.println();
		}
		
		if(select1==1&&select2==1) {
			character1=new Character(name,selectJob,selectMoney);
		}else if(select1==1&&select2==2) {
			character1=new Character(name,selectJob);
		}else if(select1==2&&select2==1) {
			character1=new Character(name,selectMoney);
		}else {
			character1=new Character(name);
		}
		
		character1.showInfo();
		
		sc.close();
	}

}
