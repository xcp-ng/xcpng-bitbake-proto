
inherit dnf-bridge

PN = "libtool"
PE = "0"
PV = "2.4.7"
PR = "13.el10"
PACKAGES = "libtool libtool-ltdl libtool-ltdl-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libtool-2.4.7-13.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libtool = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libtool-2.4.7-13.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libtool}"
RDEPENDS:libtool = " \
 autoconf \
 automake \
 tar \
 bash \
 gcc \
 sed \
 findutils \
"

URI_libtool-ltdl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libtool-ltdl-2.4.7-13.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libtool-ltdl}"
RDEPENDS:libtool-ltdl = " \
 glibc \
"

URI_libtool-ltdl-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libtool-ltdl-devel-2.4.7-13.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libtool-ltdl-devel}"
RDEPENDS:libtool-ltdl-devel = " \
 automake \
 bash \
 libtool-ltdl \
"
