package in.saathitech.intent_assignment_1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.Touch;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button srchClick;
    EditText srchtxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        srchClick = (Button) findViewById(R.id.btnSearch);
        srchClick.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        srchtxt = (EditText) findViewById(R.id.txtSearch);
        String s = srchtxt.getText().toString();
        Toast toast = Toast.makeText(this, s, Toast.LENGTH_LONG);
        toast.show();

        Intent srchIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com/search?q=" +s));
        startActivity(srchIntent);
    }

}
