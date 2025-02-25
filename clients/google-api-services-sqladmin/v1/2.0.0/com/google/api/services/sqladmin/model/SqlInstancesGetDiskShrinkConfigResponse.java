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

package com.google.api.services.sqladmin.model;

/**
 * Instance get disk shrink config response.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SqlInstancesGetDiskShrinkConfigResponse extends com.google.api.client.json.GenericJson {

  /**
   * This is always `sql#getDiskShrinkConfig`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The minimum size to which a disk can be shrunk in GigaBytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long minimalTargetSizeGb;

  /**
   * This is always `sql#getDiskShrinkConfig`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This is always `sql#getDiskShrinkConfig`.
   * @param kind kind or {@code null} for none
   */
  public SqlInstancesGetDiskShrinkConfigResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The minimum size to which a disk can be shrunk in GigaBytes.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMinimalTargetSizeGb() {
    return minimalTargetSizeGb;
  }

  /**
   * The minimum size to which a disk can be shrunk in GigaBytes.
   * @param minimalTargetSizeGb minimalTargetSizeGb or {@code null} for none
   */
  public SqlInstancesGetDiskShrinkConfigResponse setMinimalTargetSizeGb(java.lang.Long minimalTargetSizeGb) {
    this.minimalTargetSizeGb = minimalTargetSizeGb;
    return this;
  }

  @Override
  public SqlInstancesGetDiskShrinkConfigResponse set(String fieldName, Object value) {
    return (SqlInstancesGetDiskShrinkConfigResponse) super.set(fieldName, value);
  }

  @Override
  public SqlInstancesGetDiskShrinkConfigResponse clone() {
    return (SqlInstancesGetDiskShrinkConfigResponse) super.clone();
  }

}
