package com.findbugs.examples;

public class ScaryRankBugs {
	private final String checkStrValue;

	public ScaryRankBugs() {
		this.checkStrValue = "SomeValue";
	}

	private void executeSomeConditions() {
		if ("SomeValue".equals(this.checkStrValue)) {
			// Condition 1
		} else if ("SomeValue".equals(this.checkStrValue)) {
			// Condition 2
		}
	}

	private static void incorrectAssignmentInIfCondition() {
		boolean value = false;
	}
}
