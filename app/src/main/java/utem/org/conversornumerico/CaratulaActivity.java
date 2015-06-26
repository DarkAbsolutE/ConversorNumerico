package utem.org.conversornumerico;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.RadioButton;

public class CaratulaActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		//Iniciamos la actividad super llama al constructor de la actividad padre
		super.onCreate(savedInstanceState);
		//Asigna el Layout de la carpeta res a la actividad principal (esta actividad)
		setContentView(R.layout.activity_caratula);
		
		//Genera una referencia a los TextView
		final EditText num = (EditText) findViewById (R.id.editText1);
		final EditText respuesta = (EditText) findViewById (R.id.editText3);
		
		//Genera una referencia a los botones de conversión
		final Button dAb = (Button) findViewById (R.id.button1);
		final Button hAb = (Button) findViewById (R.id.button2);
		final Button bAd = (Button) findViewById (R.id.button3);
		final Button hAd = (Button) findViewById (R.id.button4);
		final Button bAh = (Button) findViewById (R.id.button5);
		final Button dAh = (Button) findViewById (R.id.button6);
		
		//Genera una referencia a los Radio Button que indican la base del número
		final RadioButton bin = (RadioButton) findViewById (R.id.radio0);
		final RadioButton dec = (RadioButton) findViewById (R.id.radio1);
		final RadioButton hexa = (RadioButton) findViewById (R.id.radio2);
		
		final Conversiones convs = new Conversiones();
		
		
		//Todo este bloque de código ayuda a establecer la navegabilidad
		bin.setOnCheckedChangeListener(new OnCheckedChangeListener(){
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if (isChecked){
					dAb.setClickable(false);
					hAb.setClickable(false);
					bAd.setClickable(true);
					hAd.setClickable(false);
					bAh.setClickable(true);
					dAh.setClickable(false);
				}	
			}
		});
		
		dec.setOnCheckedChangeListener(new OnCheckedChangeListener(){
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if (isChecked){
					dAb.setClickable(true);
					hAb.setClickable(false);
					bAd.setClickable(false);
					hAd.setClickable(false);
					bAh.setClickable(false);
					dAh.setClickable(true);
				}
			}
		});
		
		hexa.setOnCheckedChangeListener(new OnCheckedChangeListener(){
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if (isChecked){
					dAb.setClickable(false);
					hAb.setClickable(true);
					bAd.setClickable(false);
					hAd.setClickable(true);
					bAh.setClickable(false);
					dAh.setClickable(false);
				}
			}
		});
		
		//Este bloque de código maneja los "clics" en los botones
		bAd.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//Alternativa 1 con programación en Java
				//Long elNumero = Long.parseLong(num.getText().toString(), 2);
				//respuesta.setText(String.valueOf(elNumero));
				respuesta.setText(convs.binaryToDecimal(num.getText().toString()));
			}
		});
		
		hAd.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//Alternativa 1 con programación en Java
				//Long elNumero = Long.parseLong(num.getText().toString(), 2);
				//respuesta.setText(String.valueOf(elNumero));
				respuesta.setText(convs.hexToDecimal(num.getText().toString()));
			}
		});
		
		dAb.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//Alternativa 1 con programación en Java
				//Long elNumero = Long.parseLong(num.getText().toString(), 2);
				//respuesta.setText(String.valueOf(elNumero));
				respuesta.setText(convs.decimalToBinary(num.getText().toString()));
			}
		});
		
		hAb.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//Alternativa 1 con programación en Java
				//Long elNumero = Long.parseLong(num.getText().toString(), 2);
				//respuesta.setText(String.valueOf(elNumero));
				//respuesta.setText(convs.hexToBinary(num.getText().toString()));
			}
		});
		
		bAh.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//Alternativa 1 con programación en Java
				//Long elNumero = Long.parseLong(num.getText().toString(), 2);
				//respuesta.setText(String.valueOf(elNumero));
				//respuesta.setText(convs.binaryToHex(num.getText().toString()));
			}
		});
		
		dAh.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//Alternativa 1 con programación en Java
				//Long elNumero = Long.parseLong(num.getText().toString(), 2);
				//respuesta.setText(String.valueOf(elNumero));
				//respuesta.setText(convs.decimalToHex(num.getText().toString()));
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.caratula, menu);
		return true;
	}

}
