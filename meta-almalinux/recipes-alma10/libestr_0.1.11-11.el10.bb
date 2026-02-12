
inherit dnf-bridge

PN = "libestr"
PE = "0"
PV = "0.1.11"
PR = "11.el10"
PACKAGES = "libestr libestr-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libestr-0.1.11-11.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libestr = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libestr-0.1.11-11.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libestr}"
RDEPENDS:libestr = " \
 glibc \
"

URI_libestr-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libestr-devel-0.1.11-11.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libestr-devel}"
RDEPENDS:libestr-devel = " \
 libestr \
 pkgconf-pkg-config \
"
