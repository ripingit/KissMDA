/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package de.crowdcode.kissmda.examples.apptest.components;

import java.util.Date;

import de.crowdcode.kissmda.testapp.components.Company;
import de.crowdcode.kissmda.testapp.components.CompanyAttribute;

public class CompanyImpl implements Company {

	private String name;
	private double value;
	private Date created;
	private CompanyAttribute<String, Integer> companyAttribute;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public double getValue() {
		return value;
	}

	@Override
	public void setValue(double value) {
		this.value = value;
	}

	@Override
	public Date getCreated() {
		return created;
	}

	@Override
	public void setCreated(Date created) {
		this.created = created;
	}

	@Override
	public CompanyAttribute<String, Integer> getCompanyAttribute() {
		return companyAttribute;
	}

	@Override
	public void setCompanyAttribute(
			CompanyAttribute<String, Integer> companyAttribute) {
		this.companyAttribute = companyAttribute;
	}
}
