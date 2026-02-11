
PN = "tpm2-tss"
PE = "0"
PV = "4.1.3"
PR = "5.el10"
PACKAGES = "tpm2-tss tpm2-tss-fapi tpm2-tss-devel"


URI_tpm2-tss = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/tpm2-tss-4.1.3-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tpm2-tss = " \
 libuuid \
 shadow-utils \
 openssl-libs \
 json-c \
 bash \
 glibc \
"

URI_tpm2-tss-fapi = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/tpm2-tss-fapi-4.1.3-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tpm2-tss-fapi = " \
 libuuid \
 openssl-libs \
 json-c \
 libcurl \
 glibc \
 tpm2-tss \
"

URI_tpm2-tss-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/tpm2-tss-devel-4.1.3-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tpm2-tss-devel = " \
 pkgconf-pkg-config \
 libuuid-devel \
 openssl-devel \
 tpm2-tss-devel \
 tpm2-tss \
 libcurl-devel \
 tpm2-tss-fapi \
 json-c-devel \
"
