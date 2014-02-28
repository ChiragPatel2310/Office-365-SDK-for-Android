/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/
package com.microsoft.office365.lists;

import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import com.microsoft.office365.OfficeEntity;

// TODO: Auto-generated Javadoc
/**
 * The Class SPListField.
 */
public class SPListField extends OfficeEntity {

	/**
	 * List from json.
	 * 
	 * @param json
	 *            the json
	 * @return the list
	 * @throws JSONException
	 *             the JSON exception
	 */
	public static List<SPListField> listFromJson(JSONObject json) throws JSONException {
		return OfficeEntity.listFromJson(json, SPListField.class);
	}
	
	/**
	 * Instantiates a new SP list field.
	 * 
	 * @throws JSONException
	 *             the JSON exception
	 */
	public SPListField() throws JSONException {
		super();
	}
	
	/**
	 * Gets the title.
	 * 
	 * @return the title
	 */
	public String getTitle() {
		return getData("Title").toString();
	}

	/**
	 * Gets the entity property name.
	 * 
	 * @return the entity property name
	 */
	public String getEntityPropertyName() {
		return getData("EntityPropertyName").toString();
	}

}
