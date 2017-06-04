import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class BotListener extends ListenerAdapter {

	public void onMessageReceived(MessageReceivedEvent e){
		if(e.getMessage().getRawContent().equalsIgnoreCase("Hi")){
			e.getChannel().sendMessage(e.getAuthor().getAsMention()+"So nice to meet you").queue();
		}
		if(e.getMessage().getRawContent().equalsIgnoreCase("Hello")){
			e.getChannel().sendMessage(e.getAuthor().getAsMention()+"I love you too").queue();
		}
		if(e.getMessage().getRawContent().equalsIgnoreCase("who are you?")){
			e.getChannel().sendMessage(e.getAuthor().getAsMention()+"Are you talking to me?").queue();
		}
		if(e.getMessage().getRawContent().equalsIgnoreCase("Are you talking to me?")){
			e.getChannel().sendMessage(e.getAuthor().getAsMention()+"I wanna marry you !").queue();
		}
		if(e.getMessage().getRawContent().equalsIgnoreCase("NO")){
			e.getChannel().sendMessage(e.getAuthor().getAsMention()+"Yes hon?").queue();
		}
		if(e.getMessage().getRawContent().equalsIgnoreCase("yes")){
			e.getChannel().sendMessage(e.getAuthor().getAsMention()+"Good to know you are positive :)").queue();
		}
	}
}
