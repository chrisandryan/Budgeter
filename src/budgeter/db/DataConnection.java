package budgeter.db;



import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
	public class DataConnection extends ContentProvider {
	    // Database Related Constants
	    private static final int DATABASE_VERSION = 1;	
	    private static final String DATABASE_NAME = "Budgeter";	
	    private static final String ACCOUNTS_TABLE = "Accounts";
	    private static final String BUDGETS_TABLE = "Budgets";
	    private static final String TRANSACTIONS_TABLE = "Transactions";
	    private static final String REPEATING_TRANSACTIONS_TABLE = "RepeatingTransactions";
	    private static final String SETTINGS_TABLE = "Settings";
	    // Accounts table Columns
	    public static final String COLUMN_ACCOUNTID = "account_id";
	    public static final String COLUMN_ACCOUNT_NAME = "account_name";
	    public static final String COLUMN_CURRENCY = "currency";
	    public static final String COLUMN_OPENING_BALANCE = "opening_balance";
	    public static final String COLUMN_CURRENT_BALANCE = "current_balance";
	    public static final String COLUMN_ALERT_LIMIT = "alert_limit";
	    // Budgets table Columns
	    public static final String COLUMN_BUDGETID = "budget_id";
	    public static final String COLUMN_BUDGET_NAME = "budget_name";
	    public static final String COLUMN_ACCOUNT_ID_FK = "account_id";
	    // Transactions table Columns
	    public static final String COLUMN_TRANSACTIONID = "transaction_id";
	    public static final String COLUMN_TRANSACTION_AMOUNT = "transaction_amaount";
	    public static final String COLUMN_DATE = "date";
	    public static final String COLUMN_ACCOUNT_TO = "account_to";
	    public static final String COLUMN_REPEATID_FK = "repeat_id";
	    public static final String COLUMN_BUDGETID_FK = "budget_id";

	    //Create Accounts table SQL statement
	    private static final String ACCOUNTS_TABLE_CREATE = "create table "
	            + ACCOUNTS_TABLE + " (" + COLUMN_ACCOUNTID
	            + " integer primary key autoincrement, " + COLUMN_ACCOUNT_NAME
	            + " text not null, " + COLUMN_CURRENCY + " text not null, "
	            + COLUMN_OPENING_BALANCE + " real not null,"
	            + COLUMN_CURRENT_BALANCE + " real not null,"
	            + COLUMN_ALERT_LIMIT + " real not null);";
	    //Create Accounts table SQL statement
	    private static final String BUDGETS_TABLE_CREATE = "create table "
	            + BUDGETS_TABLE + " (" 
	    		+ COLUMN_BUDGETID + " integer primary key autoincrement, " 
	            + COLUMN_BUDGET_NAME + " text not null, " 
	            + " FOREIGN KEY ("+COLUMN_ACCOUNT_ID_FK+") REFERENCES "+ACCOUNTS_TABLE+" ("+COLUMN_ACCOUNTID+"));";
	    
	    private SQLiteDatabase mDb;
	    @Override
	    public boolean onCreate() {
	        mDb = new DatabaseHelper(getContext()).getWritableDatabase(); 
	        return true;
	    }
		@Override
		public int delete(Uri arg0, String arg1, String[] arg2) {
			// TODO Auto-generated method stub
			return 0;
		}
		@Override
		public String getType(Uri arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public Uri insert(Uri arg0, ContentValues arg1) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public Cursor query(Uri arg0, String[] arg1, String arg2,
				String[] arg3, String arg4) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public int update(Uri arg0, ContentValues arg1, String arg2,
				String[] arg3) {
			// TODO Auto-generated method stub
			return 0;
		}
// ---------------  Database helper nested class -----------------
		private static class DatabaseHelper extends SQLiteOpenHelper {	
		    DatabaseHelper(Context context) {
		        super(context, DATABASE_NAME, null, DATABASE_VERSION);
		    }
		    
		    public void onCreate(SQLiteDatabase db) {
		        db.execSQL(ACCOUNTS_TABLE_CREATE); 
		    }
		    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {	
		        throw new UnsupportedOperationException();
		    }
		}

	}
	

