/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jenkinsci.plugins.computerqueue;

import hudson.model.Action;
import hudson.model.ComputerPanelBox;
import hudson.model.Hudson;

/**
 *
 * @author lucinka
 */
public class QueueUpdateAction implements Action{
    
    public String getIconFileName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getDisplayName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getUrlName() {
        return "updateQueue";
    }
    
    public ComputerQueue getComputerQueue(){
        return Hudson.getInstance().getExtensionList(ComputerPanelBox.class).get(ComputerQueue.class);
    }
    
    
}
