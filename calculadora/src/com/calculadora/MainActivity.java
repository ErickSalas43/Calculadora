package com.calculadora;

import android.app.Activity; 
import android.graphics.Typeface;
import android.os.Bundle; 
import android.view.View; 
import android.view.Window; 
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView; 

public class MainActivity extends Activity {
	/* Fuente textos */
	    private Typeface digital;
	    


/** Called when the activity is first created. */ 
String x=""; 
int flagpu=0; 
public int flagpas=0; 
double Total=0,x1,y1; 
int flagl=0; 
int ope=0; 
public String im(String a){ 
float p=Float.parseFloat(a); 
p*=-1; 
p=(float) Math.sqrt(p); 
a=p+"i"; 

return a; 
} 
public void procesa(String a){ 
Total=Double.parseDouble(a); 
x=""; 



} 




public String resu(){ 
return x; 
} 
public void almacena(String a){ 
if(flagl>0){ 
x=""; 
flagl=0; 
} 

x+=a; 

} 
public String get(){ 
return x; 
} 
public String resultad(){ 
switch (ope){ 
case 1:{ 
//suma 
Total=x1+y1; 
x=""+Total; 
break; 


} 
case 2:{ 

Total=x1*y1; 
x=""+Total; 
break; 

} 
case 3:{ 

Total=x1-y1; 
x=""+Total; 
break; 

} 
case 4:{ 

Total=x1/y1; 
x=""+Total; 
break; 

} 
default:{ 
x=""+y1; 
break; 
} 

} 

x1=0; 
y1=0; 
flagpu=0; 
return x; 
} 
@Override 

public void onCreate(Bundle savedInstanceState) 
{ 

requestWindowFeature(Window.FEATURE_NO_TITLE); 
super.onCreate(savedInstanceState); 

setContentView(R.layout.beta); 
digital = Typeface.createFromAsset(getAssets(),
		"fonts/digital.ttf");


final TextView Resultado=(TextView)findViewById(R.id.Resultado);
Resultado.setTypeface(digital);
Resultado.setTextSize(50);
//Boton 1 
final ImageView boton1=(ImageView)findViewById(R.id.Boton1); 


boton1.setOnClickListener(new View.OnClickListener() { 
@Override 
public void onClick(View v){ 


almacena("1"); 

Resultado.setText(get()); 

} 
}); 
//Boton 2 
final ImageButton boton2=(ImageButton)findViewById(R.id.Boton2); 


boton2.setOnClickListener(new View.OnClickListener() { 
@Override 
public void onClick(View v){ 

almacena("2"); 

Resultado.setText(get()); 


} 
}); 
//Boton 3 
final ImageButton boton3=(ImageButton)findViewById(R.id.Boton3); 


boton3.setOnClickListener(new View.OnClickListener() { 
@Override 
public void onClick(View v){ 


almacena("3"); 

Resultado.setText(get()); 

} 
}); 
//Boton 4 
final ImageButton boton4=(ImageButton)findViewById(R.id.Boton4); 


boton4.setOnClickListener(new View.OnClickListener() { 
@Override 
public void onClick(View v){ 

almacena("4"); 

Resultado.setText(get()); 


} 
}); 
//Boton 5 
final ImageButton boton5=(ImageButton)findViewById(R.id.Boton5); 


boton5.setOnClickListener(new View.OnClickListener() { 
@Override 
public void onClick(View v){ 
almacena("5"); 

Resultado.setText(get()); 



} 
}); 
//Boton 6 
final ImageButton boton6=(ImageButton)findViewById(R.id.Boton6); 


boton6.setOnClickListener(new View.OnClickListener() { 
@Override 
public void onClick(View v){ 


almacena("6"); 

Resultado.setText(get()); 

} 
}); 
//Boton 7 
final ImageButton boton7=(ImageButton)findViewById(R.id.Boton7); 


boton7.setOnClickListener(new View.OnClickListener() { 
@Override 
public void onClick(View v){ 


almacena("7"); 

Resultado.setText(get()); 

} 
}); 
//Boton 8 
final ImageButton boton8=(ImageButton)findViewById(R.id.Boton8); 


boton8.setOnClickListener(new View.OnClickListener() { 
@Override 
public void onClick(View v){ 
almacena("8"); 

Resultado.setText(get()); 



} 
}); 
//Boton 9 
final ImageButton boton9=(ImageButton)findViewById(R.id.Boton9); 


boton9.setOnClickListener(new View.OnClickListener() { 
@Override 
public void onClick(View v){ 

almacena("9"); 

Resultado.setText(get()); 


} 
}); 
//Boton . 
final ImageButton botonpunto=(ImageButton)findViewById(R.id.Botonpunto); 


botonpunto.setOnClickListener(new View.OnClickListener() { 
@Override 
public void onClick(View v){ 

if(flagpu==0){ 
almacena("."); 
flagpu++; 
} 

Resultado.setText(get()); 

} 
}); 
//Boton 1 
final ImageButton boton0=(ImageButton)findViewById(R.id.Boton0); 


boton0.setOnClickListener(new View.OnClickListener() { 
@Override 
public void onClick(View v){ 


almacena("0"); 

Resultado.setText(get()); 

} 
}); 
//Boton 1 
final ImageButton botonmulti=(ImageButton)findViewById(R.id.Botonmulti); 


botonmulti.setOnClickListener(new View.OnClickListener() { 
@Override
public void onClick(View v){

ope=2; 

if(x1==0){ 
x=Resultado.getText().toString(); 
x1=Double.parseDouble(x); 
x=""; 
Resultado.setText(x); 
}else{ 
y1=Double.parseDouble(Resultado.getText().toString()); 


Resultado.setText(resultad()); 

} 


flagl++; 


} 
}); 

final ImageButton botonresta=(ImageButton)findViewById(R.id.Botonresta); 


botonresta.setOnClickListener(new View.OnClickListener() { 
@Override 
public void onClick(View v){ 

if("".equals(x)){ 
almacena("-"); 
}else{ 
ope=3; 
flagl++; 
if(x1==0){ 
x=Resultado.getText().toString(); 
x1=Double.parseDouble(x); 
x=""; 
Resultado.setText(x); 
}else{ 

y1=Double.parseDouble(Resultado.getText().toString()); 


Resultado.setText(resultad());} 


} 


} 
}); 
final ImageButton botondiv=(ImageButton)findViewById(R.id.Botondiv); 


botondiv.setOnClickListener(new View.OnClickListener() { 
@Override 
public void onClick(View v){ 
ope=4; 
flagl++; 
if(x1==0){ 
x=Resultado.getText().toString(); 
x1=Double.parseDouble(x); 
x=""; 
Resultado.setText(x); 
}else{ 


y1=Double.parseDouble(Resultado.getText().toString()); 


Resultado.setText(resultad()); 
} 



} 
}); 
final ImageButton botonsuma=(ImageButton)findViewById(R.id.Botonsuma); 


botonsuma.setOnClickListener(new View.OnClickListener() { 
@Override 
public void onClick(View v){ 
ope=1; 
flagl++; 
if(x1==0){ 
x=Resultado.getText().toString(); 
x1=Double.parseDouble(x); 
x=""; 
Resultado.setText(x); 
}else{ 

y1=Double.parseDouble(Resultado.getText().toString()); 


Resultado.setText(resultad());} 

} 
}); 
final ImageButton sqrt=(ImageButton)findViewById(R.id.Botonsqrt); 


sqrt.setOnClickListener(new View.OnClickListener() { 
@Override 
public void onClick(View v){ 
x=Resultado.getText().toString(); 

flagl++; 
double p=Float.parseFloat(x); 
if(p>=0){ 
p= Math.sqrt(p); 
Total=p; 
Resultado.setText(""+Total); 
x=""; 
}else { 
Resultado.setText(im(x)); 

} 

} 
}); 
final ImageButton del=(ImageButton)findViewById(R.id.DEL); 


del.setOnClickListener(new View.OnClickListener() { 
@Override 
public void onClick(View v){ 
if(x.length()>0) 
x=x.substring(0, (x.length()-1)); 
Resultado.setText(x); 



} 
}); 
final ImageButton Ce=(ImageButton)findViewById(R.id.CE); 
Ce.setOnClickListener(new View.OnClickListener() { 

public void onClick(View v) { 
x=""; 
y1=0; 
x1=0; 
Total=0; 
flagpu=0; 
flagpas=0; 





Resultado.setText(""); 
} 
}); 
final ImageButton igual=(ImageButton)findViewById(R.id.Botonigual); 

igual.setOnClickListener(new View.OnClickListener() { 

public void onClick(View v) { 
y1=Double.parseDouble(Resultado.getText().toString()); 


Resultado.setText(resultad()); 



} 
}); 
final ImageButton exp=(ImageButton)findViewById(R.id.Botonexp); 
exp.setOnClickListener(new View.OnClickListener() { 

public void onClick(View v) { 
x=Resultado.getText().toString(); 
double k=Float.parseFloat(x); 
k=k*k; 
Total=k; 
flagl++; 

Resultado.setText(""+Total); 


} 
}); 




} 
} 