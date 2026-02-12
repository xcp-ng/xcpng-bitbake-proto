
inherit dnf-bridge

PN = "isns-utils"
PE = "0"
PV = "0.103"
PR = "1.el10"
PACKAGES = "isns-utils isns-utils-libs isns-utils-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/isns-utils-0.103-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_isns-utils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/isns-utils-0.103-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_isns-utils}"
RDEPENDS:isns-utils = " \
 glibc \
 systemd \
 bash \
 isns-utils-libs \
"

URI_isns-utils-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/isns-utils-libs-0.103-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_isns-utils-libs}"
RDEPENDS:isns-utils-libs = " \
 glibc \
"

URI_isns-utils-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/isns-utils-devel-0.103-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_isns-utils-devel}"
RDEPENDS:isns-utils-devel = " \
 pkgconf-pkg-config \
 isns-utils-libs \
"
