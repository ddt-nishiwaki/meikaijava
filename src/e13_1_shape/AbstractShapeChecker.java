package e13_1_shape;

/*************************************************
	インポート
*************************************************/
// 入力を扱うライブラリを読み込む
import java.util.Scanner;

/*************************************************
	クラス
*************************************************/
/**
 * 図形インスタンスの作成と出力をチェックするための抽象クラス
 */
public abstract class AbstractShapeChecker {
	
	/*************************************************
		スキャナー
	*************************************************/
	// 入力を扱うオブジェクトを作成する
	public static Scanner sInputScanner = new Scanner(System.in);

	/*************************************************
		メソッド
	*************************************************/
	
	/**
	 * 図形の作成を行うメソッド
	 */
	public abstract AbstractShape mMakeShape();
	
	/**
	 * 図形を描画するメソッド
	 */
	public abstract void mCheckShape();
}
