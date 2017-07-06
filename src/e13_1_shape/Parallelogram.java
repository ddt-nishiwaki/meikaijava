package e13_1_shape;

/*************************************************
	インポート
*************************************************/
// 全パッケージ共有の定数を読み込む
import static common.CommonConstants.*;
// 図形クラス共用定数を読み込む
import static e13_1_shape.CommonShapeConstants.*;

/**
 * 平行四辺形を作成するクラス
 * 
 * @author wakkky05
 */
public class Parallelogram extends AbstractShape implements Plane2D {

	/*************************************************
		定数(文字列)
	*************************************************/
	// 描画する図形を示す文字列を設定する
	public static final String TEXT_SHAPE_PARALLELOGRAM = "Parallelogram";
	// toStringの返値フォーマットを設定する
	public static final String FORMAT_OUTPUT_TO_STRING = "%s(width: %d, height: %d, 面積: %d)";
	// オフセット描画用の文字を設定する
	public static final String OFFSET_SYMBOL = " ";
	

	/***************************************************
		インスタンス変数
	****************************************************/
	private int mWidth;			//底辺の幅
	private int mHeight;		//高さ
	
	/***************************************************
		コンストラクタ
	****************************************************/
	/**
	 * 底辺の幅と高さを設定します
	 * @param width 底辺の幅を示すフィールド
	 * @param height 高さを示すフィールド
	 */
	public Parallelogram(int width, int height){
		// 底辺の幅を設定する
		mWidth = width;
		// 高さを設定する
		mHeight = height;
	}

	/***************************************************
		toStringオーバーライド
	****************************************************/
	/**
	 * インスタンスの以下情報をStringで返します
	 * 図形の名前<br>
	 * 底辺の幅<br>
	 * 高さ
	 * @return String
	 */
	@Override public String toString(){
		return String.format(FORMAT_OUTPUT_TO_STRING, TEXT_SHAPE_PARALLELOGRAM, mWidth, mHeight, mGetArea());
	};

	/***************************************************
		抽象メソッド実装
	****************************************************/
	/**
	 * 図形を描画します
	 */
	public void mDraw(){
		// 設定された高さ分の行に描画処理を行う
		for(int heightCount = NUMBER_START_COUNT; heightCount < mHeight; heightCount++){
			// 辺を傾けるためのオフセットを出力する
			mOutputOffset(heightCount);
			// 設定された幅を出力する
			mOutputWidth();
			// 次の行を描画するために改行する
			System.out.println();
		}
	};
	
	/***************************************************
		インスタンスメソッド
	****************************************************/
	/**
	 * 辺を傾けるためのオフセット文字を出力します
	 */
	private void mOutputOffset(int heightCount){
		// 高さ - 1 のオフセットを出力する
		for(int offsetCount = heightCount; offsetCount < mHeight; offsetCount++){
			// オフセット用文字を出力する
			System.out.print(OFFSET_SYMBOL);
		}
	}
	/**
	 * 設定された幅文の描画用文字を出力します
	 */
	private void mOutputWidth(){
		// 設定された幅分処理を行う
		for(int widthCount = NUMBER_START_COUNT; widthCount < mWidth; widthCount++){
			System.out.print(DRAW_FILL);
		}
	}
	

	/***************************************************
		インターフェース実装
	****************************************************/
	
	/**
	 * 面積を求めるメソッドの実装を強制します
	 */
	public int mGetArea(){
		// 面積を求めて返す
		return mWidth * mHeight;
	};
	
}
