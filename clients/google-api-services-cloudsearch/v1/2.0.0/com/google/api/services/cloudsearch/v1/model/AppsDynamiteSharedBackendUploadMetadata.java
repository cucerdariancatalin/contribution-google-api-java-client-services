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

package com.google.api.services.cloudsearch.v1.model;

/**
 * Metadata used only in Dynamite backend for uploaded attachments.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppsDynamiteSharedBackendUploadMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Blobstore path for the uploaded attachment
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String blobPath;

  /**
   * The original file name for the content, not the full path.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentName;

  /**
   * Scotty reported content size by default.
   * http://google3/uploader/agent/scotty_agent.proto?l=101=140889785
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long contentSize;

  /**
   * Type is from Scotty's best_guess by default:
   * http://google3/uploader/agent/scotty_agent.proto?l=51=140889785
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentType;

  /**
   * The results of the Data Loss Prevention (DLP) scan of the attachment. DEPRECATED: use
   * dlp_scan_summary instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dlpScanOutcome;

  /**
   * Summary of a Data Loss Prevention (DLP) scan of the attachment. Attachments are evaluated in
   * the backend when they are uploaded.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DlpScanSummary dlpScanSummary;

  /**
   * GroupId to which this attachment is uploaded.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GroupId groupId;

  /**
   * If the uploaded file is a video that has been transcoded on the client side Next tag: 18
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isClientSideTranscodedVideo;

  /**
   * Original dimension of the content. Only set for image attachments.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppsDynamiteSharedDimension originalDimension;

  /**
   * The message id of a quote reply referencing this attachment. When present, this attachment has
   * been quoted in a reply message. Normally, the attachment is fetched through the message id in
   * the blob_path, but in the case of a quote reply, the blob_path would contain the quoted message
   * id. Thus this message id field is needed to fetch the quote reply message instead. This field
   * is conditionally populated at read time for quotes and never persisted in storage. See go
   * /message-quoting-attachments for more context.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MessageId quoteReplyMessageId;

  /**
   * The SHA256 hash of the attachment bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sha256;

  /**
   * User IP address at upload time. Ex. "123.1.2.3". Used by Ares abuse scanning.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uploadIp;

  /**
   * Timestamp of when user finished uploading the content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long uploadTimestampUsec;

  /**
   * VideoID of the video attachments. This ID shall meets the Youtube ID format of 16 hex
   * characters. For example, '4c14b8825af6059b' is a valid ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String videoId;

  /**
   * Full Blobstore ID for the video thumbnail.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String videoThumbnailBlobId;

  /**
   * Result for a virus scan.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String virusScanResult;

  /**
   * Blobstore path for the uploaded attachment
   * @return value or {@code null} for none
   */
  public java.lang.String getBlobPath() {
    return blobPath;
  }

  /**
   * Blobstore path for the uploaded attachment
   * @param blobPath blobPath or {@code null} for none
   */
  public AppsDynamiteSharedBackendUploadMetadata setBlobPath(java.lang.String blobPath) {
    this.blobPath = blobPath;
    return this;
  }

  /**
   * The original file name for the content, not the full path.
   * @return value or {@code null} for none
   */
  public java.lang.String getContentName() {
    return contentName;
  }

  /**
   * The original file name for the content, not the full path.
   * @param contentName contentName or {@code null} for none
   */
  public AppsDynamiteSharedBackendUploadMetadata setContentName(java.lang.String contentName) {
    this.contentName = contentName;
    return this;
  }

  /**
   * Scotty reported content size by default.
   * http://google3/uploader/agent/scotty_agent.proto?l=101=140889785
   * @return value or {@code null} for none
   */
  public java.lang.Long getContentSize() {
    return contentSize;
  }

  /**
   * Scotty reported content size by default.
   * http://google3/uploader/agent/scotty_agent.proto?l=101=140889785
   * @param contentSize contentSize or {@code null} for none
   */
  public AppsDynamiteSharedBackendUploadMetadata setContentSize(java.lang.Long contentSize) {
    this.contentSize = contentSize;
    return this;
  }

  /**
   * Type is from Scotty's best_guess by default:
   * http://google3/uploader/agent/scotty_agent.proto?l=51=140889785
   * @return value or {@code null} for none
   */
  public java.lang.String getContentType() {
    return contentType;
  }

  /**
   * Type is from Scotty's best_guess by default:
   * http://google3/uploader/agent/scotty_agent.proto?l=51=140889785
   * @param contentType contentType or {@code null} for none
   */
  public AppsDynamiteSharedBackendUploadMetadata setContentType(java.lang.String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * The results of the Data Loss Prevention (DLP) scan of the attachment. DEPRECATED: use
   * dlp_scan_summary instead.
   * @return value or {@code null} for none
   */
  public java.lang.String getDlpScanOutcome() {
    return dlpScanOutcome;
  }

  /**
   * The results of the Data Loss Prevention (DLP) scan of the attachment. DEPRECATED: use
   * dlp_scan_summary instead.
   * @param dlpScanOutcome dlpScanOutcome or {@code null} for none
   */
  public AppsDynamiteSharedBackendUploadMetadata setDlpScanOutcome(java.lang.String dlpScanOutcome) {
    this.dlpScanOutcome = dlpScanOutcome;
    return this;
  }

  /**
   * Summary of a Data Loss Prevention (DLP) scan of the attachment. Attachments are evaluated in
   * the backend when they are uploaded.
   * @return value or {@code null} for none
   */
  public DlpScanSummary getDlpScanSummary() {
    return dlpScanSummary;
  }

  /**
   * Summary of a Data Loss Prevention (DLP) scan of the attachment. Attachments are evaluated in
   * the backend when they are uploaded.
   * @param dlpScanSummary dlpScanSummary or {@code null} for none
   */
  public AppsDynamiteSharedBackendUploadMetadata setDlpScanSummary(DlpScanSummary dlpScanSummary) {
    this.dlpScanSummary = dlpScanSummary;
    return this;
  }

  /**
   * GroupId to which this attachment is uploaded.
   * @return value or {@code null} for none
   */
  public GroupId getGroupId() {
    return groupId;
  }

  /**
   * GroupId to which this attachment is uploaded.
   * @param groupId groupId or {@code null} for none
   */
  public AppsDynamiteSharedBackendUploadMetadata setGroupId(GroupId groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * If the uploaded file is a video that has been transcoded on the client side Next tag: 18
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsClientSideTranscodedVideo() {
    return isClientSideTranscodedVideo;
  }

  /**
   * If the uploaded file is a video that has been transcoded on the client side Next tag: 18
   * @param isClientSideTranscodedVideo isClientSideTranscodedVideo or {@code null} for none
   */
  public AppsDynamiteSharedBackendUploadMetadata setIsClientSideTranscodedVideo(java.lang.Boolean isClientSideTranscodedVideo) {
    this.isClientSideTranscodedVideo = isClientSideTranscodedVideo;
    return this;
  }

  /**
   * Original dimension of the content. Only set for image attachments.
   * @return value or {@code null} for none
   */
  public AppsDynamiteSharedDimension getOriginalDimension() {
    return originalDimension;
  }

  /**
   * Original dimension of the content. Only set for image attachments.
   * @param originalDimension originalDimension or {@code null} for none
   */
  public AppsDynamiteSharedBackendUploadMetadata setOriginalDimension(AppsDynamiteSharedDimension originalDimension) {
    this.originalDimension = originalDimension;
    return this;
  }

  /**
   * The message id of a quote reply referencing this attachment. When present, this attachment has
   * been quoted in a reply message. Normally, the attachment is fetched through the message id in
   * the blob_path, but in the case of a quote reply, the blob_path would contain the quoted message
   * id. Thus this message id field is needed to fetch the quote reply message instead. This field
   * is conditionally populated at read time for quotes and never persisted in storage. See go
   * /message-quoting-attachments for more context.
   * @return value or {@code null} for none
   */
  public MessageId getQuoteReplyMessageId() {
    return quoteReplyMessageId;
  }

  /**
   * The message id of a quote reply referencing this attachment. When present, this attachment has
   * been quoted in a reply message. Normally, the attachment is fetched through the message id in
   * the blob_path, but in the case of a quote reply, the blob_path would contain the quoted message
   * id. Thus this message id field is needed to fetch the quote reply message instead. This field
   * is conditionally populated at read time for quotes and never persisted in storage. See go
   * /message-quoting-attachments for more context.
   * @param quoteReplyMessageId quoteReplyMessageId or {@code null} for none
   */
  public AppsDynamiteSharedBackendUploadMetadata setQuoteReplyMessageId(MessageId quoteReplyMessageId) {
    this.quoteReplyMessageId = quoteReplyMessageId;
    return this;
  }

  /**
   * The SHA256 hash of the attachment bytes.
   * @see #decodeSha256()
   * @return value or {@code null} for none
   */
  public java.lang.String getSha256() {
    return sha256;
  }

  /**
   * The SHA256 hash of the attachment bytes.
   * @see #getSha256()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeSha256() {
    return com.google.api.client.util.Base64.decodeBase64(sha256);
  }

  /**
   * The SHA256 hash of the attachment bytes.
   * @see #encodeSha256()
   * @param sha256 sha256 or {@code null} for none
   */
  public AppsDynamiteSharedBackendUploadMetadata setSha256(java.lang.String sha256) {
    this.sha256 = sha256;
    return this;
  }

  /**
   * The SHA256 hash of the attachment bytes.
   * @see #setSha256()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public AppsDynamiteSharedBackendUploadMetadata encodeSha256(byte[] sha256) {
    this.sha256 = com.google.api.client.util.Base64.encodeBase64URLSafeString(sha256);
    return this;
  }

  /**
   * User IP address at upload time. Ex. "123.1.2.3". Used by Ares abuse scanning.
   * @return value or {@code null} for none
   */
  public java.lang.String getUploadIp() {
    return uploadIp;
  }

  /**
   * User IP address at upload time. Ex. "123.1.2.3". Used by Ares abuse scanning.
   * @param uploadIp uploadIp or {@code null} for none
   */
  public AppsDynamiteSharedBackendUploadMetadata setUploadIp(java.lang.String uploadIp) {
    this.uploadIp = uploadIp;
    return this;
  }

  /**
   * Timestamp of when user finished uploading the content.
   * @return value or {@code null} for none
   */
  public java.lang.Long getUploadTimestampUsec() {
    return uploadTimestampUsec;
  }

  /**
   * Timestamp of when user finished uploading the content.
   * @param uploadTimestampUsec uploadTimestampUsec or {@code null} for none
   */
  public AppsDynamiteSharedBackendUploadMetadata setUploadTimestampUsec(java.lang.Long uploadTimestampUsec) {
    this.uploadTimestampUsec = uploadTimestampUsec;
    return this;
  }

  /**
   * VideoID of the video attachments. This ID shall meets the Youtube ID format of 16 hex
   * characters. For example, '4c14b8825af6059b' is a valid ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getVideoId() {
    return videoId;
  }

  /**
   * VideoID of the video attachments. This ID shall meets the Youtube ID format of 16 hex
   * characters. For example, '4c14b8825af6059b' is a valid ID.
   * @param videoId videoId or {@code null} for none
   */
  public AppsDynamiteSharedBackendUploadMetadata setVideoId(java.lang.String videoId) {
    this.videoId = videoId;
    return this;
  }

  /**
   * Full Blobstore ID for the video thumbnail.
   * @return value or {@code null} for none
   */
  public java.lang.String getVideoThumbnailBlobId() {
    return videoThumbnailBlobId;
  }

  /**
   * Full Blobstore ID for the video thumbnail.
   * @param videoThumbnailBlobId videoThumbnailBlobId or {@code null} for none
   */
  public AppsDynamiteSharedBackendUploadMetadata setVideoThumbnailBlobId(java.lang.String videoThumbnailBlobId) {
    this.videoThumbnailBlobId = videoThumbnailBlobId;
    return this;
  }

  /**
   * Result for a virus scan.
   * @return value or {@code null} for none
   */
  public java.lang.String getVirusScanResult() {
    return virusScanResult;
  }

  /**
   * Result for a virus scan.
   * @param virusScanResult virusScanResult or {@code null} for none
   */
  public AppsDynamiteSharedBackendUploadMetadata setVirusScanResult(java.lang.String virusScanResult) {
    this.virusScanResult = virusScanResult;
    return this;
  }

  @Override
  public AppsDynamiteSharedBackendUploadMetadata set(String fieldName, Object value) {
    return (AppsDynamiteSharedBackendUploadMetadata) super.set(fieldName, value);
  }

  @Override
  public AppsDynamiteSharedBackendUploadMetadata clone() {
    return (AppsDynamiteSharedBackendUploadMetadata) super.clone();
  }

}
