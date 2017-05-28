
package com.tahutelorcommunity.bukapagar.Model.Products.CreateProductResponse;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProductDetail {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("category_id")
    @Expose
    private Integer categoryId;
    @SerializedName("category_structure")
    @Expose
    private List<String> categoryStructure = null;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("active")
    @Expose
    private Boolean active;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("province")
    @Expose
    private String province;
    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("weight")
    @Expose
    private String weight;
    @SerializedName("courier")
    @Expose
    private List<String> courier = null;
    @SerializedName("force_insurance")
    @Expose
    private Boolean forceInsurance;
    @SerializedName("image_ids")
    @Expose
    private List<Object> imageIds = null;
    @SerializedName("images")
    @Expose
    private List<Object> images = null;
    @SerializedName("small_images")
    @Expose
    private List<Object> smallImages = null;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("desc")
    @Expose
    private String desc;
    @SerializedName("condition")
    @Expose
    private String condition;
    @SerializedName("nego")
    @Expose
    private Boolean nego;
    @SerializedName("seller_username")
    @Expose
    private String sellerUsername;
    @SerializedName("seller_name")
    @Expose
    private String sellerName;
    @SerializedName("seller_id")
    @Expose
    private Integer sellerId;
    @SerializedName("seller_avatar")
    @Expose
    private String sellerAvatar;
    @SerializedName("seller_level")
    @Expose
    private String sellerLevel;
    @SerializedName("seller_level_badge_url")
    @Expose
    private String sellerLevelBadgeUrl;
    @SerializedName("seller_positive_feedback")
    @Expose
    private Integer sellerPositiveFeedback;
    @SerializedName("seller_negative_feedback")
    @Expose
    private Integer sellerNegativeFeedback;
    @SerializedName("seller_term_condition")
    @Expose
    private String sellerTermCondition;
    @SerializedName("seller_alert")
    @Expose
    private Object sellerAlert;
    @SerializedName("payment_ready")
    @Expose
    private Boolean paymentReady;
    @SerializedName("stock")
    @Expose
    private Integer stock;
    @SerializedName("specs")
    @Expose
    private Specs specs;
    @SerializedName("state_description")
    @Expose
    private List<Object> stateDescription = null;
    @SerializedName("minimum_negotiable")
    @Expose
    private Object minimumNegotiable;
    @SerializedName("for_sale")
    @Expose
    private Boolean forSale;
    @SerializedName("favorited")
    @Expose
    private Boolean favorited;
    @SerializedName("free_shipping_coverage")
    @Expose
    private List<Object> freeShippingCoverage = null;
    @SerializedName("deal_info")
    @Expose
    private DealInfo dealInfo;
    @SerializedName("deal_request_state")
    @Expose
    private String dealRequestState;
    @SerializedName("product_sin")
    @Expose
    private List<String> productSin = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProductDetail() {
    }

    /**
     * 
     * @param weight
     * @param desc
     * @param smallImages
     * @param freeShippingCoverage
     * @param dealRequestState
     * @param sellerUsername
     * @param nego
     * @param city
     * @param id
     * @param stock
     * @param forceInsurance
     * @param name
     * @param paymentReady
     * @param sellerPositiveFeedback
     * @param province
     * @param productSin
     * @param sellerTermCondition
     * @param condition
     * @param sellerAvatar
     * @param categoryId
     * @param courier
     * @param categoryStructure
     * @param minimumNegotiable
     * @param sellerAlert
     * @param sellerName
     * @param sellerLevelBadgeUrl
     * @param url
     * @param sellerNegativeFeedback
     * @param category
     * @param stateDescription
     * @param price
     * @param forSale
     * @param favorited
     * @param sellerId
     * @param active
     * @param images
     * @param sellerLevel
     * @param dealInfo
     * @param specs
     * @param imageIds
     */
    public ProductDetail(String id, String category, Integer categoryId, List<String> categoryStructure, String name, Boolean active, String city, String province, Integer price, String weight, List<String> courier, Boolean forceInsurance, List<Object> imageIds, List<Object> images, List<Object> smallImages, String url, String desc, String condition, Boolean nego, String sellerUsername, String sellerName, Integer sellerId, String sellerAvatar, String sellerLevel, String sellerLevelBadgeUrl, Integer sellerPositiveFeedback, Integer sellerNegativeFeedback, String sellerTermCondition, Object sellerAlert, Boolean paymentReady, Integer stock, Specs specs, List<Object> stateDescription, Object minimumNegotiable, Boolean forSale, Boolean favorited, List<Object> freeShippingCoverage, DealInfo dealInfo, String dealRequestState, List<String> productSin) {
        super();
        this.id = id;
        this.category = category;
        this.categoryId = categoryId;
        this.categoryStructure = categoryStructure;
        this.name = name;
        this.active = active;
        this.city = city;
        this.province = province;
        this.price = price;
        this.weight = weight;
        this.courier = courier;
        this.forceInsurance = forceInsurance;
        this.imageIds = imageIds;
        this.images = images;
        this.smallImages = smallImages;
        this.url = url;
        this.desc = desc;
        this.condition = condition;
        this.nego = nego;
        this.sellerUsername = sellerUsername;
        this.sellerName = sellerName;
        this.sellerId = sellerId;
        this.sellerAvatar = sellerAvatar;
        this.sellerLevel = sellerLevel;
        this.sellerLevelBadgeUrl = sellerLevelBadgeUrl;
        this.sellerPositiveFeedback = sellerPositiveFeedback;
        this.sellerNegativeFeedback = sellerNegativeFeedback;
        this.sellerTermCondition = sellerTermCondition;
        this.sellerAlert = sellerAlert;
        this.paymentReady = paymentReady;
        this.stock = stock;
        this.specs = specs;
        this.stateDescription = stateDescription;
        this.minimumNegotiable = minimumNegotiable;
        this.forSale = forSale;
        this.favorited = favorited;
        this.freeShippingCoverage = freeShippingCoverage;
        this.dealInfo = dealInfo;
        this.dealRequestState = dealRequestState;
        this.productSin = productSin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public List<String> getCategoryStructure() {
        return categoryStructure;
    }

    public void setCategoryStructure(List<String> categoryStructure) {
        this.categoryStructure = categoryStructure;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public List<String> getCourier() {
        return courier;
    }

    public void setCourier(List<String> courier) {
        this.courier = courier;
    }

    public Boolean getForceInsurance() {
        return forceInsurance;
    }

    public void setForceInsurance(Boolean forceInsurance) {
        this.forceInsurance = forceInsurance;
    }

    public List<Object> getImageIds() {
        return imageIds;
    }

    public void setImageIds(List<Object> imageIds) {
        this.imageIds = imageIds;
    }

    public List<Object> getImages() {
        return images;
    }

    public void setImages(List<Object> images) {
        this.images = images;
    }

    public List<Object> getSmallImages() {
        return smallImages;
    }

    public void setSmallImages(List<Object> smallImages) {
        this.smallImages = smallImages;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Boolean getNego() {
        return nego;
    }

    public void setNego(Boolean nego) {
        this.nego = nego;
    }

    public String getSellerUsername() {
        return sellerUsername;
    }

    public void setSellerUsername(String sellerUsername) {
        this.sellerUsername = sellerUsername;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerAvatar() {
        return sellerAvatar;
    }

    public void setSellerAvatar(String sellerAvatar) {
        this.sellerAvatar = sellerAvatar;
    }

    public String getSellerLevel() {
        return sellerLevel;
    }

    public void setSellerLevel(String sellerLevel) {
        this.sellerLevel = sellerLevel;
    }

    public String getSellerLevelBadgeUrl() {
        return sellerLevelBadgeUrl;
    }

    public void setSellerLevelBadgeUrl(String sellerLevelBadgeUrl) {
        this.sellerLevelBadgeUrl = sellerLevelBadgeUrl;
    }

    public Integer getSellerPositiveFeedback() {
        return sellerPositiveFeedback;
    }

    public void setSellerPositiveFeedback(Integer sellerPositiveFeedback) {
        this.sellerPositiveFeedback = sellerPositiveFeedback;
    }

    public Integer getSellerNegativeFeedback() {
        return sellerNegativeFeedback;
    }

    public void setSellerNegativeFeedback(Integer sellerNegativeFeedback) {
        this.sellerNegativeFeedback = sellerNegativeFeedback;
    }

    public String getSellerTermCondition() {
        return sellerTermCondition;
    }

    public void setSellerTermCondition(String sellerTermCondition) {
        this.sellerTermCondition = sellerTermCondition;
    }

    public Object getSellerAlert() {
        return sellerAlert;
    }

    public void setSellerAlert(Object sellerAlert) {
        this.sellerAlert = sellerAlert;
    }

    public Boolean getPaymentReady() {
        return paymentReady;
    }

    public void setPaymentReady(Boolean paymentReady) {
        this.paymentReady = paymentReady;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Specs getSpecs() {
        return specs;
    }

    public void setSpecs(Specs specs) {
        this.specs = specs;
    }

    public List<Object> getStateDescription() {
        return stateDescription;
    }

    public void setStateDescription(List<Object> stateDescription) {
        this.stateDescription = stateDescription;
    }

    public Object getMinimumNegotiable() {
        return minimumNegotiable;
    }

    public void setMinimumNegotiable(Object minimumNegotiable) {
        this.minimumNegotiable = minimumNegotiable;
    }

    public Boolean getForSale() {
        return forSale;
    }

    public void setForSale(Boolean forSale) {
        this.forSale = forSale;
    }

    public Boolean getFavorited() {
        return favorited;
    }

    public void setFavorited(Boolean favorited) {
        this.favorited = favorited;
    }

    public List<Object> getFreeShippingCoverage() {
        return freeShippingCoverage;
    }

    public void setFreeShippingCoverage(List<Object> freeShippingCoverage) {
        this.freeShippingCoverage = freeShippingCoverage;
    }

    public DealInfo getDealInfo() {
        return dealInfo;
    }

    public void setDealInfo(DealInfo dealInfo) {
        this.dealInfo = dealInfo;
    }

    public String getDealRequestState() {
        return dealRequestState;
    }

    public void setDealRequestState(String dealRequestState) {
        this.dealRequestState = dealRequestState;
    }

    public List<String> getProductSin() {
        return productSin;
    }

    public void setProductSin(List<String> productSin) {
        this.productSin = productSin;
    }

}
