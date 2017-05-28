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
package org.tyrannyofheaven.bukkit.util.command;

import org.bukkit.ChatColor;

/**
 * Default UsageOptions for my plugins.
 * 
 * @author zerothangel
 */
public class DefaultUsageOptions implements UsageOptions {

	/* (non-Javadoc)
	 * @see org.tyrannyofheaven.bukkit.util.command.UsageOptions#getPrefix()
	 */
	public String getPreamble() {
		return ChatColor.GREEN.toString();
	}

	/* (non-Javadoc)
	 * @see org.tyrannyofheaven.bukkit.util.command.UsageOptions#getPostamble()
	 */
	public String getPostamble() {
		return "";
	}

	/* (non-Javadoc)
	 * @see org.tyrannyofheaven.bukkit.util.command.UsageOptions#getFlagEnd()
	 */
	public String getFlagEnd() {
		return ChatColor.AQUA + "]" + ChatColor.GREEN;
	}

	/* (non-Javadoc)
	 * @see org.tyrannyofheaven.bukkit.util.command.UsageOptions#getFlagStart()
	 */
	public String getFlagStart() {
		return ChatColor.AQUA + "[" + ChatColor.GOLD;
	}

	/* (non-Javadoc)
	 * @see org.tyrannyofheaven.bukkit.util.command.UsageOptions#getFlagValueEnd()
	 */
	public String getFlagValueEnd() {
		return ">";
	}

	/* (non-Javadoc)
	 * @see org.tyrannyofheaven.bukkit.util.command.UsageOptions#getFlagValueStart()
	 */
	public String getFlagValueStart() {
		return " " + ChatColor.LIGHT_PURPLE + "<";
	}

	/* (non-Javadoc)
	 * @see org.tyrannyofheaven.bukkit.util.command.UsageOptions#getParameterEnd(boolean)
	 */
	public String getParameterEnd(boolean optional) {
		if (optional)
			return "]" + ChatColor.GREEN;
		else
			return ">" + ChatColor.GREEN;
	}

	/* (non-Javadoc)
	 * @see org.tyrannyofheaven.bukkit.util.command.UsageOptions#getParameterStart(boolean)
	 */
	public String getParameterStart(boolean optional) {
		if (optional)
			return ChatColor.AQUA + "[";
		else
			return ChatColor.LIGHT_PURPLE + "<";
	}

	/* (non-Javadoc)
	 * @see org.tyrannyofheaven.bukkit.util.command.UsageOptions#getDescriptionDelimiter()
	 */
	public String getDescriptionDelimiter() {
		return " " + ChatColor.WHITE + "- ";
	}

	/* (non-Javadoc)
	 * @see org.tyrannyofheaven.bukkit.util.command.UsageOptions#getVarargsEnd()
	 */
	public String getVarargsEnd() {
		return "]" + ChatColor.GREEN;
	}

	/* (non-Javadoc)
	 * @see org.tyrannyofheaven.bukkit.util.command.UsageOptions#getVarargsStart()
	 */
	public String getVarargsStart() {
		return " " + ChatColor.AQUA + "[";
	}

}
