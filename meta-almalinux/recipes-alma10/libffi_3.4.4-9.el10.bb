
inherit dnf-bridge

PN = "libffi"
PE = "0"
PV = "3.4.4"
PR = "9.el10"
PACKAGES = "libffi libffi-devel"


URI_libffi = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libffi-3.4.4-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libffi = " \
 glibc \
"

URI_libffi-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libffi-devel-3.4.4-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libffi-devel = " \
 libffi \
 pkgconf-pkg-config \
"
