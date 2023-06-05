package chooeat.admin.web.prod.pojo;

import java.io.Serializable;

public class ProdVO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer prodId;
    private Integer restaurantId;
    private String prodName;
    private String prodText;
    private String prodUserGuide;
    private Integer prodPrice;
    private Integer prodQty;
    private Integer prodState;
    private Byte[] prodPic;
    private Integer prodCommentNumber;
    private Integer prodCommentScore;
    
	public ProdVO(Integer prodId, Integer restaurantId, String prodName, String prodText, String prodUserGuide,
			Integer prodPrice, Integer prodQty, Integer prodState, Byte[] prodPic, Integer prodCommentNumber,
			Integer prodCommentScore) {
		this.prodId = prodId;
		this.restaurantId = restaurantId;
		this.prodName = prodName;
		this.prodText = prodText;
		this.prodUserGuide = prodUserGuide;
		this.prodPrice = prodPrice;
		this.prodQty = prodQty;
		this.prodState = prodState;
		this.prodPic = prodPic;
		this.prodCommentNumber = prodCommentNumber;
		this.prodCommentScore = prodCommentScore;
	}
	public ProdVO() {
		
	}
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	public Integer getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdText() {
		return prodText;
	}
	public void setProdText(String prodText) {
		this.prodText = prodText;
	}
	public String getProdUserGuide() {
		return prodUserGuide;
	}
	public void setProdUserGuide(String prodUserGuide) {
		this.prodUserGuide = prodUserGuide;
	}
	public Integer getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(Integer prodPrice) {
		this.prodPrice = prodPrice;
	}
	public Integer getProdQty() {
		return prodQty;
	}
	public void setProdQty(Integer prodQty) {
		this.prodQty = prodQty;
	}
	public Integer getProdState() {
		return prodState;
	}
	public void setProdState(Integer prodState) {
		this.prodState = prodState;
	}
	public Byte[] getProdPic() {
		return prodPic;
	}
	public void setProdPic(Byte[] prodPic) {
		this.prodPic = prodPic;
	}
	public Integer getProdCommentNumber() {
		return prodCommentNumber;
	}
	public void setProdCommentNumber(Integer prodCommentNumber) {
		this.prodCommentNumber = prodCommentNumber;
	}
	public Integer getProdCommentScore() {
		return prodCommentScore;
	}
	public void setProdCommentScore(Integer prodCommentScore) {
		this.prodCommentScore = prodCommentScore;
	}

}
