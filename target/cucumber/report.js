$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/language.feature");
formatter.feature({
  "line": 1,
  "name": "Language",
  "description": "",
  "id": "language",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5718168900,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Language Change",
  "description": "",
  "id": "language;language-change",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I open the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I select the option \"German\" in the Language List",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "The word Women is replaced by Frauen",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageSteps.iOpenTheHomepage()"
});
formatter.result({
  "duration": 1186394200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "German",
      "offset": 21
    }
  ],
  "location": "HeaderSteps.iSelectTheOptionInTheLanguageList(String)"
});
formatter.result({
  "duration": 720288500,
  "status": "passed"
});
formatter.match({
  "location": "HeaderSteps.theWordWomenIsReplacedByFrauen()"
});
formatter.result({
  "duration": 64657100,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"link text\",\"selector\":\"FRAUEN\"}\n  (Session info: chrome\u003d86.0.4240.111)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-S8UL47O\u0027, ip: \u0027192.168.2.168\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.111, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: C:\\Users\\Victor\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:55715}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 037a941a7165578bf0fa0389af47f9fa\n*** Element info: {Using\u003dlink text, value\u003dFRAUEN}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByLinkText(RemoteWebDriver.java:380)\r\n\tat org.openqa.selenium.By$ByLinkText.findElement(By.java:220)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy23.click(Unknown Source)\r\n\tat org.example.stepdefinitions.HeaderSteps.theWordWomenIsReplacedByFrauen(HeaderSteps.java:46)\r\n\tat ✽.Then The word Women is replaced by Frauen(src/test/resources/language.feature:6)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 2249106000,
  "status": "passed"
});
});