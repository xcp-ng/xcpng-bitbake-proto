
inherit dnf-bridge

PN = "shared-mime-info"
PE = "0"
PV = "2.3"
PR = "8.el10"
PACKAGES = "shared-mime-info"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/shared-mime-info-2.3-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_shared-mime-info = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/shared-mime-info-2.3-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_shared-mime-info}"
RDEPENDS:shared-mime-info = " \
 libgcc \
 libxml2 \
 libstdc++ \
 bash \
 glib2 \
 glibc \
"
