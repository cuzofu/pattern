package com.cuzofu.pattern.criteria;

import java.util.ArrayList;
import java.util.List;

public class AndCriteria implements Criteria {

	private Criteria criteria;
	private Criteria otherCriteria;

	public AndCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
		List<Person> otherCriteriaPersons = otherCriteria.meetCriteria(persons);
		List<Person> resultCriteriaPersons = new ArrayList<Person>();

		for (Person person : otherCriteriaPersons) {
			if (firstCriteriaPersons.contains(person)) {
				resultCriteriaPersons.add(person);
			}
		}
		return resultCriteriaPersons;
	}

}
