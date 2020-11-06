package core;

import burp.*;
import common.Constants;
import common.PrintUtil;
import listener.HttpListener;
import ui.TestUI;

import javax.swing.*;
import java.awt.*;

public class BurpJsScan implements IBurpExtender, ITab {

    private IBurpExtenderCallbacks callbacks;
    private JPanel jPanelMain;

    public BurpJsScan() {
    }

    @Override
    public void registerExtenderCallbacks(IBurpExtenderCallbacks callbacks) {
        this.callbacks = callbacks;
        callbacks.setExtensionName(Constants.EXTENSION_NAME);
        callbacks.registerHttpListener(new HttpListener(callbacks));
        PrintUtil.print(callbacks, Constants.INTRODUCTION);
        buildUI();
        new JsScan(callbacks);
    }

    private void buildUI() {
        SwingUtilities.invokeLater(() -> {
            jPanelMain = new JPanel();
            TestUI ui = new TestUI();
            JComponent component = ui.$$$getRootComponent$$$();
            jPanelMain.add(component);
            callbacks.customizeUiComponent(jPanelMain);
            callbacks.addSuiteTab(BurpJsScan.this);
        });
    }

    @Override
    public String getTabCaption() {
        return Constants.EXTENSION_NAME;
    }

    @Override
    public Component getUiComponent() {
        return jPanelMain;
    }
}
