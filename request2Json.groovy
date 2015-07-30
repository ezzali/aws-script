
// Read the request template.
def request = new File(args[0]).getText('UTF-8');


String token = "\${"
int open = 0

while (true) {
	// Search token "${"
	open = request.indexOf(token, open);

	// Terminate the main loop when token can't no longer be found
	if (open < 0)
		break

	// Search token "}"
	int close = request.indexOf("}", open)

	// Extract filename
	String filename = request.substring(open + 2, close)
	// println("Filename: " + filename)

	String json = new File(filename).getText('UTF-8').replace("\"", "\\\"").replace("\n", "")
	// println("JSON: " + json)

	request = request.substring(0, open) + json + request.substring(close + 1)

}

println(request)