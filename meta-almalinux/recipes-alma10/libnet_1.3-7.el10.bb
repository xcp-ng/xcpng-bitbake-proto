
inherit dnf-bridge

PN = "libnet"
PE = "0"
PV = "1.3"
PR = "7.el10"
PACKAGES = "libnet libnet-devel libnet-doc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libnet-1.3-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libnet = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libnet-1.3-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libnet}"
RDEPENDS:libnet = " \
 glibc \
"

URI_libnet-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libnet-devel-1.3-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libnet-devel}"
RDEPENDS:libnet-devel = " \
 bash \
 pkgconf-pkg-config \
 libnet \
"

URI_libnet-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libnet-doc-1.3-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_libnet-doc}"
RDEPENDS:libnet-doc = ""
