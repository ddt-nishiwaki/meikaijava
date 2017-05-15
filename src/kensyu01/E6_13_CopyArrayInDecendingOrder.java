package kensyu01;

// 配列を逆順にコピーするクラス
public class E6_13_CopyArrayInDecendingOrder {

	// 数値型変数を初期化する値を設定する
	private static final int INITIALIZE_NUMERIC = 0;
	// 配列の長さを設定する
	private static final int LENGTH_ARRAY = 10;
	// 配列の最初のインデックスを設定する
	private static final int FIRST_INDEX_ARRAY = 0;
	// 配列の値を出力する際の区切り文字を設定する
	private static final String SEPALATOR_STRING = ", ";
	// 配列がコピーされたことをメッセージで出力する
	private static final String MESSAGE_COPY_ARRAY = "\n\t↓　逆順にコピーした結果\n\n";
	// 配列を逆順にコピーする処理を行う
	public static void main(String[] arg ){
		
		// 配列の最後のインデックスを設定するための変数を初期化する
		int lastIndexArray = LENGTH_ARRAY;
		// 配列の最後のインデックスを設定する
		lastIndexArray--;
		
		// 昇順に値を設定する配列を作成する
		int[] arrayInAcendingOrder = new int[LENGTH_ARRAY];
		// 降順に値をコピーする配列を作成する
		int[] arrayDecendingOrder = new int[LENGTH_ARRAY];
		

		// 昇順の配列を作成する
		for (int indexCount = INITIALIZE_NUMERIC; indexCount < LENGTH_ARRAY; indexCount++ ) {
			// 各インデックスに値を設定する
			arrayInAcendingOrder[indexCount] = indexCount;
		}

		int decendingCount = lastIndexArray;
		// コピー用の配列に降順に値をコピーする
		for (int indexCount = INITIALIZE_NUMERIC; indexCount < LENGTH_ARRAY; indexCount++ ) {
			// 各インデックスに値を設定する
			arrayDecendingOrder[indexCount] = arrayInAcendingOrder[decendingCount--];
		}
		
		// コピー元配列の値を出力する
		for (int indexCount = FIRST_INDEX_ARRAY; indexCount < LENGTH_ARRAY; indexCount++ ) {
			// 値を出力する
			System.out.print(arrayInAcendingOrder[indexCount]);
			// 最後のインデックスだった場合の処理を行う
			if ( indexCount == lastIndexArray ) {
				// 改行を出力する
				System.out.println();
				// 走査を終了する
				break;
			}
			// 区切り文字を出力する
			System.out.print(SEPALATOR_STRING);
		}
		
		
		// 配列の値がシャッフルされたことをテキストで出力する
		System.out.print(MESSAGE_COPY_ARRAY);
		
		for (int indexCount = FIRST_INDEX_ARRAY; indexCount < LENGTH_ARRAY; indexCount++ ) {
			// 値を出力する
			System.out.print(arrayDecendingOrder[indexCount]);
			// 最後のインデックスだった場合の処理を行う
			if ( indexCount == lastIndexArray ) {
				// 改行を出力する
				System.out.println();
				// 走査を終了する
				break;
			}
			// 区切り文字を出力する
			System.out.print(SEPALATOR_STRING);
		}
			
	}	
}
