package com.example.recyclercarddemo;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DatosActivity extends AppCompatActivity {
    private static final int ALERT_DIALOG = 1;

    private EditText edtNo, edtPas;
    private Button Alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        edtNo = (EditText) findViewById(R.id.Nombre);
        edtPas = (EditText) findViewById(R.id.editText2);


        ((Button) findViewById(R.id.button2))
                .setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            showDialog(ALERT_DIALOG);
                                        }
                                    }
                );
    }

    public void Registra(View view) {
        String nombre = edtNo.getText().toString();
        String apeellido = edtPas.getText().toString();

        if (nombre.length() == 0) {
            Toast.makeText(this, "Debes ingresar un nombre", Toast.LENGTH_SHORT).show();

        }
        if (apeellido.length() == 0) {
            Toast.makeText(this, "Debes ingresar un apellido", Toast.LENGTH_SHORT).show();

        }
        if (nombre.length() != 0 && edtPas.length() != 0) {
            Toast.makeText(this, "En Proceso", Toast.LENGTH_SHORT).show();

        }
    }



    @Override
    protected Dialog onCreateDialog(int id )
    {
        Dialog dialog = null;
        if ( id == ALERT_DIALOG )
        {
            AlertDialog.Builder builder = new AlertDialog.Builder( this );
            builder.setMessage( "¡Listo!, Ya podras recoger tu libro. Recuerda llevar una identificación." )
                    .setCancelable( false )
                    .setPositiveButton( "Aceptar",
                            new DialogInterface.OnClickListener()
                            {
                                @Override
                                public void onClick( DialogInterface dialog, int which ){
                                    dialog.dismiss();
                                }
                            }
                    );
            dialog = builder.create();
        }
        if ( dialog == null )
        {
            dialog = super.onCreateDialog( id );
        }
        return dialog;
    }
}
