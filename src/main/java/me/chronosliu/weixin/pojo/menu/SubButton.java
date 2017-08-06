package me.chronosliu.weixin.pojo.menu;
/**
 * 子按钮集合
 * 
 * @author ChronosLiu
 * @date 2017年8月6日 上午11:03:19
 */
public class SubButton extends Button {
	/**
	 * 子按钮集合
	 */
	private Button[] sub_button;

	public Button[] getSub_button() {
		return sub_button;
	}

	public void setSub_button(Button[] sub_button) {
		this.sub_button = sub_button;
	}
}
