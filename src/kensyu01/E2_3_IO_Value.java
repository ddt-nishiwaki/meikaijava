package kensyu01;

// 入力した値を読み込む為の機能の読み込みを行う
import java.util.Scanner;

// 入力した値を反復して表示するクラス
public class E2_3_IO_Value {

	// 入力した値を変数xに保持して報告する為の処理を行う
	public static void main(String[] arg){
		
		// 入力した値を読み込む為のオブジェクトを作成する
		Scanner stdIn = new Scanner(System.in);
		
		// 整数値の入力を促すメッセージを出力する処理を行う
		System.out.print("整数値 : ");
		// 変数xに入力した値を保持する
		int x = stdIn.nextInt();
		// 入力用ストリームを閉じる
		stdIn.close();
		
		// 入力された値を報告するメッセージを出力する処理を行う
		System.out.println(x + "と入力しましたね");
		
	}
}
