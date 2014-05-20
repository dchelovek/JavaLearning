package com.za.tutorial.i18n;

import java.util.ListResourceBundle;

public class DemoBundle_en_US extends ListResourceBundle {
	static final Object[][] contents = {{"SIGN_IN", "Sign in(ListResourceBundle)"},
										{"USERNAME","Username (ListResourceBundle)"},
										{"PASSWORD", "Password (ListResourceBundle)"},
										{"FLAG", "i18n/flags/USA_flag.png"}};
	@Override
	protected Object[][] getContents() {
		
		return contents;
	}

}
