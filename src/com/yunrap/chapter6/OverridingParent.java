package com.yunrap.chapter6;

import java.util.Date;

public class OverridingParent {
	public OverridingParent() {
		
	}
	
	public String getDate() {
		Date date = new Date();
		return date.toString();
	}
}
