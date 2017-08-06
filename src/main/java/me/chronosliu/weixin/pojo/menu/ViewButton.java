package me.chronosliu.weixin.pojo.menu;
/**
 * View类型按钮
 * 
 * @author ChronosLiu
 * @date 2017年8月6日 上午11:19:27
 */
public class ViewButton extends Button {
	/**
	 * 类型
	 */
	private String type;
	/**
	 * url,跳转url
	 */
	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
