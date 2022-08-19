package com.aurionpro.test;

import com.aurionpro.model.BackEndDeveloper;
import com.aurionpro.model.FrontEndDeveloper;

public class Project {

	public static void main(String[] args) {
		FrontEndDeveloper fd = new FrontEndDeveloper();
		fd.writeJavaScript();
		BackEndDeveloper bd = new BackEndDeveloper();
		bd.writeJava();
	}

}
