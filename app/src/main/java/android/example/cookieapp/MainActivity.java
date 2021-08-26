package android.example.cookieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.example.cookieapp.R;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView setNewImage = (ImageView) findViewById(R.id.android_cookie_image_view);
        setNewImage.setImageResource(R.drawable.after_cookie);


        // TODO: Find a reference to the TextView in the layout. Change the text.
        TextView setnewText = (TextView) findViewById(R.id.status_text_view);
        setnewText.setText("I'm So Full!");

    }
}