package budgeter.transactions;
import budgeter.accounts.*;

import java.util.LinkedList;

import com.example.budgeter.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Main extends Activity {
	private LinkedList accounts;
	
	private void initAccounts(){
		
		accounts = new LinkedList();
	}
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transactions);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_transactions, menu);
        return true;
    }
    
}
