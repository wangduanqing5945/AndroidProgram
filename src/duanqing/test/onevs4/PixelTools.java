package duanqing.test.onevs4;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/**
 * ������   ��ɶԴ��ں���ͼView�� ��Ⱥ͸߶ȵĴ���
 * @author ����
 *
 */
public class PixelTools {
	
	/**
	 * ��̬��Ӳ���ʱ��Ҫ��ȥ����
	 */
	public static int minus = 0;
	static DisplayMetrics metrics = null;

	/**
	 * �õ���Ļ�ĸ߶ȺͿ��
	 * 
	 * @return ������Ԫ�ص��������ʽ����
	 */
	public static void getWindowWidthHeight(Activity activities, int[] widHei) {
		if (null == metrics) {
			metrics = new DisplayMetrics();
		}
		activities.getWindowManager().getDefaultDisplay().getMetrics(metrics);
		widHei[0] = metrics.heightPixels;
		widHei[1] = metrics.widthPixels;
	}

	/**
	 * �õ���Ļ�Ŀ��
	 * 
	 * @return ������Ԫ�ص��������ʽ����
	 */
	public static int getWindowWidth(Activity activities) {
		if (null == metrics) {
			metrics = new DisplayMetrics();
		}
		activities.getWindowManager().getDefaultDisplay().getMetrics(metrics);
		return metrics.widthPixels;
	}

	/**
	 * �õ�һ��view�߶�
	 * 
	 * @param view
	 * @param widHei
	 */
	public static int getViewHeight(View view) {
		view.measure(View.MeasureSpec.UNSPECIFIED, View.MeasureSpec.UNSPECIFIED);
		return  view.getMeasuredHeight();
	}
	

	/**
	 * �õ�һ��view�Ŀ�ȣ�һ��Ҫ��view�������������֮����ã�����������׼ȷ
	 * 
	 * @param view
	 * @param widHei
	 */
	public static int getViewWidth(View view) {
		view.measure(View.MeasureSpec.UNSPECIFIED, View.MeasureSpec.UNSPECIFIED);
		return view.getMeasuredWidth();
	}
	
	/**
	 * �����ֻ��ķֱ��ʴ� dp �ĵ�λ ת��Ϊ px(����)
	 */
	public static int dip2px(Context context, float dpValue) {
		final float scale = context.getResources().getDisplayMetrics().density;
		return (int) (dpValue * scale + 0.5f);
	}
}
