
inherit dnf-bridge

PN = "sanlock"
PE = "0"
PV = "3.9.5"
PR = "4.el10"
PACKAGES = "sanlock sanlock-lib sanlock-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/sanlock-3.9.5-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_sanlock = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sanlock-3.9.5-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_sanlock}"
RDEPENDS:sanlock = " \
 libuuid \
 systemd \
 libaio \
 sanlock-lib \
 libblkid \
 bash \
 glibc \
"

URI_sanlock-lib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sanlock-lib-3.9.5-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_sanlock-lib}"
RDEPENDS:sanlock-lib = " \
 glibc \
 libaio \
 libblkid \
"

URI_sanlock-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/sanlock-devel-3.9.5-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_sanlock-devel}"
RDEPENDS:sanlock-devel = " \
 pkgconf-pkg-config \
 sanlock-lib \
"
