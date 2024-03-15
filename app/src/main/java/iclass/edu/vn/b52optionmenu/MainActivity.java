package iclass.edu.vn.b52optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Xu ly tao OptionsMenu

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.optionmenu, menu);
        return true;
    }//Ket thuc onCreateOptionsMenu
    //Xu ly cac su kien khi nguoi dung chon cac chuc nang cua Option Menu

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.SettingsId:
                Toast.makeText(MainActivity.this, "Bạn đã chọn Settings", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.ToolsId:
                Toast.makeText(MainActivity.this, "Bạn đã chọn Tools", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.ExitId:
                finish();
                return true;
            default:
            return super.onOptionsItemSelected(item);
        }
    }//Ket thuc OnOptionsItemSelected
}