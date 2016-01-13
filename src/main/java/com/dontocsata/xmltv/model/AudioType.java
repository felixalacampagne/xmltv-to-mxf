/*
 * Copyright (c) 2015, Raymond R Douglass III. All rights reserved. DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS
 * FILE HEADER.
 *
 * This file is part of XMLTV-to-MXF.
 *
 * XMLTV-to-MXF is free software: you can redistribute it and/or modify it under the terms of the GNU General Public
 * License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * XMLTV-to-MXF is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with XMLTV-to-MXF. If not, see
 * <http://www.gnu.org/licenses/>.
 */
 package com.dontocsata.xmltv.model;

public enum AudioType {
	// 'mono','stereo','dolby','dolby digital','bilingual' and 'surround'
	MONO("mono", 1),
	STEREO("stereo", 2),
	DOLBY("dolby", 3),
	DOLBY_DIGITAL("dolby digital", 4),
	BILINGUAL("bilingual", 0),
	SURROUND("surround", 5);

	private String xmlTvType;
	private int mxfType;

	private AudioType(String xmlTvType, int mxfType) {
		this.xmlTvType = xmlTvType;
		this.mxfType = mxfType;
	}

	public String getXmlTvType() {
		return xmlTvType;
	}

	public int getMxfType() {
		return mxfType;
	}

	public static AudioType parse(String xmlTvString) {
		for (AudioType at : values()) {
			if (at.xmlTvType.equals(xmlTvString)) {
				return at;
			}
		}
		throw new IllegalArgumentException("No AudioType for: " + xmlTvString);
	}

}
