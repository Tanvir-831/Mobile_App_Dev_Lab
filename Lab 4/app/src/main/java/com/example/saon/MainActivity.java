package com.example.saon;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView facebook = findViewById(R.id.facebook);
        facebook.setOnClickListener(v -> openLink("https://www.facebook.com/saon.saon.1"));

        ImageView instagram = findViewById(R.id.instagram);
        instagram.setOnClickListener(v -> openLink("https://www.instagram.com/tan_s_vir?igsh=eWd4cDRhZ21ibmNh"));

        ImageView linkedin = findViewById(R.id.linkedin);
        linkedin.setOnClickListener(v -> openLink("https://www.linkedin.com/in/md-tanvir-hossain-saon-23b5a11ab?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app"));

        ImageView github = findViewById(R.id.github);
        github.setOnClickListener(v -> openLink("https://github.com/Tanvir-831"));
    }







    //Call onSendMessage() when the button is clicked
    public void onSendMessage(View view) {

        EditText messageView = (EditText)findViewById(R.id.message);
        String messageText = messageView.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, messageText);
        String chooserTitle = getString(R.string.chooser);
        Intent chosenIntent = Intent.createChooser(intent, chooserTitle);
        startActivity(chosenIntent);
        getString(R.string.chooser);
    }

    private void openLink(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}


