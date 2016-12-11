package baas202.baspondman_pset1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.view.View;

@SuppressWarnings("WrongConstant")
public class MainActivity extends Activity {

    ImageView ears;
    ImageView eyes;
    ImageView eyebrows;
    ImageView arms;
    ImageView glasses;
    ImageView hat;
    ImageView mouth;
    ImageView mustache;
    ImageView nose;
    ImageView shoes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ears = (ImageView) findViewById(R.id.imageView_ears);
        eyes = (ImageView) findViewById(R.id.imageView_eyes);
        eyebrows = (ImageView) findViewById(R.id.imageView_eyebrows);
        arms = (ImageView) findViewById(R.id.imageView_arms);
        glasses = (ImageView) findViewById(R.id.imageView_glasses);
        hat = (ImageView) findViewById(R.id.imageView_hat);
        mouth = (ImageView) findViewById(R.id.imageView_mouth);
        mustache = (ImageView) findViewById(R.id.imageView_mustache);
        nose = (ImageView) findViewById(R.id.imageView_nose);
        shoes = (ImageView) findViewById(R.id.imageView_shoes);
    }

    /* Used this from Google Developer example:
    https://developer.android.com/guide/topics/ui/controls/checkbox.html
 */
    public void onCheckboxClicked(View v) {
        // default method for handling onClick Events..
        // Is the view now checked?

        boolean checked = ((CheckBox) v).isChecked();

        // Check which checkbox was clicked
        switch(v.getId()) {
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

    // Save state to handle rotation
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState)
    {
        /*
        Used a little code from Modge to understand savedInstanceState:
        http://stackoverflow.com/questions/32131417/must-be-one-of-view-visible-view-invisible-view-gone
         */
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("Ears",ears.getVisibility());
        savedInstanceState.putInt("Eyes",eyes.getVisibility());
        savedInstanceState.putInt("Eyebrows",eyebrows.getVisibility());
        savedInstanceState.putInt("Arms",arms.getVisibility());
        savedInstanceState.putInt("Glasses",glasses.getVisibility());
        savedInstanceState.putInt("Hat",hat.getVisibility());
        savedInstanceState.putInt("Mouth",mouth.getVisibility());
        savedInstanceState.putInt("Mustache",mustache.getVisibility());
        savedInstanceState.putInt("Nose",nose.getVisibility());
        savedInstanceState.putInt("Shoes",shoes.getVisibility());
    }

    // Restore the previous state before rotation
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState)
    {
        super.onRestoreInstanceState(savedInstanceState);
        ears.setVisibility(savedInstanceState.getInt("Ears"));
        eyes.setVisibility(savedInstanceState.getInt("Eyes"));
        eyebrows.setVisibility(savedInstanceState.getInt("Eyebrows"));
        arms.setVisibility(savedInstanceState.getInt("Arms"));
        glasses.setVisibility(savedInstanceState.getInt("Glasses"));
        hat.setVisibility(savedInstanceState.getInt("Hat"));
        mouth.setVisibility(savedInstanceState.getInt("Mouth"));
        mustache.setVisibility(savedInstanceState.getInt("Mustache"));
        nose.setVisibility(savedInstanceState.getInt("Nose"));
        shoes.setVisibility(savedInstanceState.getInt("Shoes"));
    }
}