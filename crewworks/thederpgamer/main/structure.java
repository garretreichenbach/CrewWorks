package crewworks.thederpgamer.main;

import thederpgamer.main.main;
import thederpgamer.main.blocks;

public class structure {

  public static Entity entity = new entity();
  public static Block block = new block();
  public static Structure structure = new structure();
  public static Player player = new player();
  public static Faction faction = player.getfaction();

  @EventHandler //starmade api equivalent?
  public static void onBlockPlace(EventHandler event, Block block) {
    if (block == blocks.crewModule) {
      if (entity.type != "ship" || entity.type != "station") {
        MessageBox placeError = new MessageBox;
        placeError.setText("You can only put crew modules on ships or stations!", center)
        placeError.addbutton("Ok", center)
        player.sendMessage().placeError;
        event.cancel(); //cancel block place event
        return;
      }
    }
  }
}