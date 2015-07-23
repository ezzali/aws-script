# aws-script

This script saves my time from re-typing "aws --profile xxxx" every time when I'm working with multiple accounts. It also tells me which account I am logging on.

## Usage:

```bash
". awsh [username] [account] optional [region]"
```

e.g. ". awsh ezzali dev"

### AWS Credential

Make sure your AWS credential file has been created in the ~/.aws/credentials folder as such:

```bash
[ezzali dev]
aws_access_key_id=
aws_secret_access_key=
```
### Proxy Settings

Place your proxy configurations here ~/.proxy as such:

```bash
http_proxy=
https_proxy=
```

## Quit

Simply type exit to quit your AWS session.

```bash
exit
```
## Switching Role

You can switch to a different cross account role from the current login account. [Note] You need to download groovy to be able to run the script. Alternatively, you can replace the parser.groovy script with JQ: http://stedolan.github.io/jq/

```bash
role [rolename] [accountnumber]
```

e.g. "role readonly 29102923233"

## Quit Role

Type exit to quit your role and return to your initial session.

```bash
exit
```
