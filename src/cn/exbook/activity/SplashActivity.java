package cn.exbook.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.widget.LinearLayout;
import cn.exbook.R;

public class SplashActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);

		LinearLayout splashRoot = (LinearLayout) findViewById(R.id.splash_root);

		// 渐变的效果
		AlphaAnimation alphaAnimation = new AlphaAnimation(0.3f, 1f);
		alphaAnimation.setDuration(2000);
		splashRoot.startAnimation(alphaAnimation);
	}

	/**
	 * 进入主页面
	 */
	private void enterHome() {
		Intent intent = new Intent(this, HomeActivity.class);
		startActivity(intent);
		finish();
	}
}
