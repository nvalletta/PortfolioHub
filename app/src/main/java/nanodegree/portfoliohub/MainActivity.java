package nanodegree.portfoliohub;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public final class MainActivity extends Activity {

    private Button _spotifyStreamerButton;
    private Button _scoresButton;
    private Button _libraryButton;
    private Button _buildItBiggerButton;
    private Button _xyzReaderButton;
    private Button _capstoneButton;

    private View.OnClickListener _displayToastListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Context context = getApplicationContext();
            if (null != context) {
                displayToast(((Button)v).getText().toString(), context);
            }
        }

        private void displayToast(String buttonTitle, Context context) {
            String toastText = "This button will launch my " + buttonTitle + " app!";
            Toast toast = Toast.makeText(context, toastText, Toast.LENGTH_SHORT);
            toast.show();
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setupViews();
        this.attachButtonClickListeners();
    }


    private void setupViews() {
        _spotifyStreamerButton = (Button)findViewById(R.id.spotifyStreamerButton);
        _scoresButton = (Button)findViewById(R.id.scoresButton);
        _libraryButton = (Button)findViewById(R.id.libraryButton);
        _buildItBiggerButton = (Button)findViewById(R.id.buildItBiggerButton);
        _xyzReaderButton = (Button)findViewById(R.id.xyzReaderButton);
        _capstoneButton = (Button)findViewById(R.id.capstoneButton);
    }


    private void attachButtonClickListeners() {
        _spotifyStreamerButton.setOnClickListener(_displayToastListener);
        _scoresButton.setOnClickListener(_displayToastListener);
        _libraryButton.setOnClickListener(_displayToastListener);
        _buildItBiggerButton.setOnClickListener(_displayToastListener);
        _xyzReaderButton.setOnClickListener(_displayToastListener);
        _capstoneButton.setOnClickListener(_displayToastListener);
    }


}
