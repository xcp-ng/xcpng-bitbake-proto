
inherit dnf-bridge

PN = "sscg"
PE = "0"
PV = "3.0.5"
PR = "9.el10"
PACKAGES = "sscg"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/sscg-3.0.5-9.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_sscg = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sscg-3.0.5-9.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_sscg}"
RDEPENDS:sscg = " \
 openssl-libs \
 popt \
 libtalloc \
 glibc \
 libpath_utils \
"
