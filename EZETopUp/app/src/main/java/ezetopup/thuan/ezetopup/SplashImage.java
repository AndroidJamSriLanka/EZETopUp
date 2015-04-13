package ezetopup.thuan.ezetopup;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;


public class SplashImage extends ActionBarActivity {

    /** Duration of wait **/
    private final int SPLASH_DISPLAY_LENGTH = 3000;

    /** Called when the activity is first created. */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_image);

        /*requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_image);*/

        /*super.onCreate(icicle);
        setContentView(R.layout.SplashImage);*/

        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
            new Handler().postDelayed(new Runnable(){
                @Override
                public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                    Intent mainIntent = new Intent(SplashImage.this,Select_Service_Provider.class);
                    SplashImage.this.startActivity(mainIntent);
                    SplashImage.this.finish();
                }
            }, SPLASH_DISPLAY_LENGTH);


        }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_splash_image, menu);
        return true;


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);

        
    }
}

