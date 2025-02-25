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
 * This proto holds IPTC metadata. http://www.iptc.org/cms/site/index.html?channel=CH0099 Proto
 * field name is same with IPTC property name except which is clearly stated. Next Id: 63
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
public final class ImageExifIPTCMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Page URL about how to acquire this licensable image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String acquireLicensePage;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ImageExifIPTCMetadataArtwork> artwork;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ImageExifIPTCMetadataContactInfo contactinfo;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String copyrightNotice;

  /**
   * IPTC authorship & copyright related fields.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> creator;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creditLine;

  /**
   * Time (in seconds)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long dateCreated;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long dateExpired;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long dateReleased;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String event;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String headline;

  /**
   * PLUS field, not used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageSupplier;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String instructions;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> keywords;

  /**
   * License URL about how to distribute the image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String licenseUrl;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ImageExifIPTCMetadataLocation location;

  /**
   * Location of the camera
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ImageExifIPTCMetadataLocationInfo locationCreated;

  /**
   * Location shown on the image
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ImageExifIPTCMetadataLocationInfo> locationShown;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String modelReleaseStatus;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String propertyReleaseStatus;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rightsUsageTerms;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String source;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> supplementalCategories;

  /**
   * IPTC description related fields.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Page URL about how to acquire this licensable image.
   * @return value or {@code null} for none
   */
  public java.lang.String getAcquireLicensePage() {
    return acquireLicensePage;
  }

  /**
   * Page URL about how to acquire this licensable image.
   * @param acquireLicensePage acquireLicensePage or {@code null} for none
   */
  public ImageExifIPTCMetadata setAcquireLicensePage(java.lang.String acquireLicensePage) {
    this.acquireLicensePage = acquireLicensePage;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<ImageExifIPTCMetadataArtwork> getArtwork() {
    return artwork;
  }

  /**
   * @param artwork artwork or {@code null} for none
   */
  public ImageExifIPTCMetadata setArtwork(java.util.List<ImageExifIPTCMetadataArtwork> artwork) {
    this.artwork = artwork;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public ImageExifIPTCMetadataContactInfo getContactinfo() {
    return contactinfo;
  }

  /**
   * @param contactinfo contactinfo or {@code null} for none
   */
  public ImageExifIPTCMetadata setContactinfo(ImageExifIPTCMetadataContactInfo contactinfo) {
    this.contactinfo = contactinfo;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCopyrightNotice() {
    return copyrightNotice;
  }

  /**
   * @param copyrightNotice copyrightNotice or {@code null} for none
   */
  public ImageExifIPTCMetadata setCopyrightNotice(java.lang.String copyrightNotice) {
    this.copyrightNotice = copyrightNotice;
    return this;
  }

  /**
   * IPTC authorship & copyright related fields.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getCreator() {
    return creator;
  }

  /**
   * IPTC authorship & copyright related fields.
   * @param creator creator or {@code null} for none
   */
  public ImageExifIPTCMetadata setCreator(java.util.List<java.lang.String> creator) {
    this.creator = creator;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCreditLine() {
    return creditLine;
  }

  /**
   * @param creditLine creditLine or {@code null} for none
   */
  public ImageExifIPTCMetadata setCreditLine(java.lang.String creditLine) {
    this.creditLine = creditLine;
    return this;
  }

  /**
   * Time (in seconds)
   * @return value or {@code null} for none
   */
  public java.lang.Long getDateCreated() {
    return dateCreated;
  }

  /**
   * Time (in seconds)
   * @param dateCreated dateCreated or {@code null} for none
   */
  public ImageExifIPTCMetadata setDateCreated(java.lang.Long dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getDateExpired() {
    return dateExpired;
  }

  /**
   * @param dateExpired dateExpired or {@code null} for none
   */
  public ImageExifIPTCMetadata setDateExpired(java.lang.Long dateExpired) {
    this.dateExpired = dateExpired;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getDateReleased() {
    return dateReleased;
  }

  /**
   * @param dateReleased dateReleased or {@code null} for none
   */
  public ImageExifIPTCMetadata setDateReleased(java.lang.Long dateReleased) {
    this.dateReleased = dateReleased;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * @param description description or {@code null} for none
   */
  public ImageExifIPTCMetadata setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getEvent() {
    return event;
  }

  /**
   * @param event event or {@code null} for none
   */
  public ImageExifIPTCMetadata setEvent(java.lang.String event) {
    this.event = event;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getHeadline() {
    return headline;
  }

  /**
   * @param headline headline or {@code null} for none
   */
  public ImageExifIPTCMetadata setHeadline(java.lang.String headline) {
    this.headline = headline;
    return this;
  }

  /**
   * PLUS field, not used.
   * @return value or {@code null} for none
   */
  public java.lang.String getImageSupplier() {
    return imageSupplier;
  }

  /**
   * PLUS field, not used.
   * @param imageSupplier imageSupplier or {@code null} for none
   */
  public ImageExifIPTCMetadata setImageSupplier(java.lang.String imageSupplier) {
    this.imageSupplier = imageSupplier;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getInstructions() {
    return instructions;
  }

  /**
   * @param instructions instructions or {@code null} for none
   */
  public ImageExifIPTCMetadata setInstructions(java.lang.String instructions) {
    this.instructions = instructions;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getKeywords() {
    return keywords;
  }

  /**
   * @param keywords keywords or {@code null} for none
   */
  public ImageExifIPTCMetadata setKeywords(java.util.List<java.lang.String> keywords) {
    this.keywords = keywords;
    return this;
  }

  /**
   * License URL about how to distribute the image.
   * @return value or {@code null} for none
   */
  public java.lang.String getLicenseUrl() {
    return licenseUrl;
  }

  /**
   * License URL about how to distribute the image.
   * @param licenseUrl licenseUrl or {@code null} for none
   */
  public ImageExifIPTCMetadata setLicenseUrl(java.lang.String licenseUrl) {
    this.licenseUrl = licenseUrl;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public ImageExifIPTCMetadataLocation getLocation() {
    return location;
  }

  /**
   * @param location location or {@code null} for none
   */
  public ImageExifIPTCMetadata setLocation(ImageExifIPTCMetadataLocation location) {
    this.location = location;
    return this;
  }

  /**
   * Location of the camera
   * @return value or {@code null} for none
   */
  public ImageExifIPTCMetadataLocationInfo getLocationCreated() {
    return locationCreated;
  }

  /**
   * Location of the camera
   * @param locationCreated locationCreated or {@code null} for none
   */
  public ImageExifIPTCMetadata setLocationCreated(ImageExifIPTCMetadataLocationInfo locationCreated) {
    this.locationCreated = locationCreated;
    return this;
  }

  /**
   * Location shown on the image
   * @return value or {@code null} for none
   */
  public java.util.List<ImageExifIPTCMetadataLocationInfo> getLocationShown() {
    return locationShown;
  }

  /**
   * Location shown on the image
   * @param locationShown locationShown or {@code null} for none
   */
  public ImageExifIPTCMetadata setLocationShown(java.util.List<ImageExifIPTCMetadataLocationInfo> locationShown) {
    this.locationShown = locationShown;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getModelReleaseStatus() {
    return modelReleaseStatus;
  }

  /**
   * @param modelReleaseStatus modelReleaseStatus or {@code null} for none
   */
  public ImageExifIPTCMetadata setModelReleaseStatus(java.lang.String modelReleaseStatus) {
    this.modelReleaseStatus = modelReleaseStatus;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPropertyReleaseStatus() {
    return propertyReleaseStatus;
  }

  /**
   * @param propertyReleaseStatus propertyReleaseStatus or {@code null} for none
   */
  public ImageExifIPTCMetadata setPropertyReleaseStatus(java.lang.String propertyReleaseStatus) {
    this.propertyReleaseStatus = propertyReleaseStatus;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getRightsUsageTerms() {
    return rightsUsageTerms;
  }

  /**
   * @param rightsUsageTerms rightsUsageTerms or {@code null} for none
   */
  public ImageExifIPTCMetadata setRightsUsageTerms(java.lang.String rightsUsageTerms) {
    this.rightsUsageTerms = rightsUsageTerms;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSource() {
    return source;
  }

  /**
   * @param source source or {@code null} for none
   */
  public ImageExifIPTCMetadata setSource(java.lang.String source) {
    this.source = source;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSupplementalCategories() {
    return supplementalCategories;
  }

  /**
   * @param supplementalCategories supplementalCategories or {@code null} for none
   */
  public ImageExifIPTCMetadata setSupplementalCategories(java.util.List<java.lang.String> supplementalCategories) {
    this.supplementalCategories = supplementalCategories;
    return this;
  }

  /**
   * IPTC description related fields.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * IPTC description related fields.
   * @param title title or {@code null} for none
   */
  public ImageExifIPTCMetadata setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public ImageExifIPTCMetadata set(String fieldName, Object value) {
    return (ImageExifIPTCMetadata) super.set(fieldName, value);
  }

  @Override
  public ImageExifIPTCMetadata clone() {
    return (ImageExifIPTCMetadata) super.clone();
  }

}
