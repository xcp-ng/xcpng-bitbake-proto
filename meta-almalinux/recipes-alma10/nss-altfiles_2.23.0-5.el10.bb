
inherit dnf-bridge

PN = "nss-altfiles"
PE = "0"
PV = "2.23.0"
PR = "5.el10"
PACKAGES = "nss-altfiles"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/nss-altfiles-2.23.0-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_nss-altfiles = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nss-altfiles-2.23.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_nss-altfiles}"
RDEPENDS:nss-altfiles = " \
 glibc \
"
