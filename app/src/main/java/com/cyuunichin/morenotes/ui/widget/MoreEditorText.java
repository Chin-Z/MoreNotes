package com.cyuunichin.morenotes.ui.widget;
import android.widget.*;
import android.util.*;
import android.content.*;

public class MoreEditorText extends EditText
{
	
	public MoreEditorText(Context ctx) {
		super(ctx, null);
	}
	
	public MoreEditorText(Context ctx, AttributeSet attrs) {
		super(ctx, attrs, android.R.attr.editTextStyle);
	}
}
