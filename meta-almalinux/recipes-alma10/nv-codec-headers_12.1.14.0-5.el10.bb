
inherit dnf-bridge

PN = "nv-codec-headers"
PE = "0"
PV = "12.1.14.0"
PR = "5.el10"
PACKAGES = "nv-codec-headers"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/nv-codec-headers-12.1.14.0-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_nv-codec-headers = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/nv-codec-headers-12.1.14.0-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_nv-codec-headers}"
RDEPENDS:nv-codec-headers = " \
 pkgconf-pkg-config \
"
