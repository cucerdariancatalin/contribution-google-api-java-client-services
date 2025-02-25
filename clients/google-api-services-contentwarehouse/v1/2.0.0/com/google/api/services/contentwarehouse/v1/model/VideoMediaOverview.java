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
 * Next ID: 19 IMPORTANT: This file is used in scattered directories, such that it is risky to add
 * values to any enumerated type. (First of all, compilation breaks on switch statements without
 * default clauses.) Run a global tap presubmit: tap_presubmit -p all --train -c before submitting.
 * Also check out the blame layer of previous updates for hints on what other files to changes.
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
public final class VideoMediaOverview extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String aspectRatio;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<VideoMediaOverviewAudioOverview> audioOverview;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String authoringTool;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String colorDynamicRange;

  /**
   * Creation timestamp of this media_info, in Unix timestamp since epoch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long creationTimeStampUsec;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<VideoMediaOverviewDataOverview> dataOverview;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String frameRate;

  /**
   * Currently used by originals replacement pipeline to exclude all videos containing chapter info.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hasChapters;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VideoMediaOverviewMediaClipInfoOverview mediaClipInfoOverview;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String orientation;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String origin;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projection;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resolution;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String spatialAudioMode;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stereoMode;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<VideoMediaOverviewTimedTextOverview> timedtextOverview;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<VideoMediaOverviewVideoOverview> videoOverview;

  /**
   * This only applies when: projection = PROJECTION_PARTIALLY_SPHERICAL
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String wallyMeshType;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getAspectRatio() {
    return aspectRatio;
  }

  /**
   * @param aspectRatio aspectRatio or {@code null} for none
   */
  public VideoMediaOverview setAspectRatio(java.lang.String aspectRatio) {
    this.aspectRatio = aspectRatio;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<VideoMediaOverviewAudioOverview> getAudioOverview() {
    return audioOverview;
  }

  /**
   * @param audioOverview audioOverview or {@code null} for none
   */
  public VideoMediaOverview setAudioOverview(java.util.List<VideoMediaOverviewAudioOverview> audioOverview) {
    this.audioOverview = audioOverview;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getAuthoringTool() {
    return authoringTool;
  }

  /**
   * @param authoringTool authoringTool or {@code null} for none
   */
  public VideoMediaOverview setAuthoringTool(java.lang.String authoringTool) {
    this.authoringTool = authoringTool;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getColorDynamicRange() {
    return colorDynamicRange;
  }

  /**
   * @param colorDynamicRange colorDynamicRange or {@code null} for none
   */
  public VideoMediaOverview setColorDynamicRange(java.lang.String colorDynamicRange) {
    this.colorDynamicRange = colorDynamicRange;
    return this;
  }

  /**
   * Creation timestamp of this media_info, in Unix timestamp since epoch.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCreationTimeStampUsec() {
    return creationTimeStampUsec;
  }

  /**
   * Creation timestamp of this media_info, in Unix timestamp since epoch.
   * @param creationTimeStampUsec creationTimeStampUsec or {@code null} for none
   */
  public VideoMediaOverview setCreationTimeStampUsec(java.lang.Long creationTimeStampUsec) {
    this.creationTimeStampUsec = creationTimeStampUsec;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<VideoMediaOverviewDataOverview> getDataOverview() {
    return dataOverview;
  }

  /**
   * @param dataOverview dataOverview or {@code null} for none
   */
  public VideoMediaOverview setDataOverview(java.util.List<VideoMediaOverviewDataOverview> dataOverview) {
    this.dataOverview = dataOverview;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getFrameRate() {
    return frameRate;
  }

  /**
   * @param frameRate frameRate or {@code null} for none
   */
  public VideoMediaOverview setFrameRate(java.lang.String frameRate) {
    this.frameRate = frameRate;
    return this;
  }

  /**
   * Currently used by originals replacement pipeline to exclude all videos containing chapter info.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHasChapters() {
    return hasChapters;
  }

  /**
   * Currently used by originals replacement pipeline to exclude all videos containing chapter info.
   * @param hasChapters hasChapters or {@code null} for none
   */
  public VideoMediaOverview setHasChapters(java.lang.Boolean hasChapters) {
    this.hasChapters = hasChapters;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public VideoMediaOverviewMediaClipInfoOverview getMediaClipInfoOverview() {
    return mediaClipInfoOverview;
  }

  /**
   * @param mediaClipInfoOverview mediaClipInfoOverview or {@code null} for none
   */
  public VideoMediaOverview setMediaClipInfoOverview(VideoMediaOverviewMediaClipInfoOverview mediaClipInfoOverview) {
    this.mediaClipInfoOverview = mediaClipInfoOverview;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getOrientation() {
    return orientation;
  }

  /**
   * @param orientation orientation or {@code null} for none
   */
  public VideoMediaOverview setOrientation(java.lang.String orientation) {
    this.orientation = orientation;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getOrigin() {
    return origin;
  }

  /**
   * @param origin origin or {@code null} for none
   */
  public VideoMediaOverview setOrigin(java.lang.String origin) {
    this.origin = origin;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getProjection() {
    return projection;
  }

  /**
   * @param projection projection or {@code null} for none
   */
  public VideoMediaOverview setProjection(java.lang.String projection) {
    this.projection = projection;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getResolution() {
    return resolution;
  }

  /**
   * @param resolution resolution or {@code null} for none
   */
  public VideoMediaOverview setResolution(java.lang.String resolution) {
    this.resolution = resolution;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSpatialAudioMode() {
    return spatialAudioMode;
  }

  /**
   * @param spatialAudioMode spatialAudioMode or {@code null} for none
   */
  public VideoMediaOverview setSpatialAudioMode(java.lang.String spatialAudioMode) {
    this.spatialAudioMode = spatialAudioMode;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getStereoMode() {
    return stereoMode;
  }

  /**
   * @param stereoMode stereoMode or {@code null} for none
   */
  public VideoMediaOverview setStereoMode(java.lang.String stereoMode) {
    this.stereoMode = stereoMode;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<VideoMediaOverviewTimedTextOverview> getTimedtextOverview() {
    return timedtextOverview;
  }

  /**
   * @param timedtextOverview timedtextOverview or {@code null} for none
   */
  public VideoMediaOverview setTimedtextOverview(java.util.List<VideoMediaOverviewTimedTextOverview> timedtextOverview) {
    this.timedtextOverview = timedtextOverview;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<VideoMediaOverviewVideoOverview> getVideoOverview() {
    return videoOverview;
  }

  /**
   * @param videoOverview videoOverview or {@code null} for none
   */
  public VideoMediaOverview setVideoOverview(java.util.List<VideoMediaOverviewVideoOverview> videoOverview) {
    this.videoOverview = videoOverview;
    return this;
  }

  /**
   * This only applies when: projection = PROJECTION_PARTIALLY_SPHERICAL
   * @return value or {@code null} for none
   */
  public java.lang.String getWallyMeshType() {
    return wallyMeshType;
  }

  /**
   * This only applies when: projection = PROJECTION_PARTIALLY_SPHERICAL
   * @param wallyMeshType wallyMeshType or {@code null} for none
   */
  public VideoMediaOverview setWallyMeshType(java.lang.String wallyMeshType) {
    this.wallyMeshType = wallyMeshType;
    return this;
  }

  @Override
  public VideoMediaOverview set(String fieldName, Object value) {
    return (VideoMediaOverview) super.set(fieldName, value);
  }

  @Override
  public VideoMediaOverview clone() {
    return (VideoMediaOverview) super.clone();
  }

}
