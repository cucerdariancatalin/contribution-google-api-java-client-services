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

package com.google.api.services.migrationcenter.v1alpha1.model;

/**
 * Compute Engine target shape descriptor.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Migration Center API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ComputeEngineShapeDescriptor extends com.google.api.client.json.GenericJson {

  /**
   * Number of logical cores.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer logicalCoreCount;

  /**
   * Compute Engine machine type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String machineType;

  /**
   * Memory in mebibytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer memoryMb;

  /**
   * Number of physical cores.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer physicalCoreCount;

  /**
   * Compute Engine machine series.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String series;

  /**
   * Number of logical cores.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getLogicalCoreCount() {
    return logicalCoreCount;
  }

  /**
   * Number of logical cores.
   * @param logicalCoreCount logicalCoreCount or {@code null} for none
   */
  public ComputeEngineShapeDescriptor setLogicalCoreCount(java.lang.Integer logicalCoreCount) {
    this.logicalCoreCount = logicalCoreCount;
    return this;
  }

  /**
   * Compute Engine machine type.
   * @return value or {@code null} for none
   */
  public java.lang.String getMachineType() {
    return machineType;
  }

  /**
   * Compute Engine machine type.
   * @param machineType machineType or {@code null} for none
   */
  public ComputeEngineShapeDescriptor setMachineType(java.lang.String machineType) {
    this.machineType = machineType;
    return this;
  }

  /**
   * Memory in mebibytes.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMemoryMb() {
    return memoryMb;
  }

  /**
   * Memory in mebibytes.
   * @param memoryMb memoryMb or {@code null} for none
   */
  public ComputeEngineShapeDescriptor setMemoryMb(java.lang.Integer memoryMb) {
    this.memoryMb = memoryMb;
    return this;
  }

  /**
   * Number of physical cores.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPhysicalCoreCount() {
    return physicalCoreCount;
  }

  /**
   * Number of physical cores.
   * @param physicalCoreCount physicalCoreCount or {@code null} for none
   */
  public ComputeEngineShapeDescriptor setPhysicalCoreCount(java.lang.Integer physicalCoreCount) {
    this.physicalCoreCount = physicalCoreCount;
    return this;
  }

  /**
   * Compute Engine machine series.
   * @return value or {@code null} for none
   */
  public java.lang.String getSeries() {
    return series;
  }

  /**
   * Compute Engine machine series.
   * @param series series or {@code null} for none
   */
  public ComputeEngineShapeDescriptor setSeries(java.lang.String series) {
    this.series = series;
    return this;
  }

  @Override
  public ComputeEngineShapeDescriptor set(String fieldName, Object value) {
    return (ComputeEngineShapeDescriptor) super.set(fieldName, value);
  }

  @Override
  public ComputeEngineShapeDescriptor clone() {
    return (ComputeEngineShapeDescriptor) super.clone();
  }

}
