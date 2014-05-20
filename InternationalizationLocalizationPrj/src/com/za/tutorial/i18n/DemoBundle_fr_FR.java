package com.za.tutorial.i18n;

import java.util.ListResourceBundle;

public class DemoBundle_fr_FR extends ListResourceBundle {

	static final Object[][] contents = {{"SIGN_IN", "Se connecter (ListResourceBundle)"},
										{"USERNAME","Nom d'utilisateur (ListResourceBundle)"},
										{"PASSWORD", "not de passe (ListResourceBundle)"},
										{"FLAG", "i18n/flags/French_flag.png"}};
		@Override
		protected Object[][] getContents() {
				return contents;
		}

}
