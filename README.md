# aws-script

This script saves my time from re-typing "aws --profile xxxx" every time and tells me which account I am on.

## Usage:

```bash
". awsh [username] [account] optional [region]"
```

e.g. ". awsh ezzali dev"

## AWS Credential

Make sure your AWS credential file has been created in the ~/.aws folder as such:

```bash
[ezzali dev]
aws_access_key_id=
aws_secret_access_key=
```
## Proxy Settings

Place your proxy configurations here ~/.proxy as such:

```bash
http_proxy=
https_proxy=
```
