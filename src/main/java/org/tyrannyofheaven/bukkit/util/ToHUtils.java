/*
 * Copyright 2011 ZerothAngel <zerothangel@tyrannyofheaven.org>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.tyrannyofheaven.bukkit.util;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.bukkit.Material;
import org.bukkit.plugin.Plugin;

/**
 * Miscellaneous utility methods.
 * 
 * @author zerothangel
 */
public class ToHUtils {

	public static final int TICKS_PER_SECOND = 20;

	private static final Map<String, Material> materialMap;

	static {
		// Build materialMap consisting of lowercased names without underscores
		Map<String, Material> mm = new HashMap<String, Material>();
		for (Material material : Material.values()) {
			String name = material.name().toLowerCase().replaceAll("_", "");
			mm.put(name, material);
		}
		materialMap = Collections.unmodifiableMap(mm);
	}

	private ToHUtils() {
		throw new AssertionError("Don't instantiate me!");
	}

	/**
	 * Throws an AssertionError if test is false.
	 * 
	 * @param test the test
	 * @param message assertion message
	 */
	public static void assertTrue(boolean test, String message) {
		if (!test)
			throw new AssertionError(message);
	}

	/**
	 * Throws an AssertionError if test is false.
	 * 
	 * @param test the test
	 */
	public static void assertTrue(boolean test) {
		if (!test)
			throw new AssertionError();
	}

	/**
	 * Throws an AssertionError if test is true.
	 * 
	 * @param test the test
	 * @param message assertion message
	 */
	public static void assertFalse(boolean test, String message) {
		if (test)
			throw new AssertionError(message);
	}

	/**
	 * Throws an AssertionError if test is true.
	 * 
	 * @param test the test
	 */
	public static void assertFalse(boolean test) {
		if (test)
			throw new AssertionError();
	}

	/**
	 * Similar to {@link Material#matchMaterial(String)} but also accepts names
	 * without underscores or spaces, e.g. woodpickaxe.
	 * 
	 * @param name name of the material to match
	 * @return Material or null if not found
	 */
	public static Material matchMaterial(String name) {
		Material material = Material.matchMaterial(name);
		if (material == null) {
			// Use our map
			material = materialMap.get(name.toLowerCase());
		}
		return material;
	}

	/**
	 * Peeks into the plugin's manifest to determine actual version information.
	 * 
	 * @param plugin the plugin
	 * @return a VersionInfo object holding the artifactId/version/build fields
	 */
	public static VersionInfo getVersion(Plugin plugin) {
		VersionInfo versionInfo = null;;
		try {
			versionInfo = VersionMain.getVersion(plugin.getClass());
			if (versionInfo == null)
				ToHLoggingUtils.warn(plugin, "Failed to determine actual version");
		}
		catch (IOException e) {
			ToHLoggingUtils.error(plugin, "Error determining actual version:", e);
		}
		if (versionInfo == null) {
			versionInfo = new VersionInfo(plugin.getDescription().getName(), plugin.getDescription().getVersion(), "UNKNOWN");
		}
		return versionInfo;
	}

}
