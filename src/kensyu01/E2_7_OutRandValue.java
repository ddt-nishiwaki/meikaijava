package kensyu01;

// 乱数を生成する為の機能の読み込みを行う
import java.util.Random;

// 乱数を表示するクラス
public class E2_7_OutRandValue {

	// 一桁の正の整数、一桁の負の整数、二桁の正の整数を出力する処理を行う
	public static void main(String[] args){
		
		// 乱数を生成するオブジェクトを作成する
		Random rand = new Random();
		
		// 一桁の正の整数を変数に保持する
		int Pos_1_digit = rand.nextInt(9) + 1;
		// 一桁の負の整数を変数に保持する
		int Neg_1_digit =  ( rand.nextInt(9) + 1 ) * -1;
		// 二桁の正の整数を変数に保持する
		int Pos_2_digit = ( rand.nextInt(9) + 1 ) * 10 + rand.nextInt(10);
		
		// 一桁の正の整数を変数に保持する
		System.out.println(Pos_1_digit);
		// 一桁の負の整数を変数に保持する
		System.out.println(Neg_1_digit);
		// 二桁の正の整数を変数に保持する
		System.out.println(Pos_2_digit);
		
	}
	
}
