
inherit dnf-bridge

PN = "pbzip2"
PE = "0"
PV = "1.1.13"
PR = "14.el10"
PACKAGES = "pbzip2"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/pbzip2-1.1.13-14.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_pbzip2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pbzip2-1.1.13-14.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_pbzip2}"
RDEPENDS:pbzip2 = " \
 glibc \
 bzip2-libs \
 libgcc \
 libstdc++ \
"
