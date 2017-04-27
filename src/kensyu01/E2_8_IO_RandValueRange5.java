package kensyu01;

//入力した値を読み込む為の機能の読み込みを行う
import java.util.Scanner;
//乱数を生成する為の機能の読み込み
import java.util.Random;

// 入力された値-5 ~ 入力された値 + 5 までをランダムで出力するクラス
public class E2_8_IO_RandValueRange5 {

	// 入力された値-5 ~ 入力された値 + 5 までをランダムで出力する処理を行う
	public static void main(String[] arg){
		
		// 入力した値を読み込む為のオブジェクトを作成する
		Scanner stdIn = new Scanner(System.in);
		// 乱数を生成するオブジェクトを作成する
		Random rand = new Random();
		
		// 整数値の入力を促すメッセージを出力する
		System.out.print("整数値 : ");
		// 入力された値を変数に保持する
		int inputValue = stdIn.nextInt();
		// 入力用のストリームを閉じる
		stdIn.close();
		
		// -5 ~ 5までのランダムな一桁の整数を保持する
		int randValue = rand.nextInt(11) -5;
		
		// 入力された値に randValue を加算して変数に保持する
		int result = inputValue + randValue;
		
		// 演算結果を出力する
		System.out.println("その値の±5の乱数を生成しました。それは" + result + "です。");
		
	}
}
