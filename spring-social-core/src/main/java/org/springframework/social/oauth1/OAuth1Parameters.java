/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.oauth1;

import java.util.List;
import java.util.Map;

import org.springframework.social.support.AbstractOAuthParameters;

/**
 * Parameters for building an OAuth1 authorize URL.
 * @author Keith Donald
 * @see OAuth1Operations#buildAuthorizeUrl(String, OAuth1Parameters)
 */
public final class OAuth1Parameters extends AbstractOAuthParameters {

	private static final String OAUTH_CALLBACK = "oauth_callback";
	
	/**
	 * Shared instance for passing zero authorization parameters (accepted for OAuth 1.0a-based flows).
	 */
	public static final OAuth1Parameters NONE = new OAuth1Parameters(null);

	public OAuth1Parameters(Map<String, List<String>> parameters) {
		super(parameters);
	}
	
	/**
	 * The authorization callback url; this value must be included for OAuth 1.0 providers (and NOT for OAuth 1.0a)
	 */
	public String getCallbackUrl() {
		return getFirst(OAUTH_CALLBACK);
	}
	
	public void setCallbackUrl(String callbackUrl) {
		set(OAUTH_CALLBACK, callbackUrl);
	}
	
}
