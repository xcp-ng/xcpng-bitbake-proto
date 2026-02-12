
inherit dnf-bridge

PN = "qatengine"
PE = "0"
PV = "1.7.0"
PR = "1.el10"
PACKAGES = "qatengine"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/qatengine-1.7.0-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_qatengine = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qatengine-1.7.0-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qatengine}"
RDEPENDS:qatengine = " \
 glibc \
 qatlib \
"
