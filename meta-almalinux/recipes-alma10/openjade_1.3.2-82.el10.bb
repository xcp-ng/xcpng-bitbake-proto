
inherit dnf-bridge

PN = "openjade"
PE = "0"
PV = "1.3.2"
PR = "82.el10"
PACKAGES = "openjade"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/openjade-1.3.2-82.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_openjade = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/openjade-1.3.2-82.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_openjade}"
RDEPENDS:openjade = " \
 sgml-common \
 libgcc \
 libstdc++ \
 bash \
 opensp \
 glibc \
"
