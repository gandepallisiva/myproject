package com.lockedme;

public class LockedMemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create "main" folder if not present in current folder structure
        FileOperations.createMainFolderIfNotPresent("main");

        MenuOptions.printWelcomeScreen("LockedMe", "siva");

        HandleOpretions.handleWelcomeScreenInput();
    
	}

}
