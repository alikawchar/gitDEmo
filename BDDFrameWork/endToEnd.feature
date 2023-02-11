
Feature: end to end validation 
 Background:
  Given Open Browser 
  |chrome|   
  |Firefox|
  |safari|
  And go to url
 
 Scenario Outline: as user will be able to buy a shirt using same billing and shipping address and by using paypal. 
  
  When hover over on men manue 
  And click on new arrivels 
  And click on shirt options 
  And click on any shirt 
  And select "<number>" shirt product 
  And select size 
  |size|
  |m|
  |s|
  |xl|
   Then user should see sussessful message 
  Examples: 
  |number
  |3|
  |4|
  |1|
 