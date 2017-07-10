package shape;

/*************************************************
	クラス
*************************************************/
/**
 * 長方形インスタンスの作成と出力をチェックするためのクラス
 */
public class RectangleChecker extends AbstractShapeChecker {

	/*************************************************
		検証用の図形設定
	*************************************************/
	// 図形の幅入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_INPUT_WIDTH = "幅を入力してください";
	// 図形の高さ入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_INPUT_HEIGHT = "高さを入力してください";

	/*************************************************
		メソッド
	*************************************************/
	/**
	 * 図形の作成を行うメソッド
	 */
	public AbstractShape mMakeShape(){
		int width;		// 幅を設定するための変数を宣言する
		int height;		// 高さを設定するための変数を宣言する
		// 長方形の長さ入力を求める
		System.out.println(MESSAGE_REQUEST_INPUT_WIDTH);
		// 入力された長さを保持する
		width = sInputScanner.nextInt();
		// 長方形の幅入力を求める
		System.out.println(MESSAGE_REQUEST_INPUT_HEIGHT);
		// 入力された高さを保持する
		height = sInputScanner.nextInt();
		// 長方形を作成する
		return new Rectangle(width,height);
	};
	
	/**
	 * 図形を描画するメソッド
	 */
	public void mCheckShape(){
		// 図形の作成を行う
		AbstractShape rectangle = mMakeShape();
		// 図形を描画する
		rectangle.print();
	};
}
