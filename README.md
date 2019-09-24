# json-web-token

JSON web token demonstration with Spring Security and Spring Boot


How to run: start main method via IDE

How to test:
'/api/public' always available
'/api/private' not available by default, but will available with token included in request

How to include token you need:
1. Authentication request '/api/authenticate?username=user&password=password'.
2. Take 'Authorization' header value from response.
3. Put 'Authorization' header with value to '/api/private' request.
