package kensyu01;

//入力された値を扱う機能を読み込む
import java.util.Scanner;

// 入力された値から三角形を作成し、描画するクラス
public class E4_21_Generate_Pyramid {

	// int型変数を初期化するための値を設定する
	public static final int INITIALIZATION_INTEGER = 0;
	
	// String型変数を初期化するための値を設定する
	public static final String INITIALIZATION_STRING = "";
	
	// 三角形を描画するための記号を設定する
	public static final String DRAW_SYMBOL = "*";
	
	
	// 非表示範囲を設定するための処理開始時のカウントを設定する
	public static final int VALUE_OF_REVERSE_START = 0;
	
	// 表示範囲を設定するための処理開始時のカウントを設定する
	public static final int VALUE_OF_COUNT_START = 1;

	
	// 三角形サイズの入力を促すメッセージを設定する
	public static final String MESSAGE_OF_TRIANGLE_GENERATOR = "三角形を描画します。サイズを入力してください。";
	
	// 図形の名前をテキストで設定する(左上が直角の三角形)
	public static final String TEXT_OF_LEFT_UPPER_RIGHT_CORNER_TRIANGLE = "左上が直角の三角形";
	
	// 図形の名前をテキストで設定する(右下が直角の三角形)
	public static final String TEXT_OF_RIGHT_LOWER_RIGHT_CORNER_TRIANGLE = "右下が直角の三角形";
	
	// 図形の名前をテキストで設定する(右上が直角の三角形)
	public static final String TEXT_OF_RIGHT_UPPER_RIGHT_CORNER_TRIANGLE = "右上が直角の三角形";
	
	// 出力時のメッセージを設定する
	public static final String MESSAGE_OF_OUTPUT = "出力します。";
	
	
	
	
	// 入力された値から三角形を作成し、描画するクラス
	public static void main (String[] arg) {
		
		// 三角形サイズの入力を扱うオブジェクトを作成する
		Scanner triangleSizeInput = new Scanner(System.in);
		
		// 三角形サイズの値を保持する変数を初期化する
		int triangleSize = INITIALIZATION_INTEGER;
		
		// 三角形サイズの入力を促すメッセージを出力する
		System.out.println(MESSAGE_OF_TRIANGLE_GENERATOR);
			
		// 入力された三角形サイズの値を変数に保持する
		triangleSize = triangleSizeInput.nextInt();

		
		
		// 表示する図形をテキストで出力する
		System.out.println(TEXT_OF_LEFT_UPPER_RIGHT_CORNER_TRIANGLE +"を"+MESSAGE_OF_OUTPUT);
		
		// 直角が左上の三角形を一行づつ描画する
		for ( int rowCount = VALUE_OF_COUNT_START; rowCount <= triangleSize; rowCount++ ) {
			
			// 表示する範囲を設定する変数を初期化する
			String displayArea = "";
			
			// 表示する文字の数(範囲)を降順に切り替えるための値を設定する
			int valueOfReverseArea = triangleSize - rowCount; 
			
			// 各行の表示範囲を設定する
			for ( int columnCount = VALUE_OF_REVERSE_START; columnCount <= valueOfReverseArea; columnCount++ ) {
				
				// 表示のための文字列を作成する
				displayArea += DRAW_SYMBOL;
				
			}

			// 設定した表示範囲を出力する
			System.out.println(displayArea);

		}
		
		
		// 表示する図形をテキストで出力する
		System.out.println(TEXT_OF_RIGHT_LOWER_RIGHT_CORNER_TRIANGLE +"を"+MESSAGE_OF_OUTPUT);
		
		// 直角が右下の三角形を一行づつ描画する
		for ( int rowCount = VALUE_OF_COUNT_START; rowCount <= triangleSize; rowCount++ ) {
			
			// 表示する範囲を設定する変数を初期化する
			String displayArea = "";
			
			// 非表示にする範囲を設定する変数を初期化する
			String hideArea = "";
			
			// 表示する文字の数(範囲)を降順に切り替えるための値を設定する
			int valueOfReverseArea = triangleSize - rowCount; 
			
			// 非表示の範囲を設定する
			for ( int columnCount = VALUE_OF_REVERSE_START; columnCount < valueOfReverseArea; columnCount++ ) {
				
				// 非表示のための空白を作成する
				hideArea += " ";
				
			}
			
			// 各行の表示範囲を設定する
			for ( int columnCount = VALUE_OF_COUNT_START; columnCount <= rowCount; columnCount++) {
			
				// 表示するための文字列を作成する
				displayArea += DRAW_SYMBOL;
				
			}
			
			// 設定した表示範囲を出力する
			System.out.println(hideArea + displayArea);

		}
		
		
		// 表示する図形をテキストで出力する
		System.out.println(TEXT_OF_RIGHT_UPPER_RIGHT_CORNER_TRIANGLE +"を"+MESSAGE_OF_OUTPUT);
		
		// 直角が右上の三角形を描画する
		for ( int rowCount = VALUE_OF_COUNT_START; rowCount <= triangleSize; rowCount++ ) {
			
			// 表示する範囲を設定する変数を初期化する
			String displayArea = "";
			
			// 非表示にする範囲を設定する変数を初期化する
			String hideArea = "";
			
			// 表示する文字の数(範囲)を降順に切り替えるための値を設定する
			int valueOfReverseArea = triangleSize - rowCount; 
			
			// 非表示の範囲を設定する
			for ( int columnCount = VALUE_OF_COUNT_START; columnCount < rowCount; columnCount++ ) {
				
				// 非表示のための空白を作成する
				hideArea += " ";
				
			}
			
			// 表示領域を設定する
			for ( int columnCount = VALUE_OF_REVERSE_START; columnCount <= valueOfReverseArea; columnCount++) {
			
				// 表示するための文字列を作成する
				displayArea += DRAW_SYMBOL;
				
			}
			
			// 設定した表示範囲を出力する
			System.out.println(hideArea + displayArea);

		}
		
		// 三角形サイズの入力を扱う入力ストリームを閉じる
		triangleSizeInput.close();
		
	}
}
