/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifySecurityIpsForChannelRequest extends RpcAcsRequest<ModifySecurityIpsForChannelResponse> {
	
	public ModifySecurityIpsForChannelRequest() {
		super("Rds", "2014-08-15", "ModifySecurityIpsForChannel", "rds");
	}

	private String dBInstanceIPArrayName;

	private Long resourceOwnerId;

	private String modifyMode;

	private String resourceOwnerAccount;

	private String clientToken;

	private String ownerAccount;

	private String securityIps;

	private String dBInstanceIPArrayAttribute;

	private String dBInstanceId;

	private Long ownerId;

	public String getDBInstanceIPArrayName() {
		return this.dBInstanceIPArrayName;
	}

	public void setDBInstanceIPArrayName(String dBInstanceIPArrayName) {
		this.dBInstanceIPArrayName = dBInstanceIPArrayName;
		if(dBInstanceIPArrayName != null){
			putQueryParameter("DBInstanceIPArrayName", dBInstanceIPArrayName);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getModifyMode() {
		return this.modifyMode;
	}

	public void setModifyMode(String modifyMode) {
		this.modifyMode = modifyMode;
		if(modifyMode != null){
			putQueryParameter("ModifyMode", modifyMode);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getSecurityIps() {
		return this.securityIps;
	}

	public void setSecurityIps(String securityIps) {
		this.securityIps = securityIps;
		if(securityIps != null){
			putQueryParameter("SecurityIps", securityIps);
		}
	}

	public String getDBInstanceIPArrayAttribute() {
		return this.dBInstanceIPArrayAttribute;
	}

	public void setDBInstanceIPArrayAttribute(String dBInstanceIPArrayAttribute) {
		this.dBInstanceIPArrayAttribute = dBInstanceIPArrayAttribute;
		if(dBInstanceIPArrayAttribute != null){
			putQueryParameter("DBInstanceIPArrayAttribute", dBInstanceIPArrayAttribute);
		}
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	@Override
	public Class<ModifySecurityIpsForChannelResponse> getResponseClass() {
		return ModifySecurityIpsForChannelResponse.class;
	}

}
