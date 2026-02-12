
inherit dnf-bridge

PN = "eglexternalplatform"
PE = "0"
PV = "1.1"
PR = "10.el10"
PACKAGES = "eglexternalplatform-devel"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/eglexternalplatform-1.1-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_eglexternalplatform-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/eglexternalplatform-devel-1.1-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_eglexternalplatform-devel}"
RDEPENDS:eglexternalplatform-devel = " \
 pkgconf-pkg-config \
"
