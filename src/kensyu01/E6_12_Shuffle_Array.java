package kensyu01;

/*** 機能のインポート ***********************************/
// 乱数を扱う機能を読み込む
import java.util.Random;

/*** クラス ***********************************/
// 配列の並び順をランダムにシャッフルするクラス
public class E6_12_Shuffle_Array {

	/*** 定数設定 ***********************************/
	// 数値型変数を初期化する値を設定する
	private static final int INITIALIZE_NUMERIC = 0;
	// シャッフルする配列の長さを設定する
	private static final int LENGTH_SHUFFLE_ARRAY = 20;
	// 配列の最後のインデックスを設定する
	private static final int DECLIMENT_LAST_INDEX = -1;
	
	
	/*** メッソド ***********************************/
	// 配列の並び順をランダムにシャッフルする処理を行う
	public static void main(String[] arg) {
		

		/*** オブジェクトの作成 ***********************************/
		// ランダムなインデックスを生成するオブジェクトを作成する
		Random generatorRamdomIndex = new Random();
		// シャッフルする配列を作成する
		int[] arrayTargetShuffle = new int[LENGTH_SHUFFLE_ARRAY];
		// シャッフル用のインデックスを設定する配列を作成する
		int[] arrayRamdomIndexes = new int[LENGTH_SHUFFLE_ARRAY];
		// シャッフル用の配列のコピーを設定する配列を作成する
		int[] arrayCopyTargetShuffle = new int[LENGTH_SHUFFLE_ARRAY];

		
		/*** 処理 ***********************************/
		// シャッフル対象の配列に値を設定する
		for ( int indexCount = INITIALIZE_NUMERIC; indexCount < LENGTH_SHUFFLE_ARRAY; indexCount++ ) {
			// 各インデックスに現在のカウントを設定する
			arrayTargetShuffle[indexCount] = indexCount;
		}
		
		int randomIndex;		// ランダムなインデックスを設定するための変数を宣言する
		// 配列をシャッフルする際のインデックスの順番を設定する
		for ( int indexCount = INITIALIZE_NUMERIC; indexCount < LENGTH_SHUFFLE_ARRAY; indexCount++ ) {
			// ランダムなインデックスの値を作成し、保持する
			randomIndex = generatorRamdomIndex.nextInt(LENGTH_SHUFFLE_ARRAY);
			// 初回を除き、重複のチェックをおこなう(配列を現在のインデックスまで捜査する)
			for ( int indexBackNumber = INITIALIZE_NUMERIC; indexBackNumber < indexCount; indexBackNumber++ ) {
				// 重複が見つかった場合の処理を行う
				if ( randomIndex == arrayRamdomIndexes[indexBackNumber]) {
					// 重複があった場合, 重複がなくなるまで設定し直す
					while ( randomIndex == arrayRamdomIndexes[indexBackNumber] ) {
						// ランダムなインデックスの値を作成しなおし、保持する
						randomIndex = generatorRamdomIndex.nextInt(LENGTH_SHUFFLE_ARRAY);
					}
					// 捜査を 0 からやり直す
					indexBackNumber = INITIALIZE_NUMERIC;
				}
			}
			// シャッフル用のインデックスを設定する
			arrayRamdomIndexes[indexCount] = randomIndex;
		}
		
		// 配列のインデックスをシャッフルしてコピーを作成する
		for ( int indexCount = INITIALIZE_NUMERIC; indexCount < LENGTH_SHUFFLE_ARRAY; indexCount++ ) {
			// 配列の値をランダムに取り出してコピー用の配列に設定する
			arrayCopyTargetShuffle[ arrayRamdomIndexes[indexCount] ] = arrayTargetShuffle[indexCount];
		}
		
		
		
		// 配列の最後のインデックスを設定する
		int lastIndex = LENGTH_SHUFFLE_ARRAY + DECLIMENT_LAST_INDEX;
		// シャッフルされた配列を出力する
		for ( int indexCount = INITIALIZE_NUMERIC; indexCount < LENGTH_SHUFFLE_ARRAY; indexCount++ ) {
			// 値を出力する
			System.out.print(arrayTargetShuffle[indexCount]);
			// 最後の処理だけここで処理を終了する
			if ( indexCount == lastIndex ) {
				// 改行を出力する
				System.out.println();
				// 走査を終了する
				break;
			}
			// 区切り文字を出力する
			System.out.print(", ");
		}
		
		// 配列の値がシャッフルされたことをテキストで出力する
		System.out.print("\n\t\t↓　シャッフルした結果\n\n");
		
		// 配列の参照をシャッフルしたコピーに変える
		arrayTargetShuffle = arrayCopyTargetShuffle;
		
		// シャッフルされた配列を出力する
		for ( int indexCount = INITIALIZE_NUMERIC; indexCount < LENGTH_SHUFFLE_ARRAY; indexCount++ ) {
			// 値を出力する
			System.out.print(arrayTargetShuffle[indexCount]);
			// 最後の処理だけここで処理を終了する
			if ( indexCount == lastIndex ) {
				// 走査を終了する
				break;
			}
			// 区切り文字を出力する
			System.out.print(", ");
		}
		
	}
}
