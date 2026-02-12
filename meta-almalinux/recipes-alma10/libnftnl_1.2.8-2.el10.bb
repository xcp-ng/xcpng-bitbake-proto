
inherit dnf-bridge

PN = "libnftnl"
PE = "0"
PV = "1.2.8"
PR = "2.el10"
PACKAGES = "libnftnl libnftnl-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/libnftnl-1.2.8-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libnftnl = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libnftnl-1.2.8-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libnftnl}"
RDEPENDS:libnftnl = " \
 glibc \
 libmnl \
"

URI_libnftnl-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libnftnl-devel-1.2.8-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libnftnl-devel}"
RDEPENDS:libnftnl-devel = " \
 pkgconf-pkg-config \
 libnftnl \
 libmnl-devel \
"
