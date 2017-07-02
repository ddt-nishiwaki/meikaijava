package e13_1_shape;


/*************************************************
	クラス
*************************************************/
/**
 * 点インスタンスの作成と出力をチェックするためのクラス
 */
public class PointChecker extends AbstractShapeChecker {
	
	/**
	 * 図形の作成を行うメソッド
	 */
	public AbstractShape mMakeShape(){
		// 点を作成して返す
		return new Point();
	};
	
	/**
	 * 図形を描画するメソッド
	 */
	public void mCheckShape(){
		// 点を作成する
		AbstractShape point = mMakeShape();
		// 点を描画する
		point.print();
	};
}
