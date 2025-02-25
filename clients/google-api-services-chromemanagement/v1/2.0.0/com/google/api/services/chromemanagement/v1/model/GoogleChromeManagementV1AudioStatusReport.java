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

package com.google.api.services.chromemanagement.v1.model;

/**
 * Status data for storage. * This field is telemetry information and this will change over time as
 * the device is utilized. * Data for this field is controlled via policy:
 * [ReportDeviceAudioStatus](https://chromeenterprise.google/policies/#ReportDeviceAudioStatus) *
 * Data Collection Frequency: 10 minutes * Default Data Reporting Frequency: 3 hours - Policy
 * Controlled: Yes * Cache: If the device is offline, the collected data is stored locally, and will
 * be reported when the device is next online: No * Reported for affiliated users only: N/A
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Chrome Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleChromeManagementV1AudioStatusReport extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Active input device's name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String inputDevice;

  /**
   * Output only. Active input device's gain in [0, 100].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer inputGain;

  /**
   * Output only. Is active input device mute or not.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean inputMute;

  /**
   * Output only. Active output device's name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String outputDevice;

  /**
   * Output only. Is active output device mute or not.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean outputMute;

  /**
   * Output only. Active output device's volume in [0, 100].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer outputVolume;

  /**
   * Output only. Timestamp of when the sample was collected on device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String reportTime;

  /**
   * Output only. Active input device's name.
   * @return value or {@code null} for none
   */
  public java.lang.String getInputDevice() {
    return inputDevice;
  }

  /**
   * Output only. Active input device's name.
   * @param inputDevice inputDevice or {@code null} for none
   */
  public GoogleChromeManagementV1AudioStatusReport setInputDevice(java.lang.String inputDevice) {
    this.inputDevice = inputDevice;
    return this;
  }

  /**
   * Output only. Active input device's gain in [0, 100].
   * @return value or {@code null} for none
   */
  public java.lang.Integer getInputGain() {
    return inputGain;
  }

  /**
   * Output only. Active input device's gain in [0, 100].
   * @param inputGain inputGain or {@code null} for none
   */
  public GoogleChromeManagementV1AudioStatusReport setInputGain(java.lang.Integer inputGain) {
    this.inputGain = inputGain;
    return this;
  }

  /**
   * Output only. Is active input device mute or not.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getInputMute() {
    return inputMute;
  }

  /**
   * Output only. Is active input device mute or not.
   * @param inputMute inputMute or {@code null} for none
   */
  public GoogleChromeManagementV1AudioStatusReport setInputMute(java.lang.Boolean inputMute) {
    this.inputMute = inputMute;
    return this;
  }

  /**
   * Output only. Active output device's name.
   * @return value or {@code null} for none
   */
  public java.lang.String getOutputDevice() {
    return outputDevice;
  }

  /**
   * Output only. Active output device's name.
   * @param outputDevice outputDevice or {@code null} for none
   */
  public GoogleChromeManagementV1AudioStatusReport setOutputDevice(java.lang.String outputDevice) {
    this.outputDevice = outputDevice;
    return this;
  }

  /**
   * Output only. Is active output device mute or not.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getOutputMute() {
    return outputMute;
  }

  /**
   * Output only. Is active output device mute or not.
   * @param outputMute outputMute or {@code null} for none
   */
  public GoogleChromeManagementV1AudioStatusReport setOutputMute(java.lang.Boolean outputMute) {
    this.outputMute = outputMute;
    return this;
  }

  /**
   * Output only. Active output device's volume in [0, 100].
   * @return value or {@code null} for none
   */
  public java.lang.Integer getOutputVolume() {
    return outputVolume;
  }

  /**
   * Output only. Active output device's volume in [0, 100].
   * @param outputVolume outputVolume or {@code null} for none
   */
  public GoogleChromeManagementV1AudioStatusReport setOutputVolume(java.lang.Integer outputVolume) {
    this.outputVolume = outputVolume;
    return this;
  }

  /**
   * Output only. Timestamp of when the sample was collected on device.
   * @return value or {@code null} for none
   */
  public String getReportTime() {
    return reportTime;
  }

  /**
   * Output only. Timestamp of when the sample was collected on device.
   * @param reportTime reportTime or {@code null} for none
   */
  public GoogleChromeManagementV1AudioStatusReport setReportTime(String reportTime) {
    this.reportTime = reportTime;
    return this;
  }

  @Override
  public GoogleChromeManagementV1AudioStatusReport set(String fieldName, Object value) {
    return (GoogleChromeManagementV1AudioStatusReport) super.set(fieldName, value);
  }

  @Override
  public GoogleChromeManagementV1AudioStatusReport clone() {
    return (GoogleChromeManagementV1AudioStatusReport) super.clone();
  }

}
