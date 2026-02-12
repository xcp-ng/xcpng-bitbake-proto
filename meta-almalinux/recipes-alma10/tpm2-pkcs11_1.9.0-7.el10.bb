
inherit dnf-bridge

PN = "tpm2-pkcs11"
PE = "0"
PV = "1.9.0"
PR = "7.el10"
PACKAGES = "tpm2-pkcs11 tpm2-pkcs11-tools"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/tpm2-pkcs11-1.9.0-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_tpm2-pkcs11 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tpm2-pkcs11-1.9.0-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_tpm2-pkcs11}"
RDEPENDS:tpm2-pkcs11 = " \
 openssl-libs \
 libyaml \
 sqlite-libs \
 tpm2-tss \
 glibc \
 tpm2-tss-fapi \
"

URI_tpm2-pkcs11-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tpm2-pkcs11-tools-1.9.0-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_tpm2-pkcs11-tools}"
RDEPENDS:tpm2-pkcs11-tools = " \
 python3 \
 python3-pyyaml \
 python3-cryptography \
 python3-pyasn1-modules \
 python3-tpm2-pytss \
 bash \
"
