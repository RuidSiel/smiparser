/**
 * Copyright 2011-2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jsmiparser.smi;

import java.util.ArrayList;
import java.util.List;

import org.jsmiparser.util.token.IdToken;

public class SmiOidMacro extends SmiOidValue {
	private static final long serialVersionUID = 7169921949233977970L;
	protected StatusAll status;
	protected List<String> references = new ArrayList<String>();

	public SmiOidMacro(IdToken idToken, SmiModule module) {
		super(idToken, module);
	}

	public StatusAll getStatus() {
		return status;
	}

	public StatusV1 getStatusV1() {
		return status.getStatusV1();
	}

	public StatusV2 getStatusV2() {
		return status.getStatusV2();
	}

	public List<String> getReferences() {
		return references;
	}

	public void addReference(String reference) {
		references.add(reference);
	}
}