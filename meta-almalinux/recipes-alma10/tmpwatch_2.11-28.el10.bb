
inherit dnf-bridge

PN = "tmpwatch"
PE = "0"
PV = "2.11"
PR = "28.el10"
PACKAGES = "tmpwatch"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/tmpwatch-2.11-28.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_tmpwatch = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tmpwatch-2.11-28.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_tmpwatch}"
RDEPENDS:tmpwatch = " \
 glibc \
 psmisc \
"
