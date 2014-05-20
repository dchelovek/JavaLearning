package com.za.tutorial.i18n;

import java.util.ListResourceBundle;

public class DemoBundle_de_DE extends ListResourceBundle {
	static final Object[][] contents = {{"SIGN_IN", "Login"},
										{"USERNAME","Benutzername"},
										{"PASSWORD", "Kenwort"},
										{"FLAG", "i18n/flags/German_flag.jpeg"}};
	@Override
	protected Object[][] getContents() {
			return contents;
	}

}
