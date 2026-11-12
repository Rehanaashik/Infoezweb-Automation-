Feature:Verify Notification functionality
Scenario Outline:verify notification functionality in infoez

Given users set to launch the apps urls
When user is logg in
And  user clicks the profile button
And user clicks the notification icon
And user clicks action "<action>"
Then notification status should be verified "<verified>"

Examples:

|action        |verified        |
|Mark read     |Mark read       |
|Mark all read |Mark all read   |

