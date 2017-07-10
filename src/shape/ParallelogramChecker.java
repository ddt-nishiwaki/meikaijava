package shape;

/*************************************************
	クラス
*************************************************/
/**
* 平行四辺形インスタンスの作成と出力をチェックするためのクラス
*/
public class ParallelogramChecker extends AbstractShapeChecker {

	/*************************************************
		検証用の図形設定
	*************************************************/
	// 図形の底辺の幅入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_INPUT_WIDTH = "底辺の幅を入力してください";
	// 図形の高さ入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_INPUT_HEIGHT = "高さを入力してください";

	/*************************************************
		メソッド
	*************************************************/
	/**
	 * 図形の作成を行うメソッド
	 */
	public AbstractShape mMakeShape(){
		int width;		// 底辺の幅を設定するための変数を宣言する
		int height;		// 高さを設定するための変数を宣言する
		// 平行四辺形の長さ入力を求める
		System.out.println(MESSAGE_REQUEST_INPUT_WIDTH);
		// 入力された長さを保持する
		width = sInputScanner.nextInt();
		// 平行四辺形の底辺の幅入力を求める
		System.out.println(MESSAGE_REQUEST_INPUT_HEIGHT);
		// 入力された高さを保持する
		height = sInputScanner.nextInt();
		// 平行四辺形を作成する
		return new Parallelogram(width,height);
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
