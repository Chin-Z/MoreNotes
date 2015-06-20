package com.cyuunichin.morenotes.ui.activities;
import android.support.v7.app.*;
import android.support.v7.widget.*;
import android.support.design.widget.*;
import android.os.*;
import com.cyuunichin.morenotes.*;
import static com.cyuunichin.morenotes.utils.UiUtility.*;
import android.app.*;

public abstract class ToolbarActivity extends AppCompatActivity
{
	abstract protected int getLayoutResource();
	
	private Toolbar mToolbar;
	private AppBarLayout mAppBar;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(getLayoutResource());
		
		mAppBar = $(this, R.id.appbar);
		mToolbar = $(this, R.id.toolbar);
		
		setSupportActionBar(mToolbar);
	}
	
	
}
