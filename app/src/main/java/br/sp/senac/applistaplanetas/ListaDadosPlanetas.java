package br.sp.senac.applistaplanetas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class ListaDadosPlanetas extends AppCompatActivity {

    TextView lstPlanetas;
    ImageView imgPlanetas;

    @Override
    protected <imgageView> void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_dados_planetas);

        lstPlanetas = (TextView) findViewById(R.id.lstDplanetas);
        imgPlanetas = (imgageView) findViewById(R.id.lstIMGPlanetas);

        Intent intent = getIntent();
        String nomeRetorno = intent.getStringExtra("name");
        int imagemRetorno = intent.getByteExtra("image", 0);

        lstPlanetas.setText(nomeRetorno);
        imgPlanetas.setImageResource(imagemRetorno);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void  onBackPressed() {
        super.onBackPressed();
    }
}
