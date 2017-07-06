package e13_1_shape;

/*************************************************
	インポート
*************************************************/
// 図形クラス共用定数を読み込む
import static e13_1_shape.CommonShapeConstants.*;

/*************************************************
	クラス
*************************************************/
/*
 * 左上が直角の三角形を描画するクラス
 */
public class RightTriangleUpperLeft extends AbstractRightTriangle {

	/*************************************************
		定数(文字列)
	*************************************************/
	// 描画する図形を示す文字列を設定する
	private static final String TEXT_SHAPE_RIGHT_TRIANGLE = "RightTriangle";
	// toStringの返値フォーマットを設定する
	private static final String FORMAT_OUTPUT_TO_STRING = "%s(size: %d, 面積: %d)";
	
	/*************************************************
		コンストラクタ
	*************************************************/
	// 何もしないコンストラクタを設定する
	public RightTriangleUpperLeft(){
		super();
	}
	// 幅高さを設定するコンストラクタを設定する
	public RightTriangleUpperLeft(int width){
		super(width);
	}

	/*************************************************
		オーバーライド
	*************************************************/
	/*
	 * 描画する図形を示す文字列を返すメソッドを実装する
	 * @see e13_1_shape.AbstractLine#toString()
	 */
	@Override public String toString(){
		// 描画する図形を示す文字列を返す
		return String.format(FORMAT_OUTPUT_TO_STRING, TEXT_SHAPE_RIGHT_TRIANGLE, mGetSize(), mGetArea());
	}
	
	/*************************************************
		メソッド実装
	*************************************************/
	// 左上直角三角形を描画するメソッドを定義する
	public void mDraw(){
		// 大きさを取得する
		int size = mGetSize();
		// 描画のするために大きさ分処理を繰り返す
		for (int heightCount = size; heightCount > NUMBER_FIRST_COUNT; heightCount--){
			// カウントに応じた幅を表示する
			for(int widthCount = NUMBER_FIRST_COUNT; widthCount < heightCount; widthCount++){
				// 点を描画する
				System.out.print(DRAW_FILL);
			}
			// 出力する図形幅を整えるための改行を出力する
			System.out.println();
		}
	};
}
