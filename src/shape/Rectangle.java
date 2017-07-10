package shape;

import static shape.CommonShapeConstants.*;

/*************************************************
	クラス
*************************************************/
public class Rectangle extends AbstractShape implements Plane2D{

	/*************************************************
		定数(文字列)
	*************************************************/
	// 描画する図形を示す文字列を設定する
	private static final String TEXT_SHAPE_RECTANGLE = "Rectangle";
	// toStringの返値フォーマットを設定する
	private static final String FORMAT_OUTPUT_TO_STRING = "%s(width: %d, height: %d, 面積: %d)";

	/*************************************************
		インスタンス変数
	*************************************************/
	// 幅フィールドを設定する
	private int mWidth;			
	// 高さフィールドを設定する
	private int mHeight;
	
	/*************************************************
		コンストラクタ
	*************************************************/
	// 幅高さを設定するコンストラクタを設定する
	public Rectangle(int width, int height){
		// 幅を設定する
		mWidth = width;
		// 高さを設定する
		mHeight = height;
	}
	
	/*************************************************
		オーバーライド
	*************************************************/
	/*
	 * 描画する図形を示す文字列を返すメソッドを実装する
	 * @see e13_1_shape.AbstractShape#toString()
	 */
	@Override public String toString(){
		// 描画する図形を示す文字列を返す
		return String.format(FORMAT_OUTPUT_TO_STRING, TEXT_SHAPE_RECTANGLE, mWidth, mHeight, getArea());
	}

	/*************************************************
		抽象メソッド実装
	*************************************************/
	/*
	 * 長方形を描画するメソッドを設定する
	 * @see e13_1_shape.AbstractShape#mDraw()
	 */
	public void mDraw(){
		// 描画のするために高さ分処理を繰り返す
		for (int heightCount = NUMBER_FIRST_COUNT;heightCount < mHeight; heightCount++){
			// 描画するために幅分処理を繰り返す
			for (int widthCount = NUMBER_FIRST_COUNT;widthCount < mWidth; widthCount++){
				// 点を描画する
				System.out.print(DRAW_FILL);
			}
			// 出力する図形幅を整えるための改行を出力する
			System.out.println();
		}
	};
	
	/***************************************************
		インターフェース実装
	****************************************************/
	/**
	 * 面積を求めるメソッドの実装を強制します
	 */
	public int getArea(){
		// 面積を求めて返す
		return mWidth * mHeight;
	};	
}
