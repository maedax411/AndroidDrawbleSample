package aaa.firstapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        TextView textview = (TextView)findViewById(R.id.topText);
        textview.setTextColor(Color.parseColor("#0000ff"));


        String str = "<u>なんでもいい</u>よ、<font color='#ff0000'>なんでもない</font>よ。";
        textview.setText(Html.fromHtml(str));*/

    }
}
