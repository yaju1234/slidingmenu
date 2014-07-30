package info.androidhive.slidingmenu;


import android.view.View;
import android.widget.Button;

public class SliderView implements android.view.View.OnClickListener{
	
	public View mView = null;
	public MainActivity main;
	public Button slide_button = null;
	public SliderInterface listener;
	public SliderView(MainActivity m,SliderInterface l){
		main = m;
		listener = l;
		mView = View.inflate(main, R.layout.slider, null);
		slide_button = (Button)mView.findViewById(R.id.btn_slide);
		slide_button.setOnClickListener(this);
		
	}
	
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_slide:
			listener.onMemuClick();
			break;

		}
		
	}
	

}
