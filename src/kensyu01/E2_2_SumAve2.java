package kensyu01;

//2つの変数xとyの合計と平均を表示するクラス
public class E2_2_SumAve2 {

	//数値を計算する為の処理を行う
	public static void main(String[] arg){

		//　変数xを63で初期化する
		int x = 63;
		//　変数yを18で初期化する
		int y = 18;
		// 変数zを34初期化する
		int z = 34;

		//変数sumに x, y, z の合計を保持する
		int sum = x + y + z;
		//変数aveに x, y, z の平均を保持する
		int ave = sum / 3;

		// 変数 x, y, z の合計を出力する処理を行う
		System.out.println("変数x, y, z の合計値は" + sum + "です。");
		// 変数 x, y, z の平均を出力する処理を行う
		System.out.println("変数x, y, z の平均値は" + ave + "です。");

	}
}
