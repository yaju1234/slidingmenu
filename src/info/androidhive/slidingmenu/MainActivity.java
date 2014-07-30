package info.androidhive.slidingmenu;


import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends Activity implements SliderInterface,OnClickListener {
	private DrawerLayout mDrawerLayout;
	private RelativeLayout mDrawerList;
	private Button btn_sliding = null;
	
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		mDrawerList = (RelativeLayout) findViewById(R.id.list_slidermenu);
		btn_sliding = (Button)findViewById(R.id.btn_sliding);
		mDrawerList.removeAllViews();
		mDrawerList.addView(new SliderView(this, this).mView);
		mDrawerLayout.closeDrawer(mDrawerList);
		btn_sliding.setOnClickListener(this);
		
	}

	
	
	private void displayView(int position) {
		Fragment fragment = null;
		switch (position) {
		case 0:
			fragment = new HomeFragment();
			break;
		case 1:
			fragment = new FindPeopleFragment();
			break;
		case 2:
			fragment = new PhotosFragment();
			break;
		case 3:
			fragment = new CommunityFragment();
			break;
		case 4:
			fragment = new PagesFragment();
			break;
		case 5:
			fragment = new WhatsHotFragment();
			break;

		default:
			break;
		}

		if (fragment != null) {
			FragmentManager fragmentManager = getFragmentManager();
			//fragmentManager.beginTransaction().replace(R.id.frame_container, fragment).commit();

			
		} else {
			Log.e("MainActivity", "Error in creating fragment");
		}
	}

	
	



	
	public void onMemuClick() {
		
			mDrawerLayout.closeDrawers();
		
		
	}



	
	public void onClick(View v) {
		
			mDrawerLayout.openDrawer(mDrawerList);
		
		
	}

}
