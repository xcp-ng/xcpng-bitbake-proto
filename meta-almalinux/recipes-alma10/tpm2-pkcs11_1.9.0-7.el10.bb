
PN = "tpm2-pkcs11"
PE = "0"
PV = "1.9.0"
PR = "7.el10"
PACKAGES = "tpm2-pkcs11 tpm2-pkcs11-tools"


URI_tpm2-pkcs11 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tpm2-pkcs11-1.9.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tpm2-pkcs11 = "rtld(GNU_HASH) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libsqlite3.so.0()(64bit) ( ) libc.so.6(GLIBC_2.33)(64bit) ( ) libtss2-tctildr.so.0()(64bit) ( ) libtss2-esys.so.0()(64bit) ( ) libtss2-mu.so.0()(64bit) ( ) libyaml-0.so.2()(64bit) ( ) libtss2-rc.so.0()(64bit) ( ) libtss2-fapi.so.1()(64bit) ( )"
RPROVIDES:tpm2-pkcs11 = "libtpm2_pkcs11.so.0()(64bit) ( ) tpm2-pkcs11 ( =  1.9.0-7.el10) tpm2-pkcs11(x86-64) ( =  1.9.0-7.el10)"

URI_tpm2-pkcs11-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tpm2-pkcs11-tools-1.9.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tpm2-pkcs11-tools = "/usr/bin/bash ( ) python3-cryptography ( ) python3-pyyaml ( ) python3-pyasn1-modules ( ) python3-tpm2-pytss ( ) python(abi) ( =  3.12)"
RPROVIDES:tpm2-pkcs11-tools = "tpm2-pkcs11-tools ( =  1.9.0-7.el10) tpm2-pkcs11-tools(x86-64) ( =  1.9.0-7.el10)"
