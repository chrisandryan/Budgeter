package budgeter.accounts;

import com.example.budgeter.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class Accounts_Main extends Activity{

	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_accounts);
	        
	    }

	    @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	        // Inflate the menu; this adds items to the action bar if it is present.
	        getMenuInflater().inflate(R.menu.activity_accounts, menu);
	        return true;
	    }
}
