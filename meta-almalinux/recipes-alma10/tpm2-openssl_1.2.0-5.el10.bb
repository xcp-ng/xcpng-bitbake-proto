
PN = "tpm2-openssl"
PE = "0"
PV = "1.2.0"
PR = "5.el10"
PACKAGES = "tpm2-openssl"


URI_tpm2-openssl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tpm2-openssl-1.2.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tpm2-openssl = " \
 glibc \
 tpm2-abrmd \
 tpm2-tss \
"
