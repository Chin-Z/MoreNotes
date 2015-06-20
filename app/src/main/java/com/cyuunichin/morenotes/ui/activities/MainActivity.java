package com.cyuunichin.morenotes.ui.activities;

import com.cyuunichin.morenotes.*;
import android.os.*;
import android.support.design.widget.*;
import android.support.v7.widget.*;
import static com.cyuunichin.morenotes.utils.UiUtility.*;
import android.view.View.*;
import android.view.*;
import android.content.*;
public class MainActivity extends ToolbarActivity
{

	private RecyclerView mList;
	private FloatingActionButton mFAB;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		
		//mList = $(this,R.id.list);
		mFAB = $(this,R.id.new_fab);
		
		mFAB.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
					startActivity(new Intent(MainActivity.this, EditorActivity.class));
				}
				
		});
	}
    
	@Override
	protected int getLayoutResource()
	{
		// TODO: Implement this method
		return R.layout.main;
	}
	
}
