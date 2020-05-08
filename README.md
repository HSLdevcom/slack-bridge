# slack-bridge
HSL slack bridge sources.


If you want to add a slack bridge to your own Azure resource group following environment variables for azure webapp deployment:

AZURE_RESOURCE_GROUP: resource group name you want to deploy slack-bridge to
APP_NAME: name for the slack-bridge app
SLACK_WEBHOOK_URL: slack webhook url

Exposes a simple api like:

curl -H "Content-type: application/json" -d '{"text": "hello"}' 'xxxx/api/v1/postToSlack/{botName}/{channel}'
