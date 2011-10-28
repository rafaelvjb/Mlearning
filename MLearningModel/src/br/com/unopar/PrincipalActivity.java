package br.com.unopar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PrincipalActivity extends Activity {

	TextView txtTextoBemVindo ;
	Button btnConteudo, btnExtras, btnQuiz, btnPerform, btnForum, btnFeedback;
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        	
        	setContentView(R.layout.main);
	    	
        	Log.d("MENU", "abriu a primeira tela dps do splash");
			
//        	txtTextoBemVindo = (TextView) findViewById(R.id.txtTextoBemVindo);
//			txtTextoBemVindo.setText( "Bem Vindo!" );
        
			btnConteudo = (Button) findViewById(R.id.btnConteudo);
			btnExtras = (Button) findViewById(R.id.btnExtras);
			btnQuiz = (Button) findViewById(R.id.btnQuiz);
			btnPerform = (Button) findViewById(R.id.btnPerform);
			btnForum = (Button) findViewById(R.id.btnForum);
			btnFeedback = (Button) findViewById(R.id.btnFeedback);
			
			btnConteudo.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View arg0) {
					Log.d("MENU", "Click no botao conteudos");
					Intent it = new Intent(getApplicationContext(),Conteudos.class);
					Log.d("MENU", "criou intent");
					startActivity(it);
					Log.d("MENU", "start activity");
				}
			});
			
			btnExtras.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View arg0) {
					Intent it = new Intent(getApplicationContext(),Extras.class);
					startActivity(it);
				}
			});
			
			btnQuiz.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View arg0) {
					Intent it = new Intent(getApplicationContext(),Quiz.class);
					startActivity(it);
				}
			});
			
			btnPerform.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View arg0) {
					Intent it = new Intent(getApplicationContext(),Performance.class);
					startActivity(it);
				}
			});
			
			btnForum.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View arg0) {
					Intent it = new Intent(getApplicationContext(),Forum.class);
					startActivity(it);
				}
			});
			
			btnFeedback.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View arg0) {
					Intent it = new Intent(getApplicationContext(),Feedback.class);
					startActivity(it);
				}
			});
    }
    
    public boolean onCreateOptionsMenu(Menu menu){
        super.onCreateOptionsMenu(menu);
        menu.add(0,0,0,"Opções");
        return true;
    }

    @Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		
		
		//if(featureId == 0){//menu salvar
		switch (item.getItemId()) {
			case 0:{
				Log.i("MLEARNING", "Entrou em Configuracoes.");
				Intent it = new Intent(getApplicationContext(), Configuracoes.class);
				startActivity(it);
				return true;
			}
			case 1:{	
				return true;
			}
		}
		return true; //return do método
	}
	
    
}