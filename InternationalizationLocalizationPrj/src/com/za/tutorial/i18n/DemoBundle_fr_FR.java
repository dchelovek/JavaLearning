package com.za.tutorial.i18n;

import java.util.ListResourceBundle;

public class DemoBundle_fr_FR extends ListResourceBundle {

	static final Object[][] contents = {{"SIGN_IN", "Se connecter"},
										{"USERNAME","Nom d'utilisateur"},
										{"PASSWORD", "not de passe"},
										{"FLAG", "i18n/flags/French_flag.png"}};
		@Override
		protected Object[][] getContents() {
				return contents;
		}

}
