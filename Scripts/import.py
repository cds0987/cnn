import json




x = {
  "name": "John",
  "age": 30,
  "city": "New York"
}

y = json.dumps(x)


print(y)
y=json.loads(y)
print(y["age"])
