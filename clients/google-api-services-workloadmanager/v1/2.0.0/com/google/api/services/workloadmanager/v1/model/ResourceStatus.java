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

package com.google.api.services.workloadmanager.v1.model;

/**
 * Message describing resource status
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Workload Manager API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ResourceStatus extends com.google.api.client.json.GenericJson {

  /**
   * the new version of rule id if exists
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> rulesNewerVersions;

  /**
   * State of the resource
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * the new version of rule id if exists
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRulesNewerVersions() {
    return rulesNewerVersions;
  }

  /**
   * the new version of rule id if exists
   * @param rulesNewerVersions rulesNewerVersions or {@code null} for none
   */
  public ResourceStatus setRulesNewerVersions(java.util.List<java.lang.String> rulesNewerVersions) {
    this.rulesNewerVersions = rulesNewerVersions;
    return this;
  }

  /**
   * State of the resource
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * State of the resource
   * @param state state or {@code null} for none
   */
  public ResourceStatus setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public ResourceStatus set(String fieldName, Object value) {
    return (ResourceStatus) super.set(fieldName, value);
  }

  @Override
  public ResourceStatus clone() {
    return (ResourceStatus) super.clone();
  }

}
