Feature:profile details validation
Scenario Outline:profile details validation in infoez

 Given user sets to launching the application urls
 When user logged in the app
 And user clicks the profile menu
 And user clicks the profile page button
 And user enters the the name "<name>"
 And user enters the phone nos "<phonenos>"
 And user enters the avatar url "<avatarurl>"
 And click the save changes button
 Then expected notification should display "<display>"
 
 Examples:

|name    |phonenos |avatarurl                                  |display            |
|abinaya |987654321|https://picsum.photos/seed/picsum/200/300  |Profile updated      |
|vedha   |we@2s    | https://picsum.photos/seed/picsum/200/300 | Profile not updated  |                                       
|deva    |890786543|  345re                                    |  Profile not updated  |
                        