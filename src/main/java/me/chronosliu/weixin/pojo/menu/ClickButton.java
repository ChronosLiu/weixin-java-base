package me.chronosliu.weixin.pojo.menu;
/**
 * Click按钮
 * 
 * @author ChronosLiu
 * @date 2017年8月6日 上午11:02:04
 */
public class ClickButton extends Button {
	/**
	 * 类型
	 */
	private String type;
	/**
	 * key值，自定义key
	 */
	private String key;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
