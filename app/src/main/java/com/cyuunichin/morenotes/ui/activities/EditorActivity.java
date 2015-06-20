package com.cyuunichin.morenotes.ui.activities;

import android.os.*;
import com.cyuunichin.morenotes.ui.widget.*;
import static com.cyuunichin.morenotes.utils.UiUtility.*;
import com.cyuunichin.morenotes.*;

public class EditorActivity extends ToolbarActivity
{

	private MoreEditorText mEditor;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		mEditor = $(this, R.id.editor);
	}

	
	@Override
	protected int getLayoutResource()
	{
		// TODO: Implement this method
		return R.layout.editor;
	}
	
	
}
