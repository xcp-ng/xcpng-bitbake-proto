
inherit dnf-bridge

PN = "cjose"
PE = "0"
PV = "0.6.2.2"
PR = "7.el10"
PACKAGES = "cjose cjose-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/cjose-0.6.2.2-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_cjose = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cjose-0.6.2.2-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_cjose}"
RDEPENDS:cjose = " \
 glibc \
 openssl-libs \
 jansson \
"

URI_cjose-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/cjose-devel-0.6.2.2-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_cjose-devel}"
RDEPENDS:cjose-devel = " \
 cjose \
 openssl-devel \
 jansson-devel \
 pkgconf-pkg-config \
"
