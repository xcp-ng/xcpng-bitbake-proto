
inherit dnf-bridge

PN = "uid_wrapper"
PE = "0"
PV = "1.3.0"
PR = "8.el10"
PACKAGES = "uid_wrapper"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/uid_wrapper-1.3.0-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_uid_wrapper = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/uid_wrapper-1.3.0-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_uid_wrapper}"
RDEPENDS:uid_wrapper = " \
 glibc \
 cmake-filesystem \
 pkgconf-pkg-config \
"
