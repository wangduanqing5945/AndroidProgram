package duanqing.test.onevs4;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FiveView {
	/**
	 * ÆÁÄ»¿í¶È£¬³ýÈ¥¿ÕÏ¶ºó
	 */
	private int screntWidthSpace;
	
	private int bigTextSize;
	private int smallTextSize;
	private int smallImageWidth;
	private int bigImageWidth;
	private Context mContext;
	private int space;
	public FiveView(Context context,int width) {
		this.mContext = context;
		space = PixelTools.dip2px(mContext, 10);
		screntWidthSpace = width - 4 * space;
		smallImageWidth = screntWidthSpace / 4;
		bigImageWidth = screntWidthSpace / 2;
	}
	public View getView() {
		RelativeLayout fiveView = new RelativeLayout(mContext);
		ImageView image1 = new ImageView(mContext);
		image1.setId(R.id.image1);
		image1.setScaleType(ScaleType.FIT_XY);
		image1.setImageResource(R.drawable.head_sp_icon);
		RelativeLayout.LayoutParams imageParams1 = new RelativeLayout.LayoutParams(bigImageWidth, bigImageWidth);
		imageParams1.leftMargin = space;
		image1.setLayoutParams(imageParams1);
		fiveView.addView(image1);
		
		TextView textView1 = new TextView(mContext);
		textView1.setId(R.id.text1);
		textView1.setText("textview1");
		textView1.setGravity(Gravity.CENTER_HORIZONTAL);
		RelativeLayout.LayoutParams textParams1 = new RelativeLayout.LayoutParams(bigImageWidth, RelativeLayout.LayoutParams.WRAP_CONTENT);
		textParams1.leftMargin = space;
		textParams1.addRule(RelativeLayout.BELOW, R.id.image1);
		textView1.setLayoutParams(textParams1);
		fiveView.addView(textView1);
		
		ImageView image2 = new ImageView(mContext);
		image2.setId(R.id.image2);
		image2.setScaleType(ScaleType.FIT_XY);
		image2.setImageResource(R.drawable.head_sp_icon);
		RelativeLayout.LayoutParams imageParams2 = new RelativeLayout.LayoutParams(smallImageWidth, smallImageWidth);
		imageParams2.leftMargin = space;
		imageParams2.addRule(RelativeLayout.RIGHT_OF,R.id.image1);
		image2.setLayoutParams(imageParams2);
		fiveView.addView(image2);
		
		TextView textView2 = new TextView(mContext);
		textView2.setId(R.id.text2);
		textView2.setText("textview2");
		textView2.setGravity(Gravity.CENTER_HORIZONTAL);
		RelativeLayout.LayoutParams textParams2 = new RelativeLayout.LayoutParams(smallImageWidth, RelativeLayout.LayoutParams.WRAP_CONTENT);
		textParams2.leftMargin = space;
		textParams2.addRule(RelativeLayout.BELOW, R.id.image2);
		textParams2.addRule(RelativeLayout.RIGHT_OF,R.id.image1);
		textView2.setLayoutParams(textParams2);
		fiveView.addView(textView2);
		
		ImageView image3 = new ImageView(mContext);
		image3.setId(R.id.image3);
		image3.setScaleType(ScaleType.FIT_XY);
		image3.setImageResource(R.drawable.head_sp_icon);
		RelativeLayout.LayoutParams imageParams3 = new RelativeLayout.LayoutParams(smallImageWidth, smallImageWidth);
		imageParams3.leftMargin = space;
		imageParams3.addRule(RelativeLayout.RIGHT_OF,R.id.image2);
		image3.setLayoutParams(imageParams3);
		fiveView.addView(image3);
		
		TextView textView3 = new TextView(mContext);
		textView3.setId(R.id.text3);
		textView3.setText("textview3");
		textView3.setGravity(Gravity.CENTER_HORIZONTAL);
		RelativeLayout.LayoutParams textParams3 = new RelativeLayout.LayoutParams(smallImageWidth, RelativeLayout.LayoutParams.WRAP_CONTENT);
		textParams3.leftMargin = space;
		textParams3.addRule(RelativeLayout.BELOW, R.id.image3);
		textParams3.addRule(RelativeLayout.RIGHT_OF,R.id.image2);
		textView3.setLayoutParams(textParams3);
		fiveView.addView(textView3);
		
		ImageView image4 = new ImageView(mContext);
		image4.setId(R.id.image4);
		image4.setScaleType(ScaleType.FIT_XY);
		image4.setImageResource(R.drawable.head_sp_icon);
		RelativeLayout.LayoutParams imageParams4 = new RelativeLayout.LayoutParams(smallImageWidth, smallImageWidth);
		imageParams4.leftMargin = space;
		imageParams4.addRule(RelativeLayout.RIGHT_OF,R.id.image1);
		imageParams4.addRule(RelativeLayout.BELOW,R.id.text2);
		image4.setLayoutParams(imageParams4);
		fiveView.addView(image4);
		
		TextView textView4 = new TextView(mContext);
		textView4.setId(R.id.text4);
		textView4.setText("textview4");
		textView4.setGravity(Gravity.CENTER_HORIZONTAL);
		RelativeLayout.LayoutParams textParams4 = new RelativeLayout.LayoutParams(smallImageWidth, RelativeLayout.LayoutParams.WRAP_CONTENT);
		textParams4.leftMargin = space;
		textParams4.addRule(RelativeLayout.BELOW, R.id.image4);
		textParams4.addRule(RelativeLayout.RIGHT_OF,R.id.image1);
		textView4.setLayoutParams(textParams4);
		fiveView.addView(textView4);
		
		ImageView image5 = new ImageView(mContext);
		image5.setId(R.id.image5);
		image5.setScaleType(ScaleType.FIT_XY);
		image5.setImageResource(R.drawable.head_sp_icon);
		RelativeLayout.LayoutParams imageParams5 = new RelativeLayout.LayoutParams(smallImageWidth, smallImageWidth);
		imageParams5.leftMargin = space;
		imageParams5.addRule(RelativeLayout.BELOW,R.id.text3);
		imageParams5.addRule(RelativeLayout.RIGHT_OF,R.id.image4);
		image5.setLayoutParams(imageParams5);
		fiveView.addView(image5);
		
		TextView textView5 = new TextView(mContext);
		textView5.setId(R.id.text5);
		textView5.setText("textview5");
		textView5.setGravity(Gravity.CENTER_HORIZONTAL);
		RelativeLayout.LayoutParams textParams5 = new RelativeLayout.LayoutParams(smallImageWidth, RelativeLayout.LayoutParams.WRAP_CONTENT);
		textParams5.leftMargin = space;
		textParams5.addRule(RelativeLayout.BELOW, R.id.image5);
		textParams5.addRule(RelativeLayout.RIGHT_OF,R.id.image4);
		textView5.setLayoutParams(textParams5);
		fiveView.addView(textView5);
		return fiveView;
	}
}
