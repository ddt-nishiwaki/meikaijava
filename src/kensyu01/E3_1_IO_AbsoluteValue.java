package kensyu01;

//入力した値を読み込む為の機能の読み込みを行う
import java.util.Scanner;

// 入力した値の絶対値を出力するクラス
public class E3_1_IO_AbsoluteValue {

	// 入力した値を絶対値で出力する為の処理を行う
	public static void main (String[] arg){
		
		// 入力した値を読み込む為のオブジェクトを作成する
		Scanner stdIn = new Scanner(System.in);
		
		// 整数値の入力を促すメッセージを出力する為の処理する
		System.out.print("整数値 : ");
		// 入力された値を変数に保持する
		int inputValue = stdIn.nextInt();
		
		// 入力用ストリームを閉じる
		stdIn.close();
		
		// 入力された値が0未満の場合 -1 を乗算して絶対値に変換する為の処理を行う
		if( inputValue < 0 ) {
			
			// 正の整数に変換する
			inputValue *= -1;
		}
		
		// 変数inputValueを出力する為の処理を行う
		System.out.println("その絶対値は" + inputValue + "です。");
		
	}
		
}
