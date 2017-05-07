package kensyu01;

// 入力された値を扱う機能を読み込む
import java.util.Scanner;

// 入力された値の大きさで正方形を描画するクラス
public class E4_20_SquareGenerator {
	
	// int型変数を初期化するための値を設定する
	public static final int INITIALIZATION_INTEGER = 0;
	
	// String型変数を初期化するための値を設定する
	public static final String INITIALIZATION_STRING = "";
	
	// 正方形を描画するための記号を設定する
	public static final String DRAW_SYMBOL = "*";
	
	// 正方形サイズの入力を促すメッセージを設定する
	public static final String MESSAGE_OF_SQUARE_GENERATOR = "正方形を描画します。サイズを入力してください。";
	
	// 入力された値からアスタリスクで正方形を描画する処理を行う
	public static void main (String[] arg) {
		
		// 正方形サイズの入力を扱うオブジェクトを作成する
		Scanner squareSizeInput = new Scanner(System.in);
		
		// 正方形サイズの値を保持する変数を初期化する
		int squareSize = INITIALIZATION_INTEGER;
		
		// 正方形サイズの入力を促すメッセージを出力する
		System.out.println(MESSAGE_OF_SQUARE_GENERATOR);
		
		// 入力された正方形サイズの値を変数に保持する
		squareSize = squareSizeInput.nextInt();
		
		
		// 入力された正方形サイズの値から正方形を描画する
		for ( int rowCount = INITIALIZATION_INTEGER; rowCount < squareSize; rowCount++ ) {
			// 入力されたサイズ分の文字を出力する
			for ( int columnCount = 0; columnCount < squareSize; columnCount++ ) {
				// 描画用文字を出力する
				System.out.print(DRAW_SYMBOL);
			}
			// 改行を出力する
			System.out.println();
		}

		 
		//　正方形サイズの入力ストリームを閉じる
		squareSizeInput.close();
	}

}
