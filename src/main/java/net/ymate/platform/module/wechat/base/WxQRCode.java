/*
 * Copyright 2007-2107 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.ymate.platform.module.wechat.base;

import net.ymate.platform.module.wechat.WeChat;

/**
 * <p>
 * WxQRCode
 * </p>
 * <p>
 * 
 * </p>
 * 
 * @author 刘镇(suninformation@163.com)
 * @version 0.0.0
 *          <table style="border:1px solid gray;">
 *          <tr>
 *          <th width="100px">版本号</th><th width="100px">动作</th><th
 *          width="100px">修改人</th><th width="100px">修改时间</th>
 *          </tr>
 *          <!-- 以 Table 方式书写修改历史 -->
 *          <tr>
 *          <td>0.0.0</td>
 *          <td>创建类</td>
 *          <td>刘镇</td>
 *          <td>2014年3月20日下午7:17:28</td>
 *          </tr>
 *          </table>
 */
public class WxQRCode {

	private int sceneId;

	private String ticket;

	private int expireSeconds;

	public WxQRCode(int sceneId, String ticket, int expireSeconds) {
		this.sceneId = sceneId;
		this.ticket = ticket;
		this.expireSeconds = expireSeconds;
	}

	public int getSceneId() {
		return sceneId;
	}

	public String getTicket() {
		return ticket;
	}

	public int getExpireSeconds() {
		return expireSeconds;
	}

	public String toURL() {
		return WeChat.wxQRCodeShowURL(getTicket());
	}

}
