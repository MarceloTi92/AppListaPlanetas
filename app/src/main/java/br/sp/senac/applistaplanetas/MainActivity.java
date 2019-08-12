package br.sp.senac.applistaplanetas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String[] namePlanets = {"Jupiter", "Lua", "Marte", "Plutão", "Saturno", "Sol", "Terra", "Venus" };
    int [] imagePlanets = {R.drawable.jupiter, R.drawable.lua, R.drawable.marte, R.drawable.plutao, R.drawable.saturno, R.drawable.sol, R.drawable.terra, R.drawable.venus};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.lstPlanetas);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), ListaDadosPlanetas.class);
                intent.putExtra("name", namePlanets[position]);
                intent.putExtra("image", imagePlanets[position]);
                startActivity(intent);

            }
        });
    }
}

class CustomAdapter extends BaseAdapter {

    @Override
    public int getCount() {
        return imagePlanets.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        View view1 = getLayoutInflater().inflate(R.layout.carrega_planetas, null);

        TextView name = (TextView) view.findViewById(R.id.planetas);
        ImageView image = (ImageView) view.findViewById((R.id.imgPlanetas));

        namePlanets;
        name.setText(namePlanets[position]);
        image.setImageResource(imagePlanets[position]);

        return view;


    }

}



}
