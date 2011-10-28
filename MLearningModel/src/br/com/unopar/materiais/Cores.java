package br.com.unopar.materiais;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import br.com.unopar.R;

public class Cores extends Activity{
	public void onCreate(Bundle savedinstances){
		super.onCreate(savedinstances);
		setContentView(R.layout.cont_cores);
		
		
		ImageView img = (ImageView)findViewById(R.id.imgTabCores);
		img.setClickable(true);
		img.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
//				img.
			}
		});
		
	}
}
