
inherit dnf-bridge

PN = "plocate"
PE = "0"
PV = "1.1.22"
PR = "10.el10"
PACKAGES = "plocate"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/plocate-1.1.22-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_plocate = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/plocate-1.1.22-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_plocate}"
RDEPENDS:plocate = " \
 libgcc \
 libzstd \
 libstdc++ \
 bash \
 glibc \
 liburing \
"
