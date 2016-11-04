package baas202.baspondman_pset1;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* Used this from Google Developer example:
                https://developer.android.com/guide/topics/ui/controls/checkbox.html
                 */
    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();


        ImageView ears = (ImageView) findViewById(R.id.imageView_ears);
        ImageView eyes = (ImageView) findViewById(R.id.imageView_eyes);
        ImageView eyebrows = (ImageView) findViewById(R.id.imageView_eyebrows);
        ImageView arms = (ImageView) findViewById(R.id.imageView_arms);
        ImageView glasses = (ImageView) findViewById(R.id.imageView_glasses);
        ImageView hat = (ImageView) findViewById(R.id.imageView_hat);
        ImageView mouth = (ImageView) findViewById(R.id.imageView_mouth);
        ImageView mustache = (ImageView) findViewById(R.id.imageView_mustache);
        ImageView nose = (ImageView) findViewById(R.id.imageView_nose);
        ImageView shoes = (ImageView) findViewById(R.id.imageView_shoes);


        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBox_ears:
                if (checked)
                    ears.setVisibility(View.VISIBLE);

                else
                    ears.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox_eyes:
                if (checked)
                    eyes.setVisibility(View.VISIBLE);
                else
                    eyes.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox_eyebrows:
                if (checked)
                    eyebrows.setVisibility(View.VISIBLE);
                else
                    eyebrows.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox_arms:
                if (checked)
                    arms.setVisibility(View.VISIBLE);
                else
                    arms.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox_glasses:
                if (checked)
                    glasses.setVisibility(View.VISIBLE);
                else
                    glasses.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox_hat:
                if (checked)
                    hat.setVisibility(View.VISIBLE);
                else
                    hat.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox_mouth:
                if (checked)
                    mouth.setVisibility(View.VISIBLE);
                else
                    mouth.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox_mustache:
                if (checked)
                    mustache.setVisibility(View.VISIBLE);
                else
                    mustache.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox_nose:
                if (checked)
                    nose.setVisibility(View.VISIBLE);
                else
                    nose.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox_shoes:
                if (checked)
                    shoes.setVisibility(View.VISIBLE);
                else
                    shoes.setVisibility(View.INVISIBLE);
                break;
        }
    }
}