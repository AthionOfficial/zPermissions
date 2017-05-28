package org.tyrannyofheaven.bukkit.zPermissions.vault;

import net.milkbowl.vault.chat.Chat;
import net.milkbowl.vault.permission.Permission;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;

// Implementation of all non-OfflinePlayer-based player methods
public abstract class ChatCompatibility extends Chat {

	public ChatCompatibility(Permission perms) {
		super(perms);
	}

	@SuppressWarnings("deprecation")
	@Override
	public String getPlayerPrefix(String world, String player) {
		OfflinePlayer offlinePlayer = Bukkit.getOfflinePlayer(player);
		if (offlinePlayer == null) return "";
		return getPlayerPrefix(world, offlinePlayer);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void setPlayerPrefix(String world, String player, String prefix) {
		OfflinePlayer offlinePlayer = Bukkit.getOfflinePlayer(player);
		if (offlinePlayer == null) return;
		setPlayerPrefix(world, offlinePlayer, prefix);
	}

	@SuppressWarnings("deprecation")
	@Override
	public String getPlayerSuffix(String world, String player) {
		OfflinePlayer offlinePlayer = Bukkit.getOfflinePlayer(player);
		if (offlinePlayer == null) return "";
		return getPlayerSuffix(world, offlinePlayer);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void setPlayerSuffix(String world, String player, String suffix) {
		OfflinePlayer offlinePlayer = Bukkit.getOfflinePlayer(player);
		if (offlinePlayer == null) return;
		setPlayerSuffix(world, offlinePlayer, suffix);
	}

	@SuppressWarnings("deprecation")
	@Override
	public int getPlayerInfoInteger(String world, String player, String node, int defaultValue) {
		OfflinePlayer offlinePlayer = Bukkit.getOfflinePlayer(player);
		if (offlinePlayer == null) return defaultValue;
		return getPlayerInfoInteger(world, offlinePlayer, node, defaultValue);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void setPlayerInfoInteger(String world, String player, String node, int value) {
		OfflinePlayer offlinePlayer = Bukkit.getOfflinePlayer(player);
		if (offlinePlayer == null) return;
		setPlayerInfoInteger(world, offlinePlayer, node, value);
	}

	@SuppressWarnings("deprecation")
	@Override
	public double getPlayerInfoDouble(String world, String player, String node, double defaultValue) {
		OfflinePlayer offlinePlayer = Bukkit.getOfflinePlayer(player);
		if (offlinePlayer == null) return defaultValue;
		return getPlayerInfoDouble(world, offlinePlayer, node, defaultValue);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void setPlayerInfoDouble(String world, String player, String node, double value) {
		OfflinePlayer offlinePlayer = Bukkit.getOfflinePlayer(player);
		if (offlinePlayer == null) return;
		setPlayerInfoDouble(world, offlinePlayer, node, value);
	}

	@SuppressWarnings("deprecation")
	@Override
	public boolean getPlayerInfoBoolean(String world, String player, String node, boolean defaultValue) {
		OfflinePlayer offlinePlayer = Bukkit.getOfflinePlayer(player);
		if (offlinePlayer == null) return defaultValue;
		return getPlayerInfoBoolean(world, offlinePlayer, node, defaultValue);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void setPlayerInfoBoolean(String world, String player, String node, boolean value) {
		OfflinePlayer offlinePlayer = Bukkit.getOfflinePlayer(player);
		if (offlinePlayer == null) return;
		setPlayerInfoBoolean(world, offlinePlayer, node, value);
	}

	@SuppressWarnings("deprecation")
	@Override
	public String getPlayerInfoString(String world, String player, String node, String defaultValue) {
		OfflinePlayer offlinePlayer = Bukkit.getOfflinePlayer(player);
		if (offlinePlayer == null) return defaultValue;
		return getPlayerInfoString(world, offlinePlayer, node, defaultValue);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void setPlayerInfoString(String world, String player, String node, String value) {
		OfflinePlayer offlinePlayer = Bukkit.getOfflinePlayer(player);
		if (offlinePlayer == null) return;
		setPlayerInfoString(world, offlinePlayer, node, value);
	}

}
