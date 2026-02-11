
inherit dnf-bridge

PN = "fdk-aac-free"
PE = "0"
PV = "2.0.0"
PR = "15.el10"
PACKAGES = "fdk-aac-free fdk-aac-free-devel"


URI_fdk-aac-free = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fdk-aac-free-2.0.0-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fdk-aac-free = " \
 glibc \
"

URI_fdk-aac-free-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/fdk-aac-free-devel-2.0.0-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fdk-aac-free-devel = " \
 pkgconf-pkg-config \
 fdk-aac-free \
"
