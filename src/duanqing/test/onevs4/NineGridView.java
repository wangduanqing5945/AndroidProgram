package duanqing.test.onevs4;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

public class NineGridView {
	private Activity mActivity;
	private int totalWidth;
	public NineGridView(Activity activity) {
		this.mActivity = activity;
		DisplayMetrics outMetrics = new DisplayMetrics();
		activity.getWindowManager().getDefaultDisplay().getMetrics(outMetrics);
		totalWidth = outMetrics.widthPixels;
	}
	public void getView(RelativeLayout parentView,int totalSize) {
		if (totalSize > 0) {
//			if (totalSize == 1) {
//				LayoutParams params = new LayoutParams(totalWidth/3,totalWidth/2);
//				ImageView image = new ImageView(mActivity);
//				image.setScaleType(ScaleType.FIT_XY);
//				image.setLayoutParams(params);
//				image.setImageResource(R.drawable.head_sp_icon);
//				parentView.addView(image);
//			}else {
				for (int i = 1; i < totalSize+1; i++) {
					RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(totalWidth/3,totalWidth/3);
					ImageView image = new ImageView(mActivity);
					image.setScaleType(ScaleType.FIT_XY);
					image.setId(i);
					if (i == 2 || i == 3) {
						params.addRule(RelativeLayout.RIGHT_OF, i - 1);
					}else if (i == 4) {
						params.addRule(RelativeLayout.BELOW, 1);
					}else if (i == 5 || i == 6) {
						params.addRule(RelativeLayout.BELOW, 1);
						params.addRule(RelativeLayout.RIGHT_OF, i - 1);
					}else if (i == 7) {
						params.addRule(RelativeLayout.BELOW, 4);
					}else if (i == 8 || i == 9) {
						params.addRule(RelativeLayout.BELOW, 4);
						params.addRule(RelativeLayout.RIGHT_OF, i - 1);
					}
					image.setLayoutParams(params);
					image.setImageResource(R.drawable.head_sp_icon);
					parentView.addView(image);
					
//				}
			}
		}
	}
}
