package com.st.day4hw;

class LockedSingleton{
	
	private static volatile LockedSingleton _instance;
	
	public static LockedSingleton getInstance() {
		if (_instance == null) {
			synchronized(LockedSingleton.class) {
				if (_instance == null) {
					_instance = new LockedSingleton();
				}
			}
		}
		return _instance;
	}
}