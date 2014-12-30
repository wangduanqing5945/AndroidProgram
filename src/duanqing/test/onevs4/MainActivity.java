package duanqing.test.onevs4;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import duanqing.test.onevs4.view.KuwoListView;

public class MainActivity extends Activity {
	private KuwoListView kuwoListView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		FiveView fiveView = new FiveView(this, PixelTools.getWindowWidth(this));
//		setContentView(fiveView.getView());
		setContentView(R.layout.activity_main);
		final EditText editText = (EditText) findViewById(R.id.editText1);
		final RelativeLayout rl = (RelativeLayout) findViewById(R.id.rela);
		findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
//				int size = Integer.parseInt(editText.getText().toString());
//				rl.removeAllViews();
//				new NineGridView(MainActivity.this).getView(rl, size);
				showDialog();
			}
		});
//		kuwoListView = (KuwoListView) this.findViewById(R.id.kuwolistview);
//		kuwoListView.setPullLoadEnable(true);
//		kuwoListView.setAdapter(new MyAdapter());
//		kuwoListView.setKuwoListViewListener(new KuwoListView.KuwoListViewListener() {
//			
//			@Override
//			public void onRefresh() {
//			}
//			
//			@Override
//			public void onLoadMore() {
//				kuwoListView.stopLoadMore();
//			}
//		});
		
	}
	
	
	private Dialog mDialog;
	public void showDialog() {
		if (null == mDialog) {
			mDialog = new Dialog(this, R.style.Dialog_send_flower_style);
			View view = LayoutInflater.from(this).inflate(
					R.layout.local_add_head, null);
//			Button photo = (Button) view
//					.findViewById(R.id.local_head_local_btn);
//			Button camera = (Button) view
//					.findViewById(R.id.local_head_capture_btn);
//			Button cancel = (Button) view
//					.findViewById(R.id.local_head_cancle_btn);
//			photo.setOnClickListener(new OnClickListener() {
//				public void onClick(View v) {
//					dismissDialog();
//				}
//			});
//			camera.setOnClickListener(new OnClickListener() {
//				public void onClick(View v) {
//					dismissDialog();
//				}
//			});
//			cancel.setOnClickListener(new OnClickListener() {
//				public void onClick(View v) {
//					dismissDialog();
//				}
//			});
			if (null != view.getBackground()) {
				view.getBackground().setAlpha(0);
			}
			mDialog.setCanceledOnTouchOutside(true);
			if (null != mDialog.getWindow()) {
				mDialog.getWindow().setGravity(Gravity.BOTTOM);
			}
			mDialog.setContentView(view);
		}
		mDialog.show();
	}

	public void dismissDialog() {
		if (null != mDialog) {
			mDialog.dismiss();
		}
	}
	
	 private void setLoadMore(boolean isCanLoadMore) {
    	if (isCanLoadMore) {
    		kuwoListView.setPullLoadEnable(true);
		}else {
			kuwoListView.setPullLoadEnable(false);
			kuwoListView.setFooterNoData();
		}
	 }

	private class MyAdapter extends BaseAdapter {

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return 40;
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			TextView textView = new TextView(MainActivity.this);
			textView.setTextSize(20);
			textView.setText("textview " + position);
			return textView;
		}
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
