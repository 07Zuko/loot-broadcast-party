/*
 * Copyright (c) 2018, Tomas Slusny <slusnucky@gmail.com>
 * Copyright (c) 2021, Jonathan Rousseau <https://github.com/JoRouss>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.lootbroadcastparty;

import net.runelite.client.config.*;

import java.awt.*;

@ConfigGroup(LootBroadcastPartyConfig.GROUP)
public interface LootBroadcastPartyConfig extends Config
{
	String GROUP = "party";

	@ConfigItem(
			keyName = "collectionLogs",
			name = "Collection Log Notifications",
			description = "Enables seeing collection log notifications",
			position = 1
	)
	default boolean collectionLogs()
	{
		return true;
	}

	@ConfigItem(
			keyName = "valuableDrops",
			name = "Valuable Drop Notifications",
			description = "Enables seeing valuable drop notifications",
			position = 2
	)
	default boolean valuableDrops()
	{
		return true;
	}

	@ConfigItem(
			keyName = "combatAchievements",
			name = "Combat Achievement Notifications",
			description = "Enables seeing combat achievement notifications",
			position = 3
	)
	default boolean combatAchievements()
	{
		return true;
	}

	@ConfigItem(
			keyName = "levelUps",
			name = "Level Up Notifications",
			description = "Enables seeing level up notifications",
			position = 3
	)
	default boolean levelUps()
	{
		return true;
	}
}
