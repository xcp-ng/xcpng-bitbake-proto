
inherit dnf-bridge

PN = "newt"
PE = "0"
PV = "0.52.24"
PR = "5.el10"
PACKAGES = "newt newt-devel python3-newt"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/newt-0.52.24-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_newt = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/newt-0.52.24-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_newt}"
RDEPENDS:newt = " \
 glibc \
 slang \
 popt \
"

URI_newt-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/newt-devel-0.52.24-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_newt-devel}"
RDEPENDS:newt-devel = " \
 newt \
 slang-devel \
 pkgconf-pkg-config \
"

URI_python3-newt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-newt-0.52.24-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python3-newt}"
RDEPENDS:python3-newt = " \
 glibc \
 newt \
 python3 \
"
