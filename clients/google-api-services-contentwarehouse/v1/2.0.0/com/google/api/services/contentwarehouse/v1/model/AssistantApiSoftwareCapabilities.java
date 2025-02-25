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
 * These capabilities represent what software features the client supports. This should be
 * determined based on the client's various software versions (OS, GSA version, etc). Next ID: 27
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
public final class AssistantApiSoftwareCapabilities extends com.google.api.client.json.GenericJson {

  /**
   * IMPORTANT: Only one of AppCapabilities and AppCapabilitiesDelta should be in the
   * SoftwareCapabilities. In the edge case if the client sends up both AppCapabilities and
   * AppCapabilitiesDelta, AppCapabilitiesDelta is ignored. Complete list of app capabilities.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AssistantApiAppCapabilities> appCapabilities;

  static {
    // hack to force ProGuard to consider AssistantApiAppCapabilities used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AssistantApiAppCapabilities.class);
  }

  /**
   * Incremental update for app capabilities.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AssistantApiAppCapabilitiesDelta> appCapabilitiesDelta;

  static {
    // hack to force ProGuard to consider AssistantApiAppCapabilitiesDelta used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AssistantApiAppCapabilitiesDelta.class);
  }

  /**
   * App integrations settings for each packge name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, AssistantApiAppIntegrationsSettings> appIntegrationsSettings;

  static {
    // hack to force ProGuard to consider AssistantApiAppIntegrationsSettings used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AssistantApiAppIntegrationsSettings.class);
  }

  /**
   * Capabilities related to Assistant on Auto surfaces.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AssistantApiCarAssistantCapabilities carAssistantCapabilities;

  /**
   * Capabilities related to clock functionality, like alarms, timers, etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AssistantApiClockCapabilities clockCapabilities;

  /**
   * A top-level version of Conversation protocol where the versions are explicitly defined at go
   * /conversation-versions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AssistantApiSupportedConversationVersion conversationVersion;

  /**
   * For torus x-device execution support
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AssistantApiCrossDeviceExecutionCapability crossDeviceExecutionCapabilities;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AssistantApiGacsCapabilities gacsCapabilities;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AssistantApiGcmCapabilities gcmCapabilities;

  /**
   * Google Home app features.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AssistantApiCapabilitiesHomeAppCapabilities homeAppCapabilities;

  /**
   * Capabilities related to live TV channels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AssistantApiLiveTvChannelCapabilities liveTvChannelCapabilities;

  /**
   * List of actions OEM supports. This includes built-in actions and custom actions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AssistantApiOemCapabilities oemCapabilities;

  /**
   * on-device Assistant capabilities
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AssistantApiOnDeviceAssistantCapabilities onDeviceAssistantCapabilities;

  /**
   * Capability bits for on-device Smart Home. go/framework-for-local-semex
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AssistantApiOnDeviceSmartHomeCapabilities onDeviceSmartHomeCapabilities;

  /**
   * Reflects the storage capabilities on the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AssistantApiOnDeviceStorageCapabilities onDeviceStorageCapabilities;

  /**
   * The operating system of the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operatingSystem;

  /**
   * An ordered list containing the live tv providers available in the client. The order of the
   * providers reflects the ranking in the client and will be respected by server as well.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AssistantApiLiveTvProvider> orderedLiveTvProviders;

  static {
    // hack to force ProGuard to consider AssistantApiLiveTvProvider used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AssistantApiLiveTvProvider.class);
  }

  /**
   * The Soli capabilities on Elaine. go/dingo-dc-software
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AssistantApiSelinaCapabilites selinaCapabilities;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AssistantApiSettingsAppCapabilities settingsAppCapabilities;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AssistantApiSupportedClientOp> supportedClientOp;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AssistantApiSupportedFeatures supportedFeatures;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AssistantApiSupportedProtocolVersion supportedMsgVersion;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AssistantApiSupportedProviderTypes supportedProviderTypes;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AssistantApiSurfaceProperties surfaceProperties;

  /**
   * IMPORTANT: Only one of AppCapabilities and AppCapabilitiesDelta should be in the
   * SoftwareCapabilities. In the edge case if the client sends up both AppCapabilities and
   * AppCapabilitiesDelta, AppCapabilitiesDelta is ignored. Complete list of app capabilities.
   * @return value or {@code null} for none
   */
  public java.util.List<AssistantApiAppCapabilities> getAppCapabilities() {
    return appCapabilities;
  }

  /**
   * IMPORTANT: Only one of AppCapabilities and AppCapabilitiesDelta should be in the
   * SoftwareCapabilities. In the edge case if the client sends up both AppCapabilities and
   * AppCapabilitiesDelta, AppCapabilitiesDelta is ignored. Complete list of app capabilities.
   * @param appCapabilities appCapabilities or {@code null} for none
   */
  public AssistantApiSoftwareCapabilities setAppCapabilities(java.util.List<AssistantApiAppCapabilities> appCapabilities) {
    this.appCapabilities = appCapabilities;
    return this;
  }

  /**
   * Incremental update for app capabilities.
   * @return value or {@code null} for none
   */
  public java.util.List<AssistantApiAppCapabilitiesDelta> getAppCapabilitiesDelta() {
    return appCapabilitiesDelta;
  }

  /**
   * Incremental update for app capabilities.
   * @param appCapabilitiesDelta appCapabilitiesDelta or {@code null} for none
   */
  public AssistantApiSoftwareCapabilities setAppCapabilitiesDelta(java.util.List<AssistantApiAppCapabilitiesDelta> appCapabilitiesDelta) {
    this.appCapabilitiesDelta = appCapabilitiesDelta;
    return this;
  }

  /**
   * App integrations settings for each packge name.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, AssistantApiAppIntegrationsSettings> getAppIntegrationsSettings() {
    return appIntegrationsSettings;
  }

  /**
   * App integrations settings for each packge name.
   * @param appIntegrationsSettings appIntegrationsSettings or {@code null} for none
   */
  public AssistantApiSoftwareCapabilities setAppIntegrationsSettings(java.util.Map<String, AssistantApiAppIntegrationsSettings> appIntegrationsSettings) {
    this.appIntegrationsSettings = appIntegrationsSettings;
    return this;
  }

  /**
   * Capabilities related to Assistant on Auto surfaces.
   * @return value or {@code null} for none
   */
  public AssistantApiCarAssistantCapabilities getCarAssistantCapabilities() {
    return carAssistantCapabilities;
  }

  /**
   * Capabilities related to Assistant on Auto surfaces.
   * @param carAssistantCapabilities carAssistantCapabilities or {@code null} for none
   */
  public AssistantApiSoftwareCapabilities setCarAssistantCapabilities(AssistantApiCarAssistantCapabilities carAssistantCapabilities) {
    this.carAssistantCapabilities = carAssistantCapabilities;
    return this;
  }

  /**
   * Capabilities related to clock functionality, like alarms, timers, etc.
   * @return value or {@code null} for none
   */
  public AssistantApiClockCapabilities getClockCapabilities() {
    return clockCapabilities;
  }

  /**
   * Capabilities related to clock functionality, like alarms, timers, etc.
   * @param clockCapabilities clockCapabilities or {@code null} for none
   */
  public AssistantApiSoftwareCapabilities setClockCapabilities(AssistantApiClockCapabilities clockCapabilities) {
    this.clockCapabilities = clockCapabilities;
    return this;
  }

  /**
   * A top-level version of Conversation protocol where the versions are explicitly defined at go
   * /conversation-versions.
   * @return value or {@code null} for none
   */
  public AssistantApiSupportedConversationVersion getConversationVersion() {
    return conversationVersion;
  }

  /**
   * A top-level version of Conversation protocol where the versions are explicitly defined at go
   * /conversation-versions.
   * @param conversationVersion conversationVersion or {@code null} for none
   */
  public AssistantApiSoftwareCapabilities setConversationVersion(AssistantApiSupportedConversationVersion conversationVersion) {
    this.conversationVersion = conversationVersion;
    return this;
  }

  /**
   * For torus x-device execution support
   * @return value or {@code null} for none
   */
  public AssistantApiCrossDeviceExecutionCapability getCrossDeviceExecutionCapabilities() {
    return crossDeviceExecutionCapabilities;
  }

  /**
   * For torus x-device execution support
   * @param crossDeviceExecutionCapabilities crossDeviceExecutionCapabilities or {@code null} for none
   */
  public AssistantApiSoftwareCapabilities setCrossDeviceExecutionCapabilities(AssistantApiCrossDeviceExecutionCapability crossDeviceExecutionCapabilities) {
    this.crossDeviceExecutionCapabilities = crossDeviceExecutionCapabilities;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public AssistantApiGacsCapabilities getGacsCapabilities() {
    return gacsCapabilities;
  }

  /**
   * @param gacsCapabilities gacsCapabilities or {@code null} for none
   */
  public AssistantApiSoftwareCapabilities setGacsCapabilities(AssistantApiGacsCapabilities gacsCapabilities) {
    this.gacsCapabilities = gacsCapabilities;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public AssistantApiGcmCapabilities getGcmCapabilities() {
    return gcmCapabilities;
  }

  /**
   * @param gcmCapabilities gcmCapabilities or {@code null} for none
   */
  public AssistantApiSoftwareCapabilities setGcmCapabilities(AssistantApiGcmCapabilities gcmCapabilities) {
    this.gcmCapabilities = gcmCapabilities;
    return this;
  }

  /**
   * Google Home app features.
   * @return value or {@code null} for none
   */
  public AssistantApiCapabilitiesHomeAppCapabilities getHomeAppCapabilities() {
    return homeAppCapabilities;
  }

  /**
   * Google Home app features.
   * @param homeAppCapabilities homeAppCapabilities or {@code null} for none
   */
  public AssistantApiSoftwareCapabilities setHomeAppCapabilities(AssistantApiCapabilitiesHomeAppCapabilities homeAppCapabilities) {
    this.homeAppCapabilities = homeAppCapabilities;
    return this;
  }

  /**
   * Capabilities related to live TV channels.
   * @return value or {@code null} for none
   */
  public AssistantApiLiveTvChannelCapabilities getLiveTvChannelCapabilities() {
    return liveTvChannelCapabilities;
  }

  /**
   * Capabilities related to live TV channels.
   * @param liveTvChannelCapabilities liveTvChannelCapabilities or {@code null} for none
   */
  public AssistantApiSoftwareCapabilities setLiveTvChannelCapabilities(AssistantApiLiveTvChannelCapabilities liveTvChannelCapabilities) {
    this.liveTvChannelCapabilities = liveTvChannelCapabilities;
    return this;
  }

  /**
   * List of actions OEM supports. This includes built-in actions and custom actions.
   * @return value or {@code null} for none
   */
  public AssistantApiOemCapabilities getOemCapabilities() {
    return oemCapabilities;
  }

  /**
   * List of actions OEM supports. This includes built-in actions and custom actions.
   * @param oemCapabilities oemCapabilities or {@code null} for none
   */
  public AssistantApiSoftwareCapabilities setOemCapabilities(AssistantApiOemCapabilities oemCapabilities) {
    this.oemCapabilities = oemCapabilities;
    return this;
  }

  /**
   * on-device Assistant capabilities
   * @return value or {@code null} for none
   */
  public AssistantApiOnDeviceAssistantCapabilities getOnDeviceAssistantCapabilities() {
    return onDeviceAssistantCapabilities;
  }

  /**
   * on-device Assistant capabilities
   * @param onDeviceAssistantCapabilities onDeviceAssistantCapabilities or {@code null} for none
   */
  public AssistantApiSoftwareCapabilities setOnDeviceAssistantCapabilities(AssistantApiOnDeviceAssistantCapabilities onDeviceAssistantCapabilities) {
    this.onDeviceAssistantCapabilities = onDeviceAssistantCapabilities;
    return this;
  }

  /**
   * Capability bits for on-device Smart Home. go/framework-for-local-semex
   * @return value or {@code null} for none
   */
  public AssistantApiOnDeviceSmartHomeCapabilities getOnDeviceSmartHomeCapabilities() {
    return onDeviceSmartHomeCapabilities;
  }

  /**
   * Capability bits for on-device Smart Home. go/framework-for-local-semex
   * @param onDeviceSmartHomeCapabilities onDeviceSmartHomeCapabilities or {@code null} for none
   */
  public AssistantApiSoftwareCapabilities setOnDeviceSmartHomeCapabilities(AssistantApiOnDeviceSmartHomeCapabilities onDeviceSmartHomeCapabilities) {
    this.onDeviceSmartHomeCapabilities = onDeviceSmartHomeCapabilities;
    return this;
  }

  /**
   * Reflects the storage capabilities on the device.
   * @return value or {@code null} for none
   */
  public AssistantApiOnDeviceStorageCapabilities getOnDeviceStorageCapabilities() {
    return onDeviceStorageCapabilities;
  }

  /**
   * Reflects the storage capabilities on the device.
   * @param onDeviceStorageCapabilities onDeviceStorageCapabilities or {@code null} for none
   */
  public AssistantApiSoftwareCapabilities setOnDeviceStorageCapabilities(AssistantApiOnDeviceStorageCapabilities onDeviceStorageCapabilities) {
    this.onDeviceStorageCapabilities = onDeviceStorageCapabilities;
    return this;
  }

  /**
   * The operating system of the device.
   * @return value or {@code null} for none
   */
  public java.lang.String getOperatingSystem() {
    return operatingSystem;
  }

  /**
   * The operating system of the device.
   * @param operatingSystem operatingSystem or {@code null} for none
   */
  public AssistantApiSoftwareCapabilities setOperatingSystem(java.lang.String operatingSystem) {
    this.operatingSystem = operatingSystem;
    return this;
  }

  /**
   * An ordered list containing the live tv providers available in the client. The order of the
   * providers reflects the ranking in the client and will be respected by server as well.
   * @return value or {@code null} for none
   */
  public java.util.List<AssistantApiLiveTvProvider> getOrderedLiveTvProviders() {
    return orderedLiveTvProviders;
  }

  /**
   * An ordered list containing the live tv providers available in the client. The order of the
   * providers reflects the ranking in the client and will be respected by server as well.
   * @param orderedLiveTvProviders orderedLiveTvProviders or {@code null} for none
   */
  public AssistantApiSoftwareCapabilities setOrderedLiveTvProviders(java.util.List<AssistantApiLiveTvProvider> orderedLiveTvProviders) {
    this.orderedLiveTvProviders = orderedLiveTvProviders;
    return this;
  }

  /**
   * The Soli capabilities on Elaine. go/dingo-dc-software
   * @return value or {@code null} for none
   */
  public AssistantApiSelinaCapabilites getSelinaCapabilities() {
    return selinaCapabilities;
  }

  /**
   * The Soli capabilities on Elaine. go/dingo-dc-software
   * @param selinaCapabilities selinaCapabilities or {@code null} for none
   */
  public AssistantApiSoftwareCapabilities setSelinaCapabilities(AssistantApiSelinaCapabilites selinaCapabilities) {
    this.selinaCapabilities = selinaCapabilities;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public AssistantApiSettingsAppCapabilities getSettingsAppCapabilities() {
    return settingsAppCapabilities;
  }

  /**
   * @param settingsAppCapabilities settingsAppCapabilities or {@code null} for none
   */
  public AssistantApiSoftwareCapabilities setSettingsAppCapabilities(AssistantApiSettingsAppCapabilities settingsAppCapabilities) {
    this.settingsAppCapabilities = settingsAppCapabilities;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<AssistantApiSupportedClientOp> getSupportedClientOp() {
    return supportedClientOp;
  }

  /**
   * @param supportedClientOp supportedClientOp or {@code null} for none
   */
  public AssistantApiSoftwareCapabilities setSupportedClientOp(java.util.List<AssistantApiSupportedClientOp> supportedClientOp) {
    this.supportedClientOp = supportedClientOp;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public AssistantApiSupportedFeatures getSupportedFeatures() {
    return supportedFeatures;
  }

  /**
   * @param supportedFeatures supportedFeatures or {@code null} for none
   */
  public AssistantApiSoftwareCapabilities setSupportedFeatures(AssistantApiSupportedFeatures supportedFeatures) {
    this.supportedFeatures = supportedFeatures;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public AssistantApiSupportedProtocolVersion getSupportedMsgVersion() {
    return supportedMsgVersion;
  }

  /**
   * @param supportedMsgVersion supportedMsgVersion or {@code null} for none
   */
  public AssistantApiSoftwareCapabilities setSupportedMsgVersion(AssistantApiSupportedProtocolVersion supportedMsgVersion) {
    this.supportedMsgVersion = supportedMsgVersion;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public AssistantApiSupportedProviderTypes getSupportedProviderTypes() {
    return supportedProviderTypes;
  }

  /**
   * @param supportedProviderTypes supportedProviderTypes or {@code null} for none
   */
  public AssistantApiSoftwareCapabilities setSupportedProviderTypes(AssistantApiSupportedProviderTypes supportedProviderTypes) {
    this.supportedProviderTypes = supportedProviderTypes;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public AssistantApiSurfaceProperties getSurfaceProperties() {
    return surfaceProperties;
  }

  /**
   * @param surfaceProperties surfaceProperties or {@code null} for none
   */
  public AssistantApiSoftwareCapabilities setSurfaceProperties(AssistantApiSurfaceProperties surfaceProperties) {
    this.surfaceProperties = surfaceProperties;
    return this;
  }

  @Override
  public AssistantApiSoftwareCapabilities set(String fieldName, Object value) {
    return (AssistantApiSoftwareCapabilities) super.set(fieldName, value);
  }

  @Override
  public AssistantApiSoftwareCapabilities clone() {
    return (AssistantApiSoftwareCapabilities) super.clone();
  }

}
