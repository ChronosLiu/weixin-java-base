package me.chronosliu.weixin.pojo.menu;
/**
 * 个性化菜单
 * 
 * @author ChronosLiu
 * @date 2017年8月6日 上午11:27:17
 */
public class ConditionalMenu {
	/**
	 * 按钮集合
	 */
	private Button[] button;
	/**
	 * 个性化菜单匹配规则
	 */
	private MatchRule matchrule;
	/**
	 * 菜单ID
	 */
	private String menuid;
	
	public Button[] getButton() {
		return button;
	}
	public void setButton(Button[] button) {
		this.button = button;
	}
	public MatchRule getMatchrule() {
		return matchrule;
	}
	public void setMatchrule(MatchRule matchrule) {
		this.matchrule = matchrule;
	}
	public String getMenuid() {
		return menuid;
	}
	public void setMenuid(String menuid) {
		this.menuid = menuid;
	}
}
