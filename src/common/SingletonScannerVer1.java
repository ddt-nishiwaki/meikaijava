package common;

/******************************************
	インポート
******************************************/
// スキャナークラスを読み込む
import java.util.Scanner;
/**
 * スキャナーのシングルトン
 * getInstance呼び出し時にインスタンスがあれば返し、なければ作成して返す
 * @author wakkky05
 * @see https://ja.wikipedia.org/wiki/Singleton_パターン
 */
public class SingletonScannerVer1 {
	/******************************************
		インスタンスフィールド
	******************************************/
	private static Scanner inputScanner;

	/******************************************
		コンストラクタ
	******************************************/
	/**
	 * 外部からインスタンスを生成できないようにする
	 */
	private SingletonScannerVer1(){}
	
	/******************************************
		インスタンスメソッド
	******************************************/
	/**
	 * ScannerHolderクラスをロードし、スキャナーインスタンスを返す
	 * 
	 */
	public static Scanner getInstance(){
		// インスタンスがない場合の処理を行う
		if(inputScanner == null){
			//スキャナーを作成する
			inputScanner = new Scanner(System.in);
		}
		// スキャナーを返す
		return inputScanner;	
	}

}
