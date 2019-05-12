package com.codepolitan.fragment;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.container, new FragmentSatu())
                .commit();
    }

    private void loadFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, fragment)
                .commit();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) Toast.makeText(this, getIntent().getStringExtra("say"), Toast.LENGTH_SHORT).show();
    }

    public void satu(View view) {
        loadFragment(new FragmentSatu());
    }

    public void dua(View view) {
        loadFragment(new FragmentDua());
    }

    public void tiga(View view) {
        loadFragment(new FragmentTiga());
    }

    public void Wowoow(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("holla", "Bro Bro gore");
        startActivityForResult(intent, 1);
    }
}
