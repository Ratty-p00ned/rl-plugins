package com.cox;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class coxplugintest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(coxplugin.class);
		RuneLite.main(args);
	}
}