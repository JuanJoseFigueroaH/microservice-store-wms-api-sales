package com.microservice.store.wms.api.sales.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name="sales")
public class Sale {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long storeId;
	
	private String store;
	private String zone;
	private String linea;
	private String rubroId;
	private String rubro;
	private String subRubroId;
	private String subRubro;
	private String style;
	private String sku;
	private String articleId;
	private String units;
	private String sizeId;
	private String colorId;
	private String description;
	private String dateSale;
	
	public Long getStoreId() {
		return storeId;
	}
	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public String getLinea() {
		return linea;
	}
	public void setLinea(String linea) {
		this.linea = linea;
	}
	public String getRubroId() {
		return rubroId;
	}
	public void setRubroId(String rubroId) {
		this.rubroId = rubroId;
	}
	public String getRubro() {
		return rubro;
	}
	public void setRubro(String rubro) {
		this.rubro = rubro;
	}
	public String getSubRubroId() {
		return subRubroId;
	}
	public void setSubRubroId(String subRubroId) {
		this.subRubroId = subRubroId;
	}
	public String getSubRubro() {
		return subRubro;
	}
	public void setSubRubro(String subRubro) {
		this.subRubro = subRubro;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getArticleId() {
		return articleId;
	}
	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}
	public String getUnits() {
		return units;
	}
	public void setUnits(String units) {
		this.units = units;
	}
	public String getSizeId() {
		return sizeId;
	}
	public void setSizeId(String sizeId) {
		this.sizeId = sizeId;
	}
	public String getColorId() {
		return colorId;
	}
	public void setColorId(String colorId) {
		this.colorId = colorId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDateSale() {
		return dateSale;
	}
	public void setDateSale(String dateSale) {
		this.dateSale = dateSale;
	}
}
