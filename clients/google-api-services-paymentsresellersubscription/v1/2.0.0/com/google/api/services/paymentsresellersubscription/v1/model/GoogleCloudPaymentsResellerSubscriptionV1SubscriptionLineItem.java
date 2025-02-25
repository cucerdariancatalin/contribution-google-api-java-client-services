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

package com.google.api.services.paymentsresellersubscription.v1.model;

/**
 * Individual line item definition of a subscription.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Payments Reseller Subscription API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudPaymentsResellerSubscriptionV1SubscriptionLineItem extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The price of the product/service in this line item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudPaymentsResellerSubscriptionV1Amount amount;

  /**
   * Output only. Description of this line item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Output only. It is set only if the line item has its own free trial applied. End time of the
   * line item free trial period, in ISO 8061 format. For example, "2019-08-31T17:28:54.564Z". It
   * will be set the same as createTime if no free trial promotion is specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lineItemFreeTrialEndTime;

  /**
   * Optional. The promotions applied on the line item. It can be: - a free trial promotion, which
   * overrides the subscription-level free trial promotion. - an introductory pricing promotion.
   * When used as input in Create or Provision API, specify its resource name only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudPaymentsResellerSubscriptionV1SubscriptionPromotionSpec> lineItemPromotionSpecs;

  /**
   * Output only. Details only set for a ONE_TIME recurrence line item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudPaymentsResellerSubscriptionV1SubscriptionLineItemOneTimeRecurrenceDetails oneTimeRecurrenceDetails;

  /**
   * Required. Product resource name that identifies one the line item The format is
   * 'partners/{partner_id}/products/{product_id}'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String product;

  /**
   * Optional. Product specific payload for this line item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudPaymentsResellerSubscriptionV1ProductPayload productPayload;

  /**
   * Output only. The recurrence type of the line item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String recurrenceType;

  /**
   * Output only. The state of the line item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. The price of the product/service in this line item.
   * @return value or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1Amount getAmount() {
    return amount;
  }

  /**
   * Output only. The price of the product/service in this line item.
   * @param amount amount or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1SubscriptionLineItem setAmount(GoogleCloudPaymentsResellerSubscriptionV1Amount amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Output only. Description of this line item.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Output only. Description of this line item.
   * @param description description or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1SubscriptionLineItem setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Output only. It is set only if the line item has its own free trial applied. End time of the
   * line item free trial period, in ISO 8061 format. For example, "2019-08-31T17:28:54.564Z". It
   * will be set the same as createTime if no free trial promotion is specified.
   * @return value or {@code null} for none
   */
  public String getLineItemFreeTrialEndTime() {
    return lineItemFreeTrialEndTime;
  }

  /**
   * Output only. It is set only if the line item has its own free trial applied. End time of the
   * line item free trial period, in ISO 8061 format. For example, "2019-08-31T17:28:54.564Z". It
   * will be set the same as createTime if no free trial promotion is specified.
   * @param lineItemFreeTrialEndTime lineItemFreeTrialEndTime or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1SubscriptionLineItem setLineItemFreeTrialEndTime(String lineItemFreeTrialEndTime) {
    this.lineItemFreeTrialEndTime = lineItemFreeTrialEndTime;
    return this;
  }

  /**
   * Optional. The promotions applied on the line item. It can be: - a free trial promotion, which
   * overrides the subscription-level free trial promotion. - an introductory pricing promotion.
   * When used as input in Create or Provision API, specify its resource name only.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudPaymentsResellerSubscriptionV1SubscriptionPromotionSpec> getLineItemPromotionSpecs() {
    return lineItemPromotionSpecs;
  }

  /**
   * Optional. The promotions applied on the line item. It can be: - a free trial promotion, which
   * overrides the subscription-level free trial promotion. - an introductory pricing promotion.
   * When used as input in Create or Provision API, specify its resource name only.
   * @param lineItemPromotionSpecs lineItemPromotionSpecs or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1SubscriptionLineItem setLineItemPromotionSpecs(java.util.List<GoogleCloudPaymentsResellerSubscriptionV1SubscriptionPromotionSpec> lineItemPromotionSpecs) {
    this.lineItemPromotionSpecs = lineItemPromotionSpecs;
    return this;
  }

  /**
   * Output only. Details only set for a ONE_TIME recurrence line item.
   * @return value or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1SubscriptionLineItemOneTimeRecurrenceDetails getOneTimeRecurrenceDetails() {
    return oneTimeRecurrenceDetails;
  }

  /**
   * Output only. Details only set for a ONE_TIME recurrence line item.
   * @param oneTimeRecurrenceDetails oneTimeRecurrenceDetails or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1SubscriptionLineItem setOneTimeRecurrenceDetails(GoogleCloudPaymentsResellerSubscriptionV1SubscriptionLineItemOneTimeRecurrenceDetails oneTimeRecurrenceDetails) {
    this.oneTimeRecurrenceDetails = oneTimeRecurrenceDetails;
    return this;
  }

  /**
   * Required. Product resource name that identifies one the line item The format is
   * 'partners/{partner_id}/products/{product_id}'.
   * @return value or {@code null} for none
   */
  public java.lang.String getProduct() {
    return product;
  }

  /**
   * Required. Product resource name that identifies one the line item The format is
   * 'partners/{partner_id}/products/{product_id}'.
   * @param product product or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1SubscriptionLineItem setProduct(java.lang.String product) {
    this.product = product;
    return this;
  }

  /**
   * Optional. Product specific payload for this line item.
   * @return value or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1ProductPayload getProductPayload() {
    return productPayload;
  }

  /**
   * Optional. Product specific payload for this line item.
   * @param productPayload productPayload or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1SubscriptionLineItem setProductPayload(GoogleCloudPaymentsResellerSubscriptionV1ProductPayload productPayload) {
    this.productPayload = productPayload;
    return this;
  }

  /**
   * Output only. The recurrence type of the line item.
   * @return value or {@code null} for none
   */
  public java.lang.String getRecurrenceType() {
    return recurrenceType;
  }

  /**
   * Output only. The recurrence type of the line item.
   * @param recurrenceType recurrenceType or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1SubscriptionLineItem setRecurrenceType(java.lang.String recurrenceType) {
    this.recurrenceType = recurrenceType;
    return this;
  }

  /**
   * Output only. The state of the line item.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The state of the line item.
   * @param state state or {@code null} for none
   */
  public GoogleCloudPaymentsResellerSubscriptionV1SubscriptionLineItem setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public GoogleCloudPaymentsResellerSubscriptionV1SubscriptionLineItem set(String fieldName, Object value) {
    return (GoogleCloudPaymentsResellerSubscriptionV1SubscriptionLineItem) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudPaymentsResellerSubscriptionV1SubscriptionLineItem clone() {
    return (GoogleCloudPaymentsResellerSubscriptionV1SubscriptionLineItem) super.clone();
  }

}
