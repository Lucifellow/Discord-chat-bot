import javax.security.auth.login.LoginException;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.exceptions.RateLimitedException;

public class bot {
	public static JDA jda;
	public static final String BOT_TOKEN="MzIxMDI4MjY0NzY2NDcyMTk1.DBYElg.Raax75ChWEuSV6lOi-g4EagNl8c";
	public static void main(String[] args) {
	
		try {
			jda=new JDABuilder(AccountType.BOT).addEventListener(new BotListener()).setToken(BOT_TOKEN).buildBlocking();
		} catch (LoginException | IllegalArgumentException | InterruptedException | RateLimitedException e) {
			
			e.printStackTrace();
		}
	}

}
