import java.util.Random;
import java.util.Scanner;

public class Character {
	Scanner sc=new Scanner(System.in);
	Random rand =new Random();
	
	String name;
	String job;
	int money;
	int hp;
	int attack;
	int defense;
	
	Character(){
		
	}
	
	Character(String name){
		this.name=name;
		this.job="無職";
		this.money=rand.nextInt(401)+100;
		this.hp=rand.nextInt(51)+100;
		this.attack=rand.nextInt(21)+20;
		this.defense=rand.nextInt(21)+20;
	}
	
	Character(String name,String job){
		this.name=name;
		this.job=job;
		this.money=rand.nextInt(401)+100;
		this.hp=rand.nextInt(51)+100;
		this.attack=rand.nextInt(21)+20;
		this.defense=rand.nextInt(21)+20;
	}
	
	Character(String name,int money){
		this.name=name;
		this.job="無職";
		this.money=money;
		this.hp=rand.nextInt(51)+100;
		this.attack=rand.nextInt(21)+20;
		this.defense=rand.nextInt(21)+20;
	}
	
	Character(String name,String job,int money){
		this.name=name;
		this.job=job;
		this.money=money;
		this.hp=rand.nextInt(51)+100;
		this.attack=rand.nextInt(21)+20;
		this.defense=rand.nextInt(21)+20;
	}
	
	
	
	
	static void characterMakeInfo() {
		System.out.println("===キャラクターメイク===");
		System.out.print("名前を入力してください：");
	}
	
	static void jobSelectInfo() {
		System.out.println("職業を自分で決めますか？");
		System.out.println("1：自分で決める");
		System.out.println("2：おまかせ");
	}
	
	
	static void moneySelectInfo() {
		System.out.println("所持金を自分で決めますか？");
		System.out.println("1：自分で決める");
		System.out.println("2：おまかせ");
	}
	
	void showInfo() {
		System.out.println("===キャラクター完成===");
		System.out.println("名前："+this.name);
		System.out.println("職業："+this.job);
		System.out.println("所持金："+this.money);
		System.out.println("HP："+this.hp);
		System.out.println("こうげき："+this.attack);
		System.out.println("ぼうぎょ："+this.defense);
		
	}
	
}
