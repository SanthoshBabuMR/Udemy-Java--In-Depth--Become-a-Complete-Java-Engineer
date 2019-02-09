package com.semanticsquare.StaticVariablesAccessFromDiffPackage;

import com.semanticsquare.StaticVariables.StaticVariablesAccessibility;

class StaticVariablesAccessFromDiffPackage {

	public static void main (String[] args) {
		StaticVariablesAccessibility sva = new StaticVariablesAccessibility();
		sva.instanceMethod();
		sva.staticMethod();
		System.out.println(StaticVariablesAccessibility.staticVar);
	}
}