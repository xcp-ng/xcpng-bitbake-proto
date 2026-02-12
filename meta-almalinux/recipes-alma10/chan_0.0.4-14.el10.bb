
inherit dnf-bridge

PN = "chan"
PE = "0"
PV = "0.0.4"
PR = "14.el10"
PACKAGES = "chan chan-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/chan-0.0.4-14.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_chan = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/chan-0.0.4-14.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_chan}"
RDEPENDS:chan = " \
 glibc \
"

URI_chan-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/chan-devel-0.0.4-14.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_chan-devel}"
RDEPENDS:chan-devel = " \
 chan \
"
