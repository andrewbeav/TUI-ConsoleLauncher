package ohi.andre.consolelauncher.tuils.interfaces;

import ohi.andre.consolelauncher.commands.specific.RedirectCommand;

/**
 * Created by francescoandreuzzi on 03/03/2017.
 */

public interface Redirectator {

    void prepareRedirection(RedirectCommand cmd);
    void cleanup();
}
