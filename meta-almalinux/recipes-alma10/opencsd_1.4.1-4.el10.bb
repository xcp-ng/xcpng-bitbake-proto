
inherit dnf-bridge

PN = "opencsd"
PE = "0"
PV = "1.4.1"
PR = "4.el10"
PACKAGES = "opencsd opencsd-devel"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/opencsd-1.4.1-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_opencsd = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/opencsd-1.4.1-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_opencsd}"
RDEPENDS:opencsd = " \
 glibc \
 libgcc \
 libstdc++ \
"

URI_opencsd-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/opencsd-devel-1.4.1-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_opencsd-devel}"
RDEPENDS:opencsd-devel = " \
 opencsd \
"
