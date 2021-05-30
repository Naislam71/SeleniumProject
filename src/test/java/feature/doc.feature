
Feature: Automate LeafTaps Application

Scenario: TC001_Login Logout

Given launch chromebrowser and load url

Given launch chromeBrowser and load url
And enter userName as DemoSalesManager
And enter password as crmsfa
When click the login button
Then it is navigated homepage
And click the logout button
And close browser

@wip
Scenario: TC002_LoginLogout for Failure

Given launch chromeBrowser and load url
And enter userName as Mamun
And enter password as crmsfa
When click the login button
Then it is navigated samepage
But verify error massage