package id.ac.poliban.mi.rafii.listfriends;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> countries = new ArrayList<>();
    {
        countries.add("Irfan");
        countries.add("Indrawan");
        countries.add("Andre");
        countries.add("Andri");
        countries.add("Diana");
        countries.add("Gina");
        countries.add("Iffa");
        countries.add("Lidya");
        countries.add("Melisa");
        countries.add("Ade");
        countries.add("Purnama");
        countries.add("Dika");
        countries.add("Renaldy");
        countries.add("Awank");
        countries.add("Tasya");
        countries.add("Yunita");
        countries.add("Rezal");
        countries.add("Agustya");
        countries.add("Ratu");
        countries.add("Rizky");
        countries.add("Radi");
        countries.add("Taufan");
        countries.add("Firah");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //ubah judul di Action Bar
        if(getSupportActionBar()!=null)
            setTitle("Aplikasi List Friends");
        //daftarkan view untuk dimanipulasi
        ListView listView = findViewById(R.id.list_view);

        //buat adapter
        ArrayAdapter adapter = new ArrayAdapter(this,
                R.layout.item_rows_friends, R.id.tv_item_friends, countries);
        listView.setAdapter(adapter);
        //event handling (jangan lupa aktifkan java 1.8)
        listView.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(this, "anda mengklik " +
                    countries.get(position), Toast.LENGTH_SHORT).show();
        });
    }
}
