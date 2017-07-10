package shape;

/*************************************************
	クラス
*************************************************/
/**
 * 水平線インスタンスの作成と出力をチェックするためのクラス
 */
public class HorizonChecker extends AbstractShapeChecker{

	/*************************************************
		検証用の図形設定
	*************************************************/
	private static final String MESSAGE_REQUEST_INPUT_LENGTH = "長さを入力してください";
	// 図形の幅入力を求めるメッセージを設定する

	/*************************************************
		フィールド
	*************************************************/
	int mLength;		// 長さフィールドを設定する
	
	/*************************************************
		メソッド
	*************************************************/
	/**
	 * 図形の作成を行うメソッド
	 */
	public AbstractShape mMakeShape(){
		// 水平線の長さ入力を求める
		System.out.println(MESSAGE_REQUEST_INPUT_LENGTH);
		// 水平線を作成する
		return new HorizonLine(sInputScanner.nextInt());
	};
	
	/**
	 * 図形を描画するメソッド
	 */
	public void mCheckShape(){
		// 図形の作成を行う
		AbstractShape horizon = mMakeShape();
		// 図形を描画する
		horizon.print();
	};
}
