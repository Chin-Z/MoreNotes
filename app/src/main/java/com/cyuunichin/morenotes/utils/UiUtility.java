package com.cyuunichin.morenotes.utils;
import android.app.*;
import android.view.*;

public class UiUtility
{
	public static <T extends View> T $(Activity activity, int id)
	{
		return (T) activity.findViewById(id);
	}
	
	public static <T extends View> T $(View view, int id)
	{
		return (T) view.findViewById(id);
	}
}
