
inherit dnf-bridge

PN = "uchardet"
PE = "0"
PV = "0.0.8"
PR = "7.el10"
PACKAGES = "uchardet uchardet-devel"


URI_uchardet = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/uchardet-0.0.8-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:uchardet = " \
 glibc \
 libgcc \
 libstdc++ \
"

URI_uchardet-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/uchardet-devel-0.0.8-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:uchardet-devel = " \
 uchardet \
 cmake-filesystem \
 pkgconf-pkg-config \
"
