
inherit dnf-bridge

PN = "pkcs11-provider"
PE = "0"
PV = "1.0"
PR = "3.el10_0"
PACKAGES = "pkcs11-provider"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/pkcs11-provider-1.0-3.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_pkcs11-provider = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/pkcs11-provider-1.0-3.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_pkcs11-provider}"
RDEPENDS:pkcs11-provider = " \
 glibc \
 openssl-libs \
"
