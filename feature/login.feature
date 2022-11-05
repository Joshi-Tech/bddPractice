Feature: Login Feature
  Scenario: Logging successfully with valid credentials
Given Chrome browser launched
When url "https://webviewer:Cd3qTV%@qaweb.todaytix.com/"
Then click loggin icon
Then click on login
Then click email button
Then type valid email id
And type valid password
Then click login button
