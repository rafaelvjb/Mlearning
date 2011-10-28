package br.com.unopar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class SplashScreenRunnable extends Activity implements Runnable{

	//3 segundos
	private final int DELAY = 3000;
	
	public void onCreate(Bundle InstanceState) {
        super.onCreate(InstanceState);
        
        setContentView(R.layout.splash);
        Toast.makeText(this, "Aguarde enquanto o Aplicativo é carregado...",Toast.LENGTH_LONG).show();
        
		Handler handler= new Handler();
		handler.postDelayed(this,DELAY);
	}

	@Override
	public void run() {
		//inicializa a apliica?‹o fazendo a verifica?‹o do BD
		Intent i = new Intent( getApplicationContext(), PrincipalActivity.class );
    	this.finish();
		startActivity(i);
		//encerra essa activity para que n‹o tenha como retornar da pilha
		
	}
}
