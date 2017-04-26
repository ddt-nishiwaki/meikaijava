package kensyu01;

// 入力した値を取得する為の機能の読み込み
import java.util.Scanner;

// 三角形の面積を計算するクラス
public class E2_6_CalcurateTriangleArea {

	
	// 入力した三角形の底辺の長さと高さの値を受け取り面積を出力する為の処理
	public static void main (String[] args) {

		// 入力した値を読み込む為のオブジェクトを作成
		Scanner stdIn = new Scanner(System.in);

		// 処理の内容を出力する処理
		System.out.println("三角形の面積を求めます。");
		
		// x の値の入力を促す文字列を表示させる処理
		System.out.print("底辺 : ");
		// 入力した値を変数xに保持する為の処理
		float x = stdIn.nextFloat();

		// y の値の入力を促す文字列を表示させる処理
		System.out.print("高さ : ");
		// 入力した値を変数yに保持する為の処理
		float y = stdIn.nextFloat();
		
		// 入力用のストリームを閉じる
		stdIn.close();

		// 三角形の面積を計算しを保持する為の処理
		float result = x * y / 2;
		// 三角形の面積を出力する為の処理
		System.out.println("面積は" + result + "です。");

	}
	
}
