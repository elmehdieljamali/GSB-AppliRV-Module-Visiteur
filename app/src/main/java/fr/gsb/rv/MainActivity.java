package fr.gsb.rv;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "GSB MAIN ACTIVITY" ;
    private EditText etMatricule ;
    private EditText etMdp ;
    private Button bSeConnecter ;
    private Button bAnnuler ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMatricule = findViewById( R.id.etMatricule ) ;
        etMatricule.getText() ;

        etMdp = findViewById( R.id.etMdp ) ;
        etMdp.getText() ;

        bSeConnecter = findViewById( R.id.bValider ) ;

        bAnnuler = findViewById( R.id.bAnnuler ) ;
    }
}