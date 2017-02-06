package ults.sprint1calculator;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String total = "";
    float v1, v2;
    String sign = "";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        Button button = (Button) v;
        String str = button.getText().toString();
        total += str;
        EditText edit = (EditText) findViewById(R.id.editText);
        edit.setText(total);
    }

    public void onAdd(View v) {
        v1 = Float.parseFloat(total);
        total = "";
        Button button = (Button) v;
        String str = button.getText().toString();
        sign = str;
        EditText edit = (EditText) findViewById(R.id.editText);
        edit.setText(sign);

    }

    public void onCalculate(View v) {
        EditText edit = (EditText) findViewById(R.id.editText);
        String str2 = edit.getText().toString();
        v2 = Float.parseFloat(str2);
        float grand_total = 0;
        if (sign.equals("+")) {
            grand_total = v1 + v2;
        } else if (sign.equals("-")) {
            grand_total = v1 - v2;
        } else if (sign.equals("*")) {
            grand_total = v1 * v2;
        } else if (sign.equals("/")) {
            grand_total = v1 / v2;
        }
        edit.setText(grand_total + "");
    }

    public void onClear(View v) {
        EditText edit = (EditText) findViewById(R.id.editText);
        edit.setText("");
        total = "";
    }
}

