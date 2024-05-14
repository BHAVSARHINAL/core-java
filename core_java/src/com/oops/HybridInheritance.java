package com.oops;
/**
 * <h3>This program represents combination of Multilevel and Hierarchical
 * Inheritance.</h3>
 * @author : Hinal Bhavsar
 * @version 1.01 4-04-2024
 */

class GrandFather {

	public void showGrandfatherRelation() {
		System.out.println("Grandfather is main person of family.");
	}

}

class Father extends GrandFather {

	public void showFatherRelation() {
		System.out.println("Father is a child of grandfather.");
	}

}

class Son extends Father {

	public void showSonRelation() {
		System.out.println("Son is a child of father.");
	}

}

class Daughter extends Father {

	public void showDaughterRelation() {
		System.out.println("Daughter is a child of father.");
	}

}

public class HybridInheritance {

	public static void main(String[] args) {
		Son son = new Son();
		son.showFatherRelation();
		son.showGrandfatherRelation();
		son.showSonRelation();
		Daughter daughter = new Daughter();
		daughter.showDaughterRelation();
		daughter.showFatherRelation();
		daughter.showGrandfatherRelation();
	}

}