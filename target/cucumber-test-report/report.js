$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/AmazonCartPage.feature");
formatter.feature({
  "line": 1,
  "name": "Amazon e-commerce Login Functionality",
  "description": "",
  "id": "amazon-e-commerce-login-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7820273844,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "As a not validated user",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Browse to the url \"https://www.amazon.com/\"",
  "keyword": "When "
});
formatter.match({
  "location": "HomePage.as_a_not_validated_user()"
});
formatter.result({
  "duration": 767619741,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.amazon.com/",
      "offset": 19
    }
  ],
  "location": "HomePage.browse_to_the_url(String)"
});
formatter.result({
  "duration": 2928309303,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "2 Add to cart men shoes",
  "description": "",
  "id": "amazon-e-commerce-login-functionality;2-add-to-cart-men-shoes",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "Write \"Athletic shoes men\" as search box and submit",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Click tesla men shoes",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click choice color",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Click Select box",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Drop Down for  shoes size and click",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Click Add to cart",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Athletic shoes men",
      "offset": 7
    }
  ],
  "location": "AddToCartStep.write_as_search_box_and_submit(String)"
});
formatter.result({
  "duration": 3012275206,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartStep.click_tesla_men_shoes()"
});
formatter.result({
  "duration": 2893600808,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartStep.click_choice_color()"
});
formatter.result({
  "duration": 221920521,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartStep.click_Select_box()"
});
formatter.result({
  "duration": 271735583,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartStep.drop_Down_for_shoes_size_and_click()"
});
formatter.result({
  "duration": 316929416,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartStep.click_Add_to_cart()"
});
formatter.result({
  "duration": 1028898146,
  "status": "passed"
});
formatter.after({
  "duration": 1156233880,
  "status": "passed"
});
formatter.uri("src/test/resources/features/AmazonSearch.feature");
formatter.feature({
  "line": 1,
  "name": "Amazon e-commerce Login Functionality",
  "description": "",
  "id": "amazon-e-commerce-login-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3988016635,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "As a not validated user",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Browse to the url \"https://www.amazon.com/\"",
  "keyword": "When "
});
formatter.match({
  "location": "HomePage.as_a_not_validated_user()"
});
formatter.result({
  "duration": 1557916398,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.amazon.com/",
      "offset": 19
    }
  ],
  "location": "HomePage.browse_to_the_url(String)"
});
formatter.result({
  "duration": 2716836573,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "1. Go to Search Box",
  "description": "",
  "id": "amazon-e-commerce-login-functionality;1.-go-to-search-box",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "Write \"shoes\" as in search box",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Drop and Down for shoes for men",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click shoes for men",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "shoes",
      "offset": 7
    }
  ],
  "location": "SearchSteps.write_as_in_search_box(String)"
});
formatter.result({
  "duration": 372645706,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.drop_and_Down_for_shoes_for_men()"
});
formatter.result({
  "duration": 3625084000,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.click_shoes_for_men()"
});
formatter.result({
  "duration": 367119943,
  "status": "passed"
});
formatter.after({
  "duration": 1020362249,
  "status": "passed"
});
});