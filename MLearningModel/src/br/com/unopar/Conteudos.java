package br.com.unopar;



import java.util.ArrayList;

import br.com.unopar.materiais.*;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class Conteudos extends ListActivity { 

//	String[] itensMenu = new String[] { 
//			"1 - Definição", 
//			"2 - Funcionalidade",
//			"3 - Tipos",
//			"4 - Resistor ideal	",
//			"5 - Simbologia",
//			"6.1 - Associações: Série",
//			"6.2 - Associações: Paralelo",
//			"7 - Cores",
//			"8 - Resistividade"							
//	};
//	private ListView listViewConteudo; 
	
	
	private ArrayList<String> topicos;
	private ArrayAdapter<String> arrayMenuConteudos;
	
	
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
	
		topicos = new ArrayList<String>();
		topicos.add("1 - Definição");
		topicos.add("2 - Funcionalidade");
		topicos.add("3 - Tipos");
		topicos.add("4 - Resistor ideal");
		topicos.add("5 - Simbologia");
		topicos.add("6.1 - Associações: Série");
		topicos.add("6.2 - Associações: Paralelo");
		topicos.add("7 - Cores");
		topicos.add("8 - Resistividade");
		Log.d("MENU", "criou array de string");
		arrayMenuConteudos = new ArrayAdapter<String>(
				getApplicationContext(), android.R.layout.simple_list_item_1,topicos);
		setListAdapter(arrayMenuConteudos);
		Log.d("MENU", "set list okay");
		
		
		
//		setContentView(R.layout.conteudomain);
//		listViewConteudo = (ListView)findViewById(R.id.listViewConteudos);
//		arrayMenuConteudos = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,itensMenu);
//		Log.d("MENU", "carregou tela conteudos");
	}

//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		
//	}

	protected void onListItemClick(ListView lv, View v, int position, long id) {
		
		super.onListItemClick(lv,v,position, id);
		
		Object o = this.getListAdapter().getItem(position);
//		Object o = this.getListAdapter().getItemId(position);
		String item = o.toString();
		
//		String item1 = itensMenu[position];
		
		Log.d("MENU", "if: "+ item+ "== " + o.toString());
		
		if(item == "1 - Definição"){
//		if(item == 0+""){
			Intent it = new Intent(getApplicationContext(), Definicao.class);
			startActivity(it);
		}
		else 
//			Log.d("MENU", "if: "+ item+ "== " + o.toString());
//			if(item == 1+""){
		if(item == "2 - Funcionalidade"){
			Intent it = new Intent(getApplicationContext(), Funcao.class);
			startActivity(it);
		}
		else 
//			if(item == 2+""){
			if(item == "3 - Tipos"){
			Intent it = new Intent(getApplicationContext(), Simbologia.class);
			startActivity(it);
		}
		else
//			if(item == 3+""){
			if(item == "4 - Resistor ideal"){
			Intent it = new Intent(getApplicationContext(), ResistorIdeal.class);
			startActivity(it);
		}
		else 
//			if(item == (4+"")){
			if(item == "5 - Simbologia"){
			Intent it = new Intent(getApplicationContext(), Simbologia.class);
			startActivity(it);
		}
		else 
//			if(item == (5+"")){
			if(item == "6.1 - Associações: Série"){
			Intent it = new Intent(getApplicationContext(), AssocSerie.class);
			startActivity(it);
		}
		else 
//			if(item == (6+"")){
			if(item == "6.2 - Associações: Paralelo"){
			Intent it = new Intent(getApplicationContext(), AssocParalelo.class);
			startActivity(it);
		}
		else 
//			if(item == (7+"")){
			if(item == "7 - Cores"){
			Intent it = new Intent(getApplicationContext(), Cores.class);
			startActivity(it);
		}
		else
//		if(item == (8+"")){
			if(item == "8 - Resistividade"){
			Intent it = new Intent(getApplicationContext(), Resistividade.class);
			startActivity(it);
		}else {
			Toast.makeText(this, "ERRO - Isso as vezes acontece, sorry!" , 
					Toast.LENGTH_SHORT).show();
		}
	}
}
