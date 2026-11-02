# Step 1

You may want to use a Python virtual environment: 

Windows terminal_1> python –m venv . 

Windows terminal_1> .\Scripts\activate 

Windows terminal_1> .\Scripts\pip install "flask[async]" 

Windows terminal_1> .\Scripts\python.exe  -m flask run --host=0.0.0.0 

Alternatively, try

Windows terminal_1>  .\Scripts\python.exe -m flask --app app0.py run --host=0.0.0.0

You should see something like: 

 

 

Debug mode: off WARNING: This is a development server. Do not use it in a production deployment. Use a production WSGI server instead. 

Running on all addresses (0.0.0.0) 

Running on http://127.0.0.1:5000 

Running on http://10.194.143.164:5000 Press CTRL+C to quit 

 

Note: we are installing "flask[async]" rather than simply flask. 

 

# Step 2 

Read the RetryStromClient.java code. The client connection timeout is set to 2 seconds.   

You may have to modify the Java code a little. Each time you modify it, then rebuild and run as usual: 

 

Windows terminal_2> javac  RetryStormClient.java 

Windows terminal_2> java RetryStormClient 


# Notes

        HttpClient client = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(2)) // time to establish connection
                .build();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(SERVER_URL))
                .timeout(Duration.ofSeconds(2)) // time for GET request to complete
                .GET()
                .build();