package com.only.tech.payment.service.push.hanlder;

import com.only.tech.payment.service.push.common.AfterOpenAction;
import com.only.tech.payment.service.push.common.DisplayType;
import org.json.JSONObject;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;


public abstract class AndroidNotification extends UmengNotification {
	// Keys can be set in the payload level
	protected static final HashSet<String> PAYLOAD_KEYS = new HashSet<String>(Arrays.asList(new String[] { "display_type" }));

	// Keys can be set in the body level
	protected static final HashSet<String> BODY_KEYS = new HashSet<String>(Arrays.asList(
			new String[] { "ticker", "title", "text", "builder_id", "icon", "largeIcon", "img", "play_vibrate", "play_lights", "play_sound", "sound", "after_open", "url", "activity", "custom" }));

	// Keys can be set in the policy level
	protected static final HashSet<String> POLICY_KEYS = new HashSet<String>(Arrays.asList(new String[] { "start_time", "expire_time", "max_send_num", "out_biz_no" }));

	// Set key/value in the rootJson, for the keys can be set please see
	// ROOT_KEYS, PAYLOAD_KEYS,
	// BODY_KEYS and POLICY_KEYS.
	@Override
	public boolean setPredefinedKeyValue(String key, Object value) throws Exception {
		if (ROOT_KEYS.contains(key)) {
			// This key should be in the root level
			rootJson.put(key, value);
		} else if (PAYLOAD_KEYS.contains(key)) {
			// This key should be in the payload level
			JSONObject payloadJson = null;
			if (rootJson.has("payload")) {
				payloadJson = rootJson.getJSONObject("payload");
			} else {
				payloadJson = new JSONObject();
				rootJson.put("payload", payloadJson);
			}
			payloadJson.put(key, value);
		} else if (BODY_KEYS.contains(key)) {
			// This key should be in the body level
			JSONObject bodyJson = null;
			JSONObject payloadJson = null;
			// 'body' is under 'payload', so build a payload if it doesn't exist
			if (rootJson.has("payload")) {
				payloadJson = rootJson.getJSONObject("payload");
			} else {
				payloadJson = new JSONObject();
				rootJson.put("payload", payloadJson);
			}
			// Get body JSONObject, generate one if not existed
			if (payloadJson.has("body")) {
				bodyJson = payloadJson.getJSONObject("body");
			} else {
				bodyJson = new JSONObject();
				payloadJson.put("body", bodyJson);
			}
			bodyJson.put(key, value);
		} else if (POLICY_KEYS.contains(key)) {
			// This key should be in the body level
			JSONObject policyJson = null;
			if (rootJson.has("policy")) {
				policyJson = rootJson.getJSONObject("policy");
			} else {
				policyJson = new JSONObject();
				rootJson.put("policy", policyJson);
			}
			policyJson.put(key, value);
		} else {
			if (key == "payload" || key == "body" || key == "policy" || key == "extra") {
				throw new Exception("You don't need to set value for " + key + " , just set values for the sub keys in it.");
			} else {
				throw new Exception("Unknown key: " + key);
			}
		}
		return true;
	}

	// Set extra key/value for Android notification
	public boolean setExtraField(String key, String value) throws Exception {
		JSONObject payloadJson = null;
		JSONObject extraJson = null;
		if (rootJson.has("payload")) {
			payloadJson = rootJson.getJSONObject("payload");
		} else {
			payloadJson = new JSONObject();
			rootJson.put("payload", payloadJson);
		}

		if (payloadJson.has("extra")) {
			extraJson = payloadJson.getJSONObject("extra");
		} else {
			extraJson = new JSONObject();
			payloadJson.put("extra", extraJson);
		}
		extraJson.put(key, value);
		return true;
	}
	
	public void setExtra(JSONObject extra) throws Exception
	{
		if(extra !=null )
		{
			Iterator<String> it = extra.keys(); 
			while(it.hasNext())
			{
				String key = it.next().toString();
				setExtraField(key,extra.getString(key));
			}
		}
	}
	
	//
	public void setDisplayType(DisplayType d) throws Exception {
		if(d == null)
		{
			setPredefinedKeyValue("display_type", DisplayType.NOTIFICATION.getValue());
		}
		else
		{
			setPredefinedKeyValue("display_type", d.getValue());
		}
	}

	/// 通知栏提示文字
	public void setTicker(String ticker) throws Exception {
		setPredefinedKeyValue("ticker", ticker);
	}

	/// 发送时间
	public void setStart_time(String start_time) throws Exception {
		setPredefinedKeyValue("start_time", start_time);
	}

	/// 过期时间
	public void setExpire_time(String expire_time) throws Exception {
		setPredefinedKeyValue("expire_time", expire_time);
	}

	/// 发送限速，每秒发送的最大条数。
	public void setMax_send_num(String max_send_num) throws Exception {
		setPredefinedKeyValue("max_send_num", max_send_num);
	}

	/// 开发者对消息的唯一标识，服务器会根据这个标识避免重复发送。
	public void setOut_biz_no(String out_biz_no) throws Exception {
		setPredefinedKeyValue("out_biz_no", out_biz_no);
	}

	/// 通知标题
	public void setTitle(String title) throws Exception {
		setPredefinedKeyValue("title", title);
	}

	/// 通知文字描述
	public void setText(String text) throws Exception {
		setPredefinedKeyValue("text", text);
	}

	/// 用于标识该通知采用的样式。使用该参数时, 必须在SDK里面实现自定义通知栏样式。
	public void setBuilderId(Integer builder_id) throws Exception {
		setPredefinedKeyValue("builder_id", builder_id);
	}

	/// 状态栏图标ID, R.drawable.[smallIcon],如果没有, 默认使用应用图标。
	public void setIcon(String icon) throws Exception {
		setPredefinedKeyValue("icon", icon);
	}

	/// 通知栏拉开后左侧图标ID
	public void setLargeIcon(String largeIcon) throws Exception {
		setPredefinedKeyValue("largeIcon", largeIcon);
	}

	/// 通知栏大图标的URL链接。该字段的优先级大于largeIcon。该字段要求以http或者https开头。
	public void setImg(String img) throws Exception {
		setPredefinedKeyValue("img", img);
	}

	/// 收到通知是否震动,默认为"true"
	public void setPlayVibrate(Boolean play_vibrate) throws Exception {
		setPredefinedKeyValue("play_vibrate", play_vibrate.toString());
	}

	/// 收到通知是否闪灯,默认为"true"
	public void setPlayLights(Boolean play_lights) throws Exception {
		setPredefinedKeyValue("play_lights", play_lights.toString());
	}

	/// 收到通知是否发出声音,默认为"true"
	public void setPlaySound(Boolean play_sound) throws Exception {
		setPredefinedKeyValue("play_sound", play_sound.toString());
	}

	/// 通知声音，R.raw.[sound]. 如果该字段为空，采用SDK默认的声音
	public void setSound(String sound) throws Exception {
		setPredefinedKeyValue("sound", sound);
	}

	/// 收到通知后播放指定的声音文件
	public void setPlaySound(String sound) throws Exception {
		setPlaySound(true);
		setSound(sound);
	}

	/// 点击"通知"的后续行为，默认为打开app。
	public void goAppAfterOpen() throws Exception {
		setAfterOpenAction(AfterOpenAction.go_app);
	}

	public void goUrlAfterOpen(String url) throws Exception {
		setAfterOpenAction(AfterOpenAction.go_url);
		setUrl(url);
	}

	public void goActivityAfterOpen(String activity) throws Exception {
		setAfterOpenAction(AfterOpenAction.go_activity);
		setActivity(activity);
	}

	public void goCustomAfterOpen(String custom) throws Exception {
		setAfterOpenAction(AfterOpenAction.go_custom);
		setCustomField(custom);
	}

	public void goCustomAfterOpen(JSONObject custom) throws Exception {
		setAfterOpenAction(AfterOpenAction.go_custom);
		setCustomField(custom);
	}

	/// 点击"通知"的后续行为，默认为打开app。原始接口
	public void setAfterOpenAction(AfterOpenAction action) throws Exception {
		setPredefinedKeyValue("after_open", action.toString());
	}

	public void setUrl(String url) throws Exception {
		setPredefinedKeyValue("url", url);
	}

	public void setActivity(String activity) throws Exception {
		setPredefinedKeyValue("activity", activity);
	}

	/// can be a string of json
	public void setCustomField(String custom) throws Exception {
		setPredefinedKeyValue("custom", custom);
	}

	public void setCustomField(JSONObject custom) throws Exception {
		setPredefinedKeyValue("custom", custom);
	}

}
