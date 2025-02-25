/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.contentwarehouse.v1.model;

/**
 * A StringType configures a value whose type is intended to be arbitrary text.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Document AI Warehouse API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class KnowledgeAnswersStringType extends com.google.api.client.json.GenericJson {

  /**
   * Contains data about current schema remodelings at this ValueType level. For more information
   * see go/meaning-remodeling-framework.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NlpMeaningMeaningRemodelings remodelings;

  /**
   * If true, this value will match a single token. If false, this value will match any nonzero
   * number of tokens.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean singleToken;

  /**
   * Contains data about current schema remodelings at this ValueType level. For more information
   * see go/meaning-remodeling-framework.
   * @return value or {@code null} for none
   */
  public NlpMeaningMeaningRemodelings getRemodelings() {
    return remodelings;
  }

  /**
   * Contains data about current schema remodelings at this ValueType level. For more information
   * see go/meaning-remodeling-framework.
   * @param remodelings remodelings or {@code null} for none
   */
  public KnowledgeAnswersStringType setRemodelings(NlpMeaningMeaningRemodelings remodelings) {
    this.remodelings = remodelings;
    return this;
  }

  /**
   * If true, this value will match a single token. If false, this value will match any nonzero
   * number of tokens.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSingleToken() {
    return singleToken;
  }

  /**
   * If true, this value will match a single token. If false, this value will match any nonzero
   * number of tokens.
   * @param singleToken singleToken or {@code null} for none
   */
  public KnowledgeAnswersStringType setSingleToken(java.lang.Boolean singleToken) {
    this.singleToken = singleToken;
    return this;
  }

  @Override
  public KnowledgeAnswersStringType set(String fieldName, Object value) {
    return (KnowledgeAnswersStringType) super.set(fieldName, value);
  }

  @Override
  public KnowledgeAnswersStringType clone() {
    return (KnowledgeAnswersStringType) super.clone();
  }

}
