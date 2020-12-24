package listener;

import burp.*;
import common.PrintUtil;
import ui.TestUI;

import java.io.OutputStream;
import java.util.Objects;

public class HttpListener implements IHttpListener {

    private IBurpExtenderCallbacks callbacks;
    private IExtensionHelpers helpers;
    private OutputStream out;
    private TestUI ui;

    public HttpListener(IBurpExtenderCallbacks callbacks) {
        this.callbacks = callbacks;
        this.helpers = this.callbacks.getHelpers();
        this.out = callbacks.getStdout();
        this.ui = ui;
    }

    @Override
    public void processHttpMessage(int toolFlag, boolean messageIsRequest, IHttpRequestResponse messageInfo) {
        if (messageIsRequest) {
            //GET
            IHttpService httpService = messageInfo.getHttpService();
            IRequestInfo requestInfo = helpers.analyzeRequest(httpService, messageInfo.getRequest());
            if (Objects.equals(requestInfo.getMethod(), "GET")) {
                String url = requestInfo.getUrl().toString();
                    if (url.endsWith("js")) {
//                    PrintUtil.print(callbacks, "##############"+url);
                    TestUI.setAutoText(url);
                }
            }
//            PrintUtil.print(callbacks, helpers.bytesToString(messageInfo.getRequest()));
        } else {
//            IResponseInfo responseInfo = helpers.analyzeResponse(messageInfo.getResponse());
//            PrintUtil.print(callbacks, helpers.bytesToString(messageInfo.getResponse()));
        }
    }
}
