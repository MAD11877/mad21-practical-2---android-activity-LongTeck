package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    User user = new User("Bot", "Description", 1, false);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClick(View v){
        TextView txt =findViewById(R.id.Follow);
        if(user.Followed == false){
            txt.setText("Unfollow");
            user.Followed = true;
        }
        else{
            txt.setText("Follow");
            user.Followed = false;
        }
    }
}