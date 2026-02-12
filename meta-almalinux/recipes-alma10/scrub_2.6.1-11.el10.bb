
inherit dnf-bridge

PN = "scrub"
PE = "0"
PV = "2.6.1"
PR = "11.el10"
PACKAGES = "scrub"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/scrub-2.6.1-11.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_scrub = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/scrub-2.6.1-11.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_scrub}"
RDEPENDS:scrub = " \
 glibc \
 openssl-libs \
"
