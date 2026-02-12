
inherit dnf-bridge

PN = "priv_wrapper"
PE = "0"
PV = "1.0.1"
PR = "8.el10"
PACKAGES = "priv_wrapper"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/priv_wrapper-1.0.1-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_priv_wrapper = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/priv_wrapper-1.0.1-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_priv_wrapper}"
RDEPENDS:priv_wrapper = " \
 glibc \
 cmake-filesystem \
 pkgconf-pkg-config \
"
