package com.cristian.springboot.backend.apirest.auth;

public class JwtConfig {

	public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";
	
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n"
			+ "MIIEowIBAAKCAQEA7J7ai7Jkz5ylGSd5DBoaaYsOkSc7wBmMVrhhmUkwgn6MAffZ\r\n"
			+ "fOp4BhEYABpod5mmCbTy+lf5MW7TkMRaGioOQzXouqg883gcbSagjc4FfJTTG3S8\r\n"
			+ "YlqJ9QAWN0O3fBcmD/yn9lV2wtPbCrDfrnpWGIeJJDoI8jFRhSij2AfuTfwDTZt2\r\n"
			+ "8tSf1tn5Ro5zxf9NtkTfzFHNzAD1mCkso3KQVSXvVzhNq8gNVo9kErPq6QEbQAVg\r\n"
			+ "4lX/HRqHj641jaiqFpFsR/FcrW6FMFSxugOW/POSzdAj/Wjx8PYDDZlix4d3oT8Q\r\n"
			+ "9z6U+8D+508oj9Z8X+Diq3iUA7qWJJna5I74IwIDAQABAoIBAFUbPdgJLiFOYkON\r\n"
			+ "4wfrS5yym2ayCdeqWMPIRbJwlLYa9hivINbBLrJf65X96Z068nGDV/GbOtIA3q+v\r\n"
			+ "MAlBHygld7PLV0Dq7q6DujPG6kpI7TVu42Ms1Xn9sf/mp1RGrzYI1hDP5Itmz94k\r\n"
			+ "iA+liNoBxd310cnq2ztdxrCpCZmaXi2TpnFwji/5DJ5yfbXgjNTubAiyAM6FEwIK\r\n"
			+ "M6x/iOfAOCgkidRCq2jSzVPLquQ48yLN/5X4e+UhIdN5jkAembRXlc+K5CfCkUz2\r\n"
			+ "azTrKCRnbpMl7gNBNP0ONaSTz9oZHRvxzpdKaFDURmutJRbExw/szRvYLb+naic7\r\n"
			+ "VVHDy2ECgYEA+8k97ZmND4j0uXje6eebWoK5IzmrXlrThqq2UYdCpD6AD5r53UyP\r\n"
			+ "/7BMd+Al9hcNDK1H1el66rdxZ1xib4Yz/ASHJqOmXlOHn1LdjcukXkCReB8Sv6+q\r\n"
			+ "EemnnxrHdJj9WQ3pk/YwBRVCU/pyT/+9ckpIbLCrIw0aOccEtCDLXrUCgYEA8JSi\r\n"
			+ "00YtHKhZRlM78HklwYgiYXxi0wEI7QwmCG7+uzmE5yjtOcHpju+9faeIBOUGnQUn\r\n"
			+ "FFWD9Z+DbhWLnRbTJSed0amsC3ww6RW5mpOkBW+2vTZQmh1cQrPoUT0LqMkBrb8t\r\n"
			+ "lOKM2bcuRA59s3cDCcXLlIMQaRoxN9iXqj/zancCgYBT6ShTU9YX9EuiuC6KA17Z\r\n"
			+ "1jD/FUwQQPK3sZLbLtm9xPqGuN5GqypeSxHg7XmZPuthaypClvIY4RPRH4/KnQ4c\r\n"
			+ "EiI8dVOPogTTyxj9FX3sz1Xrk2d7LH7gQ19Sfek06XudPy612dj9CK23MQMBuDgZ\r\n"
			+ "q7nhRytxnf88fCAMK9W69QKBgFdHlUrQysz6xmidCcHUMb5khRSY68FhPrvBDItC\r\n"
			+ "uWdzFqRGVMn/b5xLnZNYlCAydpPAqszVuWoC1Mu7RUtYXIG+PaMyyxffll75YryR\r\n"
			+ "k4/lV4aNjfBbdn08h6vxWamCQvmlwgOhrTfPHRnTqAbTxmZlO9ZFNk7rEbARA/Tf\r\n"
			+ "/o9BAoGBAMObIXG1NJaeS0IdIw0xPZPdxDD8JWYAAkuPzZqu/dr7+6/RO1gSghlE\r\n"
			+ "fflWclK3qsIpCIYJpI+GFDXxzU7H01rUtf1cnM9IfmRkFieCb7ZL7J5sXXiylJaL\r\n"
			+ "eLgUaucy1vf7oCvfp6yKGcBCrz0w/vvTzI8SY8DgbOK8rA6jftKk\r\n"
			+ "-----END RSA PRIVATE KEY-----";
	public static final String RSA_PUBLICA ="-----BEGIN PUBLIC KEY-----\r\n"
			+ "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA7J7ai7Jkz5ylGSd5DBoa\r\n"
			+ "aYsOkSc7wBmMVrhhmUkwgn6MAffZfOp4BhEYABpod5mmCbTy+lf5MW7TkMRaGioO\r\n"
			+ "QzXouqg883gcbSagjc4FfJTTG3S8YlqJ9QAWN0O3fBcmD/yn9lV2wtPbCrDfrnpW\r\n"
			+ "GIeJJDoI8jFRhSij2AfuTfwDTZt28tSf1tn5Ro5zxf9NtkTfzFHNzAD1mCkso3KQ\r\n"
			+ "VSXvVzhNq8gNVo9kErPq6QEbQAVg4lX/HRqHj641jaiqFpFsR/FcrW6FMFSxugOW\r\n"
			+ "/POSzdAj/Wjx8PYDDZlix4d3oT8Q9z6U+8D+508oj9Z8X+Diq3iUA7qWJJna5I74\r\n"
			+ "IwIDAQAB\r\n"
			+ "-----END PUBLIC KEY-----";
}
