
PN = "tpm2-tools"
PE = "0"
PV = "5.7"
PR = "4.el10"
PACKAGES = "tpm2-tools"


URI_tpm2-tools = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/tpm2-tools-5.7-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tpm2-tools = "
 libcurl
 openssl-libs
 tpm2-tss
 glibc
 tpm2-tss-fapi
"
