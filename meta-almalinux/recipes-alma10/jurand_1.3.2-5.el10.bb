
inherit dnf-bridge

PN = "jurand"
PE = "0"
PV = "1.3.2"
PR = "5.el10"
PACKAGES = "jurand"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/jurand-1.3.2-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_jurand = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jurand-1.3.2-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_jurand}"
RDEPENDS:jurand = " \
 glibc \
 libgcc \
 libstdc++ \
"
