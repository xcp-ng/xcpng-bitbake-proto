
inherit dnf-bridge

PN = "libnl3"
PE = "0"
PV = "3.11.0"
PR = "1.el10"
PACKAGES = "libnl3 libnl3-cli libnl3-devel libnl3-doc"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/libnl3-3.11.0-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libnl3 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libnl3-3.11.0-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libnl3}"
RDEPENDS:libnl3 = " \
 glibc \
 libgcc \
"

URI_libnl3-cli = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libnl3-cli-3.11.0-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libnl3-cli}"
RDEPENDS:libnl3-cli = " \
 glibc \
 libnl3 \
"

URI_libnl3-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libnl3-devel-3.11.0-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libnl3-devel}"
RDEPENDS:libnl3-devel = " \
 kernel-headers \
 pkgconf-pkg-config \
 libnl3 \
 libnl3-cli \
 libnl3-devel \
"

URI_libnl3-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libnl3-doc-3.11.0-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libnl3-doc}"
RDEPENDS:libnl3-doc = " \
 libnl3 \
"
