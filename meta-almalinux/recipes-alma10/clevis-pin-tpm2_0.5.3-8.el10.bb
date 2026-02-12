
inherit dnf-bridge

PN = "clevis-pin-tpm2"
PE = "0"
PV = "0.5.3"
PR = "8.el10"
PACKAGES = "clevis-pin-tpm2"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/clevis-pin-tpm2-0.5.3-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_clevis-pin-tpm2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/clevis-pin-tpm2-0.5.3-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_clevis-pin-tpm2}"
RDEPENDS:clevis-pin-tpm2 = " \
 openssl-libs \
 libgcc \
 clevis \
 tpm2-tss \
 glibc \
"
