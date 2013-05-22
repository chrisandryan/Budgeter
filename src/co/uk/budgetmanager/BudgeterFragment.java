package co.uk.budgetmanager;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LayoutAnimationController;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BudgeterFragment extends FragmentActivity implements OnClickListener {
	private LinearLayout floatingSummary;
	private boolean bFloatingSummaryVisible;
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_fragment);
	        initialisePaging();
	        
	        Button bSummaryView = (Button) findViewById(R.id.btnSummary);
	        bSummaryView.setOnClickListener(this);
	        
	        
	        
	    }
	
    private void initialisePaging() {

    Accounts fragmentOne = new Accounts();
    Transactions fragmentThree= new Transactions();
    Budgets fragmentTwo = new Budgets();

    PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager());
    pagerAdapter.addFragment(fragmentOne);
    pagerAdapter.addFragment(fragmentTwo);
    pagerAdapter.addFragment(fragmentThree);
    

    ViewPager viewPager = (ViewPager) super.findViewById(R.id.viewPager);
    viewPager.setOnClickListener(this);
    viewPager.setAdapter(pagerAdapter);
    viewPager.setOffscreenPageLimit(2);
    viewPager.setCurrentItem(1);
    viewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
        @Override
        public void onPageSelected(int position) {
        	TextView contextText = (TextView) findViewById(R.id.txtContext);
        	ImageView ic_ViewContext = (ImageView) findViewById(R.id.img_context);
        	
        	
        	switch(position) {
            case 0:
                contextText.setText("Accounts");
                ic_ViewContext.setImageResource(R.drawable.accounts_view);
                break;
            case 1:
            	contextText.setText("Budgets");
            	ic_ViewContext.setImageResource(R.drawable.budgets_view);
                break;
            case 2:
            	contextText.setText("Transactions");
            	ic_ViewContext.setImageResource(R.drawable.transactions_view);
                break;
            default:
            	contextText.setText("Unknown");
        }
        	Log.i("<ViewPagerChange>", "Page Chnaged:" + position);
        }
                

    });
    
}

	@Override
	public void onClick(View v) {
		switch(v.getId()) {
        case R.id.btnSummary: 
  
       
        	if(bFloatingSummaryVisible){
        		
        		floatingSummary.setVisibility(View.INVISIBLE);
        		bFloatingSummaryVisible = false;
        	}else {
        	floatingSummary = (LinearLayout) findViewById(R.id.floating_summary);
        	floatingSummary.setVisibility(View.VISIBLE);
        	bFloatingSummaryVisible = true;
        	}
        	break;

        default:
        	break;
        	
		}
		
	}

	}