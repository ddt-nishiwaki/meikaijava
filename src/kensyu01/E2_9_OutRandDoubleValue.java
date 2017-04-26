package kensyu01;

// 乱数を生成する為の機能の読み込みを行う
import java.util.Random;

// double型の乱数を生成するクラス
public class E2_9_OutRandDoubleValue {

	// double型の乱数を生成する処理を行う
	public static void main(String[] arg){
		
		// 乱数を生成するオブジェクトの作成を行う
		Random rand = new Random();
		
		// 0.0 以上 1.0未満のランダム実数を生成し変数に保持する 
		double range_0_1 = rand.nextDouble();
		// 0.0 以上 10.0未満のランダム実数を生成し変数に保持する
		double range_0_10 = rand.nextDouble() * 10;
		// -1.0 以上 1.0未満のランダム実数を生成し変数に保持する
		double range_Neg1_1 = ( rand.nextDouble() * 2 ) -1;
		
		// 0.0 以上 1.0未満のランダム実数を表示する
		System.out.println(range_0_1);
		// 0.0 以上 10.0未満のランダム実数を表示する
		System.out.println(range_0_10);
		// -1.0 以上 1.0未満のランダム実数を表示する
		System.out.println(range_Neg1_1);
	}
}
