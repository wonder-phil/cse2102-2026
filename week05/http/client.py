import httpx

#url = "https://cautious-doodle-pjpjx694jxvcr944-5000.app.github.dev/"

url = "https://upgraded-couscous-v6q6x5w9rxxhp56v-5000.app.github.dev/"
response = httpx.get(url)
print(response.status_code)
print(response)



response = httpx.get(url)
print(response.status_code)
print(response.text)

mydata = {
    "text": "Hello Phil!",
    "param2": "Making a POST request",
    "body": "my own value"
}

# A POST request to the API
response = httpx.post(url + "echo", data=mydata)

# Print the response
print(response.status_code)
print(response.text) 