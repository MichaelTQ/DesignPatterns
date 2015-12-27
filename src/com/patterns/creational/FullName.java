/**
 * This is to practice builder pattern. 
 */

package com.patterns.creational;

public final class FullName {
	private final String lastName;
	private final String firstName;
	private final String middleName;
	private final String salutation;
	private final String suffix;
	
	private FullName(
			final String lastName,
			final String firstName,
			final String middleName,
			final String salutation,
			final String suffix
			) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.middleName = middleName;
		this.salutation = salutation;
		this.suffix = suffix;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getSalutation() {
		return salutation;
	}

	public String getSuffix() {
		return suffix;
	}
	
	@Override
	public String toString() {
		return this.salutation + " "
				+ this.firstName + " "
				+ this.middleName + " "
				+ this.lastName + " "
				+ this.suffix;
	}
	
	public static class FullNameBuilder {
		private final String nestedLastName;
		private final String nestedFirstName;
		private String nestedMiddleName = "";
		private String nestedSalutation = "";
		private String nestedSuffix = "";
		
		public FullNameBuilder(
				final String newLastName, final String newFirstName) {
			this.nestedLastName = newLastName;
			this.nestedFirstName = newFirstName;
		}
		
		public FullNameBuilder middleName(final String newMiddleName) {
			this.nestedMiddleName = newMiddleName;
			return this;
		}
		
		public FullNameBuilder salutation(final String newSalutation) {
			this.nestedSalutation = newSalutation;
			return this;
		}
		
		public FullNameBuilder suffix(final String newSuffix) {
			this.nestedSuffix = newSuffix;
			return this;
		}
		
		public FullName createFullName() {
			return new FullName(
					nestedLastName, nestedFirstName,
					nestedMiddleName, nestedSalutation,
					nestedSuffix
				);
		}
	}
}
